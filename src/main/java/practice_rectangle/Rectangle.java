package practice_rectangle;

public class Rectangle {
    int width;
    int height;

    Rectangle(int someWidth, int someHeight) {
        this.width = someWidth;
        this.height = someHeight;
    }

    int getWidth() {
        return this.width;
    }

    int getHeight() {
        return this.height;
    }

    void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public int calculateArea() {return width * height;}

    void print() {
        int area = calculateArea();
        System.out.println("Площадь равна: " + area);
    }

}
