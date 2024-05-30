public class ChocolateCake implements Cake {
    @Override
    public String order() {
        return "Chocolate cake ";
    }
    @Override
    public int cakePrice() {
        return 10;
    }
}
