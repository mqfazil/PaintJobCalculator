public class Circle extends Shape implements CalculatePaintCost {
    private double radius;
    Circle(double _radius){
        this.radius = _radius;
    }
    public void setRadius(double _radius) { //setter
        this.radius = _radius;
    }
    public double getRadius() { //getter
        return this.radius;
    }
    @Override
    public double area() {
        return Math.pow(this.radius,2.0) * Math.PI;
    }
    public double getPaintJobCost(){
        return CalculatePaintCost.calculatePaintJobCost(area());
    }
}