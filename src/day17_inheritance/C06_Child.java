package day17_inheritance;

public class C06_Child extends C05_Parent{

    C06_Child(){
        super(5);
        System.out.println("C parametresiz constructor calisti");
    }

    C06_Child(String s){
        super("ali");
        System.out.println("C String parametreli constructor calisti");
    }

    C06_Child(int a){ // super();
        System.out.println("C int parametreli constructor calisti");
    }

    public static void main(String[] args) {

        C06_Child child3 = new C06_Child();
        //GP int parametreli constructor calisti
        //GP String parametreli constructor calisti
        //P int parametreli constructor calisti
        //C parametresiz constructor calisti



        //C06_Child child2 = new C06_Child("Kemal");
        //GP parametresiz constructor calisti
        //P parametresiz constructor calisti
        //P String parametreli constructor calisti
        //C String parametreli constructor calisti


        // C06_Child child1 = new C06_Child(4);
        //GP parametresiz constructor calisti
        //P parametresiz constructor calisti
        //C int parametreli constructor calisti
    }
}
