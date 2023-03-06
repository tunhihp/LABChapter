
package ltchapter;

public class LTChapter {
    private String color;
    private boolean filled;

    public LTChapter(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "LTChapter{" + "color=" + color + ", filled=" + filled + '}';
    }
    
}

