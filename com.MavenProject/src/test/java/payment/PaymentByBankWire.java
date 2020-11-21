package payment;

import utility.ActionDriver;


public class PaymentByBankWire extends ActionDriver{

	// Click on Women Tab
	
	public static void BankWire() throws Exception
	{
		// Click on Women Tab
		Click("//a[@title='Women']");
		Thread.sleep(2000);
		
		// Add item to Cart
		Click("//a[@title='Add to cart' and @data-id-product='2']/span");
		Thread.sleep(2000);
		
		//  Click on Proceed to checkout
		Click("//a[@title='Proceed to checkout']/span");
		
		// Summary - Proceed to checkout
		Thread.sleep(2000);
		Click("//div[@id='center_column']/p[2]/a/span");
		
		// Address - Proceed to checkout
		Thread.sleep(2000);
		Click("//button[@name='processAddress']/span");
		
		// Shipping - Proceed to checkout
		// Click on checkbox to I AGree
		Click("//input[@id='cgv']");
		Click("//button[@name='processCarrier']/span");
		
		// Payment - Click on Bank Wire
		Click("//a[@class='bankwire']");
		
		// Click on I confirm my order
		Click("//p[@id='cart_navigation']/button/span");
		Thread.sleep(2000);
		
		// Click on Return to Home button
		Click("//i[@class='icon-home']");
		
		
	}
	
	
	
	
}
