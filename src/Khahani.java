/**
 * Developer and Teacher: Khahani.com
 * Course: Android 1 - Student Practice
 */

public class Khahani {
    // TODO: 1- use psvm to write main method
    public static void main(String[] args) {

        // TODO: 2- please store each value in variables with correct data type:
        /**
         *      1- year
         *      2- month
         *      3- day
         *      4- android course price
         *      5- your code melli
         *      6- your phone number
         *      7- your name
         *      8- your last name
         *      9- the speed of light (m/s)
         *      10- The number π (pi)
         */
        int year = 1397;
        int month = 4;
        int day = 24;
        int price = 10000000; //Rial
        String codeMelli = "1064030131";
        String phone = "09394412792";
        String name = "Mohammadreza";
        String lastName = "Khahani";
        long lighSpeed = 299792458L;
        float pi = 3.14f;

        // TODO: 3- please write ten other interesting values and write comment about them

        // 1- eath area in km
        int eathArea = 6371;

        // 2- moon area
        double moonArea = 14.6; //million square miles

        long moonAreaKm = 38000000; //square miles

        // TODO: 4- write them all in output with information to understandable.

        System.out.println("year: " + year);
        System.out.println("month: " + month);
        System.out.println("day: " + day);
        System.out.println("date:" + year + "/" + month + "/" + day);

        System.out.println("my name is " + name + " " + lastName + " with code melli " + codeMelli + ".");
        System.out.println("call me on " + phone);

        System.out.println();

        System.out.println("I know some interseting information like...");
        System.out.println("speed of light is " + lighSpeed + " mile per second");
        System.out.println("or");
        System.out.println("The number π is " + pi);
        System.out.println("There is a movie named π in 1998. I know ;)");

        System.out.println();

        System.out.println("**** Good luck *****");
    }

}
