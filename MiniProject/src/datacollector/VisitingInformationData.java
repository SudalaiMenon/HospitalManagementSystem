package datacollector;

import entity.VisitingInformation;

import java.util.HashMap;
import java.util.Map;

import static datacollector.AppoinmentData.appoinmentMap;
import static datacollector.MedicineData.getMedicine;

public class VisitingInformationData {
    public static Map<Long, VisitingInformation> visitDetails;

static
         {
            visitDetails = new HashMap<>();
            VisitingInformation heartCheckup = new VisitingInformation();
            heartCheckup.setVisitId(1L);
            heartCheckup.setAppoinment(appoinmentMap.get(1L));
            heartCheckup.setDoctorRecommendation("you feel chest pain visit again immediatly");
            heartCheckup.setFollowUpNeed(true);
            heartCheckup.setMedicinesList(getMedicine());
            visitDetails.put(heartCheckup.getVisitId(), heartCheckup);

            VisitingInformation boneCheckup = new VisitingInformation();
            boneCheckup.setVisitId(2L);
            boneCheckup.setAppoinment(appoinmentMap.get(2L));
            boneCheckup.setDoctorRecommendation("Dont shake your legs");
            boneCheckup.setFollowUpNeed(true);
            boneCheckup.setMedicinesList(getMedicine());
            visitDetails.put(boneCheckup.getVisitId(), boneCheckup);

            VisitingInformation lungsCheckup = new VisitingInformation();
            lungsCheckup.setVisitId(3L);
            lungsCheckup.setAppoinment(appoinmentMap.get(3L));
            lungsCheckup.setDoctorRecommendation("you have breath problem and visit again");
            lungsCheckup.setFollowUpNeed(true);
            lungsCheckup.setMedicinesList(getMedicine());
            visitDetails.put(lungsCheckup.getVisitId(), lungsCheckup);

            VisitingInformation bodyPainCheckup = new VisitingInformation();
            bodyPainCheckup.setVisitId(4L);
            bodyPainCheckup.setAppoinment(appoinmentMap.get(4L));
            bodyPainCheckup.setDoctorRecommendation("No worries just a fever, take one day rest");
            bodyPainCheckup.setFollowUpNeed(false);
            bodyPainCheckup.setMedicinesList(getMedicine());
            visitDetails.put(bodyPainCheckup.getVisitId(), bodyPainCheckup);

        }
}
