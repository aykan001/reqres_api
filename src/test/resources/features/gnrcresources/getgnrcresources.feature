Feature: Generic Resources API Test

  Scenario:Case-P01 Get generic resources
    Given generic resources request atilir
    Then response status code 200 olmali
    And response bos olmamali

  Scenario Outline:Case-P02 Get generic resources by page
    Given different "<page>" generic resources request atilir
    Then response status code 200 olmali
    Examples:
      | page |
      | 1    |
      | 2    |

  Scenario Outline:Case-N01 Invalid page requests
  ****geçersiz değerlerde bile 200 dönüyor beklenen disi*****
    Given different "<page>" generic resources request atilir
    Then response status code 200 olmali
    Examples:
      | page |
      | 999  |
      | -1   |
      | abc  |

  Scenario Outline: Case-N02 Without auth generic resources
    Given without auth generic resources "<page>" request atilir
    Then response status code 401 olmali
    Examples:
      | page |
      | 2    |

