package day07_methodOlusturmaVeKullanma;

public class C05_MethodOlusturma {

    public static void main(String[] args) {

        // verilen iki tamsayiyi carpip, sonucu donduren bir method olusturun

        System.out.println(carpimSonucu(5, 4)); // 20

        int sonuc = carpimSonucu(10,5);


    }


    public static int carpimSonucu (int sayi1, int sayi2){

        int carpim = sayi1*sayi2;

        return carpim;
    }
}
