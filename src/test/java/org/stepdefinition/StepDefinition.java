package org.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.pages.FBLoginPojo;
import org.pages.ForgotPassword;
import org.utilities.BaseClass;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass{
	
	static int i = 1;

	@Given("The User Should load the url of the Facebook")
	public void the_User_Should_load_the_url_of_the_Facebook(io.cucumber.datatable.DataTable dataTable) {
	    Map<String, String> map = dataTable.asMap(String.class, String.class);
	    String url = map.get("URL");
	    loadUrl(url);
	}

	@Given("The User should maximize the Window")
	public void the_User_should_maximize_the_Window() {
	    winMax();
	}

	@When("The User should type the Invalid Username and Invalid Password")
	public void the_User_should_type_the_Invalid_Username_and_Invalid_Password(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> maps = dataTable.asMaps();
	    String user = maps.get(0).get("Username");
	    String pass = maps.get(0).get("Password");
	    FBLoginPojo fb = new FBLoginPojo();
	    fill(fb.getTxtUser(), user);
	    fill(fb.getTxtPass(), pass);
	    }

	@When("The User should click the login button")
	public void the_User_should_click_the_login_button() {
		FBLoginPojo fb = new FBLoginPojo();
		btnClick(fb.getBtnLogin());
	}

	@Then("The User should directed to Invalid credential page")
	public void the_User_should_directed_to_Invalid_credential_page() throws InterruptedException, IOException {
		Thread.sleep(5000);
	    String currentUrl = returnCurrentUrl();
	    Assert.assertTrue("Verify Invalid Credentials page", currentUrl.contains("privacy_mutation_token"));
	    screenShot("\\Screenshots\\fbsc"+i+++".png");
	}

	
	@Given("The User should load the URL of facebook")
	public void the_User_should_load_the_URL_of_facebook(io.cucumber.datatable.DataTable dataTable) {
	    List<String> list = dataTable.asList();
	    String url = list.get(0);
	    loadUrl(url);
	}

	@Given("The User should maximize the window")
	public void the_User_should_maximize_the_window() {
	    winMax();
	}

	@When("The User should click the ForgottonPassword")
	public void the_User_should_click_the_ForgottonPassword() {
	    ForgotPassword fp = new ForgotPassword();
	    btnClick(fp.getForgottenPassword());
	}

	@Then("The User should directed to reset password page")
	public void the_User_should_directed_to_reset_password_page() throws IOException {
	    Assert.assertTrue("Verify Forgot Page Launched", returnCurrentUrl().contains("login/identify"));
	    screenShot("\\Screenshots\\fbsc"+i+++".png");
	}

	@Then("The user should type the mobile number or email")
	public void the_user_should_type_the_mobile_number_or_email(io.cucumber.datatable.DataTable dataTable) throws IOException, InterruptedException {
	    List<Map<String, String>> maps = dataTable.asMaps();
	    String mob = maps.get(0).get("Mobile");
	    ForgotPassword fp = new ForgotPassword();
	    fill(fp.getInputMobOrEmail(), mob);
	    btnClick(fp.getSearchButton());
	    Thread.sleep(2000);
	    screenShot("\\Screenshots\\fbsc"+i+++".png");
	}

}
