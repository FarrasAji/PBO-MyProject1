/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Lenovo
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("PERSEGI PANJANG");
        System.out.println("Panjang: 10, Lebar :5");
        System.out.println("Luas : " + pp.hitungLuas(10, 5));
        System.out.println("Keliling : " + pp.hitungKeliling(10, 5));
        
        System.out.println("Panjang: 3.6, Lebar :8");
        System.out.println("Luas : " + pp.hitungLuas(3.6, 8));
        System.out.println("Keliling : " + pp.hitungKeliling(3.6, 8));
        
        System.out.println("Panjang: 6, Lebar :8.3");
        System.out.println("Luas : " + pp.hitungLuas(6, 8.3));
        System.out.println("Keliling : " + pp.hitungKeliling(6, 8.3));
        
        System.out.println("Panjang: 5.6, Lebar :8.8");
        System.out.println("Luas : " + pp.hitungLuas(5.6, 8.8));
        System.out.println("Keliling : " + pp.hitungKeliling(5.6, 8.8));
        System.out.println("============================");
        
        Persegi p = new Persegi();
        System.out.println("PERSEGI");
        System.out.println("Panjang sisi: 4.5");
        System.out.println("Luas : " + p.hitungLuas(4.5));
        System.out.println("Keliling : " + p.hitungKeliling(4.5));
        
        System.out.println("Panjang sisi: 7");
        System.out.println("Luas : " + p.hitungLuas(7));
        System.out.println("Keliling : " + p.hitungKeliling(7));
        System.out.println("============================");
        
        Lingkaran l = new Lingkaran();
        System.out.println("LINGKARAN");
        System.out.println("Jejari: 5");
        System.out.println("Luas : " + l.hitungLuas(5));
        System.out.println("Keliling : " + l.hitungKeliling(5));
        
        System.out.println("Jejari: 7.4");
        System.out.println("Luas : " + l.hitungLuas(7.4));
        System.out.println("Keliling : " + l.hitungKeliling(7.4));
        System.out.println("============================");
        
        Segitiga s = new Segitiga();
        System.out.println("SEGITIGA");
        System.out.println("Panjang alas: 8, Tinggi: 10");
        System.out.println("Luas : " + s.hitungLuas(8, 10));
        System.out.println("Keliling : " + s.hitungKeliling(8, 10));
        
        System.out.println("Panjang alas: 8, Tinggi: 11.5");
        System.out.println("Luas : " + s.hitungLuas(8, 11.5));
        System.out.println("Keliling : " + s.hitungKeliling(8, 11.5));
        
        System.out.println("Panjang alas: 12.2, Tinggi: 9");
        System.out.println("Luas : " + s.hitungLuas(12.2, 9));
        System.out.println("Keliling : " + s.hitungKeliling(12.2, 9));
        
        System.out.println("Panjang alas: 13.9, Tinggi: 20.7");
        System.out.println("Luas : " + s.hitungLuas(13.9, 20.7));
        System.out.println("Keliling : " + s.hitungKeliling(13.9, 20.7));
        System.out.println("============================");
    }
    
}
