package untility;

import java.util.ArrayList;
import java.util.Collections;

public class Utility {

    public static Long getVisitId(ArrayList<Long> visitId) {

        Collections.sort(visitId);
        Long l = (new Long(visitId.size()));
        l++;
        return l++;
    }
}
