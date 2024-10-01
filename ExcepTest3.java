/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanexception;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExcepTest3 {
    public static void main(String args[]) {
        try {
            File file = new File("d:/test/testFilel.txt");

            // Create the file
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }

            // Write Content
            FileWriter writer = new FileWriter(file);
            writer.write("Test data");
            writer.close();

            // Read content
            FileReader reader = new FileReader(file);
            int c;
            while ((c = reader.read()) != -1) {
                char ch = (char) c;
                System.out.print(ch);
            }
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
//Program ini berfungsi untuk membuat file teks baru bernama testFilel.txt di direktori d:/test/
//Jika file berhasil dibuat, program menampilkan pesan bahwa file telah dibuat
//dan jika file sudah ada, program akan menampilkan pesan bahwa file tersebut sudah ada. 
//Setelah itu, program menulis teks "Test data" ke dalam file dan kemudian membaca isi file tersebut untuk ditampilkan di layar.
//Jika ada masalah saat membuat, menulis, atau membaca file (seperti kesalahan direktori atau akses file), 
//program akan menangkap kesalahan tersebut dan menampilkan pesan "Exception"