/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author Laura
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor1 = new Motor(); 
        motor1.start(); 
        motor1.stop();  
        motor1.quality();
        motor1.quality("eksklusif");
        System.out.println(motor1.quality(2000000));
        System.out.println("");
    }
} 