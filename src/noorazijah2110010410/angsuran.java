/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noorazijah2110010410;

/**
 *
 * @author Acer
 */
public class angsuran {
    private int idangsuran;
    private String angsuransi;
    private String tgl;
    private String sisapinjaman;
    private String jatuhtempo;
    private String totalpinjaman;
    private String status_tunggu;
    private String status_lunas;
    
    public angsuran(){
    }
    
    public void setidangsuran(int idangsuran){
        this.idangsuran=idangsuran;
    }
    public int getidangsuran(){
        return this.idangsuran;
    }
    
    public void setangsuransi(String angsuransi){
        this.angsuransi=angsuransi;
    }
    public String getangsuransi(){
        return this.angsuransi;
    }
    
    public void settgl(String tgl){
        this.tgl=tgl;
    }
    public String gettgl(){
        return this.tgl;
    }
    
     public void setsisapinjaman(String sisapinjaman){
        this.sisapinjaman=sisapinjaman;
    }
    public String getsisapinjaman(){
        return this.sisapinjaman;
    }
    
    public void setjatuhtempo(String jatuhtempo){
        this.jatuhtempo=jatuhtempo;
    }
    public String getjatuhtempo(){
        return this.jatuhtempo;
    }
    
    public void settotalpinjaman(String totalpinjaman){
        this.totalpinjaman=totalpinjaman;
    }
    public String gettotalpinjaman(){
        return this.totalpinjaman;
    }
    
    public void setstatus_tunggu(String status_tunggu){
        this.status_tunggu=status_tunggu;
    }
    public String getstatus_tunggu(){
        return this.status_tunggu;
    }
    
    public void setstatus_lunas(String status_lunas){
        this.status_lunas=status_lunas;
    }
    public String getstatus_lunas(){
        return this.status_lunas;
    }
    
}
