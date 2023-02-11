import java.util.Date;
import java.awt.*;

public class Variables {

    public static void main(String[] args) throws Exception{

        // VARIABLES

        // PRIMITIVE DATA TYPES
        // --> to store numbrers, characters, booleans

        int age = 30;          // 4 bytes
        float aggee = 30.50f;    // 4 bytes
        double aggeee = 30.545;   // 8 bytes
        long agge = 10;     // 8 bytes
        char letter = 'A';  // 2 bytes
        boolean isEligible = true;     // true/false


        System.out.println(age);


        // REFERENCE DATA TYPES
        // --> to store objects

        Date now = new Date();

        System.out.println(now);
    }

}