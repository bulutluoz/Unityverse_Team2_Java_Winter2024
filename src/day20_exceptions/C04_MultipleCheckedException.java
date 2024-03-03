package day20_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_MultipleCheckedException {

    public static void main(String[] args) {

        /*
            Checked exception'lar genelde dosya islemleri ile ilgilidir
            Dosya islemlerinde parent exception IOException

            yani aile agaci

            Exception / IOException / FileNotFoundException

            eger tek bir try, birden fazla catch kullanacaksak
            child once yazilmalidir

            Cunku parent'in yakalama kapasitesi daha fazladir
            ustte olursa child'in yakalayacklarini da yakalar
            ve child'a is kalmaz
         */

        // deneme dosyasindaki yazilari yazdirin

        String dosyaYolu = "src/day20_exceptions/deneme.txt";


        try {

            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
            int k=0;
            while((k= fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Belirtilen dosya yolunda, dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("Dosyadaki yazilar okunamadi");
        }


    }
}











