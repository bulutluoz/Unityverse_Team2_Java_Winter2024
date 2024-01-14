package day07_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C14_SifreKontrolu {

    public static void main(String[] args) {

        // Kullanicidan sifre isteyin
        // C08 Class'indaki method ile girilen sifreyi kontrol edip
        // sifre sartlari saglayincaya kadar yeniden sifre isteyin

        Scanner scanner = new Scanner(System.in);
        boolean sifreIstemeyeDevamEt = true;

        while (sifreIstemeyeDevamEt){

            System.out.println("Lutfen sifre giriniz...");
            String sifre = scanner.nextLine();

            boolean sifreKontrolSonucu = C08_SifreKontrolu.sifreKontrolEt(sifre);

            if (sifreKontrolSonucu == true){
                sifreIstemeyeDevamEt = false;
                System.out.println("Sifreniz basariyla kaydedildi");
            }

        }

    }
}
