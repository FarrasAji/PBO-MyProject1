/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author farras
 */
public class Kerucut {
    int r, s, tinggi;
    
    public void hitungVol(){
        double hasil;
        if(r % 7 == 0){
            hasil = r * r * tinggi * 22/7/3;
        }
        else {
            hasil = r * r * tinggi * 3.14/3;
        }
        System.out.println("Volume kerucut: " + hasil + " cm");
    }
    
    public void hitungLuasSelimut(){
        double hasil;
        if(r % 7 == 0){
            hasil = r * s * 22/7;
        }
        else {
            hasil = r * s * 3.14;
        }
        System.out.println("Luas selimut kerucut: " + hasil + " cm");
    }
}
