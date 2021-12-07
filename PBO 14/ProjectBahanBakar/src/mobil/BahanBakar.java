/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author farras
 */
public abstract class BahanBakar {
    public abstract double hitungBahanBakar();
    public abstract double hitungWaktu();
    
    public void tampilHasil(){
        System.out.println("Bahan bakar yang dibutuhkan adalah: " + this.hitungBahanBakar() + " liter");
        System.out.println("Waktu yang diperlukan adalah: " + this.hitungWaktu() + " jam");
    }
}
