package AyrikYapilarIcinAlgoritma;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n-----Bu Program, Çinli Kalan Teoreminin Altyapısı Kullanılarak Yapılmıştır!-----");
        System.out.println("NOT: Doğrusal denklik sistemlerini çözmek için bu teorem kullanılır.");
        System.out.println("Denklem modeli --> x = a (mod m)");
        System.out.print("\nKaç denklem gireceksiniz:");
            int islemSayisi = input.nextInt();

        ModIslemleri m1= new ModIslemleri(islemSayisi);
            m1.MBul();
            m1.bBulduranDenklem();
            m1.xBulduranDenklem();

    }
}
