Feature: Generic Resources API Test

  Scenario: Get generic resources
    Given generic resources request atilir
    Then response status code 200 olmali
    And response bos olmamali

  Scenario Outline: Get generic resources by page
    Given different "<page>" generic resources request atilir
    Then response status code 200 olmali
    Examples:
      | page |
      | 1    |
      | 2    |

  Scenario Outline: Invalid page requests
    ****geçersiz değerlerde bile 200 dönüyor beklenen disi*****
    Given different "<page>" generic resources request atilir
    Then response status code 200 olmali
    Examples:
      | page |
      | 999  |
      | -1   |
      | abc  |