/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;
import Hotel.Kamar;
import Hotel.Reservasi;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author FIFI
 */
public class KamarService implements HotelService{
    private ArrayList<Kamar> kamarr; //Daftar Kamar di Hotel.
    private ArrayList<Reservasi> reservasii; //Daftar Reservasi Hotel.
    
    public KamarService(ArrayList<Kamar> kamarr, ArrayList<Reservasi> reservasii) {
        this.kamarr = kamarr;
        this.reservasii = reservasii;
    }
    
    //Pemesanan Kamar oleh Pelanggan.
    @Override
    public void pesanKamar(String namaPelanggan, int nomorKamar, int jumlahHari){
        Scanner scanner = new Scanner(System.in);
    
        for (Kamar kamar : kamarr){
            if (kamar.memeriksaStatus() && nomorKamar == kamar.getNomorKamar()){
                double totalHarga = kamar.getHarga() * jumlahHari;
                System.out.println("Total harga yang harus dibayar: Rp. " +totalHarga);
                System.out.printf("Masukkan jumlah pembayaran: Rp. ");
                double pembayaran = scanner.nextDouble();
                
                if (pembayaran >= totalHarga){
                kamar.memesanKamar();
                reservasii.add(new Reservasi(namaPelanggan, kamar, jumlahHari, totalHarga));
                System.out.println("Pembayaran berhasil. Terima Kasih, " + namaPelanggan + "!");
                    
                if (pembayaran > totalHarga){
                        System.out.printf("Kembalian Uang Anda: %.2f\n", (pembayaran - totalHarga));
                    }
                } else {
                    System.out.println("Pembayaran tidak mencukupi. Pesanan dibatalkan.");
                }
                return;
            }
        }
        System.out.println("Kamar dengan nomor " +nomorKamar + " tidak tersedia.");
    }
    
    //Menampilkan status ketersediaan Kamar.
    @Override
    public void memeriksaStatusKamar(){
        System.out.println("+-----------------------------------------------+");
        System.out.println("| Nomor Kamar | Tipe Kamar | Status     | Harga |");
        System.out.println("+-----------------------------------------------+");
        for (Kamar kamar : kamarr){
            kamar.getDetail();
        }
        System.out.println("+-------------------------------------------+");
    }
    
    //Menghapus Reservasi berdasarkan Nomor Kamar.
    @Override
    public void hapusReservasi(int nomorKamar){
        for (Reservasi res : reservasii){
            if (res.getKamar().getNomorKamar() == nomorKamar){
                res.getKamar().setStatusKamar(true); //Mengembalikan status kamar menjadi tersedia.
                reservasii.remove(res);
                System.out.println("Reservasi untuk Kamar dengan nomor " + nomorKamar + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Tidak ditemukan reservasi dengan nomor kamar: " + nomorKamar);
    }
    
    //Mendapatkan detail reservasi berdasarkan Nama Pelanggan.
    @Override
    public void getDetailReservasi(String namaPelanggan){
        for (Reservasi res : reservasii){
            if (res.getNamaPelanggan().equalsIgnoreCase(namaPelanggan)){
                res.detailReservasi();
                return;
            }
        }
        System.out.println("Pesanan tidak ditemukan atas nama: " + namaPelanggan);
    }
    
    //Mendapatkan semua Reservasi yang tersedia.
    public void getSemuaReservasi(){
        if (reservasii.isEmpty()){
            System.out.println("Belum ada pesanan.");
        } else {
            for (Reservasi res : reservasii){
                res.detailReservasi();
                System.out.println("-----------------------------------");
            }
        }
    }
}
    



