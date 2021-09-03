package datacollector;

import entity.Ip;
import entity.Patient;

import java.util.HashMap;
import java.util.Map;

import static datacollector.BedData.bedMap;

public class IpData {
    public static Map<Long, Ip> inPatient;
    public static final Patient patientMurugan = null;
    static {
        inPatient = new HashMap<>();
        Ip patient1 = new Ip();
        patient1.setPatientId(1L);
        patient1.setIpIdentificationNumber(1L);
        patient1.setPatient(patientMurugan);
        patient1.setBed(bedMap.get(1L));

        Ip patient2 = new Ip();
        patient2.setPatientId(2L);
        patient2.setIpIdentificationNumber(2L);
        patient2.setPatient(patientMurugan);
        patient2.setBed(bedMap.get(2L));

        Ip patient3 = new Ip();
        patient3.setPatientId(2L);
        patient3.setIpIdentificationNumber(2L);
        patient3.setPatient(patientMurugan);
        patient3.setBed(bedMap.get(3L));

        inPatient = new HashMap<>();
        inPatient.put(patient1.getPatientId(), patient1);
        inPatient.put(patient2.getPatientId(), patient2);
        inPatient.put(patient3.getPatientId(), patient3);
    }
}
