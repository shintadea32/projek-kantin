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
public class menu extends nama_kantin { //membuat class dengan nama menu lalu di extends dengan class pembeli
    
public void Daftarmenu(){//membuat method void daftar menu
        System.out.println("");//membuat output daftar menu dengan harganya
        System.out.println("________________________________________________");
        System.out.println("|                       MENU                    |");
        System.out.println("|                 Kantin El Shinta              |");
        System.out.println("|_______________________________________________|");
        System.out.println("|          Nama               |     Harga       |");
        System.out.println("|_____________________________|_________________|");
        System.out.println("| 1. Nasi Goreng              |   Rp 6000       |");
        System.out.println("| 2. Soto Ayam                |   Rp 7000       |");
        System.out.println("| 3. Nasi Ayam Bakar          |   Rp 6000       |");
        System.out.println("| 4. Nasi Campur              |   Rp 6000       |");
        System.out.println("| 5. Es Teh                   |   Rp 4000       |");
        System.out.println("| 6. Es Jeruk                 |   Rp 4000       |");
        System.out.println("| 7. Jus Buah                 |   Rp 5000       |");
        System.out.println("| 8. Teh Anget                |   Rp 2000       |");
        System.out.println("|_____________________________|_________________|");
        System.out.println("");
}
public void cetak(){//membuat method void dengan nama cetak agar memudahkan ketika dipanggil

        Scanner input = new Scanner(System.in);//menggunakan scanner agar bisa menginputkan dari user
            
        int harga[] = {6000, 7000, 6000, 6000, 4000, 4000, 5000, 2000};//membuat array harga, array dimulai dari 0
        int total;//membuat variabel total 
        int bayar;//membuat variabel bayar
        int kembalian;//membuat variabel kembalian
        
        System.out.println("________________________________________________");//jarak
        System.out.print ("Masukkan Nomor Pesanan : ");//membuat perintah yang akan muncul di output program
        int item = input.nextInt();//menggunakan scanner dengan variabel item
        
        System.out.print("Masukkan Banyak Pesanan : ");//membuat perintah yang akan muncul di output program
        int jumlah = input.nextInt();//menggunakan scanner dengan variabel jumlah
        System.out.println("________________________________________________");//jarak
        
        switch (item){//menggunakan percabangan switch case
            case 1://membuat case 1, case 1 berisi menu pertama
                System.out.println("Pesanan anda : Nasi Goreng");//membuat output pesanan ke 1 
                System.out.println("Harga : "+harga[0]);//membuat output harga, dengan ditambah harga menu pertama, karena array diawali oleh 0, maka harga diisi 0 agar cocok dengan menu pertama di daftar menu
                total = harga [0] * jumlah;//melakukan operator aritmatika yaitu perkalian
                System.out.println("Total yang harus anda bayar  :  Rp." +total);//membuat output total dan ditambahkan variabel total agar data bisa masuk
                System.out.println("________________________________________________");//jarak
                System.out.print  ("Jumlah uang yang diberikan   :  RP.");//membuat output uang yang akan diberikan pada kasir
                bayar = input.nextInt();//menggunakan scanner agar bisa diinputkan user
                kembalian = bayar - total;//membuat operator aritmatika yaitu pengurangan
                System.out.println("Kembalian Anda Sebesar       :  Rp." +kembalian);//membuat output kembalian, lalu ditambahkan variabel agar data bisa muncul

                if (bayar < total) {//menggunakan percabangan if, jika uang yg dibayarkan kurang dari total harga 
                System.out.println("Uang yang diserahkan kurang."); //maka akan muncul output seperti ini 
                 }
                else if (bayar == total) {//jika uang yang dibayarkan sama dengan total harga 
                System.out.println("Uang Pas");//maka akan muncul output seperti ini
   
                }
                System.out.println("________________________________________________");//jarak
                System.out.println("           Terimakasih atas kunjungannya.       ");//output terimakasih
                System.out.println("________________________________________________");//jarak
            break;//mengakhiri case 1
            case 2://melanjutkan case 2
                System.out.println("Pesanan anda : Soto Ayam");//membuat output pesanan ke dua
                System.out.println("Harga : "+harga[1]);////membuat output harga, dengan ditambah harga menu kedua, karena array diawali oleh 0, maka harga diisi 1 agar cocok dengan menu kedua di daftar menu
                total = harga [1] * jumlah;//melakukan operator aritmatika yaitu perkalian
                System.out.println("Total yang harus anda bayar  :  Rp." +total);//membuat output total dan ditambahkan variabel total agar data bisa masuk
                System.out.println("________________________________________________");//jarak
                System.out.print  ("Jumlah uang yang diberikan   :  RP.");//membuat output uang yang akan diberikan pada kasir
                bayar = input.nextInt();//menggunakan scanner agar bisa diinputkan user
                kembalian = bayar - total;//membuat operator aritmatika yaitu pengurangan
                System.out.println("Kembalian Anda Sebesar       :  Rp." +kembalian);//membuat output kembalian, lalu ditambahkan variabel agar data bisa muncul
                
                if (bayar < total) {//menggunakan percabangan if, jika uang yg dibayarkan kurang dari total harga 
                System.out.println("Uang yang diserahkan kurang."); //maka akan muncul output seperti ini  
                 }
                else if (bayar == total) {//jika uang yang dibayarkan sama dengan total harga 
                System.out.println("Uang Pas");//maka akan muncul output seperti ini
                
                }
                System.out.println("________________________________________________");//jarak
                System.out.println("           Terimakasih atas kunjungannya.       ");//output terimakasih
                System.out.println("________________________________________________");//jarak
            break;//mengakhiri case 2
            case 3://melanjutkan case 3
                System.out.println("Pesanan anda : Nasi Ayam Bakar");//membuat output pesanan ke 3
                System.out.println("Harga : "+harga[2]);//membuat output harga, dengan ditambah harga menu ketiga, karena array diawali oleh 0, maka harga diisi 2 agar cocok dengan menu ketiga di daftar menu
                total = harga [2] * jumlah;//melakukan operator aritmatika yaitu perkalian
                System.out.println("Total yang harus anda bayar  :  Rp." +total);//membuat output total dan ditambahkan variabel total agar data bisa masuk
                System.out.println("________________________________________________");//jarak
                System.out.print  ("Jumlah uang yang diberikan   :  RP.");//membuat output uang yang akan diberikan pada kasir
                bayar = input.nextInt();//menggunakan scanner agar bisa diinputkan user
                kembalian = bayar - total;//membuat operator aritmatika yaitu pengurangan
                System.out.println("Kembalian Anda Sebesar       :  Rp." +kembalian);//membuat output kembalian, lalu ditambahkan variabel agar data bisa muncul
                
                if (bayar < total) {//menggunakan percabangan if, jika uang yg dibayarkan kurang dari total harga 
                System.out.println("Uang yang diserahkan kurang.");  //maka akan muncul output seperti ini 
                 }
                else if (bayar == total) {//jika uang yang dibayarkan sama dengan total harga 
                System.out.println("Uang Pas");//maka akan muncul output seperti ini
                
                }
                System.out.println("________________________________________________");//jarak
                System.out.println("           Terimakasih atas kunjungannya.       ");//output terimakasih
                System.out.println("________________________________________________");//jarak
            break;//mengakhiri case 3
            case 4://melanjutkan case 4
                System.out.println("Pesanan anda : Nasi Campur");//membuat output pesanan ke 4
                System.out.println("Harga : "+harga[3]);//membuat output harga, dengan ditambah harga menu ke empat, karena array diawali oleh 0, maka harga diisi 3 agar cocok dengan menu ke empat di daftar menu
                total = harga [3] * jumlah;//melakukan operator aritmatika yaitu perkalian
                System.out.println("Total yang harus anda bayar  :  Rp." +total);//membuat output total dan ditambahkan variabel total agar data bisa masuk
                System.out.println("________________________________________________");//jarak
                System.out.print  ("Jumlah uang yang diberikan   :  RP.");//membuat output uang yang akan diberikan pada kasir
                bayar = input.nextInt();//menggunakan scanner agar bisa diinputkan user
                kembalian = bayar - total;//membuat operator aritmatika pengurangan
                System.out.println("Kembalian Anda Sebesar       :  Rp." +kembalian);//membuat output kembalian, lalu ditambahkan variabel agar data bisa muncul
                
                if (bayar < total) {//menggunakan percabangan if, jika uang yg dibayarkan kurang dari total harga 
                System.out.println("Uang yang diserahkan kurang.");  //maka akan muncul output seperti ini 
                 }
                else if (bayar == total) {//jika uang yang dibayarkan sama dengan total harga 
                System.out.println("Uang Pas");//maka akan muncul output seperti ini
              
                }
                System.out.println("________________________________________________");//jarak
                System.out.println("           Terimakasih atas kunjungannya.       ");//output terimakasih
                System.out.println("________________________________________________");//jarak
            break;//mengakhiri case 4
            case 5://melanjutkan case 5
                System.out.println("Pesanan anda : Es Teh");//membuat output pesanan ke 5 
                System.out.println("Harga : "+harga[4]);//membuat output harga, dengan ditambah harga menu kelima, karena array diawali oleh 0, maka harga diisi 4 agar cocok dengan menu ke lima di daftar menu
                total = harga [4] * jumlah;//melakukan operator aritmatika yaitu perkalian
                System.out.println("Total yang harus anda bayar  :  Rp." +total);//membuat output total dan ditambahkan variabel total agar data bisa masuk
                System.out.println("________________________________________________");//jarak
                System.out.print  ("Jumlah uang yang diberikan   :  RP.");//membuat output uang yang akan diberikan pada kasir
                bayar = input.nextInt();//menggunakan scanner agar bisa diinputkan user
                kembalian = bayar - total;//membuat operator aritmatika yaitu pengurangan
                System.out.println("Kembalian Anda Sebesar       :  Rp." +kembalian);//membuat output kembalian, lalu ditambahkan variabel agar data bisa muncul
                
                if (bayar < total) {//menggunakan percabangan if, jika uang yg dibayarkan kurang dari total harga 
                System.out.println("Uang yang diserahkan kurang.");  //maka akan muncul output seperti ini 
                 }
                else if (bayar == total) {//jika uang yang dibayarkan sama dengan total harga 
                System.out.println("Uang Pas");//maka akan muncul output seperti ini
                
                }
                System.out.println("________________________________________________");//jarak
                System.out.println("           Terimakasih atas kunjungannya.       ");//output terimakasih
                System.out.println("________________________________________________");//jarak
            break;//mengakhiri case 5
            case 6://melanjutkan case 6
                System.out.println("Pesanan anda : Es Jeruk");//membuat output pesanan ke 6
                System.out.println("Harga : "+harga[5]);//membuat output harga, dengan ditambah harga menu keenam, karena array diawali oleh 0, maka harga diisi 5 agar cocok dengan menu ke enam di daftar menu
                total = harga [5] * jumlah;//melakukan operator aritmatika yaitu perkalian
                System.out.println("Total yang harus anda bayar  :  Rp." +total);//membuat output total dan ditambahkan variabel total agar data bisa masuk
                System.out.println("________________________________________________");//jarak
                System.out.print  ("Jumlah uang yang diberikan   :  RP.");//membuat output uang yang akan diberikan pada kasir
                bayar = input.nextInt();//menggunakan scanner agar bisa diinputkan user
                kembalian = bayar - total;//membuat operator aritmatika yaitu pengurangan
                System.out.println("Kembalian Anda Sebesar       :  Rp." +kembalian);//membuat output kembalian, lalu ditambahkan variabel agar data bisa muncul
                
                if (bayar < total) {//menggunakan percabangan if, jika uang yg dibayarkan kurang dari total harga 
                System.out.println("Uang yang diserahkan kurang.");  //maka akan muncul output seperti ini
                 }
                else if (bayar == total) {//jika uang yang dibayarkan sama dengan total harga 
                System.out.println("Uang Pas");//maka akan muncul output seperti ini
             
                }
                System.out.println("________________________________________________");//jarak
                System.out.println("           Terimakasih atas kunjungannya.       ");//output terimakasih
                System.out.println("________________________________________________");//jarak
            break;//mengakhiri case 6
            case 7://melanjutkan case 7
                System.out.println("Pesanan anda : Jus Buah");//membuat output pesanan ke 7
                System.out.println("Harga : "+harga[6]);//membuat output harga, dengan ditambah harga menu ke tujuh, karena array diawali oleh 0, maka harga diisi 6 agar cocok dengan menu ke tujuh di daftar menu
                total = harga [6] * jumlah;//melakukan operator aritmatika yaitu perkalian
                System.out.println("Total yang harus anda bayar  :  Rp." +total);//membuat output total dan ditambahkan variabel total agar data bisa masuk
                System.out.println("________________________________________________");//jarak
                System.out.print  ("Jumlah uang yang diberikan   :  RP.");//membuat output uang yang akan diberikan pada kasir
                bayar = input.nextInt();//menggunakan scanner agar bisa diinputkan user
                kembalian = bayar - total;//membuat operator aritmatika yaitu pengurangan
                System.out.println("Kembalian Anda Sebesar       :  Rp." +kembalian);//membuat output kembalian, lalu ditambahkan variabel agar data bisa muncul
                
                if (bayar < total) {//menggunakan percabangan if, jika uang yg dibayarkan kurang dari total harga 
                System.out.println("Uang yang diserahkan kurang.");  //maka akan muncul output seperti ini 
                 }
                else if (bayar == total) {//jika uang yang dibayarkan sama dengan total harga 
                System.out.println("Uang Pas");//maka akan muncul output seperti ini
               
                }
                System.out.println("________________________________________________");//jarak
                System.out.println("           Terimakasih atas kunjungannya.       ");//output terimakasih
                System.out.println("________________________________________________");//jarak
            break;//mengakhiri case 7
            case 8://melanjutkan case 8
                System.out.println("Pesanan anda : Teh Anget");//membuat output pesanan ke 8
                System.out.println("Harga : "+harga[7]);//membuat output harga, dengan ditambah harga menu ke delapan, karena array diawali oleh 0, maka harga diisi 7 agar cocok dengan menu ke delapan di daftar menu
                total = harga [7] * jumlah;//melakukan operator aritmatika yaitu perkalian
                System.out.println("Total yang harus anda bayar  :  Rp." +total);//membuat output total dan ditambahkan variabel total agar data bisa masuk
                System.out.println("________________________________________________");//jarak
                System.out.print  ("Jumlah uang yang diberikan   :  RP.");//membuat output uang yang akan diberikan pada kasir
                bayar = input.nextInt();//menggunakan scanner agar bisa diinputkan user
                kembalian = bayar - total;//membuat operator aritmatika yaitu pengurangan
                System.out.println("Kembalian Anda Sebesar       :  Rp." +kembalian);//membuat output kembalian, lalu ditambahkan variabel agar data bisa muncul
                
                if (bayar < total) {//menggunakan percabangan if, jika uang yg dibayarkan kurang dari total harga 
                System.out.println("Uang yang diserahkan kurang.");  //maka akan muncul output seperti ini 
                 }
                else if (bayar == total) {//jika uang yang dibayarkan sama dengan total harga 
                System.out.println("Uang Pas");//maka akan muncul output seperti ini
                
                }
                System.out.println("________________________________________________");//jarak
                System.out.println("           Terimakasih atas kunjungannya.       ");//output terimakasih
                System.out.println("________________________________________________");//jarak
            break;//mengakhiri case 8
            default:
            System.out.println("Maaf Menu tidak tersedia ! :(");//output jika user memilih angka yang tidak ada di daftar menu
        
       
}
}
}

