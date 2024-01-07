package day05_switchStatements_stringManipulations;

public class C03_SwitchDikkatEdilecekler {

    public static void main(String[] args) {


        long sayiLong = 23;
        double sayiDouble = 23.3;
        float sayiFloat = 3.5f;
        boolean bl = true;
        String cinsiyet = "Erkek";
        // 1- Switch paranytezi icine long,float,double veya boolean degisken YAZILAMAZ
        // 2- Case olarak yazilan deger tek olmali & veya || gibi mantiksal operatorler kullanilmamali


        switch (cinsiyet){

            case "Erkek":
            case "ERKEK":
            case "erkek":
                System.out.println("Cinsiyet : Erkek");
                break;


        }
    }
}
