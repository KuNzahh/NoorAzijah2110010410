/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noorazijah2110010410;

/**
 *
 * @author Acer
 */
public class anggota {
    private int idanggota;
    private String nama;
    private String alamat;
    private String jk;
    private String tgllahir;
    private String nohp;
    private String tglmasuk;
    private String jabatan;
    private String status;
    
    public anggota(){
    }
    
    public void setidanggota(int idanggota){
        this.idanggota=idanggota;
    }
    public int getidanggota(){
        return this.idanggota;
    }
    
    public void setnama(String nama){
        this.nama=nama;
    }
    
    public String getnama (){
        return this.nama;
    }
    
    public void setalamat(String alamat){
        this.alamat=alamat;
    }
    
    public String getalamat (){
        return this.alamat;
    }
    
    public void setjk(String jk){
        this.jk=jk;
    }
    
    public String getjk (){
        return this.jk;
    }
    
    public void settgllahir(String tgllahir){
        this.tgllahir=tgllahir;
    }
    
    public String gettgllahir (){
        return this.tgllahir;
    }
    
    public void setnohp(String nohp){
        this.nohp=nohp;
    }
    
    public String getnohp (){
        return this.nohp;
    }
    
     public void settglmasuk(String tglmasuk){
        this.tglmasuk=tglmasuk;
    }
    
    public String gettglmasuk (){
        return this.tglmasuk;
    }
    
    public void setjabatan(String jabatan){
        this.jabatan=jabatan;
    }
    
    public String getjabatan (){
        return this.jabatan;
    }
    
    public void setstatus(String status){
        this.status=status;
    }
    
    public String getstatus(){
        return this.status;
    }
    
}
