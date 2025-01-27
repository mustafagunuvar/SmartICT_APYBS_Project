Feature: HVL-AZ-PYBS-TMN-YGD-690 Kural tanımlamasına olanak sağlamalıdır
  HVL-AZ-PYBS-TMN-YGD-910 Kriter grubu tanımlamasına olanak sağlamalıdır
  HVL-AZ-PYBS-TMN-YGD-880 Kriter grubundan kriter tanımlamaya olanak sağlamalıdır

  Background:
    Given kullanici "pertemUrl" sayfasina gider
    Then "hvltest1" ve "123" girilir
    Then portala giris yapilir
    Then personel temin profili secilir
    Then ana paneldeki personel temin butonuna tiklanir