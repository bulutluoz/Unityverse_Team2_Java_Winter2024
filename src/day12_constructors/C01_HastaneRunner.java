package day12_constructors;

import day11_arrayLists_forEachLoop.C09_Hastane;

public class C01_HastaneRunner {

    public static void main(String[] args) {

        C09_Hastane pers1 = new C09_Hastane();

        System.out.println(pers1.persIsmi); // Isim belirtilmedi
        System.out.println(pers1.persTel); // Tel girilmedi
        System.out.println(pers1.persAdres); // Adres girilmedi

        pers1.persIsmi = "Ali Can";
        pers1.persTel = "3123454545";
        pers1.persAdres = "Cankaya";

        System.out.println(pers1.persIsmi); // Ali Can
        System.out.println(pers1.persTel); // 3123454545
        System.out.println(pers1.persAdres); // Cankaya


        C09_Hastane pers2;
        // System.out.println(pers2.persIsmi);
        // Variable 'pers2' might not have been initialized

        // Java bizim bir obje olusturma niyetimiz oldugunu anlar
        // AMMA constructor calismadigi icin
        // class'daki ozellikleri kopyalayip getirmez
        // yani obje fiilen ete kemige burunmemis olur

        // ozetle obje var ama ozellik yok

        System.out.println(new C09_Hastane().persIsmi); // Isim belirtilmedi

        new C09_Hastane();

        // burada ise constructor calistigi icin
        // class'a gidip ozellikleri kop[yalayip getirir
        // ancak bir obje'ye atamadigimiz icin
        // getirdigi ozellikler havada kalir
        // sadece 33.satirda oldugu gibi o satirlik getirilen ozelliklerden
        // istediginizi yazdirabilirsiniz.

        // ozetle : ozellik var ama obje yok

        // bir objenin olusturulup
        // tum ozelliklerin atamasi yapilabilmesi icin
        // esitligin iki tarafi da olmalidir.


    }
}
