Feature:User and Users API Test

  Scenario Outline: Get user by id
    Given "<id>" user request atilir
    Then response status code 200 olmali
    And user bos olmamali
    Examples:
      | id |
      | 1  |
      | 2  |

  Scenario:Case-P01 Get users list
    Given users list request atilir
    Then response status code 200 olmali
    And response bos olmamali

  Scenario Outline: Invalid endpoint
    ****** 404 fırlatıyor beklenen ama Then görmeden fail veriyor*****
    Given wrong "<endpoint>" request atilir
    Then response status code 404 olmali
    Examples:
      | endpoint |
      | /users/a |
      | //users/ |


  Scenario Outline:Case-N01 Wrong endpoint cases
  ****404 vermesi gereken yerde 200 veriyor beklenen dışı davranıyor *****
    Given wrong "<endpoint>" request atilir
    Then response status code 200 olmali
    Examples:
      | endpoint |
      | /usersss |
      | /abc     |

  Scenario:Case-N02 Get users without auth
  ****401 vermesi gereken yerde 200 dönüyor *****
    Given without auth "/users" request atilir
    Then response status code 200 olmali

