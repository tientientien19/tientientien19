public class MultiLayerDecorator extends BakeryDecorator {
    public MultiLayerDecorator(Cake cake) {
        super(cake);
    }
    @Override
    public String order() {
        String order = mcake.order();
        return addMultiLayer() + order;
    }
    @Override
    public int cakePrice() {
        int price = mcake.cakePrice();
        return price + multilayerPrice();
    }

    private String addMultiLayer() {
        return "Multi-layered ";
    }
    private int multilayerPrice() {
        return 5;
    }
}
