package day08_whileLoop_scope;

public class C08_BaskaClassdakiUyelereUlasma {

    public static void main(String[] args) {

        // bir class'daki static uyelere ulasmak icin
        // classIsmi.staticUyeIsmi yazariz
        // C07 class'indaki static uyelere ulasalim

        System.out.println(C07_Scope_ClassLevelVariables.sayi);
        C07_Scope_ClassLevelVariables.method1();


        // bir class'daki static olmayan uyelere ulasmak icin ise
        // o class'dan obje olustuirmaliyiz

        C07_Scope_ClassLevelVariables obj = new C07_Scope_ClassLevelVariables();
        System.out.println(obj.strInstance);
        obj.method2();


        // static olan bir uyeye
        // static yolla ulasmak yerine,
        // static olmayan yontemle, yani obje uzerinden ulasirsaniz
        // Java itiraz etmez ama intelliJ bizi yanlis yontem konusunda uyarir

        System.out.println(obj.str);
        // Static member 'day08_whileLoop_scope.C07_Scope_ClassLevelVariables.str' accessed via instance reference

    }
}
