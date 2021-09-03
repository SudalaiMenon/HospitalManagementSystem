package bussinessobject;

import datacollector.AppoinmentData;
import datacollector.MedicineData;
import entity.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ReportBO {

    public void displayPatientDetails(Map<Long, Patient> patientDetails, Long patientId, String patientName) {
        Patient patient = new Patient();
        if (patientDetails.containsKey((patientId))) {
            patient = patientDetails.get(patientId);
        }

        Iterator<Long> iterator = patientDetails.keySet().iterator();

        while (iterator.hasNext()) {
            patient.getPatientName().equals(iterator.next());
            if (patient.getPatientName().equals(patientName)) {
                System.out.println("Display the patient details for the patient Name/Id:" + patient);
                break;
            }
        }
    }

    public void displayListOfVisitPatiendId(Map<Long, VisitingInformation> visitingInformationMap, Long patientId) {
        VisitingInformation visitingInformation = new VisitingInformation();
        Iterator<Long> iterator = visitingInformationMap.keySet().iterator();
        System.out.println("Display the list of visit for the patient id:");
        while(iterator.hasNext()) {
            visitingInformation = visitingInformationMap.get(iterator.next());
            System.out.println(visitingInformation);
        }
    }

    public void displayFollowUpVisit(Map<Long, VisitingInformation> visitingInformationMap) {
        Iterator<Long> iterator = visitingInformationMap.keySet().iterator();
        System.out.println("Display the list of patient who needs the followup visit:");
        while(iterator.hasNext()) {
            VisitingInformation whoNeedFollowUp = visitingInformationMap.get(iterator.next());
            if(whoNeedFollowUp.getFollowUpNeed()) {
                System.out.println( whoNeedFollowUp.getAppoinment().getPatient());

            }
        }
    }
    public void displayOnlyOutPatient(Map<Long, Patient> patientMap) {
        Patient patient ;
        Iterator<Long> iterator = patientMap.keySet().iterator();
        System.out.println("Display only the out-patient: ");
        while (iterator.hasNext()) {
            patient = patientMap.get(iterator.next());
            if(patient.getPatientType().equals("OP")) {
                System.out.println(patient);
            }
        }
    }

    public void displayPatientByDoctorId(Map<Long, Appoinment> appoinmentMap, Long doctorId) {
        Appoinment appoinment;
        Iterator<Long> iterator = appoinmentMap.keySet().iterator();
        System.out.println("Display the list of patient by doctor id(1L): ");

        while(iterator.hasNext()) {
             appoinment = appoinmentMap.get(iterator.next());
            if( /*appoinment.getDoctor() != null &&*/ appoinment.getDoctor().getDoctorID() == doctorId) {
                System.out.println(appoinment.getPatient());
            }
        }
    }

    public void displayWhoInPatient(Map<Long, Patient> patientMap) {
        Patient patient = new Patient();
        Iterator<Long> iterator = patientMap.keySet().iterator();
        System.out.println("Display Who In-patient: " );
        while (iterator.hasNext()) {
            patient = patientMap.get(iterator.next());
            if(patient.getPatientType().equals("IP")) {
                System.out.println(patient);

            }
        }
    }

    public void todayVisitPatient(Map<Long, Appoinment> appoinmentMap) {
        Appoinment todayVisit;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormatOne = new SimpleDateFormat("dd/MM/yyyy");

        for (Long appoinmentId : appoinmentMap.keySet()) {
            todayVisit = appoinmentMap.get(appoinmentId);
            Date date = todayVisit.getDateOfVisit();
            //  System.out.println(date);
            String dateOne = dateFormat.format(date);
            String dateTwo = dateFormatOne.format(Calendar.getInstance().getTime());
            if (dateOne.equals(dateTwo)) {
                System.out.println("Display the today’s visited patient :" + todayVisit.getPatient());
                break;
            }
        }
    }
    public void displayDetailsDateRange(Map<Long, VisitingInformation> visitInformationMap) throws ParseException {
        VisitingInformation visitRange;
        System.out.println("Display the visit details for given date range:");
        for(Long visitId : visitInformationMap.keySet()) {
            visitRange = visitInformationMap.get(visitId);
            Date dates = visitRange.getAppoinment().getDateOfVisit();
            //System.out.println("date checking:" +visitRange);

            // Date date = new SimpleDateFormat("yyyy/MM/dd").parse(simpleDateFormat.format(dates));
            // System.out.println(dates);
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
                Date startDate = new SimpleDateFormat("yyyy/MM/dd").parse("2021/8/1");
                Date endDate = new SimpleDateFormat("yyyy/MM/dd").parse("2021/8/12");
                System.out.println("date checking:" +visitRange);

//                if(dates.after(startDate) && (dates.before(endDate)))
//                {
//
//                   // System.out.println(visitRange);
//                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}