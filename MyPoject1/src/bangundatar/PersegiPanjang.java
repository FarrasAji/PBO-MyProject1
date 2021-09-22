/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author user
 */
public class PersegiPanjang {
    int panjang, lebar;
    
    public void hitungLuas() {
        int hasil = panjang * lebar;
        System.out.println("Luas persegi panjang: " + hasil+ " cm");
    }
    
    public void hitungKeliling() {
        int hasil = 2 * (panjang + lebar);
        System.out.println("Keliling persegi panjang: " + hasil+ " cm");
    }
}

