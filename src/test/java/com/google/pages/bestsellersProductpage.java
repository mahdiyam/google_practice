package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class bestsellersProductpage {
WebDriver driver;
public  bestsellersProductpage(WebDriver dr) {
	
	this.driver = dr;
	PageFactory.initElements(dr, this);
}
	
	@FindBy(xpath ="(//a[@class='hmenu-item' and contains (text(),Bestsellers)])[1]")
	WebElement bestseller;
	
	public void clickbestseller() {
		bestseller.click();
	
}

	
	
	
 @FindBy(xpath ="//span[@class='a-size-extra-large a-color-base _p13n-zg-banner-landing-page-header_style_zgLandingPageBannerText__3HlJo']")
	
	WebElement bestsellerstext;
	
	
	public void gettingbestsellertText() {
		System.out.println(bestsellerstext.getText());
	}
	
	
	
}
