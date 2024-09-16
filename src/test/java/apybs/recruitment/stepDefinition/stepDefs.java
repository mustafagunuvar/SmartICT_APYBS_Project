package apybs.recruitment.stepDefinition;

import apybs.ekö.pages.ProcessPlaceDefinition;
import apybs.recruitment.pages.*;
import apybs.utilities.ConfigReader;
import apybs.utilities.Driver;
import apybs.utilities.PublicPage;
import apybs.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class stepDefs {

    PublicPage publicPage = new PublicPage();
    Homepage homepage = new Homepage();
    Definitions definitions = new Definitions();
    GeneralDefinitions generalDefinitions = new GeneralDefinitions();
    DefinitionsSave definitionsSave = new DefinitionsSave();
    DefinitionsUpdate definitionsUpdate = new DefinitionsUpdate();
    ProcessPlaceDefinition processPlaceDefinition = new ProcessPlaceDefinition();
    ProcessPlaceSave processPlaceSave = new ProcessPlaceSave();
    Actions actions = new Actions(Driver.getDriver());


    @Then("personel temin profili secilir")
    public void personelTeminProfiliSecilir() {
        ReusableMethods.visibleWait(publicPage.profilSecme, 4);
        ReusableMethods.click(publicPage.profilSecme);
        ReusableMethods.visibleWait(publicPage.pertemProfili, 9);
        ReusableMethods.click(publicPage.pertemProfili);
        ReusableMethods.bekle(2);
        ReusableMethods.click(publicPage.devamEt);
    }

    @Then("ana paneldeki personel temin butonuna tiklanir")
    public void anaPaneldekiPersonelTeminButonunaTiklanir() {
        ReusableMethods.visibleWait(homepage.leftPanelPertemButton, 5);
        ReusableMethods.click(homepage.leftPanelPertemButton);
    }

    @Then("Personel Temin islemleri panelindeki Tanimlamalar Menüsü icerisinde bulunan Genel Tanimlamalar butonu uzerine tiklanir")
    public void personelTeminIslemleriPanelindekiTanimlamalarMenüsüIcerisindeBulunanGenelTanimlamalarButonuUzerineTiklanir() {
        ReusableMethods.bekle(1);
        ReusableMethods.click(homepage.definitionsExpandMenu);
        ReusableMethods.visibleWait(definitions.generalDefinitionsButton, 5);
        ReusableMethods.click(definitions.generalDefinitionsButton);
    }

    @Then("Genel Tanımlamalar ekraninin acildıgi gorulur")
    public void genelTanımlamalarEkranininAcildıgiGorulur() {
        ReusableMethods.visibleWait(generalDefinitions.generalDefinitionsTitle, 5);
        Assert.assertTrue(generalDefinitions.generalDefinitionsTitle.isDisplayed());
    }

    @Then("Tanimlamalar Listesi alaninda bulunan Ekle butonu uzerine tiklanir")
    public void tanimlamalarListesiAlanindaBulunanEkleButonuUzerineTiklanir() {
        ReusableMethods.click(generalDefinitions.addButton);

    }

    @Then("Tanimlamalar Ekle panelinin acildigi gorulur")
    public void tanimlamalarEklePanelininAcildigiGorulur() {
        ReusableMethods.visibleWait(definitionsSave.definitionsAddPanelTitle, 5);
        Assert.assertTrue(definitionsSave.definitionsAddPanelTitle.isDisplayed());
    }


    @Then("Tanimlamalar Duzenle ekraninin acildigi gorulur")
    public void tanimlamalarDuzenleEkranininAcildigiGorulur() {
        ReusableMethods.visibleWait(definitionsUpdate.tanimlamalarDuzenleBasligi, 5);
        Assert.assertTrue(definitionsUpdate.tanimlamalarDuzenleBasligi.isDisplayed());
    }


    @Then("Tanimlamalar Listesinde aratilan kodun yer aldigi gorulur")
    public void tanimlamalarListesindeAratilanKodunYerAldigiGorulur() {
        //.visibleWait(genelTanimlamalar.listeyeEnSonEklenenSatir, 10);
        //Assert.assertTrue(genelTanimlamalar.listeyeEnSonEklenenSatir.isDisplayed());
        ReusableMethods.bekle(2);
        ReusableMethods.click(generalDefinitions.clearButton);
    }


    @Then("Silme Onay pop-up inin acildigi ve onay uyari metninin yer aldigi gorulur")
    public void silmeOnayPopUpIninAcildigiVeOnayUyariMetnininYerAldigiGorulur() {
        ReusableMethods.visibleWait(generalDefinitions.alertDialog, 5);
        Assert.assertTrue(generalDefinitions.alertDialog.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("Silme Onay pop-undaki Sil butonuna tiklanir")
    public void silmeOnayPopUndakiSilButonunaTiklanir() {
        ReusableMethods.click(generalDefinitions.deleteInAlertDialog);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Temin Tipi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanTeminTipiTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(definitionsSave.tableInPanel, 5);
        ReusableMethods.click(definitionsSave.tableInPanel);
        ReusableMethods.visibleWait(definitionsSave.tableSupplyTypeDefinition, 2);
        ReusableMethods.click(definitionsSave.tableSupplyTypeDefinition);
        definitionsSave.kod.sendKeys(ConfigReader.getProperty("kod"), Keys.TAB, ConfigReader.getProperty("öncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("kisaMetin"), Keys.TAB, ConfigReader.getProperty("uzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(definitionsSave.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Ehliyet Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanEhliyetTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(definitionsSave.tableInPanel, 5);
        ReusableMethods.click(definitionsSave.tableInPanel);
        ReusableMethods.visibleWait(definitionsSave.tablodakiEhliyetTanimlama, 2);
        ReusableMethods.click(definitionsSave.tablodakiEhliyetTanimlama);
        definitionsSave.kod.sendKeys(ConfigReader.getProperty("ehliyetKod"), Keys.TAB, ConfigReader.getProperty("ehliyetOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("ehliyetKisaMetin"), Keys.TAB, ConfigReader.getProperty("ehliyetUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(definitionsSave.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Devlet Sinavi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanDevletSinaviTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(definitionsSave.tableInPanel, 5);
        ReusableMethods.click(definitionsSave.tableInPanel);
        ReusableMethods.visibleWait(definitionsSave.tablodakiDevletSinaviTanimlama, 2);
        ReusableMethods.click(definitionsSave.tablodakiDevletSinaviTanimlama);
        definitionsSave.kod.sendKeys(ConfigReader.getProperty("devletSinaviKod"), Keys.TAB, ConfigReader.getProperty("devletSirasiOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("devletSirasiKisaMetin"), Keys.TAB, ConfigReader.getProperty("devletSirasiUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(definitionsSave.kaydetButonu);
    }

    @Then("Basarili pop-up’ının geldigi ve Tanimlamalar Listesinde eklenen kaydin yer aldigi gorulur")
    public void basariliPopUpInınGeldigiVeTanimlamalarListesindeEklenenKaydinYerAldigiGorulur() {
        ReusableMethods.visibleWait(definitionsSave.basariliPopUp, 5);
        Assert.assertTrue(definitionsSave.basariliPopUp.isDisplayed());
        Assert.assertTrue(generalDefinitions.lastAddedRowToList.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Eklenen kaydin uzerine tiklanir ve duzenle butonuna basilir")
    public void eklenenKaydinUzerineTiklanirVeDuzenleButonunaBasilir() {
        ReusableMethods.click(generalDefinitions.lastAddedRowToList);
        ReusableMethods.visibleWait(generalDefinitions.updateButton, 5);
        ReusableMethods.click(generalDefinitions.updateButton);
    }


    @Then("Basarili pop-up’ının geldigi ve Tanimlamalar Listesinde duzenlenen kaydin yer aldigi gorulur")
    public void basariliPopUpInınGeldigiVeTanimlamalarListesindeDuzenlenenKaydinYerAldigiGorulur() {
        ReusableMethods.visibleWait(definitionsUpdate.basariliPopUp, 5);
        Assert.assertTrue(definitionsUpdate.basariliPopUp.isDisplayed());
        ReusableMethods.visibleWait(generalDefinitions.lastAddedRowToList, 5);
        Assert.assertTrue(generalDefinitions.lastAddedRowToList.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Arama alanindaki Kod alanina {string} girilir ve Sorgula butonuna tiklanir")
    public void aramaAlanindakiKodAlaninaGirilirVeSorgulaButonunaTiklanir(String str) {
        generalDefinitions.codeInSearchField.sendKeys(str);
        ReusableMethods.bekle(2);
        ReusableMethods.click(generalDefinitions.searchButton);
    }

    @Then("Aratilan kaydin uzerine tiklanir ve sil butonuna basilir")
    public void aratilanKaydinUzerineTiklanirVeSilButonunaBasilir() {
        //ReusableMethods.visibleWait(genelTanimlamalar.listeyeEnSonEklenenSatir, 10);
        ReusableMethods.click(generalDefinitions.lastAddedRowToList);
        ReusableMethods.bekle(2);
        ReusableMethods.click(generalDefinitions.deleteButton);
    }


    @Then("Öncelik Sirasi alanina {int} girilir ve ardından Kaydet butonuna tiklanir")
    public void öncelikSirasiAlaninaGirilirVeArdındanKaydetButonunaTiklanir(int sayi) {
        ReusableMethods.bekle(2);
        ReusableMethods.click(definitionsUpdate.oncelikSirasi);
        definitionsUpdate.oncelikSirasi.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        ReusableMethods.bekle(2);
        definitionsUpdate.oncelikSirasi.sendKeys(Keys.UP, Keys.UP);
        ReusableMethods.bekle(2);
        ReusableMethods.click(definitionsUpdate.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Belge Tipi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanBelgeTipiTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(definitionsSave.tableInPanel, 5);
        ReusableMethods.click(definitionsSave.tableInPanel);
        ReusableMethods.visibleWait(definitionsSave.tablodakiBelgeTipiTanimlama, 2);
        ReusableMethods.click(definitionsSave.tablodakiBelgeTipiTanimlama);
        definitionsSave.kod.sendKeys(ConfigReader.getProperty("belgeTipiKod"), Keys.TAB, ConfigReader.getProperty("belgeTipiOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("belgeTipiKisaMetin"), Keys.TAB, ConfigReader.getProperty("belgeTipiUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(definitionsSave.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Sürec Tipi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanSürecTipiTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(definitionsSave.tableInPanel, 5);
        ReusableMethods.click(definitionsSave.tableInPanel);
        ReusableMethods.visibleWait(definitionsSave.tablodakiSurecTipiTanimlama, 2);
        ReusableMethods.click(definitionsSave.tablodakiSurecTipiTanimlama);
        definitionsSave.kod.sendKeys(ConfigReader.getProperty("surecKod"), Keys.TAB, ConfigReader.getProperty("surecOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("surecKisaMetin"), Keys.TAB, ConfigReader.getProperty("surecUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(definitionsSave.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Komisyon Uye Tipi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanKomisyonUyeTipiTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(definitionsSave.tableInPanel, 5);
        ReusableMethods.click(definitionsSave.tableInPanel);
        ReusableMethods.visibleWait(definitionsSave.tablodakiKomisyonUyeTipiTanimlama, 2);
        ReusableMethods.click(definitionsSave.tablodakiKomisyonUyeTipiTanimlama);
        definitionsSave.kod.sendKeys(ConfigReader.getProperty("komisyonKod"), Keys.TAB, ConfigReader.getProperty("komisyonOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("komisyonKisaMetin"), Keys.TAB, ConfigReader.getProperty("komisyonUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(definitionsSave.kaydetButonu);
    }

    @Then("Uzun Metin alanina {string} girilir ve ardindan Kaydet butonuna tiklanir")
    public void uzunMetinAlaninaGirilirVeArdindanKaydetButonunaTiklanir(String str) {
        ReusableMethods.bekle(2);
        ReusableMethods.click(definitionsUpdate.uzunMetin);
        definitionsUpdate.uzunMetin.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        ReusableMethods.bekle(2);
        definitionsUpdate.uzunMetin.sendKeys(str);
        ReusableMethods.bekle(2);
        ReusableMethods.click(definitionsUpdate.kaydetButonu);
    }

    @Then("Kisa Metin alanina {string} girilir ve ardindan Kaydet butonuna tiklanir")
    public void kisaMetinAlaninaGirilirVeArdindanKaydetButonunaTiklanir(String str) {
        ReusableMethods.bekle(2);
        ReusableMethods.click(definitionsUpdate.kisaMetin);
        definitionsUpdate.kisaMetin.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        ReusableMethods.bekle(2);
        definitionsUpdate.kisaMetin.sendKeys(str);
        ReusableMethods.bekle(2);
        ReusableMethods.click(definitionsUpdate.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Soru Grubu Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanSoruGrubuTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(definitionsSave.tableInPanel, 5);
        ReusableMethods.click(definitionsSave.tableInPanel);
        ReusableMethods.visibleWait(definitionsSave.tablodakiSoruGrubuTanimlama, 2);
        ReusableMethods.click(definitionsSave.tablodakiSoruGrubuTanimlama);
        definitionsSave.kod.sendKeys(ConfigReader.getProperty("soruGrubuKod"), Keys.TAB, ConfigReader.getProperty("soruGrubuOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("soruGrubuKisaMetin"), Keys.TAB, ConfigReader.getProperty("soruGrubuUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(definitionsSave.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Soru Zorluk Derecesi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanSoruZorlukDerecesiTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(definitionsSave.tableInPanel, 5);
        ReusableMethods.click(definitionsSave.tableInPanel);
        ReusableMethods.visibleWait(definitionsSave.tablodakiSoruZorlukDerecesiTanimlama, 2);
        ReusableMethods.click(definitionsSave.tablodakiSoruZorlukDerecesiTanimlama);
        definitionsSave.kod.sendKeys(ConfigReader.getProperty("soruZorlukDerecesiKod"), Keys.TAB, ConfigReader.getProperty("soruZorlukDerecesiOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("soruZorlukDerecesiKisaMetin"), Keys.TAB, ConfigReader.getProperty("soruZorlukDerecesiUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(definitionsSave.kaydetButonu);
    }

    @Then("Personel Temin islemleri panelindeki Tanimlamalar Menüsü icerisinde bulunan Surec Yeri Tanimlama butonu uzerine tiklanir")
    public void personelTeminIslemleriPanelindekiTanimlamalarMenüsüIcerisindeBulunanSurecYeriTanimlamaButonuUzerineTiklanir() {
        ReusableMethods.bekle(1);
        ReusableMethods.click(homepage.definitionsExpandMenu);
        ReusableMethods.visibleWait(definitions.processPlaceDefinitionsButton, 5);
        ReusableMethods.click(definitions.processPlaceDefinitionsButton);
    }

    @Then("Surec Yeri Tanimlama ekraninin acildıgi gorulur")
    public void surecYeriTanimlamaEkranininAcildıgiGorulur() {
        ReusableMethods.visibleWait(processPlaceDefinition.processPlaceTitle, 5);
        Assert.assertTrue(processPlaceDefinition.processPlaceTitle.isDisplayed());
    }

    @Then("Surec Yeri Ekle panelinin acildigi gorulur")
    public void surecYeriEklePanelininAcildigiGorulur() {
        ReusableMethods.visibleWait(processPlaceSave.processPlaceTitle, 5);
        Assert.assertTrue(processPlaceSave.processPlaceTitle.isDisplayed());
    }

    @Then("Surec Yeri Ekle panelindeki alanlar doldurulur ardindan Kaydet butonuna tiklanir")
    public void surecYeriEklePanelindekiAlanlarDoldurulurArdindanKaydetButonunaTiklanir() {
        processPlaceSave.processPlaceNameInPanel.sendKeys(ConfigReader.getProperty("surecYeriAdi"));
        ReusableMethods.click(processPlaceSave.cityInPanel);
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        processPlaceSave.capacityInPanel.sendKeys(ConfigReader.getProperty("kapasite"),
                Keys.TAB, ConfigReader.getProperty("aciklama"));
        ReusableMethods.click(processPlaceSave.activeCheckboxInPanel);
        ReusableMethods.bekle(2);
        ReusableMethods.click(processPlaceSave.submitButtonInPanel);

    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String str) {
        Driver.getDriver().get(ConfigReader.getProperty(str));
        ReusableMethods.bekle(2);
    }

    @Then("{string} ve {string} girilir")
    public void veGirilir(String kullaniciAd, String parola) {
        publicPage.kullaniciAdi.sendKeys(kullaniciAd, Keys.TAB, parola);
        ReusableMethods.bekle(2);
    }

    @Then("portala giris yapilir")
    public void portalaGirisYapilir() {
        ReusableMethods.click(publicPage.girisYap);
    }
}
