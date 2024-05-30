public class SayingX extends BakeryDecorator{
    public SayingX(Cake cake) {
        super(cake);
    }
    @Override
    public String order() {
        String order = mcake.order();
        return order + sayingX();
    }
    @Override
    public int cakePrice() {
        int price = mcake.cakePrice();
        return price + sayingXPrice();
    }
    private String sayingX(){
        return "with saying X";
    }
    private int sayingXPrice() {
        return 0;
    }
}
