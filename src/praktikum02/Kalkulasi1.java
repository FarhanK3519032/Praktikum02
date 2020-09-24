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
public class Kalkulasi1 {
    //atribut
    int sisi;
    int panjang;
    int lebar;
    int hargaPerbox;
    int jmlhKeramik;       
    
    //method menghitung luas keramik dalam satuan meter^2
    int hitungLuasKP(){  //KP -> Keramik Persegi
        int luasKP;
        luasKP = this.sisi * this.sisi / 100;
        return luasKP;
    }
    
    int hitungLuasKPP(){  //KPP -> KEramik Persegi Panjang
        int luasKPP;
        luasKPP = this.panjang * this.lebar / 100;
        return luasKPP;
    }
    
    int keperluanKP(){
        int keperluanKP;
        keperluanKP = 100 / this.hitungLuasKP(); //100 -> luas tanah
        return keperluanKP;
    }
    
    int keperluanKPP(){
        int keperluanKPP;
        keperluanKPP = 100 / this.hitungLuasKPP(); //100 -> luas tanah
        return keperluanKPP;
    }
    
    int hitungHargaSatuan(){
        int hargaSatuan;
        hargaSatuan = this.hargaPerbox / this.jmlhKeramik;
        return hargaSatuan;
    }
    
    int hitungHargaBayarKP(){
        int hargaBayarKP;
        hargaBayarKP = this.keperluanKP()*this.hitungHargaSatuan();
        return hargaBayarKP;
    }
    
    int hitungHargaBayarKPP(){
        int hargaBayarKPP;
        hargaBayarKPP = this.keperluanKPP()*this.hitungHargaSatuan();
        return hargaBayarKPP;
    }
}
