import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, total = 0;              // sayı ve toplam değerlerini tanır
        Scanner input = new Scanner(System.in);     // scanner çağır

        while (true) {              // tek sayı yazılana kadar sayı iste döngüsünü başlat
            System.out.println("Sayı Giriniz : ");      // sayı iste
            number = input.nextInt();           // verilen sayı datasını kaydet

            if (number % 4 == 0) {       //çift ve 4'e tam bölünme işelmini belirle
                total += number;                            // her sayı yazıldığında bunu topla

            }
            else if (number % 2 == 0) {
                total += number;

            }
            else if (number % 2 == 1) {                   // tek sayı yazılırsa döngüyü bitir
                break;
            }
        }
        System.out.println("Girdiğiniz Çift ve 4 e tam bölünen sayıların toplamı :" + total);   // toplamı yazdır
    }
} // Ali Eren KÖSE 24/02/2024   17:01