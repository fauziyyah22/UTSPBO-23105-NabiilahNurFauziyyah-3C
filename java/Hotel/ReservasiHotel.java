/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hotel;
import Services.KamarService;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author FIFI
 */
public class ReservasiHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Inisialisasi scanner untuk input pengguna.
        Scanner scanner = new Scanner(System.in);
        
        //Membuat daftar Kamar yang tersedia di Hotel.
        ArrayList<Kamar> daftarKamar = new ArrayList<>();
        daftarKamar.add(new KamarSingle(1, true, 150000));
        daftarKamar.add(new KamarDouble(2, true, 250000));
        daftarKamar.add(new KamarSuite(3, true, 350000));
        
        //Membuat daftar reservasi yang pada awalnya kosong.
        ArrayList<Reservasi> daftarReservasi = new ArrayList<>();
        
        //Membuat objek layanan kamar.
        KamarService kamarService = new KamarService(daftarKamar, daftarReservasi);
        
        //Program utama dengan opsi aAdmin atau Pelanggan.
        while (true){
            System.out.println("Masuk sebagai: ");
            System.out.println("1. Admin");
            System.out.println("2. Pelanggan");
            System.out.println("3. Keluar");
            System.out.printf("Silahkan masukkan opsi Anda: ");
            int pilihan = scanner.nextInt();
            
            //Jika pengguna memilih untuk Keluar.
            if (pilihan ==3){
                break;
            }
            
            //Mengecek password Admin.
            if (pilihan ==1){
                System.out.print("Masukkan password admin: ");
                String password = scanner.next();
                if (password.equals("iniadmin")){
                    System.out.println("Login berhasil sebagai admin.");
                    
                    //Menu jika pengguna memilih peran menjadi Admin.
                    while (true){
                        System.out.println("+------------------------------------------------+");
                        System.out.println("Pilih Menu: ");
                        System.out.println("1. Lihat Semua Pesanan");
                        System.out.println("2. Hapus Pesanan");
                        System.out.println("3. Keluar");
                        System.out.printf("Pilih opsi Anda: ");
                        int pilihanAdmin = scanner.nextInt();
                        System.out.println("+------------------------------------------------+");
                        
                        if (pilihanAdmin == 3){
                            break;
                        } else if (pilihanAdmin == 1){
                            kamarService.getSemuaReservasi(); //Menampilkan semua Reservasi HOtel.
                        } else if (pilihanAdmin == 2){
                            kamarService.getSemuaReservasi(); //Menampilkan daftar Reservasi Hotel.
                            System.out.printf("Masukkan nomor Kamar dari pesanan yang ingin dihapus: ");
                            int nomorKamar = scanner.nextInt();
                            kamarService.hapusReservasi(nomorKamar); //Menghapus Reservasi Hotel.
                        } else {
                            System.out.println("Pilihan tidak tersedia. Silahkan coba lagi.");
                        }
                    }
                } else {
                    System.out.println("Password salah!");
                }
            } else if (pilihan == 2){
                System.out.printf("Masukkan Nama Anda: ");
                String namaPelanggan = scanner.next();
                
                //Menu jika pengguna memilih peran menjadi Pelanggan.
                while (true){
                    System.out.println("+-----------------------------+");
                    System.out.println("| SELAMAT DATANG DI HOTEL PBO |");
                    System.out.println("+-----------------------------+");
                    System.out.println("Pilihan Menu: ");
                    System.out.println("1. Pesan Kamar");
                    System.out.println("2. Cek Status Ketersediaan Kamar");
                    System.out.println("3. Lihat Detail Pesanan");
                    System.out.println("4. Keluar");
                    System.out.printf("Pilih Opsi: ");
                    int pilihanPelanggan = scanner.nextInt();
                    
                    if (pilihanPelanggan == 4){
                        break;
                    } else if (pilihanPelanggan == 1){
                        kamarService.memeriksaStatusKamar(); //Menampilkan Kamar yang tersedia.
                        System.out.printf("Masukkan nomor kamar yang ingin Anda pesan: ");
                        int nomorKamar = scanner.nextInt();
                        System.out.printf("Masukkan jumlah hari Anda akan menginap: ");
                        int jumlahHari = scanner.nextInt();
                        kamarService.pesanKamar(namaPelanggan, nomorKamar, jumlahHari); //Memesan Kamar.
                    } else if (pilihanPelanggan == 2){
                        kamarService.memeriksaStatusKamar(); //Mengecek ketersediaan Kamar.
                    } else if (pilihanPelanggan == 3){
                        kamarService.getDetailReservasi(namaPelanggan); //Melihat detail reservasi.
                    } else {
                        System.out.println("Pilihan tidak tersedia. Silahkan coba lagi.");
                    }
                }
            } else {
                System.out.println("Pilihan tidak tersedia. Silahkan coba lagi.");
            }
        }
        
        //Menutup scanner
        scanner.close();
        System.out.println("+----------------------------------------------------------+");
        System.out.println("Terima Kasih telah menggunakan aplikasi Reservasi Hotel PBO!");
        System.out.println("+----------------------------------------------------------+");
    }
}
