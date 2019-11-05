package pbo1.pkg10118031.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk Cetak Nama
 */
public class PBO110118031Latihan45CetakNama {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Printer print = new Printer();

        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        print.setNama(scn.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        print.setJmlCetak(scn.nextInt());

        print.cetak(print.getNama());
        print.cetak(print.getJmlCetak(), print.getNama());
    }

}
