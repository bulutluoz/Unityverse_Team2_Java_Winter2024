package day06_stringManipulations_ForLoop;

public class C07_StringManipulationsSoru {

    public static void main(String[] args) {

        //Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //		   input1 : “15.35 €” , input2 : “11.40 €”
        //		   output : 26.75 €

        String input1 = "15.35 €";
        String input2 = "11.40 €";


        System.out.println(input1 + input2); // 15.30 €11.40 €
        // Integer'a cevirebilmek icin once sayi olmayan herseyden kurtulmaliyiz

        input1 = input1.replaceAll("\\D",""); // "1530"
        input2 = input2.replaceAll("\\D",""); // "1140"


        int fiyat1 = Integer.parseInt(input1);
        int fiyat2 = Integer.parseInt(input2);



        System.out.println(  ((double)fiyat1 + fiyat2) / 100  + " €");
    }
}
