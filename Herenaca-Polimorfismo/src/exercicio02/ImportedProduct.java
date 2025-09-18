package exercicio02;

public class ImportedProduct extends Product{
	private Double custonFree;

	public ImportedProduct(String name, Double price, Double custonFree) {
		super(name, price);
		this.custonFree = custonFree;
	}

	public Double getCustonFree() {
		return custonFree;
	}

	public void setCustonFree(Double custonFree) {
		this.custonFree = custonFree;
	}
	
	@Override
	public String priceTag() {
		return this.name
				+" $"
				+String.format("%.2f", totalPrice())
				+"(Custon free: $"+String.format("%.2f", getCustonFree())
				+")";
	}
	public double totalPrice() {
		return this.price + this.custonFree;
	}
	

}
