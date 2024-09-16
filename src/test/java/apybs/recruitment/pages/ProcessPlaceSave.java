package apybs.recruitment.pages;

import apybs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcessPlaceSave {
    public ProcessPlaceSave() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@title='Süreç Yeri Ekle']")
    public WebElement processPlaceTitle;

    @FindBy(xpath = "(//*[@id='name'])[3]")
    public WebElement processPlaceNameInPanel ;

    @FindBy(xpath = " (//*[@id='capacity'])[3]")
    public WebElement capacityInPanel ;

    @FindBy(xpath = "(//*[@class='p-checkbox p-component'])[2]")
    public WebElement activeCheckboxInPanel ;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitButtonInPanel ;

    @FindBy(xpath = "(//*[@class='p-dropdown-label p-inputtext p-placeholder ng-star-inserted'])[2]")
    public WebElement cityInPanel ;








}
