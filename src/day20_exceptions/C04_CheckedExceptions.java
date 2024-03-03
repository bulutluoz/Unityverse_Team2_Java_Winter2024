package day20_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        /*
            Checked Exceptions, kodlarimiz compile edilirken
            riski farkedilen exception'lardir

            Checked Exceptions genelde dosya islemlerinde karsimiza cikar

            Exception   ==> tum exception'larin parent'idir
            IOException ==> dosya islemleri ile ilgili parent exception
            FileNotFoundException ==> IOException'in child'idir. Dosya bulunamadiginda olusur

            Checked Exceptions olustugunda
            kodun alti kirmizi cizilir, bu durumda kod calismaz

            1- Ya Try-catch ile handle edip
               exception olustugunda hata mesaji verip
               yoluna normal olarak devam etmesini saglayabiliriz
            2- Ya da exception'i handle etmeden
               sadece kirmizi cizgiyi kaldirmak icin
               method deklarasyonuna throws keyword ile
               exception riski yazdirilabilir

         */

        String dosyaYolu = "src/day20_exceptions/deneme.txt";

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);


    }
}
