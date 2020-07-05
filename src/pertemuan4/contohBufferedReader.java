/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 
 
 
 
 * @author Abd. rhohim
 */
public class contohBufferedReader {

    public static void main(String[] args) throws IOException {
        String nik;
        String nama;
        String jenis_kelamin;
        String agama;
        String pekerjaan;
        //object inputStream
        InputStreamReader isr = new InputStreamReader(System.in);
        // object bufferedReader
        BufferedReader br = new BufferedReader(isr);
        
        // mengisi variable nama dengan contohBufferedReader
        System.out.println("masukkan nik anda");
        nik = br.readLine();
        System.out.println("siapa nama anda?");
        nama = br.readLine();
        System.out.println("apa jenis_kelamin anda?");
        jenis_kelamin = br.readLine();
        System.out.println("islam opo ora, kowe?");
        agama = br.readLine();
        System.out.println("pekerjaan anda apa?");
        pekerjaan = br.readLine();
       // menampilkan nama
        System.out.println("Nik Anda Adalah " + nik);
        System.out.println("Nama Anda Adalah " + nama);
        System.out.println("jenis_kelamin anda adalah " + jenis_kelamin);
        System.out.println("Agama anda adalah " + agama);
        System.out.println("Agama anda adalah " + pekerjaan);
  

        
    
    }
    
}
