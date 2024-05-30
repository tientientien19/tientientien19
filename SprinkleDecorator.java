public class SprinkleDecorator extends BakeryDecorator{
    public SprinkleDecorator (Cake cake){
        super(cake);
    }
    @Override
    public String order() {
        String order = mcake.order();
        return order + addSprinkles();
    }
    @Override
    public int cakePrice() {
        int price = mcake.cakePrice();
        return price + sprinklesPrice();
    }
    private String addSprinkles() {
        return "with sprinkles ";
    }
    private int sprinklesPrice() {
        return 2;
    }
}
