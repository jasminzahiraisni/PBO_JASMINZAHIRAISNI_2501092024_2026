/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jasmin_2501092024;

/**
 *
 * @author LAB-SI-PC
 */
public class StudentRecordSample {
    public static void main (String[] args){
        StudentRecord AliRecord = new StudentRecord();
        StudentRecord AniRecord = new StudentRecord();
        
        AliRecord.setName("Ali");
        AliRecord.setAddress("Padang");
        AliRecord.setAge(20);
        AliRecord.setMathGrade(100);
        AliRecord.setEnglishGrade(75);
        AliRecord.setScienceGrade(90);
        
        System.out.println("Data  1");
        System.out.println("Nama              :"+AliRecord.getName());
        System.out.println("Alamat            :"+AliRecord.getAddress());
        System.out.println("umur              :"+AliRecord.getAge());
        System.out.println("Matematika        :"+AliRecord.getMathGrade());
        System.out.println("b.Inggris         :"+AliRecord.getEnglishGrade());
        System.out.println("ilmu pengetahuan  :"+AliRecord.getScienceGrade());
        System.out.println("Rata-rata         :"+AliRecord.getAverage());
        
        System.out.println();
    
        AniRecord.setName("Ani");
        AniRecord.setAddress("Padang");
        AniRecord.setAge(20);
        AniRecord.setMathGrade(90);
        AniRecord.setEnglishGrade(85);
        AniRecord.setScienceGrade(88);
        
        System.out.println("Data  2");
        System.out.println("Nama              :"+AniRecord.getName());
        System.out.println("Alamat            :"+AniRecord.getAddress());
        System.out.println("umur              :"+AniRecord.getAge());
        System.out.println("Matematika        :"+AniRecord.getMathGrade());
        System.out.println("b.Inggris         :"+AniRecord.getEnglishGrade());
        System.out.println("ilmu pengetahuan  :"+AniRecord.getScienceGrade());
        System.out.println("Rata-rata         :"+AniRecord.getAverage());

        
    }
}
    

