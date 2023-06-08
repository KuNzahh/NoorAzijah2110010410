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
public class dsAngsuran {
    private ArrayList<Integer> idangsuran;
    private ArrayList<String> angsuransi;
    private ArrayList<String> tgl;
    private ArrayList<String> sisapinjaman;
    private ArrayList<String> jatuhtempo;
    private ArrayList<String> Totalpinjaman;
    private ArrayList<String> status_tunggu;
    private ArrayList<String> status_lunas;
    
    public dsAngsuran (){
        idangsuran    = new ArrayList<Integer>();
        angsuransi    = new ArrayList<String>();
        tgl           = new ArrayList<String>();
        sisapinjaman  = new ArrayList<String>();
        jatuhtempo    = new ArrayList<String>();
        Totalpinjaman = new ArrayList<String>();
        status_tunggu = new ArrayList<String>();
        status_lunas  = new ArrayList<String>();
    }
    
    public void isiid_Angsuran (int x){
         idangsuran.add(x);
     }
    public ArrayList<Integer> getDatasetIdangsuran(){
         return this.idangsuran ;
     }
    
    public void isiangsuransi(String value){
         angsuransi.add(value);
     }
     public ArrayList<String> getDatasetAngsuransi(){
         return this.angsuransi;
     }
     
    public void isitgl(String value){
         tgl.add(value);
     }
     public ArrayList<String> getDatasetTgl(){
         return this.tgl;
     }
     
     public void isisisapinjaman(String value){
         sisapinjaman.add(value);
     }
     public ArrayList<String> getDatasetSisapinjaman(){
         return this.sisapinjaman;
     }
     
     public void isijatuhtempo(String value){
         jatuhtempo.add(value);
     }
     public ArrayList<String> getDatasetJatuhtempo(){
         return this.jatuhtempo;
     }
     
     public void isiTotalPinjaman(String value){
         Totalpinjaman.add(value);
     }
     public ArrayList<String> getDatasetTtlpinjm(){
         return this.Totalpinjaman;
     }
     
     public void isiSttstggu(String value){
         status_tunggu.add(value);
     }
     public ArrayList<String> getDatasetSttstggu(){
         return this.status_tunggu;
     }
     
     public void isiSttsluns(String value){
         status_lunas.add(value);
     }
     public ArrayList<String> getDatasetSttslns(){
         return this.status_lunas;
     }
     
     public void tambahAngsuran(int idangsuran, String Angsuransi, String Tgl, 
                                String SisaPinjm, String JthTmpo, String Totpinjm, 
                                String SttsTnggu, String Sttslns){
         this.idangsuran.add(idangsuran);
         this.angsuransi.add(Angsuransi);
         this.sisapinjaman.add(SisaPinjm);
         this.jatuhtempo.add(JthTmpo);
         this.Totalpinjaman.add(Totpinjm);
         this.status_tunggu.add(SttsTnggu);
         this.status_lunas.add(Sttslns);
     }
}
