/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author Lenovo
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operasi o = new Operasi();
        System.out.println("PENJUMLAHAN");
        System.out.println("3 + 4 = " + o.jumlahkan(3, 4));
        System.out.println("4 + 7 + (-9) = " + o.jumlahkan(4, 7, -9));
        System.out.println("3.4 + (-0.002) + 0.12313 = " + o.jumlahkan(3.4, -0.002, 0.12313));
        System.out.println("PERKALIAN");
        System.out.println("3 x 4 = " + o.kalikan(3, 4));
        System.out.println("4 x 7 x (-9) = " + o.kalikan(4, 7, -9));
        System.out.println("3.4 x (-0.002) x 0.12313 = " + o.kalikan(3.4, -0.002, 0.12313));
    }
    
}
