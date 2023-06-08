/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noorazijah2110010410;

/**
 *
 * @author Acer
 */
public class pinjaman {
    private int idpinjaman;
    private String jnspinjaman;
    private String tgl;
    private String totalpinjaman;
    private String status;
    private String jml_angsuran;
    private String sttspembayaran;
    private String acc;
  
    public pinjaman(){
    }
    
    public void setidpinjaman(int idpinjaman){
        this.idpinjaman=idpinjaman;
    }
    public int getidpinjaman(){
        return this.idpinjaman;
    }
    
    public void setjnspinjaman(String jnspinjaman){
        this.jnspinjaman=jnspinjaman;
    }
    public String getjnspinjaman(){
        return this.jnspinjaman;
    }
    
    public void settgl(String tgl){
        this.tgl=tgl;
    }
    public String gettgl(){
        return this.tgl;
    }
    
    public void settotalpinjaman(String totalpinjaman){
        this.totalpinjaman=totalpinjaman;
    }
    public String gettotalpinjaman(){
        return this.totalpinjaman;
    }
    
    public void setstatus(String status){
        this.status=status;
    }
    public String getstatus(){
        return this.status;
    }
    
    public void setjml_angsuran(String jml_angsuran){
        this.jml_angsuran=jml_angsuran;
    }
    public String getjml_angsuran(){
        return this.jml_angsuran;
    }
    
    public void setsttspembayaran(String sttspembayaran){
        this.sttspembayaran=sttspembayaran;
    }
    public String getsttspembayaran(){
        return this.sttspembayaran;
    }
    
    public void setacc(String acc){
        this.acc=acc;
    }
    public String getacc(){
        return this.acc;
    }
   
}
