/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sktvp20task2olgaivanova;

import java.util.Scanner;

/**
 *
 * @author Vladimir
 */
public class SKTVp20Task2OlgaIvanova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите трехзначное число: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
       
        int units = num % 10;
        int tens = num / 10 % 10;
        int hundreds = num /100;
       
        int summ = units + tens + hundreds;
       
        
        System.out.println("В заданном Вами числе сумма цифр:" + summ);  
    }
    
}
