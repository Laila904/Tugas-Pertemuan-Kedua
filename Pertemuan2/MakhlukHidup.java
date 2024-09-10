/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author ASUS
 */
public class MakhlukHidup {
    private String Nama;
    private int usia;

    public MakhlukHidup (){
        System.out.println("Halo Ini Dari Konstruktor Makhluk Hidup");
    }
    public void bernafas() {
        System.out.println("Saya makhluk hidup, saya bisa bernafas");
    }

    public void tumbuh() {
        System.out.println("Saya bisa tumbuh");
    }

    /**
     * @return the Nama
     */
    public String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * @return the usia
     */
    public int getUsia() {
        return usia;
    }

    /**
     * @param usia the usia to set
     */
    public void setUsia(int usia) {
        this.usia = usia;
    }
}
