/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author Laura
 */
public class Motor extends Kendaraan implements Berjalan, Berhenti{
    String warna;
    int jumlahRoda;
    
    public Motor(){
        System.out.println("Halo aku motor");
        super.produksi();
        kendaraan();
    }
    
    public void quality() {
        System.out.println("Kualitas motor tergantung pada perawatan dan penggunaan.");
    }
    
    public void quality(String eksklusif) {
        System.out.println("Motor ini berkualitas tinggi");
    }
    
    public String quality(int harga) {
        return "Motor ini dibeli dengan harga " + harga + " rupiah";
    }
    
    @Override
    public void start(){
        System.out.println("Aku mulai berjalan");
    }
    
    @Override
    public void stop(){
        System.out.println("Aku sudah berhenti");
    }
    
    @Override
    void kendaraan(){
         System.out.println("Ini adalah kendaraan");
    }
}