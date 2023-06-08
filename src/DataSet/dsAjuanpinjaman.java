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
    private ArrayList<String> jml_pinjaman;
    private ArrayList<String> bunga;
    private ArrayList<String> waktu;
    private ArrayList<String> totalpinjaman;
    
       
    public dsAjuanpinjaman (){
        idajuanpinjaman = new ArrayList<Integer>();
        jml_pinjaman    = new ArrayList<String>();
        bunga           = new ArrayList<String>();
        waktu           = new ArrayList<String>();
        totalpinjaman   = new ArrayList<String>();      
    }
    
    public void isiid_ajuanpinj (int x){
         idajuanpinjaman.add(x);
     }
    public ArrayList<Integer> getDatasetIdpinjaman(){
         return this.idajuanpinjaman ;
     }
     
    public void isijum_pinj(String value){
         jml_pinjaman.add(value);
     }
     public ArrayList<String> getDatasetJum_pinj(){
         return this.jml_pinjaman;
     }
     
    public void isibunga(String value){
         bunga.add(value);
     }
    public ArrayList<String> getDatasetBunga(){
         return this.bunga;
     }
     
    public void isiwaktu(String value){
         waktu.add(value);
     }
    public ArrayList<String> getDatasetWaktu(){
         return this.waktu;
     }
     
    public void isitotalpinjaman(String value){
         totalpinjaman.add(value);
     }
     public ArrayList<String> getDatasetTotPinj(){
         return this.totalpinjaman;
     }
     
    public void tambahAjuan(int idajuanpinjaman, String jml_pinjaman, String Bunga, String Waktu, String Totalpinjaman){
         this.idajuanpinjaman.add(idajuanpinjaman);
         this.jml_pinjaman.add(jml_pinjaman);
         this.bunga.add(Bunga);
         this.waktu.add(Waktu);
         this.totalpinjaman.add(Totalpinjaman);
    }
    
}