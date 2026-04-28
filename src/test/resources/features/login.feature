Feature: Login API Test
  Scenario Outline: Case-P01  successful login test
    Given login icin "<email>" ve "<password>" body gönder
    Then  response status code <statusCode> olmali
    And response icin token olmali
    Examples:
      | email              | password   | statusCode |
      | eve.holt@reqres.in | cityslicka | 200        |

  Scenario Outline: Case-N01 fail login test
    Given login icin "<email>" ve "<password>" body gönder
    Then response status code <statusCode> olmali
    Examples:
      | email              | password   | statusCode |
      | eve.holtreqres.in  | cityslicka | 400        |
      | eve.holt@reqres.in | NULL       | 400        |
      | NULL               | cityslicka | 400        |
      | NULL               | NULL       | 400        |
      | EMPTY              | EMPTY      | 400        |