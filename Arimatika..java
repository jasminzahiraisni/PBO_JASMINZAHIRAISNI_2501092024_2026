/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class Arimatika {
     int tambah (int a, int b){
        int c = a+b;
        return c;
    }
    int ganjil (int d){
        if (d % 2 != 0 ){
            System.out.println(d + " adalah angka ganjil");
        }else{
            System.out.println(d + " adalah angka genap");
        }
        return d;
    }
    
    public static void main(String[] args) {
        Arimatika arimatika = new Arimatika();
        int c = arimatika.tambah(12, 10);
        System.out.println("Hasil = " +c);
        
        int f = arimatika.ganjil(3);
        System.out.println();
    }
}