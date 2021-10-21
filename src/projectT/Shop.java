package projectT;

public class Shop {
	   private double price;
	   private int yearOfProduction;
	   private int quantity;
	   private String brand;
	   private int warranty;
	 // price, yearOfProduction, quantity, brand, warranty
	   
	   public double getPrice() {
		return price;
	}
	 
	public void setPrice(double price) {
		this.price = price;
	}
	 
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	 
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	 
	public int getQuantity() {
		return quantity;
	}
	 
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	 
	public String getBrand() {
		return brand;
	}
	 
	public void setBrand(String brand) {
		this.brand = brand;
	}
	 
	public int getWarranty() {
		return warranty;
	}
	 
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	 
	public Shop(double price,int yearOfProduction, int quantity,String brand, int warranty) {
		this.price=price;
		this.yearOfProduction = yearOfProduction;
		this.quantity = quantity;
		this.brand = brand;
		this.warranty= warranty;
	 
	  }
	
}
