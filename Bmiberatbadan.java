import java.util.Scanner;

public class Bmiberatbadan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Berat Badan : ");
        double berat = input.nextDouble();

        System.out.print("Masukkan Tinggi Badan : ");
        double tinggi = input.nextDouble();

        double konversiBerat = berat * 2.205;
        double konversiTinggi = tinggi / 2.54;
        double RumusBmi = konversiBerat/konversiTinggi *konversiTinggi * 703;
        System.out.println("BMI= " + RumusBmi);


        Scanner inputBola = new Scanner(System.in);
        System.out.print("Masukkan Jari Jari : ");
        double JariJari = inputBola.nextDouble();
        double VolumeBola = 4/3 * 3.14 *JariJari *JariJari;
        System.out.println("volumebolaadalah:"+VolumeBola);

        Scanner inputTabung = new Scanner(System.in);
        System.out.println("Masukkan Jari Jari : ");
        double JariJariTabung = inputTabung.nextDouble();
        System.out.println("Masukkan Tinggi:");
        double VolumeTabung = 3.14*JariJariTabung*tinggi;
        System.out.println("volumetabungadalah:"+VolumeTabung);

        Scanner inputKerucut = new Scanner (System.in);
        System.out.println("Masukkan Jari Jari : ");
        double JariJariKerucut = inputKerucut.nextDouble();

        System.out.println("Masukkan Tinggi");
        double TinggiKerucut = inputKerucut.nextDouble();

        double VolumeKerucut = 3.14 * JariJariKerucut * TinggiKerucut * 1/3;
        System.out.println("Volumekerucutadalah"+VolumeKerucut);




        



    }

    
}
