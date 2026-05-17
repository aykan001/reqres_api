Feature:Create Record API Test

  Scenario Outline: Case-P03 Successfully create record
    Given record body "<name>" "<price>" "<category>" "<in_stock>" request atilir
    Then response status code 201 olmali

    Examples:
      | name                | price | category    | in_stock |
      | Wireless Headphones | 59.99 | Electronics | true     |