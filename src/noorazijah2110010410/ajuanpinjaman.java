/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noorazijah2110010410;

/**
 *
 * @author Acer
 */
public class ajuanpinjaman {
    private int idajuanpinjaman;
    private int jml_pinjaman;
    private int bunga;
    private String waktu;
    private int totalpinjaman;
    
    public ajuanpinjaman(){
    }
    
    public void setidajuanpinjaman(int idajuanpinjaman){
        this.idajuanpinjaman=idajuanpinjaman;
    }
    public int getidajuanpinjaman(){
        return this.idajuanpinjaman;
    }
    
    public void setjml_pinjaman(int jml_pinjaman){
        this.jml_pinjaman=jml_pinjaman;
    }
    public int getjml_pinjaman(){
        return this.jml_pinjaman;
    }
    
    public void setbunga(int bunga){
        if (jml_pinjaman>= 5000000){
            this.bunga=25/100;
        }else if (jml_pinjaman>= 10000000){
        //4..6 :800000
            this.bunga=30/100;
        }else {
        //7..n :1000000
            this.bunga=50/100;
       }
    }
    public int getbunga(){
        return this.bunga;
    }
    
    public void setwaktu(String waktu){
        this.waktu=waktu;
    }
    public String getwaktu(){
        return this.waktu;
    }
    
    public void settotalpinjaman(int totalpinjaman){
        this.totalpinjaman=totalpinjaman;
    }
    public int gettotalpinjaman(){
        return this.totalpinjaman;
    }
    
}
