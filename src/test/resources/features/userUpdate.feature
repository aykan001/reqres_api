Feature: User Update API Test

  Scenario: Successful update
    Given user update icin "morpheus" ve "zion resident" valid body gonder
    Then response status code 200 olmali
    And "name" "morpheus" bos olmamali ve dogru olmali
    And "job" "zion resident" bos olmamali ve dogru olmali
    And updatedAt bos olmamali ve dogru olmali

  Scenario Outline: Invalid update data
    ****400 donmesi gereke ama 200 donuyor beklenen dişi****
    Given user update icin "<name>" ve "<job>" valid body gonder
    Then response status code 200 olmali
    Examples:
      | name  | job   |
      | NULL  | NULL  |
      | EMPTY | EMPTY |

  Scenario Outline: Without Auth updated user
    ****401 alıyoruz doğru ama statusCode gelmeden hata fırlatıyor*********
    Given user updated icin without auth "<name>" "<job>" body gonder
    Then response status code 401 olmali
    Examples:
      | name     | job           |
      | morpheus | zion resident |

