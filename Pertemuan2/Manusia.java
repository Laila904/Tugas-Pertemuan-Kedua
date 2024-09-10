/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author ASUS
 */
public class Manusia extends MakhlukHidup implements Penyanyi, Pengusaha, Mahasiswa {
    
    public void Manusia (String nama, int usia){
        super.setNama(nama);
        super.setUsia(usia);
    }
    @Override
    public void bernafas() {
        System.out.println("Saya Manusia, saya bisa bernafas");
    }
    
    public void cekOver(){
        this.bernafas();
        super.bernafas();
    }

    @Override
    public void penyanyi() {
        System.out.println("Saya Penyanyi Internasional");
    }

    @Override
    public void pengusaha() {
        System.out.println("Saya Adalah Pengusaha Muda");
    }

    @Override
    public void mahasiswa() {
        System.out.println("Saya Adalah Mahasiswa Aktif");
    }
    
    
}
