package datacollector;

import entity.Doctor;

import java.util.HashMap;
import java.util.Map;

public class DoctorData {
    public static Map<Long, Doctor> doctorMap;
    static {
        doctorMap = new HashMap<>();

        Doctor doctor = new Doctor();
        doctor.setDoctorName("Dr. AravindKumar");
        doctor.setDoctorID(1L);
        doctor.setSpecialisation("Cardialogy");
        doctor.setHospitalName("Appollo Hospital");
        doctorMap.put(doctor.getDoctorID(), doctor);

        doctor = new Doctor();
        doctor.setDoctorName("Dr. RameshNatarajan");
        doctor.setDoctorID(2L);
        doctor.setSpecialisation("Orthopedics");
        doctor.setHospitalName("Appollo Hospital");
        doctorMap.put(doctor.getDoctorID(), doctor);

        doctor = new Doctor();
        doctor.setDoctorName("Dr. Vijayaragavan");
        doctor.setDoctorID(3L);
        doctor.setSpecialisation("Cancer Care");
        doctor.setHospitalName("GlopalHospital");
        doctorMap.put(doctor.getDoctorID(), doctor);

        doctor = new Doctor();
        doctor.setDoctorName("Dr. ChitraDevi");
        doctor.setDoctorID(4L);
        doctor.setSpecialisation("Ayurvedha");
        doctor.setHospitalName("GlopalHospital");
        doctorMap.put(doctor.getDoctorID(), doctor);

        doctor = new Doctor();
        doctor.setDoctorName("Dr. PremKumar");
        doctor.setDoctorID(5L);
        doctor.setSpecialisation("ENT");
        doctor.setHospitalName("GlopalHospital");
        doctorMap.put(doctor.getDoctorID(), doctor);

    }

}
