package entities;

public class PhysicalPerson extends Person {

	private Double healthSpending;

	public PhysicalPerson() {
	}

	public PhysicalPerson(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public double taxCalculation() {
		double tax;	
		if(getAnnualIncome() < 20000.00) {
			tax = 0.15 * getAnnualIncome();
		}else{
			tax = 0.25 * getAnnualIncome();
		}
		if (healthSpending != 0) {
			tax -= (healthSpending * 0.5);
		}
		return tax;
	}
	
	@Override
	public String taxesPaid() {		
		return getName() + " : $" + String.format("%.2f\n", taxCalculation());
	}

}
