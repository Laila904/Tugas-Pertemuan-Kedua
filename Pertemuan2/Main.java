/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        //construktor
        Manusia Ela = new Manusia();
        
        //Interface
        System.out.println("");
        Ela.mahasiswa();
        Ela.pengusaha();
        Ela.penyanyi();
        
        //this dan super
        System.out.println("");
        Ela.cekOver();
       
        //Casting
        System.out.println("");
        Manusia Rini = (Manusia) Ela;
        Rini.setNama("Rini Fatmawati");
        Rini.setUsia(19);
        System.out.println("Nama Saya " + Rini.getNama() + " usia saya " + Rini.getUsia());
        
    }
}
