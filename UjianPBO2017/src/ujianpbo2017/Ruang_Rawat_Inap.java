/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujianpbo2017;

/**
 *
 * @author ahmadluky
 */
public class Ruang_Rawat_Inap {
    int id;
    int harga; //harga kamar permalam dalam ribu. Jadi kalau 400 artinya Rp400000

    //lengkapi
    public Ruang_Rawat_Inap(int id, int harga) {
    }

    //lengkapi
    public void print() {
    }

    public static void main(String[] args) {
        Ruang_Rawat_Inap rri = new Ruang_Rawat_Inap(231,200);
        rri.print();
    }
}

//output:
//id ruangan:231 harga:200