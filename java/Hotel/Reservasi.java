/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author FIFI
 */
public class Reservasi {
    //Atribut untuk menyimpan informasi reservasi.
    private String namaPelanggan;
    private Kamar kamar;
    private int jumlahHari;
    private double totalHarga;
   
    //Konstruktor untuk menginialisasi objek reservasi dengan data reservasi pelanggan.
    public Reservasi(String namaPelanggan, Kamar kamar, int jumlahHari, double totalHarga){
        this.namaPelanggan = namaPelanggan;
        this.kamar = kamar;
        this.jumlahHari = jumlahHari;
        this.totalHarga = totalHarga;
    }
    
    //Mengembalikan nama pelanggan yang membuat reservasi.
    public String getNamaPelanggan(){
        return namaPelanggan;
    }
    
    //Mengembalikan objek Kamar yang dipesan.
    public Kamar getKamar(){
        return kamar;
    }
    
    //Menampilkan detail reservasi pelanggan.
    public void detailReservasi(){
        System.out.printf("Nama Pelanggan: %s\nNomor Kamar: %d\nTipe Kamar: %s\nHari: %d\nTotal Harga: %.2f\n",
            namaPelanggan, kamar.getNomorKamar(), kamar.getTipeKamar(), jumlahHari, totalHarga);
    }
}
