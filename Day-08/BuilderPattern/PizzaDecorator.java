package com.wipro.Day_eight;

public class PizzaDecorator {
	public static void main(String[] args) {
		
			
			   Pizza pizza = new PlainPizza();

		       pizza = new Cheese(pizza); //decorator
		       pizza= new Extra_Chicken(pizza);
		   

		       System.out.println("Order Summary"+"\n"+pizza.getDescription());
		       System.out.println("Total Price: "+pizza.cost());
		}
		   
		
	}
	interface Pizza {

	    String getDescription();
	    int cost();
	}

	class PlainPizza implements Pizza {
	    public String getDescription() {
	        return "Margarretta Pizza";
	    }
	    public int cost() {
	        return 100;
	    }
	}

	abstract class PizzaToppings implements Pizza {
	    protected Pizza pizza;

	    PizzaToppings(Pizza pizza) {
	        this.pizza = pizza;
	    }
	}

	// Cheese topping
	class Cheese extends PizzaToppings{
	    Cheese(Pizza pizza) {
	        super(pizza);
	    }

	    public String getDescription() {
	        return pizza.getDescription() + " \nCheese";
	    }

	    public int cost() {
	        return pizza.cost() + 30;
	    }
	}

	// Paneer topping
	class Paneer extends PizzaToppings{
	    Paneer(Pizza pizza) {
	        super(pizza);
	    }

	    public String getDescription() {
	        return pizza.getDescription() + "  + Paaneer";
	    }

	    public int cost() {
	        return pizza.cost() + 50;
	    }
	}
	class Extra_Chicken extends PizzaToppings{
	    Extra_Chicken(Pizza pizza) {
	        super(pizza);
	    }

	    public String getDescription() {
	        return pizza.getDescription() + " + Chicken";
	    }

	    public int cost() {
	        return pizza.cost() + 60;
	    }
	    
	}
