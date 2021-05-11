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
public class nama_kantin {
    private String admin;//menggunakan modifier private
   
    public void namakantinn(){  //memiliki method dengan nama kantin
        System.out.println("Selamat Datang di Kantin El'Shinta "); //berisi tulisan selamat datang di kantin
        System.out.println("|Perut Kenyang, Hati Aman|");//berisi kata atau motto kantin
    }
    public void setAdmin(String admin){ //memiliki method dengan nama setAdmin
        this.admin = admin; //this digunakan untuk variabel yang ada didalam class
        System.out.println("Admin : "+admin); //untuk memunculkan nama admin
    }
    public String getAdmin(){ //membuat method non void
        return admin; //method non void menggunakan return
    }
}