/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataSet;
import java.util.ArrayList;
        
/**
 *
 * @author Acer
 */
public class dsAjuanpinjaman {
    private ArrayList<Integer> idajuanpinjaman;
    private ArrayList<Integer> jml_pinjaman;
    private ArrayList<Integer> bunga;
    private ArrayList<String> waktu;
    private ArrayList<Integer> totalpinjaman;
    
       
    public dsAjuanpinjaman (){
        idajuanpinjaman = new ArrayList<Integer>();
        jml_pinjaman    = new ArrayList<Integer>();
        bunga           = new ArrayList<Integer>();
        waktu           = new ArrayList<String>();
        totalpinjaman   = new ArrayList<Integer>();      
    }
    
    public void isiid_ajuanpinj (int x){
         idajuanpinjaman.add(x);
     }
    public ArrayList<Integer> getDatasetIdpinjaman(){
         return this.idajuanpinjaman ;
     }
     
    public void isijum_pinj(int x){
         jml_pinjaman.add(x);
     }
     public ArrayList<Integer> getDatasetJum_pinj(){
         return this.jml_pinjaman;
     }
     
    public void isibunga(int x){
         bunga.add(x);
     }
    public ArrayList<Integer> getDatasetBunga(){
         return this.bunga;
     }
     
    public void isiwaktu(String value){
         waktu.add(value);
     }
    public ArrayList<String> getDatasetWaktu(){
         return this.waktu;
     }
     
    public void isitotalpinjaman(int x){
         totalpinjaman.add(x);
     }
     public ArrayList<Integer> getDatasetTotPinj(){
         return this.totalpinjaman;
     }
     
    public void tambahAjuan(int idajuanpinjaman, int jml_pinjaman, int Bunga, String Waktu, int Totalpinjaman){
         this.idajuanpinjaman.add(idajuanpinjaman);
         this.jml_pinjaman.add(jml_pinjaman);
         this.bunga.add(Bunga);
         this.waktu.add(Waktu);
         this.totalpinjaman.add(Totalpinjaman);
    }
    
}