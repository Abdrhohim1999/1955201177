/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author ASUS X453M
 */
public class contohscanner {
    public static void main(String[] args) {
    //  contohscanner
      Scanner input = new Scanner(System.in);
      
       // variable
        String nama,prodi,alamat,pekerjaan,agama;
        int nim;
        
        System.out.println("======================");
        System.out.println("    FORM PERTANYAAN   ");
        System.out.println("======================");
        System.out.println("masukkan nama lengkap anda =");
        nama = input.nextLine();
        System.out.println("anda mengambil program study =");
        prodi = input.nextLine();
        System.out.println("isikan alamat anda =");
        alamat = input.nextLine();
        System.out.println("masukkan pekerjaan anda =");
        pekerjaan = input.nextLine();
        System.out.println("masukkan agama anda =");
        agama = input.nextLine();
        System.out.println("masukkan nim =");
        nim = input.nextInt();
        // output
       System.out.println("=====================");
        System.out.println("  FORM PERTANTANYAAN ");
        System.out.println("=====================");
        System.out.println("Nama Lengkap =" + nama);
        System.out.println("nim =" + nim);
        System.out.println("program study =" + prodi);
        System.out.println("alamat =" + alamat);
        System.out.println("pekerjaan =" + pekerjaan);
        System.out.println("agama =" + agama);
        System.out.println("=====================");
        System.out.println("     TERIMAKASIH    ");
        System.out.println("=====================");
        
        
    }
}
