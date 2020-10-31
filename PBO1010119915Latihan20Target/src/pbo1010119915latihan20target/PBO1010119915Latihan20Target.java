/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1010119915latihan20target;

import java.util.Scanner;

/**
 *
 * @author M Hongki Alfikram
 * Kelas : IF10-K
 * NIM :10119915
 */
public class PBO1010119915Latihan20Target {
    static int saldo_awal = 3500000;
    static int saldo_target =6000000;
    static int bunga = 8;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=1;
        do{
            saldo_awal = saldo_awal+(saldo_awal*bunga/100);
            System.out.println("Saldo di bulan ke-"+i+" Rp. "+saldo_awal);
            i++;
            saldo_target++;
            
        }while(saldo_awal <= saldo_target);
    }
    
}
