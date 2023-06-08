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
public class dsAnggota {
    private ArrayList<Integer> idanggota;
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<String> jk;
    private ArrayList<String> tgllahir;
    private ArrayList<String> nohp;
    private ArrayList<String> tglmasuk;
    private ArrayList<String> jabatan;
    private ArrayList<String> status;
    
    public dsAnggota(){
        idanggota   = new ArrayList<Integer>();
        nama        = new ArrayList<String>();
        alamat      = new ArrayList<String>();
        jk          = new ArrayList<String>();
        nohp        = new ArrayList<String>(); 
        tglmasuk    = new ArrayList<String>(); 
        jabatan     = new ArrayList<String>(); 
        status      = new ArrayList<String>();   
    }
    
    public void isiidanggota (int x){
         idanggota.add(x);
     }
    public ArrayList<Integer> getDatasetIdanggota(){
         return this.idanggota;
     }
    
    public void isinama(String value){
         nama.add(value);
     }
     public ArrayList<String> getDatasetnama(){
         return this.nama;
     }
     
    public void isialamat(String value){
         alamat.add(value);
     }
     public ArrayList<String> getDatasetalamat(){
         return this.alamat;
     }
     
     public void isijk(String value){
         jk.add(value);
     }
     public ArrayList<String> getDatasetjnsklmin(){
         return this.jk;
     }
     
     public void isinohp(String value){
         nohp.add(value);
     }
     public ArrayList<String> getDatasetnohp(){
         return this.nohp;
     }
     
     public void isitglmasuk(String value){
         tglmasuk.add(value);
     }
     public ArrayList<String> getDatasettglmasuk(){
         return this.tglmasuk;
     }
     
     public void isijabatan(String value){
         jabatan.add(value);
     }
     public ArrayList<String> getDatasetjabatan(){
         return this.jabatan;
     }
     
     public void isistatus (String value){
         status.add(value);
     }
     public ArrayList<String> getDatasetstatus(){
         return this.status;
     }
     
    public void tambahAnggota(int idanggota, String Nama, String Alamat, 
                                String Jk, String Tgllahir, String Nohp, 
                                String Tglmasuk, String Jabatan, String Status ){
         this.idanggota.add(idanggota);
         this.nama.add(Nama);
         this.alamat.add(Alamat);
         this.jk.add(Jk);
         this.tgllahir.add(Tgllahir);
         this.nohp.add(Nohp);
         this.tglmasuk.add(Tglmasuk);
         this.jabatan.add(Jabatan);
         this.status.add(Status);
        
    }
}
