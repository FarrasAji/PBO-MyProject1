/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import bangundatar.*;
import bangunruang.*;
/**
 *
 * @author farras
 */
public class MainClass {
    public static void main(String[] args){
        System.out.println("=============Bangun Datar=============");
        System.out.println("------------Persegi------------");
        Persegi p1 = new Persegi();
        p1.sisi = 10;
        p1.tampilHasil();
        
        System.out.println("\n------------Lingkaran------------");
        Lingkaran l1 = new Lingkaran();
        l1.r = 14;
        l1.tampilHasil();
        
        System.out.println("\n------------Persegi Panjang------------");
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 20;
        pp1.lebar = 10;
        pp1.tampilHasil();
        
        System.out.println("\n\n=============Bangun Ruang=============");
        System.out.println("------------Tabung------------");
        Tabung t1 = new Tabung();
        t1.r = 14;
        t1.tinggi = 20;
        t1.tampilHasil();
        
        System.out.println("\n------------Balok------------");
        Balok b1 = new Balok();
        b1.p = 20;
        b1.l = 10;
        b1.t = 15;
        b1.tampilHasil();
        
        System.out.println("\n------------Bola------------");
        Bola b2 = new Bola();
        b2.r = 21;
        b2.tampilHasil();
    }
}
