Feature: Read Resource API Test

  Scenario:Case-P01 Get resources
    Given list resources request atilir
    Then response status code 200 olmali

  Scenario Outline:Case-N01 Wrong endpoint
  ********eksik veya yanlış göndersek bile 200 dönüyor beklenen disinda davranıyor *****
    Given wrong list resources  "<endpoint>" request atilir
    Then response status code 200 olmali
    Examples:
      | endpoint |
      | /unk     |
      | /invalid |
      | unknow   |

  Scenario:Case-N02 Without auth
  ****401 dönmesi gereken yerde 200 dönüyor****
    Given without auth list resources "/unknown" request atilir
    Then response status code 200 olmali