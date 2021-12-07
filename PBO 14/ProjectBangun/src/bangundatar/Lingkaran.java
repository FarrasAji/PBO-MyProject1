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
public class Lingkaran extends BangunDatar {
    //atribut jari-jari
    public double r;
    
    //method untuk hitung luas lingkaran
    @Override
    public double hitungLuas(){
        double luas = Math.round(Math.PI * this.r * this.r);
        return luas;
    }
    
    //method untuk hitung keliling lingkaran
    @Override
    public double hitungKeliling(){
        double keliling = Math.round(2 * Math.PI * this.r);
        return keliling;
    }
}
