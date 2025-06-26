package models;

class Patient extends Person{
    private int patiendId;
    private String patientName;
    private String disease;
    private String admissionDate;
    private String dischargeDate;
    private Doctor doctorAssigned;

    public Patient(String admissionDate, String dischargeDate, String disease, Doctor doctorAssigned, int patiendId, String patientName, int personId, String name, int age, String gender, String phoneNo) {
        super(personId, name, age, gender, phoneNo);
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.disease = disease;
        this.doctorAssigned = doctorAssigned;
        this.patiendId = patiendId;
        this.patientName = patientName;
    }

    public int getPatiendId() {
        return patiendId;
    }

    public void setPatiendId(int patiendId) {
        this.patiendId = patiendId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public Doctor getDoctorAssigned() {
        return doctorAssigned;
    }

    public void setDoctorAssigned(Doctor doctorAssigned) {
        this.doctorAssigned = doctorAssigned;
    }
    

}