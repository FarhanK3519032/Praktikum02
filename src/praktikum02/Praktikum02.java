/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum02;

/**
 *
 * @author Acer
 */
public class Praktikum02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //dengan method non void
        Kalkulasi1 k1 = new Kalkulasi1();
        k1.sisi = 30;
        k1.hargaPerbox = 54000;
        k1.jmlhKeramik = 10;
        System.out.println("Luas Keramik A: " +k1.hitungLuasKP()+ " meter satuan persegi" );
        System.out.println("Jumlah Keramik yang dibutuh kan: " +k1.keperluanKP());
        System.out.println("Harga keramik perbox: " +k1.hargaPerbox+ " dengan jumlah keramik: " +k1.jmlhKeramik);
        System.out.println("Harga keramik satuan: " +k1.hitungHargaSatuan());
        System.out.println("Harga yang harus dibayar: " +k1.hitungHargaBayarKP());
        
        Kalkulasi1 k2 = new Kalkulasi1();
        k2.sisi = 40;
        k2.hargaPerbox = 65000;
        k2.jmlhKeramik = 5;
        System.out.println("Luas Keramik B: " +k2.hitungLuasKP()+ " meter satuan persegi" );
        System.out.println("Jumlah Keramik yang dibutuh kan: " +k2.keperluanKP());
        System.out.println("Harga keramik perbox: " +k2.hargaPerbox+ " dengan jumlah keramik: " +k2.jmlhKeramik);
        System.out.println("Harga keramik satuan: " +k2.hitungHargaSatuan());
        System.out.println("Harga yang harus dibayar: " +k2.hitungHargaBayarKP());
        
        Kalkulasi1 k3 = new Kalkulasi1();
        k3.panjang = 30;
        k3.lebar = 40;
        k3.hargaPerbox = 60000;
        k3.jmlhKeramik = 8;
        System.out.println("Luas Keramik C: " +k3.hitungLuasKPP()+ " meter satuan persegi" );
        System.out.println("Jumlah Keramik yang dibutuh kan: " +k3.keperluanKPP());
        System.out.println("Harga keramik perbox: " +k3.hargaPerbox+ " dengan jumlah keramik: " +k3.jmlhKeramik);
        System.out.println("Harga keramik satuan: " +k3.hitungHargaSatuan());
        System.out.println("Harga yang harus dibayar: " +k3.hitungHargaBayarKPP());
        
        //dengan constructor
        Kalkulasi2 K1 = new Kalkulasi2(30.0);
        K1.jenisKeramik = "A";
        K1.hargaPerbox = 54000;
        K1.jmlhKeramik = 10;
        K1.kalkulasiKeramikPersegi();
        
        Kalkulasi2 K2 = new Kalkulasi2(40.0);
        K2.jenisKeramik = "B";
        K2.hargaPerbox = 65000;
        K2.jmlhKeramik = 5;
        K2.kalkulasiKeramikPersegi();
        
        Kalkulasi2 K3 = new Kalkulasi2(30.0, 40.0);
        K3.jenisKeramik = "C";
        K3.hargaPerbox = 60000;
        K3.jmlhKeramik = 8;
        K3.kalkulasiKeramikPersegiPanjang();
    }
}
