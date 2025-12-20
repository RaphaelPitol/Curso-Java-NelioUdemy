package ex05;

public class Product {
	private Double price;
	private String name;
	private Integer quantity;
	
	public Product(Double price, String name, Integer quantity) {
		this.price = price;
		this.name = name;
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public double total() {
		return price * quantity;
	}
	
	

}
