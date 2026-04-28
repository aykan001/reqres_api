Feature:Single User API Test
  Scenario Outline:Case-P01 Get path params single user
    Given "<id>" user request atilir
    Then response status code 200 olmali
    And user bos olmamali
    Examples:
      | id |
      | 1  |
      | 5  |

  Scenario: Case-P02 Get url single user
    Given url de id olan user requst atilir
    Then response status code 200 olmali
    And response bos olmamali


  Scenario Outline: Case-N01 Get without auth single user
    Given without auth "<endpoint>" request atilir
    Then response status code 401 olmali
    Examples:
      | endpoint |
      | /users/2 |
      | /users/5 |


  Scenario Outline: Case-N02 Get wrong endpoint single user
    Given wrong "<endpoint>" request atilir
    Then response status code <statusCode> olmali
    Examples:
      | endpoint | statusCode |
      | /users/a | 404        |
      | //users/ | 404        |
