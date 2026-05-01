Feature: Resource API Test

  Scenario: Get resources
    Given list resources request atilir
    Then response status code 200 olmali

  Scenario Outline: Wrong endpoint
      ********eksik veya yanlış göndersek bile 200 dönüyor beklenen disinda davranıyor *****
    Given wrong "<endpoint>" request atilir
    Then response status code 404 olmali
    Examples:
      | endpoint |
      | /unk     |
      | /invalid |
      | unknow   |


  Scenario: Without auth
    ****Then gitmeden hata veriyor ama hata doğru****
    Given without auth "/unknown" request atilir
    Then response status code 401 olmali
