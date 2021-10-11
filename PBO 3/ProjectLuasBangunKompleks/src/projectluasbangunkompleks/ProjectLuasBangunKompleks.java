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
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PROJECT 1
        Persegi p = new Persegi();
        Lingkaran l = new Lingkaran();
        
        double luasBangun = p.hitungLuas(42) + (l.hitungLuas(42/2) * 2);
        System.out.println("Luas dari bangun datar tersebut adalah :" + luasBangun);
        
        
        // PROJECT 2
        Persegi pp = new Persegi();
        Lingkaran ll = new Lingkaran();
        
        double LingkaranBesar = ll.hitungLuas(28/2) / 2;
        double LingkaranKecil = ll.hitungLuas(14/2);
        
        double LuasDaerahAbu = LingkaranBesar - LingkaranKecil;
        System.out.println("Luas daerah yang berwarba abu-abu adalah :" + LuasDaerahAbu);
    }
}
