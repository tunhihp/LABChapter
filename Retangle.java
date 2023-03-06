
package ltchapter;

public class Retangle extends LTChapter {
    private double width = 1.0;
    private double length= 1.0;
    public Retangle(String color, boolean filled) {
        super(color, filled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Retangle{");
        sb.append('}');
        return sb.toString();
    }
    
}
