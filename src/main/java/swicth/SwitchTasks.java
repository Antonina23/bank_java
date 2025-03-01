package swicth;

public class SwitchTasks {
    public String daysWeek(int x) {
        String day = "";
        switch (x) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "There is no such a day";
        }
            return day;
    }

    public String describePlanets(Planets planets) {
        String description = "";
        switch (planets) {
            case MERCURY:
                description = "Порядковый номер: 1,\nМасса относительно Земли: 1.0";
                break;
            case VENUS:
                description = "Порядковый номер: 2,\nМасса относительно Земли: 2.0";
                break;
            case EARTH:
                description = "Порядковый номер: 3,\nМасса относительно Земли: 3.0";
                break;
            case MARS:
                description = "Порядковый номер: 4,\nМасса относительно Земли: 4.0";
                break;
            case JUPITER:
                description = "Порядковый номер: 5,\nМасса относительно Земли: 5.0";
                break;
            case SATURN:
                description = "Порядковый номер: 6,\nМасса относительно Земли: 6.0";
                break;
            case URANUS:
                description = "Порядковый номер: 7,\nМасса относительно Земли: 7.0";
                break;
            case NEPTUNE:
                description = "Порядковый номер: 8,\nМасса относительно Земли: 8.0";
                break;
        }
        return description;
    }

    public double calc(double q, double a, char operator) {
        double resultcalculation = 0;
        switch (operator) {
            case '+':
                resultcalculation = q+a;
                break;
            case '-':
                resultcalculation = q-a;
                break;
            case '*':
                resultcalculation = q*a;
                break;
            case '/':
                resultcalculation = q/a;
                break;
        }
        return resultcalculation;
    }

}
