/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author FIFI
 */
public class Pengguna {
    //Atribut menyimpan informasi nama pengguna dan peran seperti admin atau pelanggan
    private String nama;
    private String peran;
    
    //Konstruktor untuk menginialisasi objek pengguna dengan nama dan peran
    public Pengguna(String nama, String peran){
        this.nama = nama;
        this.peran = peran;
    }
    
    //Mengembalikan nama pengguna
    public String getNama(){
        return nama;
    }
    
    //Mengembalikan peran pengguna
    public String getPeran(){
        return peran;
    }
}
