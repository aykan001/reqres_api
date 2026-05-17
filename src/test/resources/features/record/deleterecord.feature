Feature:Delete Record API Test

  Scenario: Case-P05 Successfully delete record
    Given delete record id "1" request at
    Then response status code 204 olmali
