package com.qa.opencart.pages;

import com.microsoft.playwright.Page;

public class HomePage {

	private Page page;

	// 1. String Locators - OR
	private String homePageTitle = "//span[@class='title']";

	private String search = "input[name='search']";
	private String searchIcon = "div#search button";
	private String searchPageHeader = "div#content h1";
	private String loginLink = "a:text('Login')";
	private String myAccountLink = "a[title='My Account']";
	private String productName ="//div[text()='Sauce Labs Backpack']";
	private String OpenedProductName = ".inventory_list a div";
	private String addToCart = ".inventory_list button";
	
	

	// 2. page constructor:
	public HomePage(Page page) {
		this.page = page;
	}

	// 3. Click on product
	 public String getTitleOfProduct() {
        String productTitle =page.textContent(productName);
    	System.out.println(" title of opened product " + productTitle);
		 return productTitle;
	 }

	 
	public void clickOnProductTitle() {
		page.locator(productName).click();
	}

	public void addtoCart() {
		page.click(addToCart);
	}
	// 4. get title of opened product
	
	public String getTitleOfOpenedProduct() {	
	String openedProductName =page.textContent(OpenedProductName);
	System.out.println(" title of opened product " + openedProductName);
	 return openedProductName;
	}
	
	
	public String getHomePageURL() {
		String url =  page.url();
		System.out.println("page url : " + url);
		return url;
	}

	public String doSearch(String productName) {
		page.fill(search, productName);
		page.click(searchIcon);
		String header =  page.textContent(searchPageHeader);
		System.out.println("search header: " + header);
		return header;
	}
	
	public LoginPage navigateToLoginPage() {
		//page.click(myAccountLink);
		//page.click(loginLink);
		return new LoginPage(page);
	}

}
