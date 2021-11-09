/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpelArrayListProject;
import java.util.Scanner;
/**
 *
 * @author farrasaji
 */
public class SimpleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AppArrayList app = new AppArrayList();
        while(true){
            int inp;
            print("Menu Data ArrayList : ");
            print("1.Tambah data");
            print("2.Cari Data");
            print("3.Hapus Data");
            print("4.Tampil Data");
            print("5.Keluar");
            
            Scanner input = new Scanner(System.in);
            print("");
            print("Pilih nomor berapa : ");
            inp = input.nextInt();
            switch (inp) {
                case 1:
                    app.Tambahkan_Data();
                    break;
                case 2:
                    app.Mencari_Data();
                    break;
                case 3:
                    app.Menghapus_Data();
                    break;
                case 4:
                    app.Menampilkan_Data();
                    break;
                case 5:
                    print("Program Telah Selesai");
                    System.exit(0);
                    default:
                    print("Menu tidak ada,Pilih Angka Yang Tersedia");
            }    
        }
    }
    static void print(String text) {
    System.out.println(text);
    }    
}
