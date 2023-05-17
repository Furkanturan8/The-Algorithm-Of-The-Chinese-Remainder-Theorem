package AyrikYapilarIcinAlgoritma;

import java.util.Scanner;
public class ModIslemleri {

    // Cinli kalan teoremi; dogrusal denklik sistemlerini cozmek icin kullanilir.
    // Denklem modeli --> x = a (mod m)
    // Amacımız kullanici tarafindan girilen a ve m degerlerini, doğrusal denklik sistemi uzerinde sağlayan en küçük pozitif x tamsayı değerlerini bulmak.
    /* EXAMPLE:
    number of equations = 3
       x=4(mod 5)  a1=4 m1=5
       x=4(mod 7)  a2=4 m1=7
       x=8(mod 11) a3=8 m3=11
       what is the smallest integer x=?
       x=74
       if you want to learn more about the Chinese remainder theorem, you can look at the mathematical resources.
    * */
    Scanner input = new Scanner(System.in);
    int a[],b[],m[],M=1,x;
    boolean bKontrol=false;
    int islemSay;
    public ModIslemleri(int islemSayisi){
        a = new int[islemSayisi];
        b = new int[islemSayisi];
        m = new int[islemSayisi];
        for(int i=0; i<islemSayisi; i++){
            System.out.print("a"+(i+1) +" 'yi yaziniz: ");
                a[i]=input.nextInt();
            System.out.print("m"+(i+1) +" 'yi yaziniz: ");
                m[i]=input.nextInt();
        }
        islemSay=islemSayisi;
    }
    public void MBul(){
        for(int i=0; i<islemSay; i++)
            M *= m[i];
    }
    public void bBulduranDenklem() {
        for (int i = 0; i < islemSay; i++) {
            for (int j = 0; j < m[i]; j++) {
                if (((M/m[i])*j)%m[i]==1) {
                    b[i] = j;
                    System.out.println("Aranan b bulundu! b" + (i + 1) + " =" + b[i]);
                    bKontrol = true;
                    break;
                }

            }
            if (bKontrol == false)
                System.out.println("Aranan b" + (i + 1) + " bulunamadi!");
            bKontrol=false;
        }
    }
    public void xBulduranDenklem(){
        System.out.println("M:"+M);
        for(int i=0; i<islemSay; i++)
            x+=(((M/m[i])*a[i])*b[i]);
        System.out.println("Aranan x bulundu! x=" + x);

        int Xler[]= new int[10];
        for(int i=0; i<10; i++){
            Xler[i]=(x%M)+(M*i);
        }
        System.out.println("\n---X in olabileceği değerler---");
        for(int i=0; i<10; i++)
            System.out.println(Xler[i]);

    }
    public void yazdir(){
        for(int i=0; i<islemSay; i++ ){
            System.out.println("a"+(i+1) +": " + a[i]);
            System.out.println("m"+(i+1) +": " + m[i]);
        }

    }


}
