package com.java.lab.langfundamentals;

public class ChocolatesCookiesMethod2309 {
	
	
	
	static double chocolatePrice = 15.0d;
	
	static double cookiesPrice = 10.0d;
	
	static double totalMoney = 450.0d;
	
	public double chocolates() {
		
		System.out.println("Price of Chocolates : "+chocolatePrice);
		
		System.out.println("Money before purchasing the chocolates : "+totalMoney);
		
		double chocolatesBought = chocolatePrice * 10;
		
		double totalChocolatesMoneySpent = totalMoney - chocolatesBought;
		
		System.out.println("Total money after purchasing the chocolates : "+totalChocolatesMoneySpent);
		
		return totalChocolatesMoneySpent;
	}

	public void cookies(double totalChocolatesMoneySpent) {
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("Price of Cookies : "+cookiesPrice);
				
		double cookiesBought = cookiesPrice * 5;
		
		double totalCookiesMoneySpent = totalChocolatesMoneySpent - cookiesBought;
				
		System.out.println("Total money after purchasing the Cookies : "+ totalCookiesMoneySpent);
		
	}
	
	public static void main(String[] args) {
		
		ChocolatesCookiesMethod2309 ccm = new ChocolatesCookiesMethod2309();
		
		double moneyAfterChocolates = ccm.chocolates(); 
		
		ccm.cookies(moneyAfterChocolates);
		
	}

}
