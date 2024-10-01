/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanexception;

/**
 *
 * @author ASUS
 */
public class ExcepTest2 {
 public static void main(String[] args) {
        try {
            int[] a = new int[2];
            int b = 0;
            int c = 1 / b;
            System.out.println("Access element three: " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException thrown: " + e);
        } catch (Exception e) {
            System.out.println("Exception thrown: " + e);
        }
        System.out.println("Out of the block");
    }    
}
//program ini menunjukkan pentingnya penenangan pengecualian menggunakan blok try catch
//untuk mencegah program berhenti secara tidak normal.
//pengecualian arithmeticexception terjadi karena pembagian dengan nol dan ditangani oleh blok catch umum
//sehingga program tetap bisa melanjutkan eksekusi
//meskipun pengecualian array indexoutofboundsexception tidak terjadi karena eksekusi terhenti
//lebih awal, program ini memperlihatkan cara menangani berbagau pengecualian secara efisien
//untuk menjaga kestabilan program