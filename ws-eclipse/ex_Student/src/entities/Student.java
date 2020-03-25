package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	public void verification() {
		if (finalGrade() > 60.00) {
			System.out.println("PASS");
		}else {
			double missing  = 60 - finalGrade();
			System.out.printf("FAILED \nMISSING %.2f POINTS", missing);
		}
	}
}
