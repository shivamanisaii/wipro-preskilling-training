package com.wipro.Day_eight;

public class MainStocks {
	public static void main(String[] args) {
		StockMarketApp trader1=new trader1("Shiva mani sai");
		StockMarketApp trader2=new trader2("Saahith");
		
		StockMarketApp traders[]= {trader1,trader2};
		Stocks app=new Stocks(traders);
		app.notifyTraders("Sensex lost 5000 points !!!!!!!");
	}

}
