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
public class Segitiga {
    int hitungLuas(int a, int t){
        return (a*t/2);
    }
    
    int hitungKeliling(int a, int t){
        int m = (int) Math.sqrt((a*a) + (t*t));
        return (a*t*m);
    }
    
    double hitungLuas(double a, double t){
        return (a*t/2);
    }
    
    double hitungKeliling(double a, double t){
        int m = (int) Math.sqrt((a*a) + (t*t));
        return (a*t*m);
    }
}
