package objet_exercice_learnjavaonline;

class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }
    
    Point center(Point other) {
        // Returns the center between this point the other point
        // Notice we are using integer, we won't get an accurate value
        return new Point((x + other.x) / 2, (y + other.y) / 2);
    }
    
    public void scale(){
    	// method in Point called scale, that will make the point 
    	// closer by half to (0,0). So for example, point (8, 4) 
    	// after scale will be (4, 2).
        x = x/2;
        y = y/2;
    }
}

public class App {
    public static void main(String[] args) {
        Point p = new Point(32, 32);
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}
