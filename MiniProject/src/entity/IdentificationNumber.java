package entity;

import java.util.ArrayList;
import java.util.Collections;

public class IdentificationNumber {

    static public Long getIpIdentificationNumber(ArrayList<Long> id) {

        Collections.sort(id);
        Long ipId = (new Long(id.size()));
        ipId++;

        return ipId++;
    }
}
