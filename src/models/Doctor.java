package models;

public class Doctor extends Person{
    private String specialization;
    private String department;
    private boolean availability;

   public Doctor(){

   }
    


    public Doctor(int doctorId, String name, int age, String gender, String phonenumber, String specialization,
		String department, boolean availability) {
	super(doctorId,name,age,gender,phonenumber);
	this.specialization=specialization;
	this.availability=availability;
	this.department=department;
}



	public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }



	@Override
	public String toString() {
		return "Doctor [specialization=" + specialization + ", department=" + department + ", availability="
				+ availability + ", PersonId=" + getPersonId() + ",Name=" + getName() + ", Age()="
				+ getAge() + ", Gender()=" + getGender() + ", PhoneNo()=" + getPhoneNo()  +"]";
	}




    
    
}