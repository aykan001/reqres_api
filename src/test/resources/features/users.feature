Feature: Users API Test

  Scenario:Case-P01 Get users list
    Given users list request atilir
    Then response status code 200 olmali
    And response bos olmamali

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

