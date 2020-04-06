package model.services;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double paymentFee(Double amount) {
		
		return 0.01 * amount;
		
	}

	@Override
	public Double interest(Double amount, Integer months) {
		
		return amount * 0.02 * months;
	}

}
