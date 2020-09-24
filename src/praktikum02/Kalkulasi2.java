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
    int sisi;
    int panjang;
    int lebar;
    int hargaPerbox;
    int jmlhKeramik;
    String jenisKeramik;
    
    //constructor
    Kalkulasi2(int s){
        this.sisi = s;
    }
    
    Kalkulasi2(int p, int l){
        this.panjang = p;
        this.lebar = l;
    }
    
    //method
   /*menghitung luas keramik persegi dalam satuan meter*/
    void kalkulasiKeramikPersegi(){
        int luas;
        luas = this.sisi * this.sisi / 100; /*karena dalam satuan meter maka dibagi 100*/
        int keperluanP;
        keperluanP = 100 / luas; /*luas tanah -> 100m^2  dibagi luas keramik*/
        int hargaSatuanP;
        hargaSatuanP = this.hargaPerbox / this.jmlhKeramik;
        int hargaBayarP;
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
        int luasPP; /* PP -> Persegi Panjang */
        luasPP = this.panjang * this.lebar / 100; /*karena dalam satuan meter maka dibagi 100*/
        int keperluanPP;
        keperluanPP = 100 / luasPP; /*luas tanah -> 100m^2 dibagi luas keramik PP*/
        int hargaSatuanPP;
        hargaSatuanPP = this.hargaPerbox / this.jmlhKeramik;
        int hargaBayarPP;
        hargaBayarPP = keperluanPP * hargaSatuanPP;
        System.out.println("Jenis Keramik: " +jenisKeramik);
        System.out.println("Luas Keramik : "+ luasPP + " meter satuan persegi");
        System.out.println("Jumlah Keramik yang dibutuhkan: "+keperluanPP+" pcs");
        System.out.println("Harga Keramik Perbox: "+hargaPerbox+" dengan jumlah keramik "+jmlhKeramik);
        System.out.println("Harga Keramik Satuan: "+hargaSatuanPP);
        System.out.println("Harga yang Harus dibayar: Rp."+hargaBayarPP);
    }
}
