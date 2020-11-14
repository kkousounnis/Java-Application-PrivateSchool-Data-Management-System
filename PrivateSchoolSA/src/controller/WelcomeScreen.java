package controller;

import java.util.Scanner;
import models.FakeDataCreate;

public class WelcomeScreen {

    public Scanner scan = new Scanner(System.in);
    private int choice = 0;

    public WelcomeScreen() {

        Menu();
    }

    public void Menu() {
        showWelcomeMenu();
        //i assigned to 3 because i only 1,2,3 choices 
        this.choice = checkIntegerInput(3);
        switch (this.choice) {
            case 1:
                MainMenu();
                break;
            case 2:
                FakeDataCreate.intializeLists();
                MainMenu();
                break;
            case 3:
                break;
        }
    }

    public void MainMenu() {
        showMainMenu();
        this.choice = checkIntegerInput(5);
        switch (this.choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                clearConsole();
                Menu();
        }

    }

    public void showWelcomeMenu() {
        System.out.println("---Welcome to Privete SchoolSA"
                + " where every dream becomes a reality---");
        for (int i = 0; i < 2; i++) {
            System.out.println("---                              "
                    + "                                 ---");
        }
        System.out.println("\nDescription of School");
        System.out.println("This is a private school which offers"
                + " intensive lessons for someone who desires"
                + " to learn.");
        System.out.println("Please choose how would you like to proceed.");
        System.out.println("1: Proceed to Main Menu.");
        System.out.println("2: Create fake data and proceed to Main Menu.");
        System.out.println("3: Terminate.");
    }

    public void showMainMenu() {

        System.out.println("Please choose how would you like to proceed");
        System.out.println("1: Proceed to Course Menu.");
        System.out.println("2: Proceed to Student Menu.");
        System.out.println("3: Proceed to Trainer Menu.");
        System.out.println("4: Proceed to Assignment Menu.");
        System.out.println("5: Return to strat Menu.");

    }

    public int checkIntegerInput(int x) {
        boolean catchexception = false;
        int choice = 0;
        do {
            System.out.print("Enter a number to proceed : ");
            if (scan.hasNextInt()) {

                choice = scan.nextInt();
                if (choice >= 1 & choice <= x) {
                    catchexception = true;
                } else {
                    scan.nextLine();
                    System.out.println("Enter a valid Integer value");
                }
            } else {
                scan.nextLine();
                System.out.println("Enter a valid Integer value");
            }
        } while (!catchexception);
        return choice;
    }

    public final static void clearConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println("\n");
        }
    }

}
