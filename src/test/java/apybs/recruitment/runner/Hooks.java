package apybs.recruitment.runner;

import apybs.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    /*
   Hooks class'inin kullanim amaci scenario'lardan önce veya sonra calismasini istedigimiz kodlari
   belirttigimiz class'tir. Bunu @Before ve @After notasyonlarina sahip methodlar ile yapariz.
   Bu notasyonlarin import'u io.cucumber'dan olmalidir.
   Bu class'in scenario'lar tarafindan gorulup buradaki @Before, @After methodlarinin isleme
   alabilmesi icin Hooks class'ini farklı bir package'da olusturmak istersek Runner class'indaki
   glue parametresine bu package'i tanimlamamiz gerekir. Ancak Hooks class'ini direkt stepDefinition
   package'i altinda olusturursak Runner class'indaki glue parametresinde stepDefinition package'i
   tanimli oldugu icin baska bir islem yapmamiza gerek kalmaz. glue parametresinde stepDefinition
   package'i tanimli oldugu icin direkt Hooks class'ini da kullanabiliriz.
   Hooks'un asıl amacı, Scenario fail olursa @After methodu ile rapora resim eklemektir.
    */


    @Before("@hooks")
    public void setUp() throws Exception {
        System.out.println("ilk burası başlıyor");
    }

    /*
    Scenario'dan önce calismasini istedigimiz @Before methodunun
    notasyonuna parametre olarak scenario'ya tanımladigimiz tag'i
    belirtebiliriz. Dolayısıyla sadece parametre olarak belirttigimiz
    @Before methodu Scenario'dan önce calisacaktir.
     */

    @After//import io.cucumber.java.After;
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {//Scenario fail olursa
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/jpeg",
                    "scenario_" + scenario.getName());
            Driver.closeDriver();
        }
    }
    //Bu method fail olan scenario'larda fail olan kismin resmini rapora ekleyecektir.
}
