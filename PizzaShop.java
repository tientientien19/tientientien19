public class PizzaShop {
    public static void main(String[] args) {
        IPizza chicken = new ChickenPizza();
        IPizza cheese = new CheesePizza();
        System.out.println(cheese.doPizza());
        System.out.println(chicken.doPizza());
        PepperDecorator peppercheese = new PepperDecorator(cheese);
        System.out.println(peppercheese.doPizza());
        CheeseDecorator pepcheesechiken = new CheeseDecorator(peppercheese);
        System.out.println(pepcheesechiken.doPizza());
    }
}
