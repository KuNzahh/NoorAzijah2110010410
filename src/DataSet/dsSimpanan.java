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
public class dsSimpanan {
    private ArrayList<Integer> idsimpanan;
    private ArrayList<String> jnssimpanan;
    private ArrayList<String> tgl;
    private ArrayList<String> jml_simpanan;
    private ArrayList<String> nilai;
    private ArrayList<String> status_tunggu;
    private ArrayList<String> status_lunas;
    
    public dsSimpanan(){
        idsimpanan   = new ArrayList<Integer>();
        jnssimpanan  = new ArrayList<String>();
        tgl          = new ArrayList<String>();
        jml_simpanan= new ArrayList<String>();
        nilai       = new ArrayList<String>(); 
        status_tunggu = new ArrayList<String>(); 
        status_lunas  = new ArrayList<String>(); 
    }
    
    public void isiidSimpanan (int x){
        idsimpanan.add(x);
     }
    public ArrayList<Integer> getDatasetIdSimpanan(){
         return this.idsimpanan ;
     }
    
    public void isiJnssimpn(String value){
         jnssimpanan.add(value);
     }
     public ArrayList<String> getDatasetJnssimpn(){
         return this.jnssimpanan;
     }
     
     public void isiTgl(String value){
         tgl.add(value);
     }
     public ArrayList<String> getDatasetTgl(){
         return this.tgl;
     }
     
     public void isiJmlsimpn(String value){
         jml_simpanan.add(value);
     }
     public ArrayList<String> getDatasetJmlsimpn(){
         return this.jml_simpanan;
     }
     
     public void isiNilai(String value){
         nilai.add(value);
     }
     public ArrayList<String> getDatasetNilai(){
         return this.nilai;
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
     public ArrayList<String> getDatasetSttsluns(){
         return this.status_lunas;
     }
     
     public void tambahSimpanan(int IdSimpanan, String Jnssimpn, String Tgl, 
                                String Jmlsimpn, String Nilai, String Sttstggu, 
                                String Sttslns){
         this.idsimpanan.add(IdSimpanan);
         this.jnssimpanan.add(Jnssimpn);
         this.tgl.add(Tgl);
         this.jml_simpanan.add(Jmlsimpn);
         this.nilai.add(Nilai);
         this.status_tunggu.add(Sttstggu);
         this.status_lunas.add(Sttslns);
         
     }
     
     
}
