class Operation{
    int square(int n) {
        return n * n;
    }
}
class Circle{
    Operation op; //Aggregation
    double pi = 3.14;
    double area(int r){
        op = new Operation();
        int rsquare = op.square(r);
        return pi * rsquare;
    }
}
public class Aggregation {
    public static void main(String[] args) {
        Circle k = new Circle();
        System.out.println(k.area(7));
    }
}
