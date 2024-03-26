public interface CalculatePaintCost {
    double paintperSqF = 10.50;
    static double calculatePaintJobCost(double _area){
        return _area * paintperSqF;
    }
}