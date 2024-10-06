/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author FIFI
 */
public class KamarSingle extends Kamar {
    public KamarSingle(int nomorKamar, boolean statusKamar, double harga){
        super(nomorKamar, "Single", statusKamar, harga);
    }
    
    //Mengembalikan tipe kamar spesifik sesuai dengan masing-masing class
    @Override
    public String getTipeKamar(){
        return "Kamar Single";
    }
}
