package day17_inheritance;

public class C04_GP {

    C04_GP(){
        System.out.println("GP parametresiz constructor calisti");
    }

    C04_GP(String s){
        this(3);
        System.out.println("GP String parametreli constructor calisti");
    }

    C04_GP(int a){
        System.out.println("GP int parametreli constructor calisti");
    }
}
