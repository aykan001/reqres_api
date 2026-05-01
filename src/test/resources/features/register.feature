Feature: Register API Test

  Scenario: Successful register
    Given user register icin "eve.holt@reqres.in" ve "pistol" body gönder
    Then response status code 200 olmali

  Scenario Outline: Invalid register attempts
    Given user register icin "<email>" ve "<password>" body gönder
    Then response status code 400 olmali
    Examples:
      | email              | password |
      | eve.holtreqres.in  | pistol   |
      | EMPTY              | pistol   |
      | NULL               | NULL     |

  Scenario: Register without API key ******Beklenen 401 dönüyor ama statusCode görmeden hata veriyor*******
    Given without auth "/register" request atilir
    Then response status code 401 olmali