/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

import java.util.Scanner;

/**
 *
 * @author farras
 */
public class sikuSiku {
    
    int a;
    int c;
    double b = 0;
    
    void input(){
        
        System.out.println("");
        System.out.println("Menentukan sisi siku-siku segitiga");
        
        Scanner data = new Scanner(System.in);
        
        while(true){
            System.out.println("Masukan sisi [a] : ");
            a = data.nextInt();
           
            
            System.out.println("Masukan sisi miring [c] : ");
            c = data.nextInt();
            break;
            
        }
    }
    
    void sisiSiku(){
        this.b = Math.sqrt(Math.pow(c, 2) - (Math.pow(a, 2)));
        System.out.println("Sisi siku-siku adalah : " + b);
    }
}
