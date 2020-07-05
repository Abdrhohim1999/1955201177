/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;
/**
 *
 * @author Abd rhohim
 */
public class contohJOptionpane {
    public static void main(String[] args) {
      // input
      String NIK = JOptionPane.showInputDialog("Masukkan NIK anda");
      String nama = JOptionPane.showInputDialog("masukkan nama anda");
      String pekerjaan = JOptionPane.showInputDialog("masukkan pekerjaan anda");
      String jenis_kelamin = JOptionPane.showInputDialog("Masukkan Jenis kelamin anda");
      String alamat = JOptionPane.showInputDialog("Masukkan alamat anda");
        
      
      
   JOptionPane.showMessageDialog(null, "NIK Kamu Adalah =" + NIK);
   JOptionPane.showMessageDialog(null, "Nama Kamu Adalah =" + nama);
   JOptionPane.showMessageDialog(null, "pekerjaan Kamu Adalah =" + pekerjaan);
   JOptionPane.showMessageDialog(null, "jenis kelamin Kamu Adalah =" + jenis_kelamin);
   JOptionPane.showMessageDialog(null, "alamat Kamu Adalah =" + alamat);
    }
}
