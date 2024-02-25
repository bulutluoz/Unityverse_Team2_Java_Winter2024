package day19_abstractClass_interface;

public interface C08_Interface {

    // Bir interface icindeki tum method'lar
    // public ve abstract'tir
    // public ve abstract yazmasak da farketmez

    public abstract void method1();
    // Modifier 'public' is redundant for interface members
    // Modifier 'abstract' is redundant for interface methods

    // public void method2(){ // Interface abstract methods cannot have body

    // }
    public void method2();
    abstract void method3();
    void method4();


    // Bir interface icindeki tum variable'lar ise
    // public static ve final'dir
    // static oldugu icin child class'dan direk ulasilabilir
    // final oldugu icin sonradan deger atanamaz
    public static final int SAYI1 = 10;
    static final int SAYI2 = 20;
    public final int SAYI3 = 30;
    int SAYI4 = 40;

}
