Feature:Read User API Test

  Scenario Outline: Case-P01 Get user by id
    Given "<id>" user request atilir
    Then response status code 200 olmali
    And user bos olmamali
    Examples:
      | id |
      | 1  |
      | 2  |

  Scenario Outline: Case-N01 Invalid endpoint
  ****** 404 fırlatıyor beklenen ama Then görmeden fail veriyor*****
    Given wrong "<endpoint>" request atilir
    Then response status code 404 olmali
    Examples:
      | endpoint |
      | /users/a |
      | //users/ |

  Scenario Outline:Case-N02 Without API
    Given without auth user "<id>" request atilir
    Then response status code 401 olmali
    Examples:
      | id |
      | 2  |

  Scenario: Case-N03 No id user
    Given no id user request atilir
    Then response status code 404 olmali

  Scenario Outline: Case-N04 Wrong Url User
    Given wrong url user "<id>" request atilir
    Then response status code 404 olmali
    Examples:
      | id |
      | 2  |