Feature: Register API Test

  Scenario:Case-P01 Successful register
    Given user register icin "eve.holt@reqres.in" ve "pistol" body gönder
    Then response status code 200 olmali

  Scenario Outline:Case-N01 Invalid register attempts
    Given user register icin "<email>" ve "<password>" invalid body gönder
    Then response status code 400 olmali
    Examples:
      | email             | password |
      | eve.holtreqres.in | pistol   |
      | ""                | pistol   |
      | NULL              | NULL     |
      | ""                | ""       |

  Scenario:Case-N02 Register without API key
  ******Beklenen 401 dönüyor ama statusCode görmeden hata veriyor*******
    Given without auth register "eve.holt@reqres.in" ve "pistol" request atilir
    Then response status code 401 olmali