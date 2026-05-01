Feature: Login API Test

  Scenario: Successful login
    Given login icin "eve.holt@reqres.in" ve "cityslicka" body gönder
    Then response status code 200 olmali
    And response icin token olmali

  Scenario Outline: Invalid login attempts
    Given login icin "<email>" ve "<password>" body gönder
    Then response status code 400 olmali
    Examples:
      | email              | password   |
      | eve.holtreqres.in  | cityslicka |
      | eve.holt@reqres.in | NULL       |
      | NULL               | cityslicka |
      | EMPTY              | EMPTY      |

  Scenario: Login without API key
    Given login without apikey
    Then response status code 401 olmali