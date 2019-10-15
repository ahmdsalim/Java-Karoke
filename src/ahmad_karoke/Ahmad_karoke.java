/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahmad_karoke;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LABKOM01-RPL01
 */
public class Ahmad_karoke {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        Integer jam,bayar,pilihan,total,harga,kembali;
        Scanner keyboard = new Scanner(System.in);
        showMenu();
         
        System.out.println("Nama Mu : ");
        nama = keyboard.nextLine();
        System.out.println("Pilih Jenis Room (1/2/3/4) : ");
        pilihan = keyboard.nextInt();
        if(pilihan == 1){
            harga = 55000;
            System.out.println("Lama Sewanya / Jam : ");
            jam = keyboard.nextInt();
            if(jam > 3){
                System.out.println("Anda Mendapatkan Diskon 11.11%");
                int discount = harga*jam*1111/10000;
                System.out.println("Diskon Sebesar : Rp."+discount+",-");
                total = (harga * jam) - (harga*jam*1111/10000);
                System.out.println("Total Harga : Rp."+total+",-");
                System.out.println("Total Bayar : Rp.");
                bayar = keyboard.nextInt();
                if(bayar >= total) {
                    kembali = bayar - total;
                    System.out.println("============ Karoke Lah ==============");
                    System.out.println("Nama        : "+nama+"");
                    System.out.println("Jenis Room  : Small");
                    System.out.println("Total Harga : Rp."+total+",-");
                    System.out.println("Kembali     : Rp."+kembali+",-");
                    System.out.println("======Terima Kasih Telah Memesan======");
                }else{
                    System.out.println("Uang Anda Kurang!");
                    bayar = 0;
                    System.out.println("Total Bayar : Rp.");
                    bayar = keyboard.nextInt();
                    while(bayar < total) {
                        System.out.println("Uang Anda Kurang!");
                        bayar = 0;
                        System.out.println("Total Bayar : Rp.");
                        bayar = keyboard.nextInt();
                    }
                    kembali = bayar - total;
                    System.out.println("============ Karoke Lah ==============");
                    System.out.println("Nama        : "+nama+"");
                    System.out.println("Jenis Room  : Small");
                    System.out.println("Total Harga : Rp."+total+",-");
                    System.out.println("Kembali     : Rp."+kembali+",-");
                    System.out.println("======Terima Kasih Telah Memesan======");
                }
            }else{
            total = harga * jam;
            System.out.println("Total Harga : Rp."+total+"");
            System.out.println("Total Bayar : Rp.");
            bayar = keyboard.nextInt();
            if(bayar >= total) {
                kembali = bayar - total;
                System.out.println("============ Karoke Lah ==============");
                System.out.println("Nama        : "+nama+"");
                System.out.println("Jenis Room  : Small");
                System.out.println("Total Harga : Rp."+total+",-");
                System.out.println("Kembali     : Rp."+kembali+",-");
                System.out.println("======Terima Kasih Telah Memesan======");
            }else{
                System.out.println("Uang Anda Kurang!");
                bayar = 0;
                System.out.println("Total Bayar : Rp.");
                bayar = keyboard.nextInt();
                while(bayar < total) {
                    System.out.println("Uang Anda Kurang!");
                    bayar = 0;
                    System.out.println("Total Bayar : Rp.");
                    bayar = keyboard.nextInt();
                }
                kembali = bayar - total;
                System.out.println("============ Karoke Lah ==============");
                System.out.println("Nama        : "+nama+"");
                System.out.println("Jenis Room  : Small");
                System.out.println("Total Harga : Rp."+total+",-");
                System.out.println("Kembali     : Rp."+kembali+",-");
                System.out.println("======Terima Kasih Telah Memesan======");
            }
            }
        }else if(pilihan == 2){ //Room 2
            harga = 70000;
            System.out.println("Lama Sewanya / Jam : ");
            jam = keyboard.nextInt();
            if(jam > 3){
                System.out.println("Anda Mendapatkan Diskon 11.11%");
                int discount = harga*jam*1111/10000;
                System.out.println("Diskon Sebesar : Rp."+discount+",-");
                total = (harga * jam) - (harga*jam*1111/10000);
                System.out.println("Total Harga : Rp."+total+",-");
                System.out.println("Total Bayar : Rp.");
                bayar = keyboard.nextInt();
                if(bayar >= total) {
                    kembali = bayar - total;
                    System.out.println("============ Karoke Lah ==============");
                    System.out.println("Nama        : "+nama+"");
                    System.out.println("Jenis Room  : Medium");
                    System.out.println("Total Harga : Rp."+total+",-");
                    System.out.println("Kembali     : Rp."+kembali+",-");
                    System.out.println("======Terima Kasih Telah Memesan======");
                }else{
                    System.out.println("Uang Anda Kurang!");
                    bayar = 0;
                    System.out.println("Total Bayar : Rp.");
                    bayar = keyboard.nextInt();
                    while(bayar < total) {
                        System.out.println("Uang Anda Kurang!");
                        bayar = 0;
                        System.out.println("Total Bayar : Rp.");
                        bayar = keyboard.nextInt();
                    }
                    kembali = bayar - total;
                    System.out.println("============ Karoke Lah ==============");
                    System.out.println("Nama        : "+nama+"");
                    System.out.println("Jenis Room  : Medium");
                    System.out.println("Total Harga : Rp."+total+",-");
                    System.out.println("Kembali     : Rp."+kembali+",-");
                    System.out.println("======Terima Kasih Telah Memesan======");
                }
            }else{
            total = harga * jam;
            System.out.println("Total Harga : Rp."+total+"");
            System.out.println("Total Bayar : Rp.");
            bayar = keyboard.nextInt();
            if(bayar >= total) {
                kembali = bayar - total;
                System.out.println("============ Karoke Lah ==============");
                    System.out.println("Nama        : "+nama+"");
                    System.out.println("Jenis Room  : Medium");
                    System.out.println("Total Harga : Rp."+total+",-");
                    System.out.println("Kembali     : Rp."+kembali+",-");
                    System.out.println("======Terima Kasih Telah Memesan======");
            }else{
                System.out.println("Uang Anda Kurang!");
                bayar = 0;
                System.out.println("Total Bayar : Rp.");
                bayar = keyboard.nextInt();
                while(bayar < total) {
                    System.out.println("Uang Anda Kurang!");
                    bayar = 0;
                    System.out.println("Total Bayar : Rp.");
                    bayar = keyboard.nextInt();
                }
                kembali = bayar - total;
                System.out.println("============ Karoke Lah ==============");
                    System.out.println("Nama        : "+nama+"");
                    System.out.println("Jenis Room  : Medium");
                    System.out.println("Total Harga : Rp."+total+",-");
                    System.out.println("Kembali     : Rp."+kembali+",-");
                    System.out.println("======Terima Kasih Telah Memesan======");
            }
            }
        }else if(pilihan == 3){
            harga = 120000;
            System.out.println("Lama Sewanya / Jam : ");
            jam = keyboard.nextInt();
            if(jam > 3){
                System.out.println("Anda Mendapatkan Diskon 11.11%");
                int discount = harga*jam*1111/10000;
                System.out.println("Diskon Sebesar : Rp."+discount+",-");
                total = (harga * jam) - (harga*jam*1111/10000);
                System.out.println("Total Harga : Rp."+total+",-");
                System.out.println("Total Bayar : Rp.");
                bayar = keyboard.nextInt();
                if(bayar >= total) {
                    kembali = bayar - total;
                    System.out.println("============ Karoke Lah ==============");
                    System.out.println("Nama        : "+nama+"");
                    System.out.println("Jenis Room  : Large");
                    System.out.println("Total Harga : Rp."+total+",-");
                    System.out.println("Kembali     : Rp."+kembali+",-");
                    System.out.println("======Terima Kasih Telah Memesan======");
                }else{
                    System.out.println("Uang Anda Kurang!");
                    bayar = 0;
                    System.out.println("Total Bayar : Rp.");
                    bayar = keyboard.nextInt();
                    while(bayar < total) {
                        System.out.println("Uang Anda Kurang!");
                        bayar = 0;
                        System.out.println("Total Bayar : Rp.");
                        bayar = keyboard.nextInt();
                    }
                    kembali = bayar - total;
                    System.out.println("============ Karoke Lah ==============");
                    System.out.println("Nama        : "+nama+"");
                    System.out.println("Jenis Room  : Large");
                    System.out.println("Total Harga : Rp."+total+",-");
                    System.out.println("Kembali     : Rp."+kembali+",-");
                    System.out.println("======Terima Kasih Telah Memesan======");
                }
            }else{
            total = harga * jam;
            System.out.println("Total Harga : Rp."+total+"");
            System.out.println("Total Bayar : Rp.");
            bayar = keyboard.nextInt();
            if(bayar >= total) {
                kembali = bayar - total;
                System.out.println("============ Karoke Lah ==============");
                    System.out.println("Nama        : "+nama+"");
                    System.out.println("Jenis Room  : Large");
                    System.out.println("Total Harga : Rp."+total+",-");
                    System.out.println("Kembali     : Rp."+kembali+",-");
                    System.out.println("======Terima Kasih Telah Memesan======");
            }else{
                System.out.println("Uang Anda Kurang!");
                bayar = 0;
                System.out.println("Total Bayar : Rp.");
                bayar = keyboard.nextInt();
                while(bayar < total) {
                    System.out.println("Uang Anda Kurang!");
                    bayar = 0;
                    System.out.println("Total Bayar : Rp.");
                    bayar = keyboard.nextInt();
                }
                kembali = bayar - total;
                System.out.println("============ Karoke Lah ==============");
                    System.out.println("Nama        : "+nama+"");
                    System.out.println("Jenis Room  : Large");
                    System.out.println("Total Harga : Rp."+total+",-");
                    System.out.println("Kembali     : Rp."+kembali+",-");
                    System.out.println("======Terima Kasih Telah Memesan======");
            }
            }
        }else if(pilihan == 4){
            harga = 150000;
            System.out.println("Lama Sewanya / Jam : ");
            jam = keyboard.nextInt();
            if(jam > 3){
                System.out.println("Anda Mendapatkan Diskon 11.11%");
                int discount = harga*jam*1111/10000;
                System.out.println("Diskon Sebesar : Rp."+discount+",-");
                total = (harga * jam) - (harga*jam*1111/10000);
                System.out.println("Total Harga : Rp."+total+",-");
                System.out.println("Total Bayar : Rp.");
                bayar = keyboard.nextInt();
                if(bayar >= total) {
                    kembali = bayar - total;
                    System.out.println("============ Karoke Lah ==============");
                    System.out.println("Nama        : "+nama+"");
                    System.out.println("Jenis Room  : Family");
                    System.out.println("Total Harga : Rp."+total+",-");
                    System.out.println("Kembali     : Rp."+kembali+",-");
                    System.out.println("======Terima Kasih Telah Memesan======");
                }else{
                    System.out.println("Uang Anda Kurang!");
                    bayar = 0;
                    System.out.println("Total Bayar : Rp.");
                    bayar = keyboard.nextInt();
                    while(bayar < total) {
                        System.out.println("Uang Anda Kurang!");
                        bayar = 0;
                        System.out.println("Total Bayar : Rp.");
                        bayar = keyboard.nextInt();
                    }
                    kembali = bayar - total;
                    System.out.println("============ Karoke Lah ==============");
                    System.out.println("Nama        : "+nama+"");
                    System.out.println("Jenis Room  : Family");
                    System.out.println("Total Harga : Rp."+total+",-");
                    System.out.println("Kembali     : Rp."+kembali+",-");
                    System.out.println("======Terima Kasih Telah Memesan======");
                }
            }else{
            total = harga * jam;
            System.out.println("Total Harga : Rp."+total+"");
            System.out.println("Total Bayar : Rp.");
            bayar = keyboard.nextInt();
            if(bayar >= total) {
                kembali = bayar - total;
                System.out.println("============ Karoke Lah ==============");
                    System.out.println("Nama        : "+nama+"");
                    System.out.println("Jenis Room  : Family");
                    System.out.println("Total Harga : Rp."+total+",-");
                    System.out.println("Kembali     : Rp."+kembali+",-");
                    System.out.println("======Terima Kasih Telah Memesan======");
            }else{
                System.out.println("Uang Anda Kurang!");
                bayar = 0;
                System.out.println("Total Bayar : Rp.");
                bayar = keyboard.nextInt();
                while(bayar < total) {
                    System.out.println("Uang Anda Kurang!");
                    bayar = 0;
                    System.out.println("Total Bayar : Rp.");
                    bayar = keyboard.nextInt();
                }
                kembali = bayar - total;
                System.out.println("============ Karoke Lah ==============");
                    System.out.println("Nama        : "+nama+"");
                    System.out.println("Jenis Room  : Family");
                    System.out.println("Total Harga : Rp."+total+",-");
                    System.out.println("Kembali     : Rp."+kembali+",-");
                    System.out.println("======Terima Kasih Telah Memesan======");
            }
            }
        }else{
            System.out.println("Tidak Ada Jenis Yang Anda Maksudkan!");
        }
        
        
    }
    
    static void showMenu() {
        
        System.out.println("List Harga : Karoke Lah");
        System.out.println("1.Room Small /55.000");
        System.out.println("2.Room Medium /70.000");
        System.out.println("3.Room Large /55.000");
        System.out.println("4.Family Room /55.000");

    }
    
}
