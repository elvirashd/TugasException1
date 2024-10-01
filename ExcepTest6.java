/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanexception;

/**
 *
 * @author ASUS
 */
public class ExcepTest6 {
    public static void main(String args[]) {
        System.out.println(testFinallyBlock());
    }

    private static int testFinallyBlock() {
        int a[] = new int[2];
        try {
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        } finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
        return 0;
    }
}
//Program ini mendemonstrasikan penggunaan blok finally yang akan selalu dieksekusi meskipun ada return di dalam blok try. 
//Dalam metode testFinallyBlock(), nilai 1 dikembalikan dari blok try, 
//tetapi sebelum kembali, blok finally tetap dijalankan. 
//Di dalam finally, elemen pertama array diubah menjadi 6 dan pesan tentang eksekusi finally ditampilkan. Hasil akhirnya, 
//nilai yang dikembalikan adalah 1, namun blok finally tetap dijalankan untuk menampilkan 
//"First element value: 6" dan "The finally statement is executed".