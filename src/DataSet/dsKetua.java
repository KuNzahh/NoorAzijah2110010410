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
public class dsKetua {
    private ArrayList<Integer> idketua;
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<String> jk;
    private ArrayList<String> tgllahir;
    private ArrayList<String> nohp;
    private ArrayList<String> email;
    private ArrayList<String> username;
    private ArrayList<String> password;
    
    public dsKetua(){
        idketua   = new ArrayList<Integer>();
        nama        = new ArrayList<String>();
        alamat      = new ArrayList<String>();
        jk          = new ArrayList<String>();
        tgllahir    = new ArrayList<String>(); 
        nohp     = new ArrayList<String>(); 
        email      = new ArrayList<String>(); 
        username      = new ArrayList<String>(); 
        password     = new ArrayList<String>(); 
    }
    
    public void isiIdKetua (int x){
        idketua.add(x);
     }
    public ArrayList<Integer> getDatasetIdKetua(){
         return this.idketua ;
     }
    
    public void isiNama(String value){
         nama.add(value);
     }
     public ArrayList<String> getDatasetNama(){
         return this.nama;
     }
     
     public void isiAlamat(String value){
         alamat.add(value);
     }
     public ArrayList<String> getDatasetAlamat(){
         return this.alamat;
     }
     
      public void isiJk(String value){
         jk.add(value);
     }
     public ArrayList<String> getDatasetJnsklmn(){
         return this.jk;
     }
     
     public void isiTglLahir(String value){
         tgllahir.add(value);
     }
     public ArrayList<String> getDatasetTglLhr(){
         return this.tgllahir;
     }
     
     public void isiNohp(String value){
         nohp.add(value);
     }
     public ArrayList<String> getDatasetNohp(){
         return this.nohp;
     }
     
     public void isiEmail(String value){
         email.add(value);
     }
     public ArrayList<String> getDatasetEmail(){
         return this.email;
     }
     
     public void isiUsername(String value){
         username.add(value);
     }
     public ArrayList<String> getDatasetUsername(){
         return this.username;
     }
     
     public void isiPass(String value){
         password.add(value);
     }
     public ArrayList<String> getDatasetPass(){
         return this.password;
     }
     
     public void tambahKetua(int idketua, String Nama, String Alamat, 
                                String Jk, String Tgllahir, String Nohp, 
                                String Email, String Username, String Password ){
         this.idketua.add(idketua);
         this.nama.add(Nama);
         this.alamat.add(Alamat);
         this.jk.add(Jk);
         this.tgllahir.add(Tgllahir);
         this.nohp.add(Nohp);
         this.email.add(Email);
         this.username.add(Username);
         this.password.add(Password);
         
     }
}
