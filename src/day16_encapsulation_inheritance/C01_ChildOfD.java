package day16_encapsulation_inheritance;

import day15_varargs_stringBuilder.D;

public class C01_ChildOfD extends D {

    public static void main(String[] args) {

        D obj = new D();
        // ayni class'da degiliz
        // System.out.println(obj.sayiPrivate);
        // obj.methodPrivate();

        // ayni package'da degiliz
        // System.out.println(obj.sayiDefaultAccMod);
        // obj.methodDefaultAccMod();

        C01_ChildOfD objChild = new C01_ChildOfD();
        System.out.println(objChild.sayiProtected);
        objChild.methodProtected();
        objChild.sayiProtected = 450;

        System.out.println(obj.sayiPublic);
        obj.sayiPublic = 300;
        obj.methodPublic();

    }

}
