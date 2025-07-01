package models;

public class Appointment {
	private int appointmentId;
	private int patientName;
	private int doctorName;
	private String time;
	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", patientName=" + patientName + ", doctorName="
				+ doctorName + ", time=" + time + "]";
	}
	public Appointment() {
		super();
	}
	public Appointment(int appointmentId, int patientName, int doctorName, String time) {
		super();
		this.appointmentId = appointmentId;
		this.patientName = patientName;
		this.doctorName = doctorName;
		this.time = time;
	}
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public int getPatientName() {
		return patientName;
	}
	public void setPatientName(int patientName) {
		this.patientName = patientName;
	}
	public int getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(int doctorName) {
		this.doctorName = doctorName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	

}
