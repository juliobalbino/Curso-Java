package util;

public class CurrencyConverter {

	public static final double  IOF = 1.06;
	
	public static double conversion(double dollar, double quantity) {
		return dollar * quantity * IOF;
	}
}
