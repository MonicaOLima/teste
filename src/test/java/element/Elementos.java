package element;

import org.openqa.selenium.By;

public class Elementos {

	private By documentação = By.xpath("//a[@href=\"/documentation\"]");
	private By people = By.xpath("//a[@href=\"#people\"]");
	private By films = By.xpath("//a[@href=\"#films\"]");
	private By about = By.xpath("//a[@href=\"/about\"]");
	
	public By getDocumentação() {
		return documentação;
	}
	public By getPeople() {
		return people;
	}
	public By getFilms() {
		return films;
	}
	public By getAbout() {
		return about;
	}
}
