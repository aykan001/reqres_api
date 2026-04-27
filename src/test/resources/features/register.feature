Feature: Register API Test
  Scenario Outline:Case-P01 Successful Registers
    Given user register icin "<email>" ve "<password>" body gönder
    Then response status code <statusCode> olmali
    And response icin token olmali
    Examples:
      | email              | password | statusCode |
      | eve.holt@reqres.in | pistol   | 200        |



  Scenario Outline: Case-N01 Fail Registers
    Given user register icin "<email>" ve "<password>" body gönder
    Then response status code <statusCode> olmali
    Examples:
      | email              | password | statusCode |
      | eve.holtreqres.in  | pistol   | 400        |
      | eve.holt@reqresin  | pistol   | 400        |
      | eveholt@reqres.in  | pistol   | 400        |
      | EMPTY              | pistol   | 400        |
      | eve.holt@reqres.in | EMPTY    | 400        |
      | eve.holt@reqres.in@| pistol   | 400        |
      | NULL               | pistol   | 400        |
      | eve.holt@reqres.in | NULL     | 400        |
      | NULL               | NULL     | 400        |