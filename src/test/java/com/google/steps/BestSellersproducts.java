package com.google.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.TestCase;
import com.google.pages.bestsellersProductpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BestSellersproducts  extends TestCase{

	
	
	
	@Given("i am on the amazon homepage")
	public void i_am_on_the_amazon_homepage() {
	    
	launchBrowser();
	
	
	
	}

	@When("i click on all the button")
	public void i_click_on_all_the_button() {
	  WebElement allbutton =  driver.findElement(By.id("nav-hamburger-menu"));
	allbutton.click();
	
	}

	@When("i click on the best seller button")
	public void i_click_on_the_best_seller_button() {
		bestsellersProductpage bp = new bestsellersProductpage (driver)  ;
		bp.clickbestseller();
		
	}

	@Then("i can see the list of best selling products successfully")
	public void i_can_see_the_list_of_best_selling_products_successfully() {
	    
		bestsellersProductpage bp =new bestsellersProductpage (driver);
		   bp.gettingbestsellertText();
		
		closeAll();
		
	}
	
	









}
