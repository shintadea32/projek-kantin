/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_produktif;

import java.util.Scanner;

/**
 *
 * @author I d e a P a d
 */
public class nama_pembeli extends nama_kantin {

    public void cetak_namapembeli(){//membuat method void dengan nama cetak nama pembeli
    String nama,hari;//menggunakan tipe data String dengan variabel nama dan hari
    int tgl,tahun;//menggunakan tipe data int dengan variabel tanggal dan tahun
    
    Scanner in = new Scanner (System.in);//menggunakan scanner agar bisa diinputkan oleh user
    
    System.out.println("-------------------------------------------------------");//jarak
    System.out.print("Nama  : ");//untuk memunculkan nama
    nama = in.next();//untuk pemanggilan nama
    
    System.out.print("Hari : ");//untuk memunculkan hari
    hari = in.next();//untuk pemanggilan hari
    System.out.println("-------------------------------------------------------");//jarak
}   
}
