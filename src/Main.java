public class Main {
    public static void main(String[] args) {
        Square s1 = new Square(20);
        double cost = s1.getPaintJobCost();
        System.out.println("The cost of painting the Square = " + cost);
        Circle c1 = new Circle(5.12);
        cost = c1.getPaintJobCost();
        System.out.println("The cost of painting the Circle = " + cost);
    }
}