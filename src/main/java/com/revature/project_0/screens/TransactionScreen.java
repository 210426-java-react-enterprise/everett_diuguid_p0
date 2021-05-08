package com.revature.project_0.screens;

import com.revature.project_0.database.BankActions;
import com.revature.project_0.util.ScreenRouter;

import java.io.BufferedReader;

public class TransactionScreen extends Screen{

    private BufferedReader consoleReader;
    private ScreenRouter router;

    public TransactionScreen(BufferedReader consoleReader, ScreenRouter router) {
        super("TransactionScreen", "/transactions");
        this.consoleReader = consoleReader;
        this.router = router;
    }

    @Override
    public void render() {

        String choice = null;
        String depositAmt = null;
        String withdrawAmt = null;

        System.out.println("Transaction Screen");
        System.out.println("+-----------------+");
        System.out.println("Balance: " + BankActions.getBalance(router.currentUser.getUserId()));
        System.out.println("+-----------------+");
        System.out.println("1) Deposit");
        System.out.println("2) Withdraw");
        try {
            System.out.print(">>>>> ");
            choice = consoleReader.readLine();

            switch (choice) {
                case "1": {
                    System.out.print("Deposit amount: ");
                    depositAmt = consoleReader.readLine();
                    double dbl = Double.parseDouble(depositAmt);

                    System.out.println("Deposit amount: " + dbl);
                    router.navigate("/transactions");
                    break;
                }
                case "2": {
                    System.out.print("Withdraw amount: ");
                    withdrawAmt = consoleReader.readLine();
                    double dbl = Double.parseDouble(withdrawAmt);
                    System.out.println("withdraw ammount: " + dbl);
                    router.navigate("/transactions");
                    break;
                }

            }

        } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
