Feature: User Update API Test

  Scenario: Successful update
    Given user update icin "morpheus" ve "zion resident" valid body gonder
    Then response status code 200 olmali
    And "name" "morpheus" bos olmamali ve dogru olmali
    And "job" "zion resident" bos olmamali ve dogru olmali
    And updatedAt bos olmamali ve dogru olmali

  Scenario Outline: Invalid update data
    Given user update icin "<name>" ve "<job>" valid body gonder
    Then response status code 200 olmali
    Examples:
      | name  | job   |
      | NULL  | NULL  |
      | EMPTY | EMPTY |

  Scenario: Empty body update
    Given user update icin bos body gonder
    Then response status code 200 olmali

