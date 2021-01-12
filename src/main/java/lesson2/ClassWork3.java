package lesson2;

public class ClassWork3 {
    public static void main(String[] args) {

        //group result
        /*double distance = 10;
        double sumDistance = 0;
        double coefficient = 1.1;
        int day = 1;
        while (day <= 7){
            sumDistance = sumDistance + distance;
            distance*=coefficient;
            day++;
        }
        System.out.println("Distance = " + sumDistance);*/

        //my variant
        /*double distance = 0;
        double norma = 10;
        double coef = 0.1;
        int day = 1;

        while (day <= 7) {
            if (day == 1) {
                distance = norma;
                day++;
                continue;
            }
            norma = norma + (norma * coef);
            distance = distance + norma;
            day++;
        }
        System.out.println("Distance: " + distance);*/

        //trainer variant
        int day = 1;
        double dayDistance = 0;
        double total = 0;
        while (day <= 7){
            if (day == 1){
                dayDistance = 10;
            }else{
                dayDistance = dayDistance * 1.1;
            }
            System.out.println("day:" + day +", dayDistance " + dayDistance);
            total = total + dayDistance;
            day++;
        }
        System.out.println("Total:" + total);
    }
}
