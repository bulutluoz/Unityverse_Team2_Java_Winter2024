package day17_inheritance;

public class C05_Parent extends C04_GP{

    C05_Parent(){
        // super();
        System.out.println("P parametresiz constructor calisti");
    }

    C05_Parent(String s){
        this();
        System.out.println("P String parametreli constructor calisti");
    }

    C05_Parent(int a){
        super("k");
        System.out.println("P int parametreli constructor calisti");
    }
}
