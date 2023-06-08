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
        nohp        = new ArrayList<String>(); 
        tgllahir    = new ArrayList<String>(); 
        nohp     = new ArrayList<String>(); 
        email      = new ArrayList<String>(); 
        username      = new ArrayList<String>(); 
        password     = new ArrayList<String>(); 
    }
    
    public void isiid_ketua (int x){
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
}
