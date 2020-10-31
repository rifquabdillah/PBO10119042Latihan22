/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;
import java.util.Scanner;

/**
 *
 * @author Stks
 */
public class IF110119042Latihan22 {
    
 public static void main(String[] args){
     double diameter, jarijari, luas, keliling;
     final double PHI = 3.14;
     Scanner Scanner = new Scanner(System.in);
     System.out.println("======Perhitungan Lingkaran======");
     System.out.print("Masukan Nilai Diameter Lingkaran: ");
     while(true){
         try{
           diameter = Double.parseDouble(Scanner.next());
           break;
         } catch (NumberFormatException e){
                 System.out.println("Nilai Diameter tidak Sesuai\n");
                 System.out.print("Masukan Nilai Diameter Lingkaran: ");
                 continue;
         } 
                 
         }
     
     jarijari = diameter /2;
     luas= PHI * jarijari * jarijari;
     keliling = PHI * diameter;
     System.out.println("======HASIL PERHITUNGAN LINGKARAN======");
     System.out.printf("Jari-jari lingkaran \t\t= %.2f%n", jarijari);
     System.out.printf("Luas Lingkarang\t\t\t= %.2f%n", luas);
     System.out.printf("Keliling Lingkarang\t\t= %.2f%n", keliling);
     }
     
 }
    

