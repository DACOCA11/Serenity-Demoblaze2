package nttdata.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.nttdata.tasks.AddProductPage;
import org.nttdata.tasks.PurchaseFormPage;
import org.nttdata.tasks.ViewForm;

import static org.nttdata.utils.Constants.ACTOR;

public class MyStepdefs {
    @Before

    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("selecciono un producto de la pagina")
    public void selectProduct() {
        OnStage.theActorCalled(ACTOR).attemptsTo(AddProductPage.addProductsToCart());

    }

    @Then("agrego el producto al carrito")
    public void addProducts() {
        
    }

    @And("veo el carrito")
    public void viewCart() {
        OnStage.theActorCalled(ACTOR).attemptsTo(ViewForm.viewForm());

    }


    @When("ingreso los datos {string} {string} {string} {string} {string} {string}")
    public void form(String name, String country, String city, String card, String month, String year)
    {
        OnStage.theActorCalled(ACTOR).attemptsTo(PurchaseFormPage.withData(name, country, city, card, month, year));


    }

    @Then("pulso comprar")
    public void Purchase() {
    }
}
