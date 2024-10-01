/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanexception;

/**
 *
 * @author ASUS
 */
public class ExcepTest7 {
    public static void main(String args[]) {
        int[] a = new int[2];
        try {
            System.out.println("Access element three: " + a[3]);
        } catch (ArithmeticException e) {
            System.out.println("Exception thrown: " + e);
        } finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
//Program ini mencoba mengakses elemen ketiga dari array berukuran 2, 
//yang menyebabkan pengecualian ArrayIndexOutOfBoundsException.
//Namun, karena hanya pengecualian ArithmeticException yang ditangani dalam blok catch,
//pengecualian ini tidak tertangkap, sehingga program akan crash setelah mengeksekusi blok finally. 
//Sebelum crash, blok finally tetap dijalankan, mengubah elemen pertama array menjadi 6 
//dan menampilkan pesan "First element value: 6" dan "The finally statement is executed".
