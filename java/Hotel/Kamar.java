/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author FIFI
 */
public class Kamar {
    //Atribut menyimpan informasi kamar seperti nomor, tipe, status, dan harga kamar.
    private int nomorKamar; 
    protected String tipeKamar;
    private boolean statusKamar;
    private double harga;
    
    //Konstruktor untuk menginialisasi objek kamar dengan nilai yang diberikan.
    public Kamar(int nomorKamar, String tipeKamar, boolean statusKamar, double harga){
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.statusKamar = statusKamar;
        this.harga = harga;
    }
    
    //Getter untuk mengembalikan nomor kamar.
    public int getNomorKamar(){
        return nomorKamar;
    }
    
    //Metode untuk mengembalikan status ketersediaan kamar.
    public boolean memeriksaStatus(){
        return statusKamar;
    }
    
    //Metode untuk mengubah status kamar menjadi tidak tersedia (kamar sudah dipesan).
    public void memesanKamar(){
        statusKamar = false; //Kamar tidak tersedia setelah dipesan 
    }
    
    //Getter untuk mengembalikan harga kamar.
    public double getHarga(){
        return harga;
    }
    
    //Menampilkan detail kamar.
    public void getDetail(){
        String ketersediaan = statusKamar ? "Ya" : "Tidak"; //Mengatur ketersediaan kamar dalam format String
        System.out.printf("| %-11d | %-10s | %-10s | %-7.2f |\n", nomorKamar, tipeKamar, ketersediaan, harga);
    }
    
    //Metode ini bisa dioverride oleh subclass, mengembalikan tipe kamar.
    public String getTipeKamar(){
        return tipeKamar;
    }
    
    //Mengatur status ketersediaan kamar.
    public void setStatusKamar(boolean statusKamar) {
    this.statusKamar = statusKamar;
    }
}
