/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsoleimprove;

/**
 *
 * @author farras
 */
public class RentalConsoleImprove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        perental data = new perental();
        platinum p = new platinum();
        bonus b = new bonus();
        data.data();

        
        String x = data.id;
        p.dataAnggota(x, data.setnama(), 
                data.setJenisMmber(), 
                data.setTglPinjam(), 
                data.setBlnPinjam(), 
                data.getThnPinjam(), 
                data.setTglKembali(), 
                data.setBlnPinjam(), 
                data.getThnKembali(), 
                data.setLamaHari(), 
                data.getTotalSewa(), 
                data.getJmlPoin());
        b.cashback(x);
        p.pulsa(x);
  
    }
    
    }