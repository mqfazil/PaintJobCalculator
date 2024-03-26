public class Square extends Shape{
    private double length;
    public void setLength(double _length) {
        this.length = _length;
    }
    public double getLength() {
        return this.length;
    }
    Square(double _length){
        this.length = _length;
    }
    @Override
    public double area() {
        return this.length * this.length;
    }
    public double getPaintJobCost(){
        return CalculatePaintCost.calculatePaintJobCost(area());
    }
}
