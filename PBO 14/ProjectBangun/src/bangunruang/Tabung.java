/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author farras
 */
public class Tabung extends BangunRuang {
    public double r;
    public double tinggi;
    
    @Override
    public double hitungVolume(){
        double volume = Math.round(Math.PI * this.r * this.r * this.tinggi);
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double luas = Math.round(2 * Math.PI * this.r * this.r);
        return luas;
    }
}
