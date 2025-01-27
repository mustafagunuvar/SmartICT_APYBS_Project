Feature:HVL-AZ-PYBS-TMN-YGD-170 Süreç Tanımlamasına olanak sağlayacaktır
  HVL-AZ-PYBS-TMN-YGD-250 Tercihe Süreç(ler) Atamasına olanak sağlayacaktır
  HVL-AZ-PYBS-TMN-YGD-180 Süreç Cetvel Tanımlamasına olanak sağlayacaktır
  HVL-AZ-PYBS-TMN-YGD-440 Tercih Bazlı Sürece Sınav Atamasına olanak sağlayacaktır

  Background:
    Given kullanici "pertemUrl" sayfasina gider
    Then "hvltest1" ve "123" girilir
    Then portala giris yapilir
    Then personel temin profili secilir
    Then ana paneldeki personel temin butonuna tiklanir