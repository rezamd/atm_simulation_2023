package com.mitrais.rezamd.atm_simulation.screen;

import com.mitrais.rezamd.atm_simulation.enumerator.ScreenTypeEnum;

public class TransactionMainScreen extends Screen{

	@Override
	public ScreenTypeEnum displayScreen() {
		System.out.print("1. Withdraw \n2. Fund Transfer \n3. Exit \nPlease choose option[3]: ");
		String selectedTransaction = Screen.scanner.nextLine();
		if (selectedTransaction.isEmpty())
			return displayScreen();
		switch (selectedTransaction) {
		case "1":
			System.out.println("Withdraw");
			return ScreenTypeEnum.WITHDRAWAL_MAIN_SCREEN;
		case "2":
			System.out.println("Fund Transfer");
			return ScreenTypeEnum.TRANSFER_FUND_MAIN_SCREEN;
		case "3":
			return ScreenTypeEnum.WELCOME_SCREEN;
		default:
			return displayScreen();
		}
	}

}
