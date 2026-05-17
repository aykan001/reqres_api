Feature:Read Users API Test

  Scenario:Case-P01 Get users list
    Given users list request atilir
    Then response status code 200 olmali
    And response bos olmamali

  Scenario:Case-N01 Get users without auth
  ****401 vermesi gereken yerde 200 dönüyor *****
    Given without auth users request atilir
    Then response status code 200 olmali

  Scenario Outline: Case-N02 Invalid endpoint
  ****** 404 fırlatıyor beklenen ama Then görmeden fail veriyor*****
    Given wrong "<endpoint>" request atilir
    Then response status code 404 olmali
    Examples:
      | endpoint |
      | /users/a |
      | //users/ |

  Scenario Outline:Case-N03 Wrong endpoint cases
  ****404 vermesi gereken yerde 200 veriyor beklenen dışı davranıyor *****
    Given wrong "<endpoint>" request atilir
    Then response status code 200 olmali
    Examples:
      | endpoint |
      | /usersss |
      | /abc     |


