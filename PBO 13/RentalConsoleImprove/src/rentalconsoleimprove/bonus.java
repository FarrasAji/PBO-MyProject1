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
public class bonus extends perental {
    private int jmlcashback;
    
    perental data2 = new perental();
//    Contractor
    public int cashback(String x){
        if ("M002".equals(x)){
            this.jmlcashback = 5000;
            System.out.println("Jumlah Cashback : "+this.jmlcashback);
        } else if ("M003".equals(x)){
            this.jmlcashback = 10000;
            System.out.println("Jumlah Cashback : "+this.jmlcashback);
        } else{
            this.jmlcashback = 0;
        }
        return this.jmlcashback;
        
    }
}
