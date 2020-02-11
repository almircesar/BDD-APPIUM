package ScreenObject;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class RegisterScreen {
	public WebElement element;
	public WebDriver driver;
	public TouchAction toque;

	public RegisterScreen(WebDriver driver) {
		this.driver = driver;
		toque = new TouchAction((PerformsTouchActions) driver);
	}

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText\\r\\n")
	private WebElement userName;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText\\r\\n")
	private WebElement boxemail;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText\\r\\n")
	private WebElement password;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText\\r\\n")
	private WebElement confirmPassword;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText\\r\\n")
	private WebElement firstName;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText\\r\\n")
	private WebElement lastName;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText\\r\\n")
	private WebElement phoneNumber;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement state;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText\\r\\n")
	private WebElement adress;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement city;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText\\r\\n")
	private WebElement zip;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout\\r\\n")
	private WebElement country;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button\\r\\n")
	private WebElement btnRegister;


	public void escreveUser(String username) {
		userName.sendKeys(username);

	}

	public void escreverEmail(String email) {
		boxemail.sendKeys(email);

	}

	public void escrevePassword(String senha) {
		password.sendKeys(senha);

	}

	public void escreveConfirmaPassword(String ConfirmaSenha) {
		confirmPassword.sendKeys(ConfirmaSenha);

	}

	public void escreveFirstName(String PrimeiroNome) {
		firstName.sendKeys(PrimeiroNome);

	}

	public void escreverLastName(String UltimoNome) {
		lastName.sendKeys(UltimoNome);
	}

	public void escrevePhoneNumber(String numeroDeTelefone) {
		phoneNumber.sendKeys(numeroDeTelefone);
	}

	public void EscreveEstado(String estado) {
		state.sendKeys(estado);
	}

	public void EscreveEndereço(String Endereco) {
		adress.sendKeys(Endereco);
	}

	public void EscreveCidade(String Cidade) {
		city.sendKeys(Cidade);
	}

	public void EscreveCep(String Cep) {
		zip.sendKeys(Cep);
	}

	public void clicaPais() {
		country.click();
	}
	public void rolartela() throws MalformedURLException, InterruptedException {
		toque.press(PointOption.point(458, 1353)).moveTo(PointOption.point(542, 412)).release().perform();
	}

	public void rolartelaPais() throws MalformedURLException, InterruptedException {
		toque.press(PointOption.point(668, 1952)).moveTo(PointOption.point(684, 788)).release().perform();
	}

}
