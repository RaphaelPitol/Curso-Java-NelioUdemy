package exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Enterprise {

	List<Employee> listEmployee;
	
	public Enterprise() {
		// TODO Auto-generated constructor stub
		listEmployee = new ArrayList<>();
	}

	public List<Employee> getListEmployee() {
		return listEmployee;
	}

	public void setListEmployee(Employee employee) {
		listEmployee.add(employee);
	}
	
	
}
