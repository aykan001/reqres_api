Feature:Updated Record API Test

  Scenario Outline: Case-P04 Successfully update record
    Given update record id "1" body "<name>" "<price>" "<category>" "<in_stock>" request atilir
    Then response status code 200 olmali

    Examples:
      | name                | price | category    | in_stock |
      | Wireless Headphones | 59.99 | Electronics | true     |