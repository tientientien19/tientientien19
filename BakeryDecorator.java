
public abstract class BakeryDecorator implements Cake {
    protected Cake mcake;
    BakeryDecorator (Cake cake) {
        mcake = cake;
    }
}
