Feature: Generic Resources Test API
  Scenario: Case-P01 Get generic resources
    Given generic resources request atilir
    Then response status code 200 olmali
    And response bos olmamali

  Scenario Outline:Case-P02 Get different generic resources
    Given different "<page>" generic resources request atilir
    Then response status code <statusCode> olmali
    And response bos olmamali
    Examples:
      | page | statusCode |
      | 2    | 200        |
      | 5    | 200        |
      | 12   | 200        |