/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanexception;

/**
 *
 * @author ASUS
 */
public class ExcepTest4 {
    public static void main(String args[]) {
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
//Program ini mencoba membagi 1 dengan 0, yang menyebabkan pengecualian ArithmeticException. 
//Namun, pengecualian ini ditangkap oleh blok catch umum (Exception), 
//sehingga program menampilkan pesan bahwa pengecualian terjadi. 
//Karena pembagian dengan nol terjadi lebih dulu, baris yang mencoba mengakses elemen array yang tidak ada (a[3]) tidak pernah dieksekusi, 
//sehingga pengecualian ArrayIndexOutOfBoundsException tidak muncul. Setelah penanganan pengecualian, 
//program menampilkan pesan "Out of the block" dan selesai.
