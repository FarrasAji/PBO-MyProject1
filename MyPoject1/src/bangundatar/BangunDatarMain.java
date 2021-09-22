/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author farras
 */
public class BangunDatarMain {
    public static void main(String[] args) {
        PersegiPanjang PP = new PersegiPanjang();
        PP.panjang = 25;
        PP.lebar = 38;
        PP.hitungLuas();
        PP.hitungKeliling();
        
        Persegi A = new Persegi();
        A.sisi = 10;
        A.hitungLuas();
        A.hitungKeliling();
        
        Persegi B = new Persegi();
        B.sisi = 15;
        B.hitungLuas();
        B.hitungKeliling();
        
        Lingkaran X = new Lingkaran();
        X.r = 25;
        X.hitungLuas();
        X.hitungKeliling();
        
        Lingkaran Z = new Lingkaran();
        Z.r = 37;
        Z.hitungLuas();
        Z.hitungKeliling();
    }
}

