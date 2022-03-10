package fly.emirates.task;

import fly.emirates.Interaction.Wait;
import fly.emirates.model.Emiratesmodel;
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


import java.util.List;




public class OpenUp implements Task {
    public OpenUp (List<Emiratesmodel> emiratesmodels){
        this.emiratesmodels = emiratesmodels;
    }

    private  List<Emiratesmodel> emiratesmodels;

    private EmiratePage emiratesPage;

    public static OpenUp thePage(List<Emiratesmodel> emiratesmodels) {

        return Tasks.instrumented(OpenUp.class, emiratesmodels);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(emiratesPage),
                Wait.until(1),
                Click.on(botonAceptar),
                Wait.until(1),
                Click.on(contenedor),
                //Enter.theValue("Abiyan").into(origen),
                Enter.theValue(emiratesmodels.get(0).getStrOrigen()).into(origen),
                Wait.until(1),
                Hit.the(Keys.ARROW_DOWN).into(origen),
                Wait.until(1),
                Hit.the(Keys.TAB).into(origen),
                Wait.until(1),
                Click.on(contenedorDestino),
                Wait.until(1),
                Enter.theValue(emiratesmodels.get(0).getStrDestino()).into(cajaDestino),
                //Enter.theValue("Adis Abeba").into(cajaDestino),
                Wait.until(1),
                Click.on(seleccionaDestino),
                Wait.until(1),
                Click.on(dia),
                //Wait.until(1),
                Click.on(diaSalida ),
                //Enter.theValue(emiratesmodels.getStrFechauno()).into(fechauno),
                //Enter.theValue(emiratesmodels.getFechados()).into(fechados)),
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
