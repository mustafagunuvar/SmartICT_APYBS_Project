Feature: APYBSAY-463_Kaza_Türü_Grubu_Tanimlama Testi
  Scenario: EKÖ Kaza Türü Grubu Tanimlama,Düzenleme,Listeleme ve silme testi
    Given kullanici "eköUrl" sayfasina gider
    Then "hvltest1" ve "123" girilir
    Then portala giris yapilir
    Then profil secilir
    Then ana paneldeki emniyet kaza önleme butonuna tiklanir
    Then Emniyet Kaza Önleme panelindeki Tanımlamalar Menüsü içerisinde bulunan Genel Tanımlamalar butonu üzerine tıklanır
    Then Genel Tanimlamalar ekraninin acildigi görülür
    Then Tanımlamalar Listesi alanında bulunan Ekle butonu üzerine tıklanır
    Then Tanımlamalar Ekle panelinin açıldığı görülür
    Then Tanımlamalar Ekle panelinde Tablo alanından Kaza Türü Grubu seçilir ve Kod, Öncelik Sırası, Kısa Metin ve Uzun Metin Alanları doldurulur ardından Kaydet butonuna tıklanır
    Then Başarılı pop-up’ının geldiği ve Tanımlamalar Listesinde eklenen Kaza Türü Grubunun yer aldığı görülür
    Then Eklenen Kaza Türü Grubu üzerine tıklanır ve düzenle butonuna basılır
