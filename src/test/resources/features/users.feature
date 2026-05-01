Feature: Users API Test

  Scenario: Get users list
    Given users list request atilir
    Then response status code 200 olmali
    And response bos olmamali

  Scenario Outline: Wrong endpoint cases
    ****404 vermesi gereken yerde 200 veriyor beklenen dışı davranıyor *****
    Given wrong "<endpoint>" request atilir
    Then response status code 200 olmali
    Examples:
      | endpoint |
      | /usersss |
      | /abc     |

  Scenario: Get users without auth
  ****401 vermesi gereken yerde then girmeden fail oluyor *****
    Given without auth "/users" request atilir
    Then response status code 401 olmali

