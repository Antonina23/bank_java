package practice_1;

public class MathOperations {
    public static void main(String[] args){
        int add1 = add(1, 2);
        System.out.println(add1);

        int sub1 = subtract(8, 5);
        System.out.println(sub1);

        int mult1 = multiply(6, 6);
        System.out.println(mult1);

        double div1 = divide(9, 3);
        System.out.println(div1);

        int find1 = findMax(9, 12);
        System.out.println(find1);

        int dif1 = difference(-8, -18);
        System.out.println(dif1);

        int area1 = squareArea(5);
        System.out.println(area1);

        int per1 = squarePerimeter(4);
        System.out.println(per1);

        double minutes1 = convertSecondsToMinutes(90);
        System.out.println(minutes1);

        double speed1 = averageSpeed(100, 10);
        System.out.println(speed1);

        double hypo1 = findHypotenuse(9, 16);
        System.out.println(hypo1);

        double circ1 = circleCircumference(11);
        System.out.println(circ1);

        double calculate1 = calculatePercentage(100, 10);
        System.out.println(calculate1);

        double celsius1 = celsiusToFahrenheit(10);
        System.out.println(celsius1);

        double fahrenheit1 = fahrenheitToCelsius(78);
        System.out.println(fahrenheit1);



    }

    public static int add(int x, int y){
        return x+y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
        return x*y;
    }

    public static double divide(int x, int y){
        return x/y;
    }

    public static int findMax(int a, int b){
        return Math.max(a, b);
    }

    public static int difference(int x, int y){
        return Math.abs(x-y);
    }

    public static int squareArea(int side){
        return side*side;
    }

    public static int squarePerimeter(int side){
        return 4*side;
    }

    public static double convertSecondsToMinutes(int seconds){
        return seconds/60;
    }

    public static double averageSpeed(double distance, double time){
        return distance/time;
    }

    public static double findHypotenuse(double a, double b){
        double a1 = Math.sqrt(a);
        double b1 = Math.sqrt(b);
        return a1 + b1;
    }

    public static double circleCircumference(double radius){
        double rad1 = 2 * Math.PI * radius;
        return rad1;
    }

    public static double calculatePercentage(double total, double part){
        double per1 = (part/total) * 100;
        return per1;
    }

    public static double celsiusToFahrenheit(double celsius){
        double v = (9 / 5) + 32F;
        double cels1 = celsius * v;
        return cels1;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double f = 5.0/9.0;
        double p = fahrenheit -32;
        double far1 = p*f;
        return far1;
    }

}
