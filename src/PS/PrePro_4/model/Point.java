package PS.PrePro_4.model;


public class Point {
    private double x;
    private double y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }


    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public double distance(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

}
