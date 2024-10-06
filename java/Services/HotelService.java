/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

/**
 *
 * @author FIFI
 */
public interface HotelService {
    //Metode yang harus diimplementasikan oleh kelas yang menggunakannya. Fungsinya untuk mengelola pemesanan, pengecekan status, dan melihat detail reservasi.
    void pesanKamar(String namaPelanggan, int nomorKamar, int jumlahHari);
    void memeriksaStatusKamar();
    void hapusReservasi(int nomorKamar);
    void getDetailReservasi(String namaPelanggan);
}
