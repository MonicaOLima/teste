package pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	WebDriver driver;
	
	public void abrirNavegador(String site) {
		try {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}catch (Exception e) {
		System.err.println("----- erro ao abrir navegador -----" + e.getMessage());
		System.err.println("----- erro ao abrir navegador -----" + e.getCause());
	}
	}
	public void clicar(By elemento) {
		try {
		driver.findElement(elemento).click();
		}catch (Exception e) {
			System.err.println("----- erro ao clicar -----" + e.getMessage());
			System.err.println("----- erro ao clicar -----" + e.getCause());
	}
	}
	public void screenShot(String nome) {
		try {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Evidências/" + nome + ".png");
		FileUtils.copyFile(scrFile, destFile);
		}catch (Exception e) {
			System.err.println("----- erro ao tirar screenshot -----" + e.getMessage());
			System.err.println("----- erro ao tirar screenshot -----" + e.getCause());
	}
	}
	public void fecharNavegador() {
		try {
		driver.quit();
	}catch (Exception e) {
		System.err.println("----- erro ao fechar navegador -----" + e.getMessage());
		System.err.println("----- erro ao fechar navegador -----" + e.getCause());
	}
	}

}

