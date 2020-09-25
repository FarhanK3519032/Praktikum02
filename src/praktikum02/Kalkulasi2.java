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
public class Kalkulasi2 {
    //atribut
    double sisi;
    double panjang;
    double lebar;
    double hargaPerbox;
    double jmlhKeramik;
    String jenisKeramik;
    
    //constructor
    Kalkulasi2(double s){
        this.sisi = s;
    }
    
    Kalkulasi2(double p, double l){
        this.panjang = p;
        this.lebar = l;
    }
    
    //method
   /*menghitung luas keramik persegi dalam satuan meter*/
    void kalkulasiKeramikPersegi(){
        double luas;
        luas = this.sisi * this.sisi; /*karena dalam satuan meter maka dibagi 100*/
        double keperluanP;
        keperluanP = 1000000 / luas; /*luas tanah -> 100m^2  dibagi luas keramik*/
        double hargaSatuanP;
        hargaSatuanP = this.hargaPerbox / this.jmlhKeramik;
        double hargaBayarP;
        hargaBayarP = keperluanP * hargaSatuanP;
        System.out.println("Jenis Keramik: " +jenisKeramik);
        System.out.println("Luas Keramik: "+luas+" meter satuan persegi");
        System.out.println("Jumlah Keramik yang dibutuhkan: "+keperluanP+" pcs");
        System.out.println("Harga Keramik Perbox: "+hargaPerbox+" dengan jumlah keramik "+jmlhKeramik);
        System.out.println("Harga Keramik Satuan: "+hargaSatuanP);
        System.out.println("Harga yang harus dibayar: Rp."+hargaBayarP);
    }
    
    /*menghitung luas keramik persegi panjang dalam satuan meter*/
    void kalkulasiKeramikPersegiPanjang(){
        double luasPP; /* PP -> Persegi Panjang */
        luasPP = this.panjang * this.lebar; /*karena dalam satuan meter maka dibagi 100*/
        double keperluanPP;
        keperluanPP = 1000000 / luasPP; /*luas tanah -> 100m^2 dibagi luas keramik PP*/
        double hargaSatuanPP;
        hargaSatuanPP = this.hargaPerbox / this.jmlhKeramik;
        double hargaBayarPP;
        hargaBayarPP = keperluanPP * hargaSatuanPP;
        System.out.println("Jenis Keramik: " +jenisKeramik);
        System.out.println("Luas Keramik : "+ luasPP + " meter satuan persegi");
        System.out.println("Jumlah Keramik yang dibutuhkan: "+keperluanPP+" pcs");
        System.out.println("Harga Keramik Perbox: "+hargaPerbox+" dengan jumlah keramik "+jmlhKeramik);
        System.out.println("Harga Keramik Satuan: "+hargaSatuanPP);
        System.out.println("Harga yang Harus dibayar: Rp."+hargaBayarPP);
    }
}
