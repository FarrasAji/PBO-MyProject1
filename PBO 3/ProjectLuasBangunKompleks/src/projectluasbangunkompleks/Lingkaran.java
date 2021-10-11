/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author Lenovo
 */
public class Lingkaran {
    double hitungLuas(double r){
        double luas;
        if(r % 7 == 0){
            luas = (r * r) * 22/7;
        } else {
            luas = Math.PI * (r * r);
        }
        
        return luas;
    }
}
