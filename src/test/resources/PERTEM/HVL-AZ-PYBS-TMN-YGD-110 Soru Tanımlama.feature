Feature: HVL-AZ-PYBS-TMN-YGD-100 Soru Zorluk Derecesi Tanımlamasına olanak sağlayacaktır
  @scenarious
  Scenario: PERTEM Soru Zorluk Derecesi Tanimlama, Düzenleme, Listeleme ve silme testi
    Given kullanici "pertemUrl" sayfasina gider
    Then "hvltest1" ve "123" girilir
    Then portala giris yapilir
    Then personel temin profili secilir
    Then ana paneldeki personel temin butonuna tiklanir
    Then Personel Temin islemleri panelindeki Sinav islemleri Menusu icerisinde bulunan Soru Tanimlamalar butonu uzerine tiklanir
    #Then Genel Tanımlamalar ekraninin acildıgi gorulur
    #Then Tanimlamalar Listesi alaninda bulunan Ekle butonu uzerine tiklanir
    #Then Tanimlamalar Ekle panelinin acildigi gorulur
    #Then Tanimlamalar Ekle panelinde Tablo alanindan Soru Zorluk Derecesi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir
    #Then Basarili pop-up’ının geldigi ve Tanimlamalar Listesinde eklenen kaydin yer aldigi gorulur
    #Then Eklenen kaydin uzerine tiklanir ve duzenle butonuna basilir
    #Then Tanimlamalar Duzenle ekraninin acildigi gorulur
    #Then Öncelik Sirasi alanina 2 girilir ve ardından Kaydet butonuna tiklanir
    #Then Basarili pop-up’ının geldigi ve Tanimlamalar Listesinde duzenlenen kaydin yer aldigi gorulur
    #Then Arama alanindaki Kod alanina "NOR" girilir ve Sorgula butonuna tiklanir
    #Then Tanimlamalar Listesinde aratilan kodun yer aldigi gorulur
    #Then Aratilan kaydin uzerine tiklanir ve sil butonuna basilir
    #Then Silme Onay pop-up inin acildigi ve onay uyari metninin yer aldigi gorulur
    #Then Silme Onay pop-undaki Sil butonuna tiklanir
    #And Basarili pop-up’inin geldigi ve Listede silinen kaydin olmadigi dogrulanir


