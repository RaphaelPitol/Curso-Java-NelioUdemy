package exercicio01;

public class Employee {

	protected String name;
	protected Integer hours;
	protected Double valueHours;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, Integer hours, Double valueHours) {
		this.name = name;
		this.hours = hours;
		this.valueHours = valueHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValueHours() {
		return valueHours;
	}

	public void setValueHours(Double valueHours) {
		this.valueHours = valueHours;
	}
	
	public Double paiment() {
		return this.valueHours * this.hours;
	}
	
}
