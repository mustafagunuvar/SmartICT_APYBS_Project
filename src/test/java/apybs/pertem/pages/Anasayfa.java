package apybs.pertem.pages;

import apybs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Anasayfa {
    public Anasayfa() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='p-element layout-mainmenu-link ng-tns-c4277490939-6'])[2]")
    public WebElement paneldekiPertem;

    @FindBy(xpath = "//*[text()='Tanımlamalar']")
    public WebElement tanimlamalar;


}
