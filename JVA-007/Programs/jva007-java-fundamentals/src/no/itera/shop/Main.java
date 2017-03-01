package no.itera.shop;

import no.itera.shop.actions.Action;
import no.itera.shop.actions.MainMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Ihor Ruskykh on 3/1/2017.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Action currAction = new MainMenu();

        while ( true ){
            try {
                currAction.showPrompt();
                Integer choice = scanner.nextInt();
                currAction = currAction.perform(choice);
                System.out.println();
            } catch ( InputMismatchException e){
                scanner.next();
                System.out.println();
            }catch ( Exception e ){
                continue;
            }

        }
    }
}
