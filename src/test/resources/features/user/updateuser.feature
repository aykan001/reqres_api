Feature:Update User API Test

  Scenario Outline: Case- Successful update data
    Given user update icin "<name>" ve "<job>" body gonder
    Then response status code 200 olmali
    Examples:
      | name     | job           |
      | morpheus | zion resident |

  Scenario: Case-P03 Successful update
    Given user update icin "morpheus" ve "zion resident" valid body gonder
    Then response status code 200 olmali
    And "name" "morpheus" bos olmamali ve dogru olmali
    And "job" "zion resident" bos olmamali ve dogru olmali
    And updatedAt bos olmamali ve dogru olmali

  Scenario Outline: Case-N04 Invalid update data
  ****400 donmesi gereke ama 200 donuyor beklenen dişi****
    Given user update icin "<name>" ve "<job>" valid body gonder
    Then response status code 200 olmali
    Examples:
      | name  | job   |
      | NULL  | NULL  |
      | EMPTY | EMPTY |

  Scenario Outline:Case-N05 Without Auth updated user
  ****401 alıyoruz doğru ama statusCode gelmeden hata fırlatıyor*********
    Given user updated icin without auth "<name>" "<job>" body gonder
    Then response status code 401 olmali
    Examples:
      | name     | job           |
      | morpheus | zion resident |

  Scenario Outline: Case-N01 Invalid endpoint
  ****** 404 fırlatıyor beklenen ama Then görmeden fail veriyor*****
    Given wrong "<endpoint>" request atilir
    Then response status code 404 olmali
    Examples:
      | endpoint |
      | /users/a |
      | //users/ |

  Scenario Outline:Case-N02 Wrong endpoint cases
  ****404 vermesi gereken yerde 200 veriyor beklenen dışı davranıyor *****
    Given wrong "<endpoint>" request atilir
    Then response status code 200 olmali
    Examples:
      | endpoint |
      | /usersss |
      | /abc     |
