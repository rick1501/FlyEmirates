package fly.emirates.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresoDatos   extends PageObject {

    public static  final Target Click1 = Target.the("CLASE")
            .located(By.xpath("(//A[@class='chosen-single chosen-default'])[1]"));

    public static  final Target Click2 = Target.the("CLASE")
            .located(By.xpath("(//ul[@class='chosen-results'])[1]//li[@class='active-result'][1]"));

    public static  final Target Nom1 = Target.the("CLASE")
            .located(By.xpath("(//input[@class='first-name blue-outline'])[1]"));

    public static  final Target Apll1 = Target.the("CLASE")
            .located(By.xpath("(//input[@class='last-name blue-outline'])[1]"));


    public static  final Target Caja2 = Target.the("CLASE")
            .located(By.xpath("(//div[@class='chosen-container chosen-container-single chosen-container-single-nosearch'])[2]"));

    public static  final Target trata2 = Target.the("CLASE")
            .located(By.xpath("(//ul[@class='chosen-results'])[3]//li[@class='active-result'][1]"));

    public static  final Target Nom2 = Target.the("CLASE")
            .located(By.xpath("(//input[@class='first-name blue-outline'])[2]"));

    public static  final Target Apll2 = Target.the("CLASE")
            .located(By.xpath("(//input[@class='last-name blue-outline'])[2]"));



    public static  final Target Caja3 = Target.the("CLASE")
            .located(By.xpath("(//div[@class='chosen-container chosen-container-single chosen-container-single-nosearch'])[3]"));

    public static  final Target trata3 = Target.the("CLASE")
            .located(By.xpath("(//ul[@class='chosen-results'])[5]//li[@class='active-result'][2]"));

    public static  final Target Nom3 = Target.the("CLASE")
            .located(By.xpath("(//input[@class='first-name blue-outline'])[3]"));

    public static  final Target Apll3 = Target.the("CLASE")
            .located(By.xpath("(//input[@class='last-name blue-outline'])[3]"));



    public static  final Target Caja4 = Target.the("CLASE")
            .located(By.xpath("(//div[@class='chosen-container chosen-container-single chosen-container-single-nosearch'])[4]"));

    public static  final Target trata4 = Target.the("CLASE")
            .located(By.xpath("(//ul[@class='chosen-results'])[7]//li[@class='active-result'][1]"));

    public static  final Target Nom4 = Target.the("CLASE")
            .located(By.xpath("(//input[@class='first-name blue-outline'])[4]"));

    public static  final Target Apll4 = Target.the("CLASE")
            .located(By.xpath("(//input[@class='last-name blue-outline'])[4]"));



    public static  final Target Caja5 = Target.the("CLASE")
            .located(By.xpath("(//div[@class='chosen-container chosen-container-single chosen-container-single-nosearch'])[5]"));

    public static  final Target trata5 = Target.the("CLASE")
            .located(By.xpath("(//ul[@class='chosen-results'])[9]//li[@class='active-result'][1]"));

    public static  final Target Nom5 = Target.the("CLASE")
            .located(By.xpath("(//input[@class='first-name blue-outline'])[5]"));

    public static  final Target Apll5 = Target.the("CLASE")
            .located(By.xpath("(//input[@class='last-name blue-outline'])[5]"));




    public static  final Target Caja6 = Target.the("CLASE")
            .located(By.xpath("(//div[@class='chosen-container chosen-container-single chosen-container-single-nosearch'])[6]"));

    public static  final Target trata6 = Target.the("CLASE")
            .located(By.xpath("(//ul[@class='chosen-results'])[11]//li[@class='active-result'][2]"));

    public static  final Target Nom6 = Target.the("CLASE")
            .located(By.xpath("(//input[@class='first-name blue-outline'])[6]"));

    public static  final Target Apll6 = Target.the("CLASE")
            .located(By.xpath("(//input[@class='last-name blue-outline'])[6]"));



    public static  final Target Caja7 = Target.the("CLASE")
            .located(By.xpath("(//div[@class='chosen-container chosen-container-single chosen-container-single-nosearch'])[7]"));

    public static  final Target trata7 = Target.the("CLASE")
            .located(By.xpath("(//ul[@class='chosen-results'])[13]//li[@class='active-result'][2]"));

    public static  final Target Nom7 = Target.the("CLASE")
            .located(By.xpath("(//input[@class='first-name blue-outline'])[7]"));

    public static  final Target Apll7 = Target.the("CLASE")
            .located(By.xpath("(//input[@class='last-name blue-outline'])[7]"));



    public static  final Target Caja8 = Target.the("CLASE")
            .located(By.xpath("(//div[@class='chosen-container chosen-container-single chosen-container-single-nosearch'])[8]"));

    public static  final Target trata8 = Target.the("CLASE")
            .located(By.xpath("(//ul[@class='chosen-results'])[15]//li[@class='active-result'][1]"));

    public static  final Target Nom8 = Target.the("CLASE")
            .located(By.xpath("(//input[@class='first-name blue-outline'])[8]"));

    public static  final Target Apll8 = Target.the("CLASE")
            .located(By.xpath("(//input[@class='last-name blue-outline'])[8]"));

    public static  final Target Territ = Target.the("CLASE")
            .located(By.xpath("(//span[contains(text(),'Seleccione un país o territorio')])[1]"));

    public static  final Target Poscodi = Target.the("CLASE")
            .located(By.xpath("//*[@id=\"chosenLabel18\"]"));

    public static  final Target Ingresotel = Target.the("CLASE")
            .located(By.xpath("//INPUT[@id='ctl00_c_Cont_txtContactNum1']"));

    public static  final Target Ingresocorreo = Target.the("CLASE")
            .located(By.xpath("//INPUT[@id='ctl00_c_Cont_txtEmail']"));

    public static  final Target Clickopc = Target.the("CLASE")
            .located(By.xpath("//A[@id='ctl00_c_lnkBookPax']"));

}
