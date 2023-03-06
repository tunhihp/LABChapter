
package ltchapter;

public class Circle extends LTChapter{
    private double radius;

    public Circle(String color, boolean filled) {
        super(color, filled);
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double ChuViHinhTron() {
        return 2 * 3.14 * this.radius;
    }
    public boolean checkCircle() {
        return this.radius <0;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
}
