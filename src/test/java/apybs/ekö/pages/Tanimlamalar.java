package apybs.ekö.pages;

import apybs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tanimlamalar {
    public Tanimlamalar() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[text()='Genel Tanımlamalar']")
    public WebElement genelTanimlamalar;



}
