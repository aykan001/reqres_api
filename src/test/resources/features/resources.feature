Feature: List Resources API Test
  Scenario:Case-P01 Get List Resources
    Given list resources request atilir
    Then response status code 200 olmali
    And response bos olmamali

  Scenario Outline: Case-N01 Get wrong endpoint List Resources
    Given wrong "<endpoint>" request atilir
    Then response status code <statusCode> olmali
    Examples:
      | endpoint | statusCode |
      | /        | 404        |
      | /unk2424 | 404        |

  Scenario Outline: Case-N02 Get without auth List Resources
    Given without auth "<endpoint>" request atilir
    Then response status code <statusCode> olmali
    Examples:
      | endpoint | statusCode |
      | /unknown | 401        |
