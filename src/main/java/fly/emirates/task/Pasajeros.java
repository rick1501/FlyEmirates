package fly.emirates.task;


import fly.emirates.Interaction.Wait;
import fly.emirates.userinterface.IngresoDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static fly.emirates.userinterface.IngresoDatos.*;

public class Pasajeros implements Task {

    private IngresoDatos IngresoDatos;

    public static Pasajeros thepage() {
        return Tasks.instrumented(Pasajeros.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Click1),
                Click.on(Click2),
                Click.on(Nom1),
                Enter.theValue("Manuel").into(Nom1),
                Click.on(Apll1),
                Enter.theValue("Leon").into(Apll1),

                Click.on(Caja2),
                Click.on(trata2),
                Click.on(Nom2),
                Enter.theValue("Royer").into(Nom2),
                Click.on(Apll2),
                Enter.theValue("Lopez").into(Apll2),

                Click.on(Caja3),
                Click.on(trata3),
                Click.on(Nom3),
                Enter.theValue("Gregoria").into(Nom3),
                Click.on(Apll3),
                Enter.theValue("Lopez").into(Apll3),


                Click.on(Caja4),
                Click.on(trata4),
                Click.on(Nom4),
                Enter.theValue("Yoiver").into(Nom4),
                Click.on(Apll4),
                Enter.theValue("Narvaez").into(Apll4),


                Click.on(Caja5),
                Click.on(trata5),
                Click.on(Nom5),
                Enter.theValue("Camilo").into(Nom5),
                Click.on(Apll5),
                Enter.theValue("Meneses").into(Apll5),



                Click.on(Caja6),
                Click.on(trata6),
                Click.on(Nom6),
                Enter.theValue("Yomis").into(Nom6),
                Click.on(Apll6),
                Enter.theValue("Contreras").into(Apll6),


                Click.on(Caja7),
                Click.on(trata7),
                Click.on(Nom7),
                Enter.theValue("Alyn").into(Nom7),
                Click.on(Apll7),
                Enter.theValue("Urango").into(Apll7),


                Click.on(Caja8),
                Click.on(trata8),
                Click.on(Nom8),
                Enter.theValue("Ali").into(Nom8),
                Click.on(Apll8),
                Enter.theValue("Alean").into(Apll8),
                Click.on(Territ),
                Click.on(Territ),
                Click.on(Poscodi),
                Enter.theValue("Colombia").into(Poscodi),
                Hit.the(Keys.TAB).into(Poscodi),
                Click.on(Ingresotel),
                Enter.theValue("31622134261").into(Ingresotel),
                Click.on(Ingresocorreo),
                Enter.theValue("leonbamanuel23@gmail.com").into(Ingresocorreo),
                Wait.until(10),
                Click.on(Clickopc),
                Wait.until(10)







        );
    }
}
