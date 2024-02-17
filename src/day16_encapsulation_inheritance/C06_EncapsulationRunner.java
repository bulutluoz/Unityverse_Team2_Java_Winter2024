package day16_encapsulation_inheritance;

public class C06_EncapsulationRunner {

    public static void main(String[] args) {

        /*
            Bir variable'i public yapmak ile

            private yapip, getter ve setter method'larini
            birlikte olusturmak arasinda
            islevsel olarak hicbir fark yoktur

            2.yontemi bazi developer'lar 2 sebeple tercih ediyorlar
                - variable'a deger atama(set) ve degere ulasma(get)
                  yetkilerinin verilmesinin farkinda oldugunu ve bunun uygun oldugunu vurgulamak
                - baska class'lardan bu variable'lari kullanirken
                  get ve set keyword'lerine vurgu yaparak
                  yapilan islemin amacini ortaya koymak

         */


        C05_EncapsuleClass obj = new C05_EncapsuleClass();

        obj.sayiPu = 50;

        System.out.println(obj.sayiPu); // 50




        obj.setSayiPr(80);

        System.out.println(obj.getSayiPr()); // 80


    }
}
