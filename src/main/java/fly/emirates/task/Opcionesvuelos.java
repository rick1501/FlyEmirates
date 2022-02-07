package fly.emirates.task;


import fly.emirates.Interaction.Wait;
import fly.emirates.userinterface.IngresoDatos;
import fly.emirates.userinterface.Seleccionvuelos;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static  fly.emirates.userinterface.Seleccionvuelos.*;


public class Opcionesvuelos  implements  Task {

        private Seleccionvuelos Seleccionvuelos;

        public static Opcionesvuelos thepage() {
            return Tasks.instrumented(Opcionesvuelos.class);
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(Clickpagos),
                    Wait.until(50)




            );

        }
    }
