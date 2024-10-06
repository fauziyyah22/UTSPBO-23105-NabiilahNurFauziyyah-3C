/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author FIFI
 */
public class KamarDouble extends Kamar {
    public KamarDouble(int nomorKamar, boolean statusKamar, double harga){
        super(nomorKamar, "Double", statusKamar, harga);
    }
    
    //Mengembalikan tipe kamar spesifik sesuai dengan masing-masing class
    @Override
    public String getTipeKamar(){
        return "Kamar Double";
    }
}