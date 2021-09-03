package datacollector;

import entity.Hospital;
import entity.Medicine;
import untility.DateUtility;

import java.text.ParseException;
import java.util.*;

public class MedicineData {
    public static Map<Long, Medicine> medicinDetails;

    static {
        medicinDetails = new HashMap<>();
        Medicine medicine = new Medicine();
        medicine.setMedicineId(1L);
        medicine.setMedicineName("Ecospirin");
        medicine.setMedicinePurpose("release heart pain");
        medicine.setExpiryDate(DateUtility.currentDateAsDate());
        medicine.setBatchNumber("c1245");
        medicinDetails.put(medicine.getMedicineId(), medicine);

        medicine = new Medicine();
        medicine.setMedicineId(2L);
        medicine.setMedicineName("Calcium Citrate");
        medicine.setMedicinePurpose("Joit pain support");
        medicine.setExpiryDate(DateUtility.convertStringToDate("2021/08/01"));
        medicine.setBatchNumber("b7545");
        medicinDetails.put(medicine.getMedicineId(), medicine);

        medicine = new Medicine();
        medicine.setMedicineId(3L);
        medicine.setMedicineName("Gifitinib");
        medicine.setMedicinePurpose("Cancer Chemotherapy medicine");
        medicine.setExpiryDate(DateUtility.currentDateAsDate());
        medicine.setBatchNumber("Dn375");
        medicinDetails.put(medicine.getMedicineId(), medicine);

        medicine = new Medicine();
        medicine.setMedicineId(4L);
        medicine.setMedicineName("Sandhivati");
        medicine.setMedicinePurpose("Arthiritic and join pain");
        medicine.setExpiryDate(new Date(2025/5/20));
        medicine.setBatchNumber("ayurved01");
        medicinDetails.put(medicine.getMedicineId(), medicine);
    }
    public static List<Medicine> getMedicine() {
        List<Medicine> medicineList = new ArrayList<>();
        Random random = new Random();
        int randomNumber;
        for (int i = 1; i < 3; i++) {
            randomNumber = random.nextInt(3);
            if (medicinDetails.containsKey((long) randomNumber));
            medicineList.add(medicinDetails.get((long) randomNumber));
        }
        return medicineList;
    }

}
