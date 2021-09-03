package untility;


import java.util.ArrayList;
import java.util.Collections;

public class IdentificationNumber {

    static public Long getIpIdentificationNumber(ArrayList<Long> id) {

       // Collections.sort(id);
        long ipId = ((long) id.size());

        return ipId++;
    }
}