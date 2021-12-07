/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import mobil.*;
/**
 *
 * @author farras
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Mobil A |   Sedan   |   Solo - Kudus (155 km)       |  Kecepatan 60 km/jam");
        Sedan A = new Sedan();
        A.jarak = 155;
        A.kecepatan = 60;
        A.tampilHasil();
        
        System.out.println("\nMobil B |   Sedan   |   Solo - Jakarta (536 km)   |  Kecepatan 65 km/jam");
        Sedan B = new Sedan();
        B.jarak = 536;
        B.kecepatan = 65;
        B.tampilHasil();
        
        System.out.println("\nMobil C |   SUV   |   Solo - Banten (661 km)      |  Kecepatan 57 km/jam");
        SUV C = new SUV();
        C.jarak = 661;
        C.kecepatan = 57;
        C.tampilHasil();
        
        System.out.println("\nMobil D |   SUV   |   Solo - Bandung (534 km)     |  Kecepatan 62 km/jam");
        SUV D = new SUV();
        D.jarak = 534;
        D.kecepatan = 62;
        D.tampilHasil();
        
        System.out.println("\nMobil E |   MPV   |   Solo - Banyuwangi (541 km)  |  Kecepatan 64 km/jam");
        MPV E = new MPV();
        E.jarak = 541;
        E.kecepatan = 64;
        E.tampilHasil();
        
        System.out.println("\nMobil F |   MPV   |   Solo - Jember (433 km)      |  Kecepatan 53 km/jam");
        MPV F = new MPV();
        F.jarak = 433;
        F.kecepatan = 53;
        F.tampilHasil();
    }
}
