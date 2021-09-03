package datacollector;

import entity.Hospital;

import java.util.HashMap;
import java.util.Map;

public class HospitalData {
    public static Map<Long, Hospital> hospitalMap;

    static {
        hospitalMap = new HashMap();
        Hospital hospital = new Hospital();
        hospital.setHospitalName("Apollo Hospital");
        hospital.setHospitalId(1L);
        hospital.setHospitalLocation("Chennai");
        hospitalMap.put(hospital.getHospitalId(), hospital);

        hospital = new Hospital();
        hospital.setHospitalName("Global Hospital");
        hospital.setHospitalId(2L);
        hospital.setHospitalLocation("Chennai");
        hospitalMap.put(hospital.getHospitalId(), hospital);

        hospital = new Hospital();
        hospital.setHospitalName("Kaevery Hospital");
        hospital.setHospitalId(3L);
        hospital.setHospitalLocation("Chennai");
        hospitalMap.put(hospital.getHospitalId(), hospital);
    }
}
