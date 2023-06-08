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
public class dsPinjaman {
    private ArrayList<Integer> idpinjaman;
    private ArrayList<String> jnspinjaman;
    private ArrayList<String> tgl;
    private ArrayList<String> totalpinjaman;
    private ArrayList<String> status;
    private ArrayList<String> jml_angsuran;
    private ArrayList<String> sttspembayaran;
    private ArrayList<String> acc;
    
    public dsPinjaman(){
        idpinjaman   = new ArrayList<Integer>();
        jnspinjaman  = new ArrayList<String>();
        tgl          = new ArrayList<String>();
        totalpinjaman= new ArrayList<String>();
        status       = new ArrayList<String>(); 
        jml_angsuran = new ArrayList<String>(); 
        sttspembayaran  = new ArrayList<String>(); 
        acc          = new ArrayList<String>(); 
    }
    
    public void isiidPinjaman (int x){
        idpinjaman.add(x);
     }
    public ArrayList<Integer> getDatasetIdPinjaman(){
         return this.idpinjaman ;
     }
    
    public void isiJnspinj(String value){
         jnspinjaman.add(value);
     }
     public ArrayList<String> getDatasetJnspinj(){
         return this.jnspinjaman;
     }
     
     public void isiTgl(String value){
         tgl.add(value);
     }
     public ArrayList<String> getDatasetTgl(){
         return this.tgl;
     }
     
     public void isiTotpinj(String value){
         totalpinjaman.add(value);
     }
     public ArrayList<String> getDatasetTotpinj(){
         return this.totalpinjaman;
     }
     
     public void isiStts(String value){
         status.add(value);
     }
     public ArrayList<String> getDatasetStts(){
         return this.status;
     }
     
     public void isiJmlangsurn(String value){
         jml_angsuran.add(value);
     }
     public ArrayList<String> getDatasetJmlangsurn(){
         return this.jml_angsuran;
     }
     
     public void isiSttsbyr(String value){
         sttspembayaran.add(value);
     }
     public ArrayList<String> getDatasetSttsbyr(){
         return this.sttspembayaran;
     }
     
     public void isiAcc(String value){
         acc.add(value);
     }
     public ArrayList<String> getDatasetAcc(){
         return this.acc;
     }
     
     public void tambahPinjaman(int IdPinjaman, String Jnspinj, String Tgl, 
                                String Totpinj, String Stts, String jmlangsur, 
                                String Sttsbayar, String Acc ){
         this.idpinjaman.add(IdPinjaman);
         this.jnspinjaman.add(Jnspinj);
         this.tgl.add(Tgl);
         this.totalpinjaman.add(Totpinj);
         this.status.add(Stts);
         this.jml_angsuran.add(jmlangsur);
         this.sttspembayaran.add(Sttsbayar);
         this.acc.add(Acc);
     }
     
}
