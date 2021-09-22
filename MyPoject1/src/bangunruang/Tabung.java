/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author user
 */
public class Tabung {
    int r, tinggi;
    
    public void hitungVol(){
        double hasil;
        if(r % 7 == 0){
            hasil = r * r * tinggi * 22/7;
        }
        else {
            hasil = r * r * tinggi * 3.14;
        }
        System.out.println("Volume tabung: " + hasil + " cm");
    }
    
    public void hitungLuasSelimut(){
        double hasil;
        if(r % 7 == 0){
            hasil = 2 * r * tinggi * 22/7;
        }
        else {
            hasil = 2 * r * tinggi * 3.14;
        }
        System.out.println("Luas selimut tabung: " + hasil + " cm");
    }
}
