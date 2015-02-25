/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city.name.hw;

import java.util.Scanner;

/**
 *
 * @author 15032780
 */
public class CityNameHW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String city;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite city?");
        city = scanner.nextLine();
        
        
        String upper = city.toUpperCase();
        String lower = city.toLowerCase();
        char letter = city.charAt(2);
        int stringSize = city.length();
        System.out.println(city + " has " + stringSize + " letters.");
        System.out.println(city.toUpperCase());
        System.out.println(city.toLowerCase());
        System.out.println(city.charAt(0));
      

    }

}
