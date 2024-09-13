Feature: HVL-AZ-PYBS-TMN-YGD-10 Temin Tipi Tanımlamasına olanak sağlayacaktır
  Scenario: PERTEM Temin Tipi Tanimlama, Düzenleme, Listeleme ve silme testi
    Given kullanici "pertemUrl" sayfasina gider
    Then "hvltest1" ve "123" girilir
    Then portala giris yapilir
    Then personel temin profili secilir
    Then ana paneldeki personel temin butonuna tiklanir
    Then Personel Temin islemleri panelindeki Tanimlamalar Menüsü icerisinde bulunan Surec Yeri Tanimlama butonu uzerine tiklanir
    Then Surec Yeri Tanimlama ekraninin acildıgi gorulur
    Then Tanimlamalar Listesi alaninda bulunan Ekle butonu uzerine tiklanir
    Then Surec Yeri Ekle panelinin acildigi gorulur
    Then Surec Yeri Ekle panelindeki alanlar doldurulur ardindan Kaydet butonuna tiklanir
   #Then Basarili pop-up’ının geldigi ve Tanimlamalar Listesinde eklenen kaydin yer aldigi gorulur
   #hen Eklenen kaydin uzerine tiklanir ve duzenle butonuna basilir
   #hen Tanimlamalar Duzenle ekraninin acildigi gorulur
   #hen Öncelik Sirasi alanina 2 girilir ve ardından Kaydet butonuna tiklanir
   #hen Basarili pop-up’ının geldigi ve Tanimlamalar Listesinde duzenlenen kaydin yer aldigi gorulur
   #hen Arama alanindaki Kod alanina "NOR" girilir ve Sorgula butonuna tiklanir
   #hen Tanimlamalar Listesinde aratilan kodun yer aldigi gorulur
   #hen Aratilan kaydin uzerine tiklanir ve sil butonuna basilir
   #hen Silme Onay pop-up inin acildigi ve onay uyari metninin yer aldigi gorulur
   # And Silme Onay pop-undaki Sil butonuna tiklanir


