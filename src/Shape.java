public abstract class Shape {
    protected String Shape;
    public abstract double area();
    public void setShape(String _shape) {
        Shape = _shape;
    }
    public String getShape(){
        return this.Shape;
    }
    @Override
    public String toString() {
        String content = "";
        content = "The current shape is: " + this.getShape();
        return super.toString();
    }
}
