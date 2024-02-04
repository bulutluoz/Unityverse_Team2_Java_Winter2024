package day13_staticKeyword_PassByValue;

public class C03_StaticBlocks {

    /*
        static block'lar class calismaya baslamadan once
        yapilmasi gereken bir islem varsa, kullanilir

        static blocks tum method'lardan
        HATTA main method'dan bile once calisir

        Eger birden fazla static block varsa
        diger kod bloklarina degil kendi iclerindeki siralanisa bakarlar
        usten asagi dogru sirasiyla calisirlar
     */



    C03_StaticBlocks(){

        System.out.println("Constructor calisti");
    }

    static {
        System.out.println("static block calisti");
    }

    static {
        System.out.println("2.static method calisti");
    }

    public static void main(String[] args) {

        System.out.println("main method calisti");
        C03_StaticBlocks obj1 = new C03_StaticBlocks();

    }


}
