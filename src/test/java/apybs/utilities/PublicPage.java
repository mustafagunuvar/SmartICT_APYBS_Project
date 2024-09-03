package apybs.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PublicPage {
    public PublicPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='usernameInput']")
    public WebElement kullaniciAdi;

    @FindBy(xpath = "//*[@id='passwordInput']")
    public WebElement parola;

    @FindBy(xpath = "//*[text()='Giriş Yap']")
    public WebElement girisYap;

    @FindBy(xpath = "//p-dropdown[@id='profileInput']")
    public WebElement profilSecme;

    @FindBy(xpath = "//*[@aria-label='EKÖ Admin Profil']")
    public WebElement ekoAdminProfili;

    @FindBy(xpath = "//*[text()='Devam Et']")
    public WebElement devamEt;






}
