package apybs.recruitment.stepDefinition;

import apybs.recruitment.pages.*;
import apybs.utilities.ConfigReader;
import apybs.utilities.Driver;
import apybs.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class StepDefs {


    Anasayfa anasayfa = new Anasayfa();
    Tanimlamalar tanimlamalar = new Tanimlamalar();
    GenelTanimlamalar genelTanimlamalar = new GenelTanimlamalar();
    TanimlamalarEkle tanimlamalarEkle = new TanimlamalarEkle();
    TanimlamalarDuzenle definitionsUpdate = new TanimlamalarDuzenle();
    SurecYeriEkle processPlaceSave = new SurecYeriEkle();
    Actions actions = new Actions(Driver.getDriver());


    @Then("Personel Temin islemleri panelindeki Tanimlamalar Menüsü icerisinde bulunan Genel Tanimlamalar butonu uzerine tiklanir")
    public void personelTeminIslemleriPanelindekiTanimlamalarMenüsüIcerisindeBulunanGenelTanimlamalarButonuUzerineTiklanir() {
        ReusableMethods.visibleWait(anasayfa.definitionsExpandMenu, 2);
        ReusableMethods.click(anasayfa.definitionsExpandMenu);
        ReusableMethods.visibleWait(tanimlamalar.genelTanimlamalarButonu, 5);
        ReusableMethods.click(tanimlamalar.genelTanimlamalarButonu);
    }

    @Then("Genel Tanımlamalar ekraninin acildıgi gorulur")
    public void genelTanımlamalarEkranininAcildıgiGorulur() {
        ReusableMethods.visibleWait(genelTanimlamalar.genelTanimlamalarBasligi, 5);
        Assert.assertTrue(genelTanimlamalar.genelTanimlamalarBasligi.isDisplayed());
    }

    @Then("Tanimlamalar Listesi alaninda bulunan Ekle butonu uzerine tiklanir")
    public void tanimlamalarListesiAlanindaBulunanEkleButonuUzerineTiklanir() {
        ReusableMethods.click(genelTanimlamalar.ekleButonu);

    }

    @Then("Tanimlamalar Ekle panelinin acildigi gorulur")
    public void tanimlamalarEklePanelininAcildigiGorulur() {
        ReusableMethods.visibleWait(tanimlamalarEkle.tanimlamalarEklePaneli, 5);
        Assert.assertTrue(tanimlamalarEkle.tanimlamalarEklePaneli.isDisplayed());
    }


    @Then("Tanimlamalar Duzenle ekraninin acildigi gorulur")
    public void tanimlamalarDuzenleEkranininAcildigiGorulur() {
        ReusableMethods.visibleWait(definitionsUpdate.tanimlamalarDuzenleBasligi, 5);
        Assert.assertTrue(definitionsUpdate.tanimlamalarDuzenleBasligi.isDisplayed());
    }


    @Then("Tanimlamalar Listesinde aratilan kodun yer aldigi gorulur")
    public void tanimlamalarListesindeAratilanKodunYerAldigiGorulur() {
        ReusableMethods.visibleWait(genelTanimlamalar.aramaAlanindakiKod, 10);
        Assert.assertTrue(genelTanimlamalar.listeyeSonEklenenSatir.isDisplayed());
        ReusableMethods.bekle(2);
        ReusableMethods.click(genelTanimlamalar.temizleButonu);
    }


    @Then("Silme Onay pop-up inin acildigi ve onay uyari metninin yer aldigi gorulur")
    public void silmeOnayPopUpIninAcildigiVeOnayUyariMetnininYerAldigiGorulur() {
        ReusableMethods.visibleWait(genelTanimlamalar.alertDialog, 5);
        Assert.assertTrue(genelTanimlamalar.alertDialog.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("Silme Onay pop-undaki Sil butonuna tiklanir")
    public void silmeOnayPopUndakiSilButonunaTiklanir() {
        ReusableMethods.click(genelTanimlamalar.deleteInAlertDialog);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Temin Tipi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanTeminTipiTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(tanimlamalarEkle.paneldekiTabloAlani, 5);
        ReusableMethods.click(tanimlamalarEkle.paneldekiTabloAlani);
        ReusableMethods.visibleWait(tanimlamalarEkle.tableSupplyTypeDefinition, 2);
        ReusableMethods.click(tanimlamalarEkle.tableSupplyTypeDefinition);
        tanimlamalarEkle.kod.sendKeys(ConfigReader.getProperty("kod"), Keys.TAB, ConfigReader.getProperty("öncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("kisaMetin"), Keys.TAB, ConfigReader.getProperty("uzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(tanimlamalarEkle.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Ehliyet Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanEhliyetTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(tanimlamalarEkle.paneldekiTabloAlani, 5);
        ReusableMethods.click(tanimlamalarEkle.paneldekiTabloAlani);
        ReusableMethods.visibleWait(tanimlamalarEkle.tablodakiEhliyetTanimlama, 2);
        ReusableMethods.click(tanimlamalarEkle.tablodakiEhliyetTanimlama);
        tanimlamalarEkle.kod.sendKeys(ConfigReader.getProperty("ehliyetKod"), Keys.TAB, ConfigReader.getProperty("ehliyetOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("ehliyetKisaMetin"), Keys.TAB, ConfigReader.getProperty("ehliyetUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(tanimlamalarEkle.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Devlet Sinavi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanDevletSinaviTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(tanimlamalarEkle.paneldekiTabloAlani, 5);
        ReusableMethods.click(tanimlamalarEkle.paneldekiTabloAlani);
        ReusableMethods.visibleWait(tanimlamalarEkle.tablodakiDevletSinaviTanimlama, 2);
        ReusableMethods.click(tanimlamalarEkle.tablodakiDevletSinaviTanimlama);
        tanimlamalarEkle.kod.sendKeys(ConfigReader.getProperty("devletSinaviKod"), Keys.TAB, ConfigReader.getProperty("devletSirasiOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("devletSirasiKisaMetin"), Keys.TAB, ConfigReader.getProperty("devletSirasiUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(tanimlamalarEkle.kaydetButonu);
    }

    @Then("Basarili pop-up’ının geldigi ve Tanimlamalar Listesinde eklenen kaydin yer aldigi gorulur")
    public void basariliPopUpInınGeldigiVeTanimlamalarListesindeEklenenKaydinYerAldigiGorulur() {
        ReusableMethods.visibleWait(tanimlamalarEkle.basariliPopUp, 5);
        Assert.assertTrue(tanimlamalarEkle.basariliPopUp.isDisplayed());
        ReusableMethods.visibleWait(genelTanimlamalar.listeyeSonEklenenSatir, 2);
        Assert.assertTrue(genelTanimlamalar.listeyeSonEklenenSatir.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Eklenen kaydin uzerine tiklanir ve duzenle butonuna basilir")
    public void eklenenKaydinUzerineTiklanirVeDuzenleButonunaBasilir() {
        ReusableMethods.click(genelTanimlamalar.listeyeSonEklenenSatir);
        ReusableMethods.visibleWait(genelTanimlamalar.guncelleButonu, 5);
        ReusableMethods.click(genelTanimlamalar.guncelleButonu);
    }


    @Then("Basarili pop-up’ının geldigi ve Tanimlamalar Listesinde duzenlenen kaydin yer aldigi gorulur")
    public void basariliPopUpInınGeldigiVeTanimlamalarListesindeDuzenlenenKaydinYerAldigiGorulur() {
        ReusableMethods.visibleWait(definitionsUpdate.basariliPopUp, 10);
        Assert.assertTrue(definitionsUpdate.basariliPopUp.isDisplayed());
        ReusableMethods.visibleWait(genelTanimlamalar.listeyeSonEklenenSatir, 5);
        Assert.assertTrue(genelTanimlamalar.listeyeSonEklenenSatir.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Arama alanindaki Kod alanina {string} girilir ve Sorgula butonuna tiklanir")
    public void aramaAlanindakiKodAlaninaGirilirVeSorgulaButonunaTiklanir(String str) {
        genelTanimlamalar.aramaAlanindakiKod.sendKeys(str);
        ReusableMethods.bekle(2);
        ReusableMethods.click(genelTanimlamalar.aramaButonu);
    }

    @Then("Aratilan kaydin uzerine tiklanir ve sil butonuna basilir")
    public void aratilanKaydinUzerineTiklanirVeSilButonunaBasilir() {
        ReusableMethods.visibleWait(genelTanimlamalar.listeyeSonEklenenSatir, 10);
        ReusableMethods.click(genelTanimlamalar.listeyeSonEklenenSatir);
        ReusableMethods.bekle(2);
        ReusableMethods.click(genelTanimlamalar.silButonu);
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
        ReusableMethods.visibleWait(tanimlamalarEkle.paneldekiTabloAlani, 5);
        ReusableMethods.click(tanimlamalarEkle.paneldekiTabloAlani);
        ReusableMethods.visibleWait(tanimlamalarEkle.tablodakiBelgeTipiTanimlama, 2);
        ReusableMethods.click(tanimlamalarEkle.tablodakiBelgeTipiTanimlama);
        tanimlamalarEkle.kod.sendKeys(ConfigReader.getProperty("belgeTipiKod"), Keys.TAB, ConfigReader.getProperty("belgeTipiOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("belgeTipiKisaMetin"), Keys.TAB, ConfigReader.getProperty("belgeTipiUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(tanimlamalarEkle.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Sürec Tipi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanSürecTipiTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(tanimlamalarEkle.paneldekiTabloAlani, 5);
        ReusableMethods.click(tanimlamalarEkle.paneldekiTabloAlani);
        ReusableMethods.visibleWait(tanimlamalarEkle.tablodakiSurecTipiTanimlama, 2);
        ReusableMethods.click(tanimlamalarEkle.tablodakiSurecTipiTanimlama);
        tanimlamalarEkle.kod.sendKeys(ConfigReader.getProperty("surecKod"), Keys.TAB, ConfigReader.getProperty("surecOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("surecKisaMetin"), Keys.TAB, ConfigReader.getProperty("surecUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(tanimlamalarEkle.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Komisyon Uye Tipi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanKomisyonUyeTipiTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(tanimlamalarEkle.paneldekiTabloAlani, 5);
        ReusableMethods.click(tanimlamalarEkle.paneldekiTabloAlani);
        ReusableMethods.visibleWait(tanimlamalarEkle.tablodakiKomisyonUyeTipiTanimlama, 2);
        ReusableMethods.click(tanimlamalarEkle.tablodakiKomisyonUyeTipiTanimlama);
        tanimlamalarEkle.kod.sendKeys(ConfigReader.getProperty("komisyonKod"), Keys.TAB, ConfigReader.getProperty("komisyonOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("komisyonKisaMetin"), Keys.TAB, ConfigReader.getProperty("komisyonUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(tanimlamalarEkle.kaydetButonu);
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
        ReusableMethods.visibleWait(tanimlamalarEkle.paneldekiTabloAlani, 5);
        ReusableMethods.click(tanimlamalarEkle.paneldekiTabloAlani);
        ReusableMethods.visibleWait(tanimlamalarEkle.tablodakiSoruGrubuTanimlama, 2);
        ReusableMethods.click(tanimlamalarEkle.tablodakiSoruGrubuTanimlama);
        tanimlamalarEkle.kod.sendKeys(ConfigReader.getProperty("soruGrubuKod"), Keys.TAB, ConfigReader.getProperty("soruGrubuOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("soruGrubuKisaMetin"), Keys.TAB, ConfigReader.getProperty("soruGrubuUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(tanimlamalarEkle.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Soru Zorluk Derecesi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanSoruZorlukDerecesiTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(tanimlamalarEkle.paneldekiTabloAlani, 5);
        ReusableMethods.click(tanimlamalarEkle.paneldekiTabloAlani);
        ReusableMethods.visibleWait(tanimlamalarEkle.tablodakiSoruZorlukDerecesiTanimlama, 2);
        ReusableMethods.click(tanimlamalarEkle.tablodakiSoruZorlukDerecesiTanimlama);
        tanimlamalarEkle.kod.sendKeys(ConfigReader.getProperty("soruZorlukDerecesiKod"), Keys.TAB, ConfigReader.getProperty("soruZorlukDerecesiOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("soruZorlukDerecesiKisaMetin"), Keys.TAB, ConfigReader.getProperty("soruZorlukDerecesiUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(tanimlamalarEkle.kaydetButonu);
    }

    @Then("Personel Temin islemleri panelindeki Tanimlamalar Menüsü icerisinde bulunan Surec Yeri Tanimlama butonu uzerine tiklanir")
    public void personelTeminIslemleriPanelindekiTanimlamalarMenüsüIcerisindeBulunanSurecYeriTanimlamaButonuUzerineTiklanir() {
        ReusableMethods.bekle(1);
        ReusableMethods.click(anasayfa.definitionsExpandMenu);
        ReusableMethods.visibleWait(tanimlamalar.surecYeriTanimlamaButonu, 5);
        ReusableMethods.click(tanimlamalar.surecYeriTanimlamaButonu);
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


    @And("Basarili pop-up’inin geldigi ve Listede silinen kaydin olmadigi dogrulanir")
    public void basariliPopUpIninGeldigiVeListedeSilinenKaydinOlmadigiDogrulanir() {
        ReusableMethods.visibleWait(genelTanimlamalar.basariliPopUpForDelete, 5);
        Assert.assertTrue(genelTanimlamalar.basariliPopUpForDelete.isDisplayed());
    }

    @Then("Personel Temin islemleri panelindeki Sinav islemleri Menusu icerisinde bulunan Soru Tanimlamalar butonu uzerine tiklanir")
    public void personelTeminIslemleriPanelindekiSinavIslemleriMenusuIcerisindeBulunanSoruTanimlamalarButonuUzerineTiklanir() {
        ReusableMethods.visibleWait(anasayfa.examOperationsExpandMenu, 5);
        ReusableMethods.click(anasayfa.examOperationsExpandMenu);
    }

    @Then("emre abi")
    public void emreAbi() {

    }
}
