package entities;

public class JuridicPerson extends Person {

	private Integer employeesNumber;

	public JuridicPerson() {
	}

	public JuridicPerson(String name, Double annualIncome, Integer employeesNumber) {
		super(name, annualIncome);
		this.employeesNumber = employeesNumber;
	}

	
	public Integer getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	@Override
	public double taxCalculation() {
		double tax;
		if (employeesNumber > 10 ) {
			tax = 0.14 * getAnnualIncome();
		}else {
			tax = 0.16 * getAnnualIncome();
		}
		return tax;
	}

	@Override
	public String taxesPaid() {		
		return getName() + " : $" + String.format("%.2f\n", taxCalculation());
	}

}
