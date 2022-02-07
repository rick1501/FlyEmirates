package fly.emirates.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HacerReservas extends PageObject {


    public static  final Target Seletbtn1 = Target.the("CLASE")
            .located(By.xpath("//*[@id=\"ctl00_c_Mresult1_ctl02_IdEconomySelect\"]"));

    public static  final Target Seletbtn2 = Target.the("CLASE")
            .located(By.xpath("//*[@id=\"ctl00_IdEconomySelect\"]"));

    public static  final Target Clickcont = Target.the("CLASE")
            .located(By.xpath("//A[@id='ctl00_c_lnkContinue']"));
}
