package fly.emirates.task;


import fly.emirates.Interaction.Wait;
import fly.emirates.userinterface.HacerReservas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static fly.emirates.userinterface.HacerReservas.*;

public class Buscarvuelos implements Task {

    private HacerReservas HacerReservas;

    public static Buscarvuelos thepage() {

        return Tasks.instrumented(Buscarvuelos.class);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               Click.on(Seletbtn1),
                Wait.until(10),
                Click.on(Seletbtn2),
                Wait.until(10),
                Click.on(Clickcont)

        );

    }
}
