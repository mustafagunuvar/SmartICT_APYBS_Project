package apybs.recruitment.pages;

import apybs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralDefinitions {
    public GeneralDefinitions() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1")
    public WebElement generalDefinitionsTitle;

    @FindBy(xpath = "//*[text()='Ekle']")
    public WebElement addButton;

    @FindBy(xpath = "//*[@id='HRM_PER_A_EKO_GENELTANIMISLEM_001_edit']")
    public WebElement updateButton;

    @FindBy(xpath = "//*[text()='Sil']")
    public WebElement deleteButton;

    @FindBy(xpath = "(//tr/td)[1]")
    public WebElement lastAddedRowToList;

    @FindBy(xpath = "(//*[@id='code'])[1]")
    public WebElement codeInSearchField;

    @FindBy(xpath = "(//*[@id='shortText'])[1]")
    public WebElement shortTextInSearchField;

    @FindBy(xpath = "//*[text()='Sorgula']")
    public WebElement searchButton;

    @FindBy(xpath = "//*[text()='Temizle']")
    public WebElement clearButton;

    @FindBy(xpath = "//*[@role='alertdialog']")
    public WebElement alertDialog;

    @FindBy(xpath = "(//*[text()='Sil'])[2]")
    public WebElement deleteInAlertDialog;






}
