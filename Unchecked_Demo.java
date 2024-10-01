/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanexception;

/**
 *
 * @author ASUS
 */
public class Unchecked_Demo {
    public static void main(String[] args) {
        try {
            int num [] = {1, 2, 3, 4};
            System.out.println(num[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array melebihi batas: " +e);
        }
    }   
}
//Program ini mencoba mengakses elemen kelima dari array yang hanya memiliki empat elemen, 
//sehingga menyebabkan pengecualian ArrayIndexOutOfBoundsException. 
//Pengecualian ini ditangkap oleh blok catch, yang kemudian menampilkan pesan "Array melebihi batas" disertai rincian pengecualian. 
//Dengan demikian, program dapat menangani kesalahan tanpa crash 
//dan memberikan umpan balik yang jelas mengenai masalah tersebut.