package fly.emirates.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Seleccionvuelos extends PageObject {

    public static  final Target Clickpagos = Target.the("CLASE")
            .located(By.xpath("//*[@id=\"lnkContinue\"]"));
}
