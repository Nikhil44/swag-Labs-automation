package com.qa.opencart.pages;

import com.microsoft.playwright.Page;

public class ShoppingCartPage {
   private Page page;
   
	private String shoppingCart = "a.shopping_cart_link";
	private String shoppingCartPageTitle = ".title";
    private String shopingCartBadge = ".shopping_cart_badge";
    private String titleOfProductAddedInCart = ".inventory_item_name";
    private String removeButton = "button.btn btn_secondary btn_small cart_button";

   
   public ShoppingCartPage(Page page) {
	   this.page = page;
   }
   
   
	public void openShopingCart() {
		page.click(shoppingCart);
		
	}
	
	public String getShoppingCartPageTitle() {
		
		String CartPageTitle = page.textContent(shoppingCartPageTitle);
		System.out.println("Shopping cart page title is: "+CartPageTitle);
		return CartPageTitle;
	}
	public int getNoOfItemsInCart() {
		
		String noOfItems = page.textContent(shopingCartBadge);
		int totalItems = Integer.parseInt(noOfItems);
		System.out.println("Total no of items added in cart: "+totalItems);
		return totalItems;
	}
	
	public String getTitleOfProdictInCart() {
		
		String titleOfProductInCart = page.textContent(titleOfProductAddedInCart);
		
		System.out.println("Title of product added in cart: "+titleOfProductInCart);

		 return titleOfProductInCart;

	}
	
	public boolean isRemoveButtonPresent() {
		 boolean isRemoveButtonPresent =page.isVisible(removeButton);
		 return isRemoveButtonPresent;
	}
}
