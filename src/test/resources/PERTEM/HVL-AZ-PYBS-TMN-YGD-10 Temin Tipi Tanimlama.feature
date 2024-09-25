Feature: HVL-AZ-PYBS-TMN-YGD-10 Temin Tipi Tanımlamasına olanak sağlayacaktır
  @scenarious
  Scenario: PERTEM Temin Tipi Tanimlama, Düzenleme, Listeleme ve silme testi
    Given kullanici "pertemUrl" sayfasina gider
    Then "hvltest1" ve "123" girilir
    Then portala giris yapilir
    Then personel temin profili secilir
    Then ana paneldeki personel temin butonuna tiklanir
    Then Personel Temin islemleri panelindeki Tanimlamalar Menüsü icerisinde bulunan Genel Tanimlamalar butonu uzerine tiklanir
    Then Genel Tanımlamalar ekraninin acildıgi gorulur
    Then Tanimlamalar Listesi alaninda bulunan Ekle butonu uzerine tiklanir
    Then Tanimlamalar Ekle panelinin acildigi gorulur
    Then Tanimlamalar Ekle panelinde Tablo alanindan Temin Tipi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir
    Then Basarili pop-up’ının geldigi ve Tanimlamalar Listesinde eklenen kaydin yer aldigi gorulur
    Then Eklenen kaydin uzerine tiklanir ve duzenle butonuna basilir
    Then Tanimlamalar Duzenle ekraninin acildigi gorulur
    Then Uzun Metin alanina "Uzman Yardimcisi - Duzenlendi" girilir ve ardindan Kaydet butonuna tiklanir
    Then Basarili pop-up’ının geldigi ve Tanimlamalar Listesinde duzenlenen kaydin yer aldigi gorulur
    Then Arama alanindaki Kod alanina "UZMYRD1" girilir ve Sorgula butonuna tiklanir
    Then Tanimlamalar Listesinde aratilan kodun yer aldigi gorulur
    Then Aratilan kaydin uzerine tiklanir ve sil butonuna basilir
    Then Silme Onay pop-up inin acildigi ve onay uyari metninin yer aldigi gorulur
    Then Silme Onay pop-undaki Sil butonuna tiklanir
    And Basarili pop-up’inin geldigi ve Listede silinen kaydin olmadigi dogrulanir




















    #.feature uzantılı dosyalar, Behavior Driven Development (BDD) (Davranışa Dayalı Geliştirme) yönteminde kullanılan özellik dosyalarıdır.
    # Genellikle Cucumber veya benzeri BDD araçlarıyla ilişkilidirler.
    # Bu dosyalar, yazılımın işlevselliğini tanımlayan senaryoları açık ve anlaşılır bir şekilde ifade eder.
    # İşte .feature dosyalarında ne yapıldığını ve nasıl kullanıldığını detaylı olarak açıklayalım:

    #Temel Yapı
    #Feature: Özelliğin başlığı ve açıklaması. Özelliğin ne olduğunu açıklar.
    #Scenario: Özelliğin belirli bir durumdaki davranışını test eder. Bir veya daha fazla senaryo olabilir.
    #Given-When-Then: Senaryolardaki adımların yapısını tanımlar:
    #Given: Başlangıç durumu veya ön koşullar.
    #When: Yapılacak işlem veya eylem.
    #Then: Beklenen sonuç veya doğrulama.

    #ORNEK
    #Feature: Login Functionality
    #
    #  Scenario: Successful login with valid credentials
    #    Given the user is on the login page
    #    When the user enters valid credentials
    #    And the user clicks the login button
    #    Then the user should be redirected to the homepage
    #    And a welcome message should be displayed

  #Gherkin Dili
  #.feature dosyalarında senaryolar Gherkin dilinde yazılır. Gherkin, anlaşılır bir dilde yazılacak şekilde tasarlanmış
  # ve doğal dil ifadeleriyle test senaryolarını oluşturmanıza olanak tanır. Gherkin, iş kurallarını ve test senaryolarını
  # açıkça tanımlar ve aşağıdaki anahtar kelimeleri içerir:
  #
  #Feature: Özelliğin genel tanımı.
  #Scenario: Özelliğin belirli bir durumunu anlatan senaryo.
  #Given: Başlangıç durumu veya ön koşul.
  #When: İşlem veya eylem.
  #Then: Beklenen sonuç.
  #And, But: Ek adımlar veya koşullar.

  #3. Adım Tanımları (Step Definitions)
  #.feature dosyasında tanımlanan senaryolardaki adımlar, Java veya diğer programlama dillerinde tanımlanan
  # adım tanımlarıyla ilişkilendirilir. Adım tanımları, Gherkin adımlarının nasıl gerçekleştirileceğini belirler.
  #Java kullanarak adım tanımlarını StepDefinitions adlı bir sınıfta yazabilirsiniz:

  #Özet
  #.feature dosyaları, yazılımın işlevselliğini açık ve anlaşılır bir şekilde tanımlayan senaryolar içerir.
  # Gherkin dilini kullanarak yazılır ve bu senaryoların nasıl çalıştığını belirlemek için adım tanımları ile ilişkilendirilir.
  # Bu dosyalar, testlerinizi daha anlaşılır ve iş birliğine dayalı hale getirir ve
  # geliştiriciler ile iş analistleri arasında ortak bir anlayış sağlar.


