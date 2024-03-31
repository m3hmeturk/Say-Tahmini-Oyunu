package javaapplication6;
import java.util.Random;
import java.util.Scanner;

class SayiTahminiOyunu {
    private int sayi;
    private int can;
    private int[] tahminler;
    private int tahminSayisi;

    public SayiTahminiOyunu() {
        Random rand = new Random();
        sayi = rand.nextInt(20);
        can = 5;
        tahminler = new int[can];
        tahminSayisi = 0;
    }
    public void oyunuBaslat() {
        System.out.println("Sayi Tahmini Oyununa Hosgeldiniz !");
        System.out.println("0-19 Arasi bir sayi tuttum");
        
        Scanner input = new Scanner(System.in);
        while (can > 0) {
            System.out.print("Tahmininiz: ");
            int tahmin = input.nextInt();
            if (tahmin < 0 || tahmin > 19) {
                System.out.println("Lutfen 0-19 Arasi Bir Sayi Girin ");
                continue;
            }
            tahminler[tahminSayisi++] = tahmin;
            if (tahmin == sayi) {
                oyunuBitir(true);
                return;
            } else {
                System.out.println("Yanlis, Tekrar Deneyiniz ! Kalan Can: " + --can);
            }
        }
        oyunuBitir(false);
    }

    private void oyunuBitir(boolean kazanmaDurumu) {
        if (kazanmaDurumu) {
            System.out.println("Tebrikler Dogru Tahmin");
        } else {
            System.out.println("Basaramadiniz");
        }
        System.out.print("Tahminleriniz : ");
        for (int i = 0; i < tahminSayisi; i++) {
            System.out.print(tahminler[i] + " , ");
        }
        System.out.println("\nTuttugum Sayi : " + sayi);
    }
}

    
