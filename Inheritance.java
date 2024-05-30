class GrandParents {
    void act1() {
        System.out.println("Action 1!");
    }
}
class Mom extends GrandParents {
    void act2() {
        System.out.println("Action 2!");
    }
}
class Dad extends GrandParents {
    void act3() {
        System.out.println("Action 3!");
    }
}
class Son extends Mom {
    void act4(){
        System.out.println("Action 4!");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Son son = new Son();
        son.act1(); //Multilevel Inheritance
        son.act2();
        Mom mom = new Mom();
        mom.act1(); //Single, Hierarchical
        Dad dad = new Dad();
        dad.act1(); //Single, Hierarchical
    }
}