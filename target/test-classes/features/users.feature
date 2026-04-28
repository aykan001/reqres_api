Feature: Users List API Test

  Scenario: Case-P01 Get users list
    Given  users list request atilir
    Then response status code 200 olmali
    And response bos olmamali


  Scenario Outline:Case-N01 Get wrong users list (ne yaparsam yapim 200 dönüyor)
    Given wrong "<endpoint>" request atilir
    Then response status code <statusCode> olmali
    Examples:
      | endpoint        | statusCode |
      | zzz             | 200        |
      | /users?page=abc | 200        |
      | /users?page=-1  | 200        |
      | /users?page=999 | 200        |
      | /users?page=    | 200        |

  Scenario Outline: Case-02 Get without auth users list
      Given without auth "<endpoint>" request atilir
      Then response status code 401 olmali
    Examples:
      | endpoint |
      | /users   |

