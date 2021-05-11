/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_produktif;

/**
 *
 * @author I d e a P a d
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//menggunakan class main
        // TODO code application logic here
        nama_kantin obj = new nama_kantin();//membuat objek untuk class nama kantin
        obj.namakantinn();//menaruh objek untuk memanggil method nama kantin
        obj.setAdmin("Shinta");//menaruh objek untuk memanggil method setAdmin dan mengisinya
        obj.getAdmin();//menaruh objek untuk memanggil method getAdmin
        
        nama_pembeli obj1 = new nama_pembeli();//membuat objek untuk dihubungkan dengan class nama_pembeli
        obj1.cetak_namapembeli();//memanggil method cetak_namapembeli  di class nama_pembeli
        
        menu obj3 = new menu();//membuat objek untuk dihubungkan dengan class menu
        obj3.Daftarmenu();//memanggil method daftar menu di class menu
        obj3.cetak();//memanggil method cetak di class menu
    }
    
}
