package createAccount;

import org.testng.annotations.Test;

import utility.ActionDriver;
import utility.ExcelDataProvider;
import login.Login;
import payment.PaymentByBankWire;
import payment.PaymentByCheck;

public class Execute_ValidateEmailAddress extends ActionDriver {

	
	@Test
	public static void ValidateEmailColumn() throws Exception
	{
		ValidateEmailAddress.EnterCorrectEmailAddress();
		ValidateEmailAddress.EnterInCorrectEmailAddress();
		ValidateEmailAddress.LeaveBlankEmailColumn();
		ValidateEmailAddress.AlreadyUsedEmailAddress();
	
	}
	
//	@Test
	public static void Login() throws Exception
	{
		Login.EnterLogin();
		PaymentByBankWire.BankWire();
		PaymentByCheck.Check();
		
	}
	

}
