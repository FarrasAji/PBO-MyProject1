/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;
import java.util.Scanner;
/**
 *
 * @author farras
 */
public class GameTebakAngkaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tebak;
        
        
        bilRandom rn = new bilRandom();
        int random = rn.generate();
        System.out.println(random);
        
        System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
        Scanner masukan = new Scanner(System.in);
        
//       while(true){
//            System.out.println("Masukan tebakan anda: ");
//            tebak = masukan.nextInt();
//            
//            if(tebak < random){
//                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
//                
//            } else if(tebak > random){
//                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
//                
//            } else if(tebak == random) {
//                System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
//                break;
//            } else{
//                System.out.println("Masukan angka !!!");
//            }
//        }
        
        do{
            System.out.println("Masukan tebakan anda: ");
            tebak = masukan.nextInt();
            
            if(tebak < random){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
                
            } else if(tebak > random){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
                
            } else {
                System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
                break;
            }
        } while (tebak != random);
        
    }
    
    
}
