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
public class Bola {
    int r;
    
    public void hitungVol(){
        double hasil;
        if(r % 7 == 0){
            hasil = r * r * r * 4 * 22/7/3;
        }
        else {
            hasil = r * r * r * 4 * 3.14/3;
        }
        System.out.println("Volume bola: " + hasil + " cm");
    }
    
    public void hitungLuasSelimut(){
        double hasil;
        if(r % 7 == 0){
            hasil = 4 * r * r  * 22/7;
        }
        else {
            hasil = 4 * r * r  * 3.14;
        }
        System.out.println("Luas selimut bola: " + hasil + " cm");
    }
}