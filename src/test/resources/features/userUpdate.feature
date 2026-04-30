Feature: User Update API Test
  Scenario Outline: Case-P01 Successfully user updates
    Given user update icin "<name>" ve "<job>" valid body gonder
    Then response status code <statusCode> olmali
    And "name" "<name>" bos olmamali ve dogru olmali
    And "job" "<job>" bos olmamali ve dogru olmali
    And updatedAt bos olmamali ve dogru olmali
    Examples:
      | name     | job           | statusCode |
      | morpheus | zion resident | 200        |



  Scenario Outline: Case-N01 User update that failed and behaved unexpectedly
    Given user update icin "<name>" ve "<job>" valid body gonder
    Then response status code <statusCode> olmali
    Examples:
      | name  | job   | statusCode |
      | NULL  | NULL  | 200        |
      | EMPTY | EMPTY | 200        |
      | 1234  | 1224  | 200        |


  Scenario: Case-N02 Empty body ile user update
    Given user update icin empty body gonder
    Then response status code 200 olmali

