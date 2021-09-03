package datacollector;

import entity.Bed;

import java.util.HashMap;
import java.util.Map;

public class BedData {
    public static Map<Long, Bed> bedMap;

    static {
        bedMap = new HashMap<>();
        Bed bed = new Bed();
        bed.setBedId(1L);
        bed.setBedType("Normal single bed");
        bed.setRoomName("A");
        bedMap.put(bed.getBedId(), bed);

        bed = new Bed();
        bed.setBedId(2L);
        bed.setBedType("Normal single bed");
        bed.setRoomName("B");
        bedMap.put(bed.getBedId(), bed);

        bed = new Bed();
        bed.setBedId(3L);
        bed.setBedType("Double bed");
        bed.setRoomName("C");
        bedMap.put(bed.getBedId(), bed);

        bed = new Bed();
        bed.setBedId(4L);
        bed.setBedType("Double bed");
        bed.setRoomName("D");
        bedMap.put(bed.getBedId(), bed);

        bed = new Bed();
        bed.setBedId(5L);
        bed.setBedType("Double bed with High class" );
        bed.setRoomName("E");
        bedMap.put(bed.getBedId(), bed);

    }
}
