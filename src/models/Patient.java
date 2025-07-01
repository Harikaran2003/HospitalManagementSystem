package models;

public class Patient extends Person{
   
    @Override
	public String toString() {
		return "Patient [patiendId="  + ", patientName=" + patientName + ", disease=" + disease
				+ ", admissionDate=" + admissionDate + ", dischargeDate=" + dischargeDate + "]";
	}
  //  private int patiendId;
	private String patientName;
    private String disease;
    private String admissionDate;
    private String dischargeDate;
   private Doctor doctorAssigned;

    public Patient( int personId, String patientName,String disease,String admissionDate, String dischargeDate, String name, int age, String gender, String phoneNo) {
        super(personId, name, age, gender, phoneNo);
        //this.patiendId = patiendId;
        this.patientName = patientName;
        this.disease = disease;
        this.dischargeDate = dischargeDate;
        this.admissionDate = admissionDate;
        
        
    //    this.doctorAssigned = doctorAssigned;
     
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