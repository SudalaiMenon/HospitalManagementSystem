package untility;

import java.util.ArrayList;

public class Utility {

    public static Long getVisitId(ArrayList<Long> visitId) {

        long l = ((long) visitId.size());
        return l++;
    }
}
