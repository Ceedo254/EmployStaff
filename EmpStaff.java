class Staff {
	String name;
	String staffId;
	int salary;


	public Staff(String name, String staffId) {
		this.name = name;
		this.staffId = staffId;
	}

	public void setSalary(int salary) {
			this.salary = salary;
	}
}

class Admin {
	public Staff employ(String name, String staffId) {
		Staff employee = new Staff(name, staffId);
		return employee;
	}

	public void allocateSalary(Staff employee, int salary) {
		employee.setSalary(salary);
	}
}

public class EmpStaff {
	public static void main(String[] args) {
		Admin admin = new Admin();

		Staff employee1 = admin.employ("Cedrik Onsando", "SABUCE2011");
		admin.allocateSalary(employee1, 55000);

		System.out.println("Employee name: " + employee1.name + "\nEmployee salary: " + employee1.salary);

		Staff employee2 = admin.employ("Another Employee", "SANOEM2011");
		admin.allocateSalary(employee2, 444000);

		System.out.println("\n\nEmployee name: " + employee2.name + "\nEmployee salary: " + employee2.salary);

		Staff employee3 = admin.employ("Third Employee", "SEMTHI2011");
		admin.allocateSalary(employee3, 200000);

		System.out.println("\n\nEmployee name: " + employee3.name + "\nEmployee salary: " + employee3.salary);
	}
}
