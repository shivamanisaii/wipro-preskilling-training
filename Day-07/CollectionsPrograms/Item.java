package com.wipro.Day_seven;

public class Item {
    private String productName;
    private double price;

    public Item() {}

    public String getProductName(){ 
    	return productName; 
    }
    public void setProductName(String productName){ 
    	
    	this.productName = productName;
    }

    public double getPrice(){ 
    	return price; 
    	
    }
    public void setPrice(double price){ 
    	
    	this.price = price; 
    }

    @Override
    public String toString(){
        return "Item [productName=" + productName + ", price=" + price + "]";
    }
}