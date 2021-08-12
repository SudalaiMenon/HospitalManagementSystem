package bussinessobject;

import entity.Bed;
import entity.GenerateIdentificationNumber;
import entity.Ip;
import entity.Patient;

import java.util.ArrayList;
import java.util.Map;

public class BedBO {
public void bedAllocateInPatient(Long patientId, Map<Long, Patient> patientMap, Long bedId, Map<Long, Bed> bedMap,
                                 Map<Long, Ip> inPatient, String bedType, String roomName) throws Exception {
    System.out.println();
    Ip ip =new Ip();

    Patient patient = new Patient();
    if(patientMap.containsKey(patientId)) {
        patient = patientMap.get(patientId);
      //  System.out.println(patient);
    }

    ip.setIpIdentificationNumber(GenerateIdentificationNumber.getIpIdentificationNumber(new ArrayList<Long>(inPatient.keySet())));

    if(patient.getTypeIpOp().equals("IP")) {
        ip.setPatient(patient);
        ip.setBed(bedMap.get(bedId));
    }

    inPatient.put(ip.getIpIdentificationNumber(), ip);
    System.out.println(inPatient);
}
}
