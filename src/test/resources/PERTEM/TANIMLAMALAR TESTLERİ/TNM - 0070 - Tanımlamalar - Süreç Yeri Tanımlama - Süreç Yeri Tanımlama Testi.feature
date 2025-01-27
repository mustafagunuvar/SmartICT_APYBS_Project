Feature: HVL-AZ-PYBS-TMN-YGD-60 Süreç Yeri Tanımlamasına olanak sağlayacaktır

  Background:
    Given kullanici "pertemUrl" sayfasina gider
    Then "hvltest1" ve "123" girilir
    Then portala giris yapilir
    Then personel temin profili secilir
    Then ana paneldeki personel temin butonuna tiklanir

  @scenarious
  Scenario: PERTEM Süreç Yeri Tanimlama, Düzenleme, Listeleme ve silme testi
    Then Personel Temin islemleri panelindeki Tanimlamalar Menüsü icerisinde bulunan Surec Yeri Tanimlama butonu uzerine tiklanir
    Then Surec Yeri Tanimlamalar ekraninin acildıgi gorulur
    Then Süreç Yeri Tanimlamalari Listesi alaninda bulunan Ekle butonu uzerine tiklanir
    Then Surec Yeri Ekle panelinin acildigi gorulur
    Then Surec Yeri Ekle panelindeki alanlar doldurulur ardindan Kaydet butonuna tiklanir
    Then Basarili pop-up’ının geldigi ve listede eklenen kaydin yer aldigi gorulur
    Then Eklenen kaydin uzerine tiklanir ve duzenle butonuna basilir
    Then Surec Yeri Duzenle ekraninin acildigi gorulur
    Then Aciklama alanina "MEBS Okulu Testi" girilir ve ardindan Kaydet butonuna tiklanir



