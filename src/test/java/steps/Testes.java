package steps;

import element.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Testes {
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	@Given("que esteja na home")
	public void que_esteja_na_home() {
		metodo.abrirNavegador("https://swapi.dev/");
	}

	@When("clicar na documentacao")
	public void clicar_na_documentacao() {
		metodo.clicar(el.getDocumentação());
	}

	@When("clicar em People")
	public void clicar_em_people() {
		metodo.clicar(el.getPeople());
		metodo.screenShot("CT01 - People");
	}

	@When("clicar em Films")
	public void clicar_em_films() {
		metodo.clicar(el.getFilms());
		metodo.screenShot("CT02 - Films");
	}

	@Then("visualizo as informacoes")
	public void visualizo_as_informacoes() {
		metodo.fecharNavegador();
	}

	@When("clicar em About")
	public void clicar_em_about() {
		metodo.clicar(el.getAbout());
		metodo.screenShot("CT03 - Teste negativo");
	}

	@Then("nao visualizo as informacoes")
	public void nao_visualizo_as_informacoes() {
		metodo.fecharNavegador();
	}
}
