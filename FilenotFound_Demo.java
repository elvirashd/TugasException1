/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanexception;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author ASUS
 */
public class FilenotFound_Demo {

public static void main(String args[]){
        try{
            File file = new File ("E://filee.txt");
            FileReader fr = new
FileReader(file);
        }catch (Exception e){
            System.out.println("Ada kesalahan");
        }
    }
}    
//Program ini mencoba untuk membuka file bernama filee.txt yang berada di direktori E://. 
//Jika file tidak ditemukan, program akan menangkap pengecualian dan menampilkan pesan "Ada kesalahan".
//Namun, karena pengecualian yang lebih spesifik, seperti FileNotFoundException, 
//tidak ditangani secara khusus, semua jenis pengecualian akan ditangkap oleh blok catch yang umum. 
//Program ini bertujuan untuk menunjukkan cara menangani kesalahan saat mencoba mengakses file.