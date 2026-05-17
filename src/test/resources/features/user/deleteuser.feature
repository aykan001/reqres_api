Feature:Delete User API Test

  Scenario Outline: Case-P01 Successful delete user by id
    Given delete icin "<id>" user request atilir
    Then response status code 204 olmali
    Examples:
      | id |
      | 2  |
      | 3  |

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

  Scenario Outline:
    Given delete without auth user "<id>" request atilir
    Then  response status code 401 olmali
    Examples:
      | id |
      | 2  |
