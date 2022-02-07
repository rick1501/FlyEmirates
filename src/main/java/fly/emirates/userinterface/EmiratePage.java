package fly.emirates.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.emirates.com/")

public class EmiratePage  extends PageObject{

    public static  final Target botonAceptar = Target.the("btnaceptar")
            .located(By.id("onetrust-accept-btn-handler"));

    public static  final Target contenedor = Target.the("Contenedor")
            .located(By.xpath("(//div[@class='dropdown__input-container js-dropdown-open'])[1]"));

    public static  final Target origen = Target.the("Origen")
            .located(By.xpath("(//input[@class='js-field-input field__input js-dropdown-open field__input--active'])[1]"));

    public static  final Target contenedorDestino = Target.the("ContenedorD")
            .located(By.xpath("(//div[@class='dropdown__input-container js-dropdown-open'])[2]"));

    public static  final Target cajaDestino = Target.the("Cjades")
            .located(By.xpath("(//input[@class='js-field-input field__input js-dropdown-open field__input--active'])[2]"));

    public static  final Target seleccionaDestino = Target.the("SelD")
            .located(By.xpath("//li[@class='location__item js-dropdown-select-item highlight js-location-list']"));

    public static  final Target dia = Target.the("Dia")
            .located(By.xpath(" (//td[@data-date='12'])[2]"));

    public static  final Target diaSalida = Target.the("Dsalida")
            .located(By.xpath("(//td[@data-date='17'])[2]"));

    public static  final Target Selecpasajeros = Target.the("CLASE")
            .located(By.xpath("//*[@id=\"panel0\"]/div[2]/div/div/section/div[4]/div[2]/div[1]/div[1]/div/div[1]/div/a"));

    public static  final Target Numpas = Target.the("CLASE")
            .located(By.xpath("(//BUTTON[@type='button'])[4]"));

    public static  final Target Clickclass = Target.the("Cclass")
            .located(By.xpath("(//div[@class='js-dropdown dropdown-container mobile-bubble-dropdown js-mobile-bubble-dropdown selected'])[1]"));

    public static  final Target Seletclass = Target.the("CLASE")
            .located(By.xpath("(//a[@class='class-dropdown__link js-dropdown-select-item'])[2]"));

    public static  final Target botonBuscar = Target.the("BtnBus")
            .located(By.xpath("//button[@class='cta cta--large cta--primary js-widget-submit ']"));


}
