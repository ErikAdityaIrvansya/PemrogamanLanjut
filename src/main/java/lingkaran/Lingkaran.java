/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lingkaran;

/**
 *
 * @author Sen
 */
public class Lingkaran {
    private final double PI = 3.141592;
    
    public void hitungLuas(double r){
        double luas = PI * r * r;

        System.out.println("Luas lingkaran (pecahan): " + luas);              
        System.out.println("Luas lingkaran (bilangan bulat): " + (int) luas); 
        System.out.println("Luas lingkaran (pembulatan): " + Math.round(luas));
    }
}
