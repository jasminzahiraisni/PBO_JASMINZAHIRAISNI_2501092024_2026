/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jasmin2304;

/**
 *
 * @author LAB-SI-PC
 */
public class PegawaiHasil {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai("34643246", "Ardito Pramono", "IIIb");
        Pegawai p2 = new Pegawai("34532455", "Sifa Fajri", "IIIa");

        System.out.println("DATA PEGAWAI 1");
        System.out.println("NIP          : " + p1.getNip());
        System.out.println("Nama         : " + p1.getNama());
        System.out.println("Golongan     : " + p1.getGolongan());
        System.out.println("Gaji Pokok   : Rp " + p1.getGajiPokok());
        System.out.println("Tunjangan    : Rp " + p1.getTunjangan());
        System.out.println("Potongan     : Rp " + p1.getPotongan());
        System.out.println("Gaji Bersih  : Rp " + p1.getGajiBersih());
        
        System.out.println("--------------------------------------------------");

        System.out.println("\nDATA PEGAWAI 2");
        System.out.println("NIP          : " + p2.getNip());
        System.out.println("Nama         : " + p2.getNama());
        System.out.println("Golongan     : " + p2.getGolongan());
        System.out.println("Gaji Pokok   : Rp " + p2.getGajiPokok());
        System.out.println("Tunjangan    : Rp " + p2.getTunjangan());
        System.out.println("Potongan     : Rp " + p2.getPotongan());
        System.out.println("Gaji Bersih  : Rp " + p2.getGajiBersih());
    }
} 

