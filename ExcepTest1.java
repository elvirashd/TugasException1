/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanexception;

/**
 *
 * @author ASUS
 */
public class ExcepTest1 {

    public static void main(String[] args) {
        try {
            int a[] = new int[2]; 
            System.out.println("Access element three: " +a[3]);
            
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown: " +e); 
            
        }
        System.out.println("Out of the block");
    }
}
//Mendeklarasi integer array dengan jumlah elemen 2
//mencoba mengakses indeks ke 3 dari array a yang hanya memiliki 2 indeks 
//mencoba mengakses indeks ke 3 dari array a yang hanya memiliki 2 indeks (OutOfBounds)
//kemudian exceptio akan diambil oleh catch dan mencetak pesan "Out of the block"