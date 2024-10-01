/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanexception;

/**
 *
 * @author ASUS
 */
public class ExcepTest8 {
    public static void main(String args[]) {
        int a = 3;
        int b = 0;
        try {
            System.out.println("result: " + divide(a, b));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    private static int divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("second argument cannot be zero.");
        }
        return a / b;
    }
}
//Program ini mencoba membagi angka 3 dengan 0 menggunakan metode divide(). 
//Ketika b sama dengan 0, metode tersebut melempar pengecualian dengan pesan "second argument cannot be zero."
//Pengecualian ini ditangkap oleh blok catch di dalam main, yang kemudian menampilkan pesan kesalahan. 
//Dengan demikian, program menangani kesalahan pembagian dengan memberikan 
//informasi yang jelas tanpa mengalami crash.