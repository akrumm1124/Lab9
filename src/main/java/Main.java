/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the length for the first LandTract");
        double len1 = keyboard.nextDouble();
        System.out.println("Enter the width for the first LandTract");
        double wid1 = keyboard.nextDouble();
        System.out.println("Enter the length for the second LandTract");
        double len2 = keyboard.nextDouble();
        System.out.println("Enter the width for the second LandTract");
        double wid2 = keyboard.nextDouble();
        LandTract land1 = new LandTract(len1, wid1);
        LandTract land2 = new LandTract(len2, wid2);
    
        if (land1.equals(land2)) {
            System.out.println("The LandTracts are equal.");
        }
        else {
            System.out.println("The LandTracts are not equal.");
        }
    }
}
