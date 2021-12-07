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
public class Balok extends BangunRuang {
    public double p;
    public double l;
    public double t;
    
    public double hitungVolume(){
        double volume = (this.p * this.l * this.t);
        return volume;
    }
    
    public double hitungLuasPermukaan(){
        double luas = (2 * ((this.p*this.l) + (this.p*this.t) + (this.l*this.t)));
        return luas;
    }
}
