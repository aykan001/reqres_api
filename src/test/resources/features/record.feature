Feature: Record API Test

  Scenario: Case-P01 Get list records
    Given list records request at
    Then response status code 200 olmali

  Scenario: Case-P02 Get record
    Given record id "1" request at
    Then response status code 200 olmali

  Scenario Outline: Case-P03 Successfully create record
    Given record body "<name>" "<price>" "<category>" "<in_stock>" request atilir
    Then response status code 201 olmali

    Examples:
      | name                | price | category    | in_stock |
      | Wireless Headphones | 59.99 | Electronics | true     |

  Scenario Outline: Case-P04 Successfully update record
    Given update record id "1" body "<name>" "<price>" "<category>" "<in_stock>" request atilir
    Then response status code 200 olmali

    Examples:
      | name                | price | category    | in_stock |
      | Wireless Headphones | 59.99 | Electronics | true     |

  Scenario: Case-P05 Successfully delete record
    Given delete record id "1" request at
    Then response status code 204 olmali
