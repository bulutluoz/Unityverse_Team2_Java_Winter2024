package day15_varargs_stringBuilder;

public class D02_AccessModifier {

    public static void main(String[] args) {

        D obj = new D();

        //System.out.println(obj.sayiPrivate);
        //obj.methodPrivate();

        System.out.println(obj.sayiDefaultAccMod);
        obj.sayiDefaultAccMod = 600;
        obj.methodDefaultAccMod();

        System.out.println(obj.sayiProtected);
        obj.methodProtected();

        System.out.println(obj.sayiPublic);
        obj.methodPublic();

    }

}
