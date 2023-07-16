package utility;

import java.util.UUID;

public class Util {

    /**
     * 
     * @return a standard String ID generated by UUID
     */
    public static String getRandomString() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

}