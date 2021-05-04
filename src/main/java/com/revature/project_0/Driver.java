package com.revature.project_0;

import com.revature.project_0.database.Connect;
import com.revature.project_0.screens.WelcomeScreen;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Driver {

    public static void main(String[] args) {

        Connect newConnection = new Connect();

            try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
                WelcomeScreen welcome = new WelcomeScreen(consoleReader);
                welcome.render();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
