package day08_whileLoop_scope;

public class C02_StringiTerseCevirme {

    public static void main(String[] args) {

        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip,
        //        bu halini bize donduren bir method olusturun.

        System.out.println(metniTerseCevir("Ali topu at.")); // .ta upot ilA
        System.out.println(metniTerseCevir("Java candir")); // ridnac avaJ
        System.out.println(metniTerseCevir("madam")); // madam

        String cananinTersi = metniTerseCevir("Canan");
        System.out.println(cananinTersi); // nanaC

        String str = "Cumleyi tersine cevir";

        // yukarda verilen str'i terse cevirip, kaydedin
        str = metniTerseCevir(str);
        System.out.println("str'in yeni degeri : " + str); // rivec enisret iyelmuC

        // method'u kullanarak, verilen metnin palindrome olup olmadigini kontrol edin

        String metin = "Ey edip Adanada pide ye";

        if (metin.equalsIgnoreCase(metniTerseCevir(metin))){
            System.out.println("verilen metin palindrome");
        }else {
            System.out.println("verilen metin palindrome degil");
        }


    }

    public static String metniTerseCevir( String metin){

        String tersMetin ="";

        int index= metin.length()-1; // son harften baslamak istedigim icin

        while (index >= 0){
            tersMetin += metin.charAt(index);
            index--;
        }

        return tersMetin;
    }

}
