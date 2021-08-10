package bussinessobject;

import entity.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class VisitingInformationBO {
    public Patient createVisitLogInformation(Long appointmentId, Map<Long, Appoinment> appointmentMap,
                                             Map<Long, VisitingInformation> visitDetails,
                                             List<Medicine> medicines, String doctorRecommendation,
                                             Boolean followUpNeed) throws Exception {

        if (appointmentId == null) {
            throw new Exception(" appointmentId is null ");
        }
        if (doctorRecommendation == null) {
            throw new Exception(" doctorRecommendation is null ");
        }
        if (followUpNeed == null) {
            throw new Exception(" followUpNeed is null ");
        }
        if (appointmentMap.isEmpty()) {
            throw new Exception(" appointmentMap empty ");
        }
        if (visitDetails.isEmpty()) {
            throw new Exception(" visitDetails empty ");
        }
        if (medicines.isEmpty()) {
            throw new Exception(" medicines empty ");
        }

        Appoinment appointment = new Appoinment();
        if (appointmentMap.containsKey(appointmentId)) {
            appointment = appointmentMap.get(appointmentId);
        }

        Patient patient = appointment.getPatient();

        VisitingInformation visitingInformation = new VisitingInformation();
        visitingInformation.setVisitId(Utility.getVisitId(new ArrayList<>(visitDetails.keySet())));
        visitingInformation.setDoctorRecommendation(doctorRecommendation);
        visitingInformation.setFollowUpNeed(followUpNeed);
        visitingInformation.setMedicines(medicines);
        visitingInformation.setAppoinment(appointment);

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
