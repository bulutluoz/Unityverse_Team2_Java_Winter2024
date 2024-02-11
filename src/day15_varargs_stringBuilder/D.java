package day15_varargs_stringBuilder;

public class D {

    private int sayiPrivate = 10;
    int sayiDefaultAccMod = 20;
    protected int sayiProtected = 30;
    public int sayiPublic = 40;

    private void methodPrivate(){
        System.out.println("Private method calisti");
    }

    void methodDefaultAccMod(){
        System.out.println("Default Access Modifier method calisti");
    }

    protected void methodProtected(){
        System.out.println("Protected method calisti");
    }

    public void methodPublic(){
        System.out.println("Public method calisti");
    }


    public static void main(String[] args) {

        D obj = new D();

        System.out.println(obj.sayiPrivate);
        obj.methodPrivate();

        System.out.println(obj.sayiDefaultAccMod);
        obj.methodDefaultAccMod();

        System.out.println(obj.sayiProtected);
        obj.methodProtected();

        System.out.println(obj.sayiPublic);
        obj.methodPublic();

    }
}
