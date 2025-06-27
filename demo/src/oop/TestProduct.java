package oop;

class Product {
	// Instance variables
	private String name;
	private int price;

	// Class variable
	private static int taxRate = 12;
	private static int count = 0;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
		Product.count ++;
	}

	public static int getCount() {
		return Product.count;
	}
	
	public void show() {
		System.out.println("Name : " + this.name);
		System.out.println("Price: " + this.price);
	}

	public int getNetPrice() {
		return this.price + this.price * Product.taxRate / 100;
	}

	public int getPrice() {
		return this.price;
	}

	public String getName() {
		return this.name;
	}

	public void setPrice(int p) {
		this.price = p;
	}

	public void setName(String n) {
		this.name = n;
	}
	
	public static int getTaxRate() {
		//price
		return  Product.taxRate;
	}
}

public class TestProduct {

	public static void main(String[] args) {
		Product p1 = new Product("iPhone 16 Pro", 90000);
		System.out.println(p1.getNetPrice());
		
		Product p2 = new Product("iPad Air 4", 50000);
		
		System.out.println(Product.getTaxRate());
		System.out.println(Product.getCount());
		

	}

}
