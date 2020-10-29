/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan20.targetsaldotabungan;

/**
 * @author 
 * NAMA: Zain Achamd Rizqullah
 * KELAS: PBO2
 * NIM: 10116380
 * Deskripsi: Program Target Saldo Tabungan
 */
public class PBO210116380Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;
        int saldoTab = 3500000;
        double bungaBul = 0.08;
        double saldoBul;

        while (saldoTab <= 6000000) {

            saldoBul = bungaBul * saldoTab;
            saldoTab = (int) (saldoTab + saldoBul);
            System.out.println("Saldo di bulan ke-" + i + " Rp. "
                    + saldoTab);
            i++;
        }
        
    }
    
}
