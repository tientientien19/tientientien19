/*CMPT373 - Fall 2021
Design Patterns Exercise

The bakery package in the starter project contains partial code for a bakery. The bakery makes two types of cakes: vanilla and chocolate.
They now want to make more complex cakes such as a "Multi-layered Vanilla cake with sprinkles that says 'Hello World!'"

Change the code so that an order can contain such complex cakes using the Decorator Pattern:

Create the necessary decorator classes:
    For multi-layered cakes, add $5 and print "Multi-layered" out at the front of the name.
    For sprinkles, add $2 and print "with sprinkles" at the end of the name.
    For a cake with the saying X, add nothing to the cost, and print "with saying 'X'" at the end of the name.
    Add the new type of cake: strawberry cake, which costs twice as much as a Cake.
    Change the client to add the following to an Order, and print the Order:
        Chocolate cake
        Vanilla cake with saying "PLAIN!"
        Vanilla cake with sprinkles with saying "FANCY"
        Multi-layered Strawberry cake with double sprinkles and two sayings "One of" and "EVERYTHING"
        Suggested output is: Multi-layered Strawberry cake with sprinkles with sprinkles with saying "One of" with saying "EVERYTHING"
*/
public class Bakery {
    public static void main(String[] args) {
        ChocolateCake chocolateCake = new ChocolateCake();
        Vanilla vanilla = new Vanilla();
        StrawberryCake strawberry = new StrawberryCake();
        System.out.println(chocolateCake.cakePrice()+ " "+ chocolateCake.order());
        System.out.println(vanilla.cakePrice()+ " "+vanilla.order() + "with saying \"PLAIN!\"");
        SprinkleDecorator sprinkleVanilla = new SprinkleDecorator(vanilla);
        System.out.println(sprinkleVanilla.cakePrice()+ " "+ sprinkleVanilla.order() + "with saying \"FANCY!\"");
        MultiLayerDecorator strawberryCake = new MultiLayerDecorator(strawberry);
        SprinkleDecorator strawberryCake1 = new SprinkleDecorator(strawberryCake);
        SprinkleDecorator strawberryCake2 =  new SprinkleDecorator(strawberryCake1);
        System.out.println(strawberryCake2.cakePrice() + " " + strawberryCake2.order() + "with saying \"One of\" with saying \"EVERYTHING\"");
    }
}
