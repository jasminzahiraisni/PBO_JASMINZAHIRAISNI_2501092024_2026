/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class Arimatika {
    int tambah(int a, int b) {
       int c = a+b;
       return c;       
    }            

   public static void main(String[] args) {
       Arimatika arimatika = new Arimatika();
       int c = arimatika.tambah(12, 10);
       System.out.println("hasil =" +c);
    }

}