/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118031.latihan45.cetaknama;

/**
 *
 * @author Vendetta
 */
public class Printer {
   private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak (String nama){
        System.out.println("Nama Anda : " + nama);
    }
    
    public void cetak (int jmlCetak, String nama){
        System.out.println("Hasil Cetak :");
        for(int no = 1; no<=jmlCetak; no++){
            System.out.println(no+". "+ nama);
        }
    }
    
}
