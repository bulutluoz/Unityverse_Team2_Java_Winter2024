package day16_encapsulation_inheritance;

import day15_varargs_stringBuilder.D;

public class C02_ChildOlmayanClass {

    public static void main(String[] args) {

        D obj = new D();
        // ayni class'da degiliz
        // System.out.println(obj.sayiPrivate);
        // obj.methodPrivate();

        // ayni package'da degiliz
        // System.out.println(obj.sayiDefaultAccMod);
        // obj.methodDefaultAccMod();

        // child class degil
        // System.out.println(obj.sayiProtected);
        // obj.methodProtected();

        System.out.println(obj.sayiPublic);
        obj.methodPublic();

    }
}
