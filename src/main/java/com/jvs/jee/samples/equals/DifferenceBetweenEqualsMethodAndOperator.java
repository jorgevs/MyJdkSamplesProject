package com.jvs.jee.samples.equals;

//----------------------------------------------------------------
class Employee {

	private Integer empId;
	private String empName;

	public Employee(Integer empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}

}

// ----------------------------------------------------------------

public class DifferenceBetweenEqualsMethodAndOperator {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 3;

		String strA = "Hello";
		String strB = new String("Hello");
		String strC = "Hello";

		Employee emp1 = new Employee(10, "Jorge");
		Employee emp2 = new Employee(5, "Luis");
		Employee emp3 = new Employee(10, "Jorge");

		// Using the == operator in primitives
		System.out.println("a == b: " + (a == b));
		System.out.println("a == c: " + (a == c));

		System.out.println("\n");

		// Using the == operator in String objects
		System.out.println("strA == strB: " + (strA == strB));
		System.out.println("strA == strC: " + (strA == strC));

		System.out.println("\n");

		// Using the == operator in objects
		System.out.println("emp1 == emp2: " + (emp1 == emp2));
		System.out.println("emp1 == emp3: " + (emp1 == emp2));

		System.out.println("\n");

		// Using the equals() method in objects
		System.out.println("emp1.equals(emp2): " + emp1.equals(emp2));
		System.out.println("emp1.equals(emp3): " + emp1.equals(emp3));

	}

}
