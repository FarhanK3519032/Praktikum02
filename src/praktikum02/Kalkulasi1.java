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
    double sisi;
    double panjang;
    double lebar;
    double hargaPerbox;
    double jmlhKeramik;       
    
    //method menghitung luas keramik dalam satuan meter^2
    double hitungLuasKP(){  //KP -> Keramik Persegi
        double luasKP;
        luasKP = this.sisi * this.sisi;
        return luasKP;
    }
    
    double hitungLuasKPP(){  //KPP -> Keramik Persegi Panjang
        double luasKPP;
        luasKPP = this.panjang * this.lebar;
        return luasKPP;
    }
    
    double keperluanKP(){
        double keperluanKP;
        keperluanKP = 1000000 / this.hitungLuasKP(); //100 -> luas tanah
        return keperluanKP;
    }
    
    double keperluanKPP(){
        double keperluanKPP;
        keperluanKPP = 100 / this.hitungLuasKPP(); //100 -> luas tanah
        return keperluanKPP;
    }
    
    double hitungHargaSatuan(){
        double hargaSatuan;
        hargaSatuan = this.hargaPerbox / this.jmlhKeramik;
        return hargaSatuan;
    }
    
    double hitungHargaBayarKP(){
        double hargaBayarKP;
        hargaBayarKP = this.keperluanKP()*this.hitungHargaSatuan();
        return hargaBayarKP;
    }
    
    double hitungHargaBayarKPP(){
        double hargaBayarKPP;
        hargaBayarKPP = this.keperluanKPP()*this.hitungHargaSatuan();
        return hargaBayarKPP;
    }
}
