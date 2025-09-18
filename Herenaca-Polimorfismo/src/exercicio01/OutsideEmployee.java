package exercicio01;

public class OutsideEmployee extends Employee{
	@SuppressWarnings("unused")
	private Double aditionalCharge;
	public OutsideEmployee() {
		// TODO Auto-generated constructor stub
	}
	public OutsideEmployee(String name, Integer hours, Double valueHours, Double aditionalCharge) {
		super(name, hours, valueHours);
		this.aditionalCharge = aditionalCharge;
	}
	
	@Override
	public Double paiment() {
		double charge = this.aditionalCharge / 100;
		charge = charge * 110;
		return (this.valueHours * this.hours) + charge;
	}
}
