/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpengubinan;

/**
 *
 * @author Lenovo
 */
public class Ubin {
    
    // panjang ubin
    int panjang;
    // lebar ubin
    int lebar;
    
    // menghitung luas sebuah ubin
    int htiungLuas(){
        PersegiPanjang p = new PersegiPanjang();
        return p.hitungLuas(this.panjang, this.lebar);
    }
}
