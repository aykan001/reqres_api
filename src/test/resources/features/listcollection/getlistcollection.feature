Feature:Read List Collections API Test

  Scenario Outline: Case-P06 Successfully list collections
    Given list collections "<project_id>" request at
    Then response status code 200 olmali
    Examples:
      | project_id |
      | 14226      |

