package com.revature.project_0.screens;

import com.revature.project_0.auth.LoginAuth;
import com.revature.project_0.util.ScreenRouter;

import java.io.BufferedReader;

public class LoginScreen extends Screen {

    private BufferedReader consoleReader;
    private ScreenRouter router;


    public LoginScreen(BufferedReader consoleReader, ScreenRouter router) {
        super("LoginScreen", "/login");
        this.consoleReader = consoleReader;
        this.router = router;
    }

    public void render() {
        try {

            String username;
            String password;

            //Login form
            System.out.println("Log into your account!");
            System.out.println("+---------------------+");

            System.out.print("Username: ");
            username = consoleReader.readLine();

            System.out.print("Password: ");
            password = consoleReader.readLine();

            if (username != null && password != null) {
                LoginAuth loginAuth = new LoginAuth(username, password);
                loginAuth.authenticateUser();
                if (loginAuth != null) {
                    System.out.println("Login Successful!");
                    router.navigate("/account");
                } else {
                    System.out.println("Login Failed!");
                }
            } else {
                System.out.println("Please complete all fields");
            }





        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
