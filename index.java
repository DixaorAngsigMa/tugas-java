// public class index {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//         System.out.println("Hallo");
//     System.out.println("Hallo 1");
//     System.out.println("Hallo");
//     System.out.println("Hallo");

//     String name ="Test";
//     Integer angka = 1;
//     Float desimal = (float) 1.1;
//     Boolean testing = true;
//     Integer test = 1;

//     test = 2;

//     var sum = test + desimal;
//     Integer angka1 = 1;
//     int angka2=1;
//     System.out.print(angka1);
//     System.out.print(angka2);
//     }
// }
import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String nama;
    System.out.print("Nama kamu siapa: ");
    nama = sc.next();
    System.out.println("Nama Saya " + nama);
    int menu = sc.nextInt();
    for (int i = 1; i > menu ; i++) {
      System.out.println("Pilih Menu : 0.Kalkulator  , 2.keluar");
      System.out.print("Masukan angka pertama : ");
      int angka1 = sc.nextInt();
      System.out.print("Masukan angka kedua : ");
      int angka2 = sc.nextInt();
      int hasil = angka1 + angka2;
      System.out.println("Hasil: " + hasil);
      if (hasil % 2 == 0) {
        System.out.println("angka genap");
      } else{
        System.out.println("Angka Ganjl");
      }
    }
  }
}