import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik ders notunuzu giriniz : ");
        mat = input.nextInt();

        if (mat >= 55 && mat <= 100) {
            System.out.println("Matematik dersini geçtiniz.");
        } else if (mat >= 0 && mat < 55) {
            System.out.println("Matematik dersinden kaldınız.");
        } else {
            System.out.println("Lütfen geçerli aralıkta bir not girin.");
        }


        System.out.print("Fizik ders notunuzu giriniz : ");
        fizik = input.nextInt();

        if (fizik >= 55 && fizik <= 100) {
            System.out.println("Fizik dersini geçtiniz.");
        } else if (fizik >= 0 && fizik < 55) {
            System.out.println("Fizik dersinden kaldınız.");
        } else {
            System.out.println("Lütfen geçerli aralıkta bir not girin.");
        }

        System.out.print("Kimya ders notunuzu giriniz : ");
        kimya = input.nextInt();

        if (kimya >= 55 && kimya <= 100) {
            System.out.println("Kimya dersini geçtiniz.");
        } else if (kimya >= 0 && kimya < 55) {
            System.out.println("Kimya dersinden kaldınız.");
        } else {
            System.out.println("Lütfen geçerli aralıkta bir not girin.");
        }

        System.out.print("Türkçe ders notunuzu giriniz : ");
        turkce = input.nextInt();

        if (turkce >= 55 && turkce <= 100) {
            System.out.println("Türkçe dersini geçtiniz.");
        } else if (turkce >= 0 && turkce < 55) {
            System.out.println("Türkçe dersinden kaldınız.");
        } else {
            System.out.println("Lütfen geçerli aralıkta bir not girin.");
        }

        System.out.print("Müzik ders notunuzu giriniz : ");
        muzik = input.nextInt();

        if (muzik >= 55 && muzik <= 100) {
            System.out.println("Müzik dersini geçtiniz.");
        } else if (muzik >= 0 && muzik < 55) {
            System.out.println("Müzik dersinden kaldınız.");
        } else {
            System.out.println("Lütfen geçerli aralıkta bir not girin.");
        }

    }
}
