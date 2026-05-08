Feature: Record API Test
  Scenario: Case-P01 Get list records
    Given list records request at
    Then response status code 200 olmali

  Scenario: Case-P02 Get record
    Given records request at
    Then response status code 200 olmali

