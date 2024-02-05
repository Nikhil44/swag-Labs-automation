package com.qa.opencart.tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;

public class HomePageTest extends BaseTest {

	@Test
	public void productTitleTest() {
		String productTitle = homePage.getTitleOfProduct();
		homePage.clickOnProductTitle();
		String ProductTitleAfterOpening = homePage.getTitleOfOpenedProduct();
		Assert.assertEquals(productTitle, ProductTitleAfterOpening);
	}

	
	//We can add below more test cases
	// 1. Is user will be able to remove added product after clicking on Remove button
	// 2. Can we add multiple products
	// 3. Is showing same description and price of product after clicking on it
	
	//I have observed few below defects
	//1. We can't add all prodicts to cart as some 'Add to Cart' buttons are not clickable
	// 2. We can't remove product once added from home page
	// After clicking on product, It shows completely different product with different image, diferent title, description and price
	
	
}
