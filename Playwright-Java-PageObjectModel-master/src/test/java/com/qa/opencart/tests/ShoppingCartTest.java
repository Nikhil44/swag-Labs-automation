package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;

public class ShoppingCartTest extends BaseTest {


	@Test(priority = 1)
	public void isProductAdded() {
		String titleOfProductToAdd = homePage.getTitleOfProduct();
		homePage.addtoCart();
		shoppingCartPage.openShopingCart();
		String cartPageTitle = shoppingCartPage.getTitleOfProdictInCart();
		 Assert.assertEquals(titleOfProductToAdd, cartPageTitle);
	}
	@Test(priority = 2)
	public void openShoppingCart() {
		String cartPageTitle = shoppingCartPage.getShoppingCartPageTitle();
		Assert.assertEquals(cartPageTitle, AppConstants.SHOPPING_CART_PAGE_TITLE);
		System.out.println("Shopping cart page is opened.");
	}
	@Test(priority = 3)

	public void noOfIteamsAddedInCart() {
	 int noOfItems = shoppingCartPage.getNoOfItemsInCart();
	 Assert.assertEquals(noOfItems, 1);
      
	}
	@Test(priority = 4)

	public void removeButton() {
	boolean isRemoveBTNPresent =	shoppingCartPage.isRemoveButtonPresent();
	Assert.assertEquals(isRemoveBTNPresent, true);
		
	}
	
	//We can add more test cases as below
	//1. We can validate is checkout button working
	//2. Is remove button is working
	//3. Is Contibue shopping button working
	//4. Is no of products count is changing as per addition or deletion of product
	
}
