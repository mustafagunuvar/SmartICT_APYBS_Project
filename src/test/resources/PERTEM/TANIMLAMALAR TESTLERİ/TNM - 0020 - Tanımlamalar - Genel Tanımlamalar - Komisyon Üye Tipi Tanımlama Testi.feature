Feature: HVL-AZ-PYBS-TMN-YGD-80 Komisyon Üye Tipi Tanımlamasına olanak sağlayacaktır
  @scenarious
  Scenario: PERTEM Komisyon Üye Tipi Tanimlama, Düzenleme, Listeleme ve silme testi
    Given kullanici "pertemUrl" sayfasina gider
    Then "hvltest1" ve "123" girilir
    Then portala giris yapilir
    Then personel temin profili secilir
    Then ana paneldeki personel temin butonuna tiklanir
    Then Personel Temin islemleri panelindeki Tanimlamalar Menüsü icerisinde bulunan Genel Tanimlamalar butonu uzerine tiklanir
    Then Genel Tanımlamalar ekraninin acildıgi gorulur
    Then Tanimlamalar Listesi alaninda bulunan Ekle butonu uzerine tiklanir
    Then Tanimlamalar Ekle panelinin acildigi gorulur
    Then Tanimlamalar Ekle panelinde Tablo alanindan Komisyon Uye Tipi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir
    Then Basarili pop-up’ının geldigi ve Tanimlamalar Listesinde eklenen kaydin yer aldigi gorulur
    Then Eklenen kaydin uzerine tiklanir ve duzenle butonuna basilir
    Then Tanimlamalar Duzenle ekraninin acildigi gorulur
    Then Uzun Metin alanina "Psikolog-Düzenlendi" girilir ve ardindan Kaydet butonuna tiklanir
    Then Basarili pop-up’ının geldigi ve Tanimlamalar Listesinde duzenlenen kaydin yer aldigi gorulur
    Then Arama alanindaki Kod alanina "PSKLG" girilir ve Sorgula butonuna tiklanir
    Then Tanimlamalar Listesinde aratilan kodun yer aldigi gorulur
    Then Aratilan kaydin uzerine tiklanir ve sil butonuna basilir
    Then Silme Onay pop-up inin acildigi ve onay uyari metninin yer aldigi gorulur
    Then Silme Onay pop-undaki Sil butonuna tiklanir
    And Basarili pop-up’inin geldigi ve Listede silinen kaydin olmadigi dogrulanir


