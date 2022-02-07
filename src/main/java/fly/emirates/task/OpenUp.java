package fly.emirates.task;

import fly.emirates.Interaction.Wait;
import fly.emirates.userinterface.EmiratePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;
import static  fly.emirates.userinterface.EmiratePage.*;


public class OpenUp implements Task {

    private EmiratePage emiratesPage;

    public static OpenUp thePage() {

        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(emiratesPage),
                Wait.until(1),
                Click.on(botonAceptar),
                Wait.until(1),
                Click.on(contenedor),
                Enter.theValue("Abiyan").into(origen),
                Wait.until(1),
                Hit.the(Keys.ARROW_DOWN).into(origen),
                Wait.until(1),
                Hit.the(Keys.TAB).into(origen),
                Wait.until(1),
                Click.on(contenedorDestino),
                Wait.until(1),
                Enter.theValue("Adis Abeba").into(cajaDestino),
                Wait.until(1),
                Click.on(seleccionaDestino),
                Wait.until(1),
                Click.on(dia),
                Wait.until(1),
                Click.on(diaSalida ),
                Wait.until(1),
                Click.on(Selecpasajeros),
                Click.on(Numpas),
                Click.on(Numpas),
                Click.on(Numpas),
                Click.on(Numpas),
                Click.on(Numpas),
                Click.on(Numpas),
                Click.on(Numpas),
                Click.on(Clickclass),
                Click.on(Seletclass),
                Wait.until(2),
                Click.on(botonBuscar)

                );
    }
}
