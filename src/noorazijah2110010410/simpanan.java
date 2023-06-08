/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noorazijah2110010410;

/**
 *
 * @author Acer
 */
public class simpanan {
    private int idsimpanan;
    private String jnssimpanan;
    private String tgl;
    private String jml_simpanan;
    private String nilai;
    private String status_tunggu;
    private String status_lunas;
    
    public simpanan(){
    }
    
    public void setidsimpanan(int idsimpanan){
        this.idsimpanan=idsimpanan;
    }
    public int getidsimpanan(){
        return this.idsimpanan;
    }
    
    public void setjnssimpanan(String jnssimpanan){
        this.jnssimpanan=jnssimpanan;
    }
    public String getjnssimpanan(){
        return this.jnssimpanan;
    }
    
    public void settgl(String tgl){
        this.tgl=tgl;
    }
    public String gettgl(){
        return this.tgl;
    }
    
    public void setjml_simpanan(String jml_simpanan){
        this.jml_simpanan=jml_simpanan;
    }
    public String getjml_simpanan(){
        return this.jml_simpanan;
    }
    
    public void setnilai(String nilai){
        this.nilai=nilai;
    }
    public String getnilai(){
        return this.nilai;
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
