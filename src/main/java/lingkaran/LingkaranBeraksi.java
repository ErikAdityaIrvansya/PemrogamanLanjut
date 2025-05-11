/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lingkaran;

/**
 *
 * @author Sen
 */
public class LingkaranBeraksi {
    public static void main(String[]args) {
        Lingkaran lingkaran = new Lingkaran();
        double r = 11.78;
        double luas = lingkaran.hitungLuas(r);
        
        System.out.println("Luas lingkaran(Pecahan): " + luas);
        System.out.println("Luas lingkaran (Bilangan bulat): " +(int) luas);
        System.out.println("Luas lingkarn (pembulatan): " + Math.round(luas));
    }
}
