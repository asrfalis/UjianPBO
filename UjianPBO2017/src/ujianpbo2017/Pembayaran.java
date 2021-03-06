/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujianpbo2017;

import java.util.ArrayList;

/**
 *
 * @author ahmadluky
 */
public class Pembayaran {
    Pasien pasien;
    double TagihanDokter;
    double TagihanFasilitas;
    
    private ArrayList<Fasilitas> alFasilitas = new ArrayList<>();
    private ArrayList<Dokter> alDokter = new ArrayList<>();

    //lengkapi
    public void addFasilitas(Fasilitas f) {
    }
    
    //lengapi
    public void addDokter(Dokter d){
    }
    
    //lengkapi
    public double hitungDokterTagihan(){
        return 0;
    }
    
    //lengkapi
    public double hitungFasilitasTagihan(){
        return 0;
    }
    
    //lengkapi
    public double hitungSemuaTagihan() {
        return 0;
    }

    public Pembayaran(Pasien p) {
        this.pasien = p;
    }

    public static void main(String[] args) {
        Pasien pasien = new Pasien(1,"Rudi");
        Pembayaran  pembayaran_pasien = new Pembayaran(pasien);
        
        /*
         * Lengkapi fungsu main, dengan ketentuan:
         * - jumlah pemeriksaan usg = 3 kali
         * - jumlah pemeriksaan ct scan = 3 kali
         * - jumlah pemeriksaan cek darah = 3 kali
         * - asuransi:200
         * - ruang rawat inap id=231 harga=200
         */
        
        // Cotoh USG:
        System.err.println("=========================");
        USG usg = new USG();
        usg.jumPemeriksaan = 3;
        usg.print();
        pembayaran_pasien.addFasilitas(usg);
        
    }
}

//output:
/*
|=========================|
Pemeriksaan USG - Jumlah : 3 kali , harga : 15
Pemeriksaan CT Scan - Jumlah : 3 kali , asuransi : 200, harga : 1400
Pemeriksaan Cek Darah - Jumlah : 3 kali , harga : 10
Ruangan - id ruangan : 231, harga : 200
jumlah hari :3
|=========================|
#Tagihan Faslilitas : 4875.0

|=========================|
id dokter : 1, nama : DR. Joni, waktu : 04-04-2017 20:00, spesialis : Jantung
|=========================|
#Tagihan Docter : 80000.0

#Tagihan Semua : 84875.0
*/