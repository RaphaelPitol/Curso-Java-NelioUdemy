package entiti;

import java.time.LocalDate;
import java.util.Date;

public class HourContract {
	private Date date;
	private double valuePerHour;
	private int hours;
	
	public HourContract() {
		// TODO Auto-generated constructor stub
	}

	public HourContract(Date date, double valuePerHour, int hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return this.valuePerHour * this.hours;
	}
	

}
