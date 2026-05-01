Feature: Single User API Test

  Scenario Outline: Get user by id
    Given "<id>" user request atilir
    Then response status code 200 olmali
    And user bos olmamali
    Examples:
      | id |
      | 1  |
      | 2  |

  Scenario: Get user by fixed url
    Given url de id olan user requst atilir
    Then response status code 200 olmali

  Scenario Outline: Invalid endpoint
    ****** 404 fırlatıyor beklenen ama Then görmeden fail veriyor*****
    Given wrong "<endpoint>" request atilir
    Then response status code 404 olmali
    Examples:
      | endpoint |
      | /users/a |
      | //users/ |