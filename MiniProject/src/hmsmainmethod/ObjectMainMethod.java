package hmsmainmethod;


import generatedata.AppoinmentGenerator;
import bussinessobject.InPatientBO;
import bussinessobject.ReportBO;
import entity.*;
import generatedata.VisitingInformationGenerator;

import java.text.ParseException;

import static datacollector.AppoinmentData.appoinmentMap;
import static datacollector.BedData.bedMap;
import static datacollector.DoctorData.doctorMap;
import static datacollector.MedicineData.getMedicine;
import static datacollector.PatientData.patientMap;
import static datacollector.VisitingInformationData.visitDetails;

public class ObjectMainMethod {

    public static void main(String[] args) {
        ReportBO displayReport = new ReportBO();
       // System.out.println(appoinmentMap.get(1L));

        AppoinmentGenerator appoinmentGenerator = new AppoinmentGenerator();
        System.out.println(appoinmentGenerator.createAppoinment(2L, patientMap, 2L, doctorMap, appoinmentMap, "heartPain"));

       // VisitingInformationGenerator visitingInformationGenerator;

            VisitingInformationGenerator visitingInformationGenerator = new VisitingInformationGenerator();
            System.out.println(appoinmentMap.get(2L).getPatient());

        try {
            Patient patient;
            patient = visitingInformationGenerator.createVisitLogInformation(2L, appoinmentMap, visitDetails,
                    getMedicine(), "take medicine regularly", true);
            patientMap.put(patient.getPatientID(), patient);
            System.out.println(patient);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // System.out.println(medicineList);


        InPatientBO bedBO = new InPatientBO();
        try {
            bedBO.bedAllocateInPatient(2L, patientMap, 2L, bedMap);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            displayReport.displayPatientDetails(patientMap, 2L, "Murugan");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
              displayReport.displayListOfVisitPatiendId(visitDetails, 2L);
          }
          catch (Exception e) {
              System.out.println(e.getMessage());
               }
         try{
             displayReport.displayFollowUpVisit(visitDetails);
         }
         catch (Exception e) {
             System.out.println(e.getMessage());
         }

         try {
            displayReport.displayOnlyOutPatient(patientMap);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            displayReport.displayPatientByDoctorId(appoinmentMap, 2L);
         //   System.out.println( " doctor value:"+appoinmentMap.get(1L));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            displayReport.displayWhoInPatient(patientMap);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            displayReport.todayVisitPatient(appoinmentMap);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            displayReport.displayDetailsDateRange(visitDetails);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


}






