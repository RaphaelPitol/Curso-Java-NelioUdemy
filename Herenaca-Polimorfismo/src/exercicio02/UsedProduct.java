package exercicio02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsedProduct extends Product {
	DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate manufacturedDate;

	public UsedProduct(String name, Double price, LocalDate manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}

	public LocalDate getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(LocalDate manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
	@Override
	public String priceTag() {
		return this.name
				+"(used) $"
				+String.format("%.2f", getPrice())
				+ "(Manufactured Date:"+this.manufacturedDate.format(form1)
				+")";
	}
	
	
	
}
