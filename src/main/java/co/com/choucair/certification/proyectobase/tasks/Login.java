package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChourcairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login OnThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Open.browserOn(choucairAcademyPage));
        actor.attemptsTo(Click.on(ChourcairLoginPage.LOGIN_BUTTON),
                Enter.theValue("ingresarTuUsuario").into(ChourcairLoginPage.INPUT_USER),
                Enter.theValue("ingresarTuContraseña").into(ChourcairLoginPage.INPUT_PASSWORD),
                Click.on(ChourcairLoginPage.ENTER_BUTTON));
    }
}
