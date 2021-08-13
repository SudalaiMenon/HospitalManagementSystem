package bussinessobject;

import entity.*;
import untility.Utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class VisitingInformationBO {
    public Patient createVisitLogInformation(Long appointmentId, Map<Long, Appoinment> appointmentMap,
                                             Map<Long, VisitingInformation> visitDetails,
                                             List<Medicine> medicines, String doctorRecommendation,
                                             Boolean followUpNeed) throws Exception {


        Appoinment appointment = new Appoinment();
        if (appointmentMap.containsKey(appointmentId)) {
            appointment = appointmentMap.get(appointmentId);
          //  System.out.println(appointment.getPatient());

        }

        Patient patient = appointment.getPatient();

        VisitingInformation visitingInformation = new VisitingInformation();
        visitingInformation.setVisitId(Utility.getVisitId(new ArrayList<>(visitDetails.keySet())));
        visitingInformation.setDoctorRecommendation(doctorRecommendation);
        visitingInformation.setFollowUpNeed(followUpNeed);
        visitingInformation.setMedicinesList(medicines);
        visitingInformation.setAppoinment(appointment);
        System.out.println(visitingInformation);
        System.out.println(patient.getPatientID());

        Boolean status = checkPatientType(visitDetails, patient);
        visitDetails.put(visitingInformation.getVisitId(), visitingInformation);

        return patient;
    }

    private Boolean checkPatientType(Map<Long, VisitingInformation> visitDetails, Patient patient) {

        Iterator<Long> itr = visitDetails.keySet().iterator();
        VisitingInformation visitLog;
        int visitCount = 0;
        while (itr.hasNext()) {
            visitLog = visitDetails.get(itr.next());
            if (visitLog.getAppoinment().getPatient().getPatientID() == patient.getPatientID()) {
                visitCount++;
            }
        }

        System.out.println("visitCount : " + visitCount);

        if (visitCount >= 3) {
            patient.setTypeIpOp("IP");
            return true;
        }
        return false;
    }
}
