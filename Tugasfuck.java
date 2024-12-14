import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class tugasjava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sistem4 = 0;
        
        String nama;
        int password;
        String pin;
        System.out.println("   Yukk Login Terlebih Dahulu");
        System.out.print("Nama: ");
        nama = sc.next();
        System.out.print("Password: ");
        password = sc.nextInt();
        System.out.print("Pin: ");
        pin = sc.next();

        if (nama.equals("Administrator") &&
                password >= 00000 &&
                pin.equals("123456789")) {
            System.out.println("Yeyy akses Diterima, Selamat Datang!!");
           
            int all;
            do {
                System.out.println("===Silahkan Pilih Menu===");
                System.out.println(
                        " 1.Bangun Ruang/Datar \n 2.Konversi \n 3.Secret Menu \n 4.Exit");
                System.out.print("Input Untuk Memilih Menu Diatas : ");
                all = sc.nextInt();  
                switch (all) {
                    case 1:
                        do {
                            System.out.println("<==Bangun Ruang Datar==>");
                            System.out.println(
                                    "Silahkan Pilih Rumus : \n 1.Luas(Meter Kuadrat) \n 2.Volume(Liter) \n 3.Exit");                          
                            System.out.print("Massukkan Nomor: ");
                            all = sc.nextInt();                            
                            int Luas;
                            switch (all) {
                                case 1:
                                    int panjang, lebar, sisi, alas, tinggi, r;
                                    do {
                                        System.out.println(
                                                "Silahkan Pilih Menu : \n" +
                                                        "1).Persegi Panjang \n" +
                                                        "2).Persegi \n" +
                                                        "3).Segitiga \n" +
                                                        "4).Lingkaran \n" +
                                                        "5).Exit ");
                                        System.out.print("Silahkan Pilih : ");
                                        Luas = sc.nextInt();                                   
                                        switch (Luas) {                                           
                                            case 1:
                                                System.out.println("Persegi Panjang");
                                                System.out.println("Rumus = p * l");
                                                System.out.println("Masukkan Panjang");
                                                panjang = sc.nextInt();
                                                System.out.println("Masukkan Lebar");
                                                lebar = sc.nextInt();
                                                System.out.println("Hasilnya : " + (panjang * lebar) + " m²");
                                                break;                                          
                                            case 2:
                                                System.out.println("Persegi");
                                                System.out.println("Rumus = sisi * sisi");
                                                System.out.println("Masukkan Sisi² ");
                                                sisi = sc.nextInt();
                                                System.out.println("Hasilnya : " + (sisi * sisi) + " m²");
                                                break;                                        
                                            case 3:
                                                System.out.println("Segitiga");
                                                System.out.println("Rumus = 1/2 * alas * tinggi ");
                                                System.out.println("1/2");
                                                System.out.println("Masukkan Alas");
                                                alas = sc.nextInt();
                                                System.out.println("Masukkan Tinggi");
                                                tinggi = sc.nextInt();
                                                System.out.println("Hasilnya : " + (1 * alas * tinggi / 2) + " m²");
                                                break;                                         
                                            case 4:
                                                System.out.println("Lingkaran");
                                                System.out.println("Rumus = 22/7 * r*r");
                                                System.out.print("Masukkan Radius²  ");
                                                r = sc.nextInt();
                                                System.out.println("Hasilnya : " + (22 * r * r / 7) + " m²");
                                                break;
                                            case 5:
                                                System.out.println("Mencapai Batas Akhir Luas");
                                                break;
                                            default:
                                                System.out.println("Exit");
                                                break;
                                        }
                                    } while (Luas < 5);
                                    break;
                                case 2:
                                    do {
                                        System.out.println(
                                                "Pilihan Menu \n" + "1.Balok \n" + "2.Kubus \n" + "3.Bola \n"
                                                        + "4.Exit");
                                        sistem4 = sc.nextInt();
                                        
                                        switch (sistem4) {
                                            case 1:
                                                System.out.println("Balok ");
                                                System.out.println("Rumus = panjang x lebar x tinggi");
                                                System.out.println("Masukkan Panjang");
                                                panjang = sc.nextInt();
                                                System.out.println("Masukkan Lebar");
                                                lebar = sc.nextInt();
                                                System.out.println("Masukkan Tinggi");
                                                tinggi = sc.nextInt();
                                                System.out
                                                        .println("Hasilnya : " + (panjang * lebar * tinggi) + " Liter");
                                                break;
                                            case 2:
                                                System.out.println("Rumus Volume Kubus : Sisi³");
                                                System.out.println("Masukkan Sisi³  : ");
                                                sisi = sc.nextInt();
                                                System.out.println("Hasilnya : " + (sisi * sisi * sisi) + " Liter");
                                                break;
                                            case 3:
                                                System.out.println("Rumus Volume Bola :  4/3  22/7  r³ ");
                                                System.out.println(" Masukkan r³ ");
                                                r = sc.nextInt();
                                                System.out.println(
                                                        "Hasilnya : " + (4 * 22 * r * r * r / 3 / 7) + "Liter");
                                                break;
                                            case 4:
                                                System.out.println("Mencapai Batas Akhir Volume");
                                                break;
                                            default:
                                                System.out.println("Exit");
                                                break;
                                        }

                                    } while (sistem4 < 4);
                                    break;
                                default:
                                    System.out.println();
                            }
                        } while (all < 3);
                        break;
                    case 2:
                        int konversi = 1;
                        do {
                            System.out.println(
                                    "Pilih Menu di bawah ini : \n 1. Derajat \n 2. Panjang (meter) \n 3. Berat (gram)  \n 4. Exit");
                            konversi = sc.nextInt();
                            switch (konversi) {
                                case 1:
                                    System.out.println("Derajat :");
                                    int derajat = 1;
                                    do {
                                        System.out.println(
                                                "Pilih soal dibawah in : \n 1. Celcius \n 2. Farenhait \n 3. Reamur \n 4. Exit");
                                        System.out.println("masukkan pilihan :");
                                        derajat = sc.nextInt();
                                        System.out.println("Anda memilih konversi nomor : " + derajat);
                                        
                                        switch (derajat) {
                                            case 1:
                                                int c1 = 1;
                                                do {
                                                    System.out.println("Derajat celcius");
                                                    System.out.println(
                                                            "1. celcius ke farenhait \n2. celcius ke reamur \n 3.exit");
                                                    System.out.println("Masukan nomor yang anda pilih: ");
                                                    c1 = sc.nextInt();
                                                    switch (c1) {
                                                        case 1:
                                                            Float c;

                                                            System.out.println("Celcius");
                                                            System.out.println("Masukan Nilai Celcius: ");
                                                            c = sc.nextFloat();

                                                            System.out.println(
                                                                    c + "°C" + " di ubah ke " + ((9 * c / 5) + 32)
                                                                            + " °F");
                                                            ;
                                                            break;
                                                        case 2:
                                                            float R;

                                                            System.out.println("Celcius");
                                                            System.out.println("Masukan Nilai Celcius: ");
                                                            R = sc.nextFloat();

                                                            System.out.println(R + "°C" + " di ubah ke "
                                                                    + (4 * R / 5) + " °R");
                                                            ;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                } while (c1 < 3);

                                                break;
                                            case 2:
                                                int F7 = 1;
                                                do {
                                                    System.out.println("Derajat farenhait");
                                                    System.out.println(
                                                            "1. farenhait ke celcius \n2. farenhait ke reamur \n 3.exit");
                                                    System.out.println("Masukan nomor yang anda pilih: ");
                                                    F7 = sc.nextInt();
                                                    switch (F7) {
                                                        case 1:
                                                            Float F8;

                                                            System.out.println("Fahrenheit");
                                                            System.out.println("Masukan nilai Fahrenheit: ");
                                                            F8 = sc.nextFloat();

                                                            System.out.println(
                                                                    F8 + "°F" + " di ubah ke " + ((F8 - 32) * 5 / 9)
                                                                            + " °C");
                                                            ;
                                                            break;
                                                        case 2:
                                                            Float F9;

                                                            System.out.println("Fahrenheit");
                                                            System.out.println("Masukan nilai Fahrenheit: ");
                                                            F9 = sc.nextFloat();

                                                            System.out.println(
                                                                    F9 + "°F" + " di ubah ke " + ((F9 - 32) * 4 / 9)
                                                                            + " °R");
                                                            ;
                                                            break;

                                                        default:
                                                            break;
                                                    }
                                                } while (F7 < 3);
                                                break;
                                            case 3:
                                                int R1 = 1;
                                                do {
                                                    System.out.println("Derajat Reamur");
                                                    System.out.println(
                                                            "1. reamur ke celcius \n2. reamur ke farenhait \n 3.exit");
                                                    System.out.println("Masukan nomor yang anda pilih: ");
                                                    R1 = sc.nextInt();
                                                    switch (R1) {
                                                        case 1:
                                                            float R8;

                                                            System.out.println("Reamur");
                                                            System.out.println("Masukan nilai Reamur: ");
                                                            R8 = sc.nextFloat();

                                                            System.out.println(
                                                                    R8 + "°R" + " di ubah ke " + (R8 * 5 / 4) + " °C");
                                                            ;
                                                            break;
                                                        case 2:
                                                            float R9;

                                                            System.out.println("Reamur");
                                                            System.out.println("Masukan nilai reamur: ");
                                                            R9 = sc.nextFloat();

                                                            System.out.println(
                                                                    R9 + "°R" + " di ubah ke " + (R9 * 9 / 4 + 32)
                                                                            + " °F");
                                                            ;
                                                            break;

                                                        default:
                                                            break;
                                                    }
                                                } while (R1 < 3);

                                                break;
                                            default:
                                                break;
                                        }
                                    } while (derajat < 4);
                                    break;
                                case 2:
                                    Float meter;
                                    int sPanjang = 1;
                                    System.out.println("Panjang");
                                    do {
                                        System.out.println(
                                                "Silahkan Pilih : \n 1. Kilometer \n 2. Hektometer \n 3. Dekameter \n 4. Desimeter \n 5. Sentimeter \n 6. Milimeter \n 7. Exit");
                                        sPanjang = sc.nextInt();
                                        switch (sPanjang) {
                                            case 1:
                                                System.out.println("Konversi Meter => Kilometer ");
                                                meter = sc.nextFloat();
                                                System.out.println("Hasil " + (meter / 1000) + "Km");
                                                break;
                                            case 2:
                                                System.out.println("Konversi Meter => HektaMeter ");
                                                meter = sc.nextFloat();
                                                System.out.println("Hasil " + (meter / 100) + "Hm");
                                                break;
                                            case 3:
                                                System.out.println("Konversi Meter => Dam ");
                                                meter = sc.nextFloat();
                                                System.out.println("Hasil " + (meter / 10) + "Dam");
                                                break;
                                            case 4:
                                                System.out.println("Konversi Meter => DesiMeter ");
                                                meter = sc.nextFloat();
                                                System.out.println("Hasil " + (meter * 10) + "Dm");
                                                break;
                                            case 5:
                                                System.out.println("Konversi Meter => CentiMeter ");
                                                meter = sc.nextFloat();
                                                System.out.println("Hasil " + (meter * 100) + "Cm");
                                                break;
                                            case 6:
                                                System.out.println("Konversi Meter => MiliMeter ");
                                                meter = sc.nextFloat();
                                                System.out.println("Hasil " + (meter * 1000) + "Mm");
                                                break;
                                        }
                                    } while (sPanjang < 7);
                                    break;
                                
                                case 3:
                                    int sberat = 1;
                                    System.out.println("Panjang");
                                    do {
                                        System.out.println(
                                                "Silahkan Pilih : \n 1. KiloGram \n 2. HektoGram \n 3. DekaGram \n 4. DesiGram \n 5. SentiGram \n 6. MiliGram \n 7. Exit");
                                        sberat = sc.nextInt();
                                        float gram;
                                        switch (sberat) {
                                            case 1:
                                                System.out.print("Konversi Gram => KiloGram :");
                                                gram = sc.nextFloat();
                                                System.out.println("Hasil Dari Konversi :" + (gram / 1000) + "Kg");
                                                break;
                                            case 2:
                                                System.out.print("Konversi Gram => Hektogram :");
                                                gram = sc.nextFloat();
                                                System.out.println("Hasil Dari Konversi :" + (gram / 100) + "Hg");
                                                break;
                                            case 3:
                                                System.out.print("Konversi Gram => Dekagram :");
                                                gram = sc.nextFloat();
                                                System.out.println("Hasil Dari Konversi :" + (gram / 10) + "Dag");
                                                break;
                                            case 4:
                                                System.out.print("Konversi Gram => Desigram :");
                                                gram = sc.nextFloat();
                                                System.out.println("Hasil Dari Konversi :" + (gram * 10) + "Dg");
                                                break;
                                            case 5:
                                                System.out.print("Konversi Gram => Centigram :");
                                                gram = sc.nextFloat();
                                                System.out.println("Hasil Dari Konversi :" + (gram * 100) + "Cg");
                                                break;
                                            case 6:
                                                System.out.print("Konversi Gram => MiliGram :");
                                                gram = sc.nextFloat();
                                                System.out.println("Hasil Dari Konversi :" + (gram * 1000) + "Mg");
                                                break;
                                        }
                                    } while (sberat < 7);
                                    break;

                                default:
                                    break;
                            }
                        } while (konversi < 4);
                        break;
                    
                    case 3:
                        String unik2;
                        int rahasia;
                        System.out.print("Masukan kode unik: ");
                        unik2 = sc.next();
                        if (unik2.length() > 7 || unik2.length() < 10) {
                            System.out.println(" \n Yo Selamat Datang VVIP!!! \n ");
                            
                            do {
                                String text;
                                System.out.println("Silahkan Pilih Menu Rahasia");
                                System.out.println(" 1. Uppercase \n 2. Lowercase \n 3. Reverse \n 4. Exit");
                                rahasia = sc.nextInt();
                                System.out.println("Anda Memilih Nomor : " +
                                        rahasia);
                                switch (rahasia) {
                                    
                                    case 1:
                                        System.out.println("Uppercase");
                                        System.out.print("Masukan Kalimat : ");
                                        sc.nextLine();
                                        text = sc.nextLine().toUpperCase();
                                        System.out.println("Hasilnya: " + text);
                                        break;
                                    case 2:
                                        System.out.println("Lowercase");
                                        sc.nextLine();
                                        System.out.print("Masukan Kalimat : ");
                                        text = sc.nextLine();
                                        System.out.println("Hasil : " + text.toLowerCase());
                                        break;
                                    case 3:
                                        System.out.println("Reverse \n Merubah Susunan Huruf menjadi Terbalik");
                                        sc.nextLine();
                                        String dataInput;
                                        System.out.println("Masukkan Data : ");
                                        dataInput = sc.nextLine();
                                        System.out.println("Hasil : ");
                                        List<String> unik = Arrays.asList(dataInput.split(" "));
                                        Collections.reverse(unik);
                                        System.out.println(
                                                String.join(" ", unik));
                                        break;
                                    default:
                                        break;
                                }
                            } while (rahasia < 4);
                            System.out.println("Kembali Ke Menu Pertama");
                            break;
                        } else {
                            System.out.println("Akses Di tolak wlee");
                            break;
                        }
                    default:
                    System.out.println("Terima kasih, dan sampai jumpa lagi!");
                        break;
                }
            } while (all < 4);
        } else {
            System.out.println("Akses Di tolak wlee");
            sc.close();
        }
    }
}      
