package com.wipro.Day_eight;
public class ZomatoAdapter  {
    public static void main(String[] args) {

        Order zomato = new Zomato();
        zomato.placeOrder("Pizza");
        
        TableBookingSystem bookingSystem = new TableBookingSystem();
        Order adapter = new BookingAdapter(bookingSystem);
        adapter.placeOrder("Shiva mani sai");
        
        Cloudkitchen newkitchen=new Cloudkitchen();
        Order cloudadapter= new CloudKitchenAdapter(newkitchen);
        cloudadapter.placeOrder("Sprouts");
        }
}

interface Order{
	void placeOrder(String x);
}

class Zomato implements Order 
 {
    public void placeOrder(String item) {
        System.out.println("Order placed: " + item);
    }
}


class TableBookingSystem  //new functionality
{
    public void bookTable(String name) {
        System.out.println("Table booked for: " + name);
    }

}
class Cloudkitchen{
	public void cloudOrder(String name) {
		System.out.println("Cloud order placed for: "+name);
	}
}

class BookingAdapter implements Order {

    private TableBookingSystem booking;

    BookingAdapter(TableBookingSystem booking) {
        this.booking = booking;
    }


	@Override
	public void placeOrder(String x) {
		 booking.bookTable(x);
		
	}
}
class CloudKitchenAdapter implements Order {
    private Cloudkitchen kitchen;

    CloudKitchenAdapter(Cloudkitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void placeOrder(String x) {
        kitchen.cloudOrder(x);
    }
}