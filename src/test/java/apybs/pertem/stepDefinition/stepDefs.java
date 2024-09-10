package apybs.pertem.stepDefinition;

import apybs.pertem.pages.*;
import apybs.utilities.ConfigReader;
import apybs.utilities.Driver;
import apybs.utilities.PublicPage;
import apybs.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class stepDefs {

    PublicPage publicPage = new PublicPage();
    Anasayfa anasayfa = new Anasayfa();
    Tanimlamalar tanimlamalar = new Tanimlamalar();
    Genel_Tanimlamalar genelTanimlamalar = new Genel_Tanimlamalar();
    Tanimlamalar_Ekle tanimlamalarEkle = new Tanimlamalar_Ekle();
    Tanimlamalar_Duzenle tanimlamalarDuzenle = new Tanimlamalar_Duzenle();
    Actions actions = new Actions(Driver.getDriver());


    @Then("personel temin profili secilir")
    public void personelTeminProfiliSecilir() {
        ReusableMethods.click(publicPage.profilSecme);
        ReusableMethods.visibleWait(publicPage.pertemProfili, 5);
        ReusableMethods.click(publicPage.pertemProfili);
        ReusableMethods.bekle(2);
        ReusableMethods.click(publicPage.devamEt);
    }

    @Then("ana paneldeki personel temin butonuna tiklanir")
    public void anaPaneldekiPersonelTeminButonunaTiklanir() {
        ReusableMethods.visibleWait(anasayfa.paneldekiPertem, 5);
        ReusableMethods.click(anasayfa.paneldekiPertem);
    }

    @Then("Personel Temin islemleri panelindeki Tanimlamalar Menüsü icerisinde bulunan Genel Tanimlamalar butonu uzerine tiklanir")
    public void personelTeminIslemleriPanelindekiTanimlamalarMenüsüIcerisindeBulunanGenelTanimlamalarButonuUzerineTiklanir() {
        ReusableMethods.bekle(1);
        ReusableMethods.click(anasayfa.tanimlamalar);
        ReusableMethods.visibleWait(tanimlamalar.genelTanimlamalar, 5);
        ReusableMethods.click(tanimlamalar.genelTanimlamalar);
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
        ReusableMethods.visibleWait(tanimlamalarEkle.tanimlamalarEklePanelBasligi, 5);
        Assert.assertTrue(tanimlamalarEkle.tanimlamalarEklePanelBasligi.isDisplayed());
    }


    @Then("Tanimlamalar Duzenle ekraninin acildigi gorulur")
    public void tanimlamalarDuzenleEkranininAcildigiGorulur() {
        ReusableMethods.visibleWait(tanimlamalarDuzenle.tanimlamalarDuzenleBasligi, 5);
        Assert.assertTrue(tanimlamalarDuzenle.tanimlamalarDuzenleBasligi.isDisplayed());
    }


    @Then("Tanimlamalar Listesinde aratilan kodun yer aldigi gorulur")
    public void tanimlamalarListesindeAratilanKodunYerAldigiGorulur() {
        //.visibleWait(genelTanimlamalar.listeyeEnSonEklenenSatir, 10);
        //Assert.assertTrue(genelTanimlamalar.listeyeEnSonEklenenSatir.isDisplayed());
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
        ReusableMethods.click(genelTanimlamalar.alertDialogIcindekiSil);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Temin Tipi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanTeminTipiTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(tanimlamalarEkle.paneldekiTablo, 5);
        ReusableMethods.click(tanimlamalarEkle.paneldekiTablo);
        ReusableMethods.visibleWait(tanimlamalarEkle.tablodakiTeminTipiTanimlama, 2);
        ReusableMethods.click(tanimlamalarEkle.tablodakiTeminTipiTanimlama);
        tanimlamalarEkle.kod.sendKeys(ConfigReader.getProperty("kod"), Keys.TAB, ConfigReader.getProperty("öncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("kisaMetin"), Keys.TAB, ConfigReader.getProperty("uzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(tanimlamalarEkle.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Ehliyet Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanEhliyetTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(tanimlamalarEkle.paneldekiTablo, 5);
        ReusableMethods.click(tanimlamalarEkle.paneldekiTablo);
        ReusableMethods.visibleWait(tanimlamalarEkle.tablodakiEhliyetTanimlama, 2);
        ReusableMethods.click(tanimlamalarEkle.tablodakiEhliyetTanimlama);
        tanimlamalarEkle.kod.sendKeys(ConfigReader.getProperty("ehliyetKod"), Keys.TAB, ConfigReader.getProperty("ehliyetOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("ehliyetKisaMetin"), Keys.TAB, ConfigReader.getProperty("ehliyetUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(tanimlamalarEkle.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Devlet Sinavi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanDevletSinaviTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(tanimlamalarEkle.paneldekiTablo, 5);
        ReusableMethods.click(tanimlamalarEkle.paneldekiTablo);
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
        Assert.assertTrue(genelTanimlamalar.listeyeEnSonEklenenSatir.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Eklenen kaydin uzerine tiklanir ve duzenle butonuna basilir")
    public void eklenenKaydinUzerineTiklanirVeDuzenleButonunaBasilir() {
        ReusableMethods.click(genelTanimlamalar.listeyeEnSonEklenenSatir);
        ReusableMethods.visibleWait(genelTanimlamalar.duzenleButonu, 5);
        ReusableMethods.click(genelTanimlamalar.duzenleButonu);
    }


    @Then("Basarili pop-up’ının geldigi ve Tanimlamalar Listesinde duzenlenen kaydin yer aldigi gorulur")
    public void basariliPopUpInınGeldigiVeTanimlamalarListesindeDuzenlenenKaydinYerAldigiGorulur() {
        ReusableMethods.visibleWait(tanimlamalarDuzenle.basariliPopUp, 5);
        Assert.assertTrue(tanimlamalarDuzenle.basariliPopUp.isDisplayed());
        ReusableMethods.visibleWait(genelTanimlamalar.listeyeEnSonEklenenSatir, 5);
        Assert.assertTrue(genelTanimlamalar.listeyeEnSonEklenenSatir.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Arama alanindaki Kod alanina {string} girilir ve Sorgula butonuna tiklanir")
    public void aramaAlanindakiKodAlaninaGirilirVeSorgulaButonunaTiklanir(String str) {
        genelTanimlamalar.aramaAlanindakiKod.sendKeys(str);
        ReusableMethods.bekle(2);
        ReusableMethods.click(genelTanimlamalar.sorgulaButonu);
    }

    @Then("Aratilan kaydin uzerine tiklanir ve sil butonuna basilir")
    public void aratilanKaydinUzerineTiklanirVeSilButonunaBasilir() {
        //ReusableMethods.visibleWait(genelTanimlamalar.listeyeEnSonEklenenSatir, 10);
        ReusableMethods.click(genelTanimlamalar.listeyeEnSonEklenenSatir);
        ReusableMethods.bekle(2);
        ReusableMethods.click(genelTanimlamalar.silButonu);
    }


    @Then("Öncelik Sirasi alanina {int} girilir ve ardından Kaydet butonuna tiklanir")
    public void öncelikSirasiAlaninaGirilirVeArdındanKaydetButonunaTiklanir(int sayi) {
        ReusableMethods.bekle(2);
        ReusableMethods.click(tanimlamalarDuzenle.oncelikSirasi);
        tanimlamalarDuzenle.oncelikSirasi.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        ReusableMethods.bekle(2);
        tanimlamalarDuzenle.oncelikSirasi.sendKeys(Keys.UP, Keys.UP);
        ReusableMethods.bekle(2);
        ReusableMethods.click(tanimlamalarDuzenle.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Belge Tipi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanBelgeTipiTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(tanimlamalarEkle.paneldekiTablo, 5);
        ReusableMethods.click(tanimlamalarEkle.paneldekiTablo);
        ReusableMethods.visibleWait(tanimlamalarEkle.tablodakiBelgeTipiTanimlama, 2);
        ReusableMethods.click(tanimlamalarEkle.tablodakiBelgeTipiTanimlama);
        tanimlamalarEkle.kod.sendKeys(ConfigReader.getProperty("belgeTipiKod"), Keys.TAB, ConfigReader.getProperty("belgeTipiOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("belgeTipiKisaMetin"), Keys.TAB, ConfigReader.getProperty("belgeTipiUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(tanimlamalarEkle.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Sürec Tipi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanSürecTipiTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(tanimlamalarEkle.paneldekiTablo, 5);
        ReusableMethods.click(tanimlamalarEkle.paneldekiTablo);
        ReusableMethods.visibleWait(tanimlamalarEkle.tablodakiSurecTipiTanimlama, 2);
        ReusableMethods.click(tanimlamalarEkle.tablodakiSurecTipiTanimlama);
        tanimlamalarEkle.kod.sendKeys(ConfigReader.getProperty("surecKod"), Keys.TAB, ConfigReader.getProperty("surecOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("surecKisaMetin"), Keys.TAB, ConfigReader.getProperty("surecUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(tanimlamalarEkle.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Komisyon Uye Tipi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanKomisyonUyeTipiTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(tanimlamalarEkle.paneldekiTablo, 5);
        ReusableMethods.click(tanimlamalarEkle.paneldekiTablo);
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
        ReusableMethods.click(tanimlamalarDuzenle.uzunMetin);
        tanimlamalarDuzenle.uzunMetin.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        ReusableMethods.bekle(2);
        tanimlamalarDuzenle.uzunMetin.sendKeys(str);
        ReusableMethods.bekle(2);
        ReusableMethods.click(tanimlamalarDuzenle.kaydetButonu);
    }

    @Then("Kisa Metin alanina {string} girilir ve ardindan Kaydet butonuna tiklanir")
    public void kisaMetinAlaninaGirilirVeArdindanKaydetButonunaTiklanir(String str) {
        ReusableMethods.bekle(2);
        ReusableMethods.click(tanimlamalarDuzenle.kisaMetin);
        tanimlamalarDuzenle.kisaMetin.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        ReusableMethods.bekle(2);
        tanimlamalarDuzenle.kisaMetin.sendKeys(str);
        ReusableMethods.bekle(2);
        ReusableMethods.click(tanimlamalarDuzenle.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Soru Grubu Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanSoruGrubuTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(tanimlamalarEkle.paneldekiTablo, 5);
        ReusableMethods.click(tanimlamalarEkle.paneldekiTablo);
        ReusableMethods.visibleWait(tanimlamalarEkle.tablodakiSoruGrubuTanimlama, 2);
        ReusableMethods.click(tanimlamalarEkle.tablodakiSoruGrubuTanimlama);
        tanimlamalarEkle.kod.sendKeys(ConfigReader.getProperty("soruGrubuKod"), Keys.TAB, ConfigReader.getProperty("soruGrubuOncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("soruGrubuKisaMetin"), Keys.TAB, ConfigReader.getProperty("soruGrubuUzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(tanimlamalarEkle.kaydetButonu);
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Soru Zorluk Derecesi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanSoruZorlukDerecesiTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(tanimlamalarEkle.paneldekiTablo, 5);
        ReusableMethods.click(tanimlamalarEkle.paneldekiTablo);
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
        ReusableMethods.click(anasayfa.tanimlamalar);
        ReusableMethods.visibleWait(tanimlamalar.
        ReusableMethods.click(tanimlamalar.genelTanimlamalar);

    }
}
