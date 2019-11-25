/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodata.modul.pkg1;

/**
 *
 * @author Asus
 */
public class BiodataModul1 {
    private String Nama, Asal, Jurusan, Fakultas;
  
    public String getNama() {
        return this. Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAsal() {
        return this. Asal;
    }

    public void setAsal(String Asal) {
        this.Asal = Asal;
    }

    public String getJurusan() {
        return this. Jurusan;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    public String getFakultas() {
        return this. Fakultas;
    }

    public void setFakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }
    
    public static void main(String[] args) {
        BiodataModul1 bio= new BiodataModul1();
        bio.setNama("Muhammad Naufal Al Ghifari");
        bio.setAsal("Pasuruan");
        bio.setJurusan("Teknik Informatika");
        bio.setFakultas("Teknik");
        System.out.println("NIM     : 201810370311256");
        System.out.println("Nama    : " + bio.getNama());
        System.out.println("Asal    : " + bio.getAsal());
        System.out.println("Jurusan : " + bio.getJurusan());
        System.out.println("Fakultas: " + bio.getFakultas());
        System.out.println("Universitas Muhammadiyah Malang");
    }
}
