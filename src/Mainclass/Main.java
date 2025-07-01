package Mainclass;

import java.time.LocalDateTime;
import java.util.*;

import com.customexception.NameException;

import models.Appointment;
import models.Doctor;
import models.Patient;
public class Main{
	 static public List<Doctor> doctors=new ArrayList<Doctor>();
	  
	  static public List<Patient>patients=new ArrayList<Patient>();
	  static public List<Appointment>appointment=new ArrayList<Appointment>();
	  static int docid=101;
	  static int patId=1;
	  static int appId=1001;
	  
    public static void main(String... args)
    {
    	Scanner sc=new Scanner(System.in);
    int choice;
   // List<Doctor> doctores=new ArrayList<Doctor>();
Main m=new Main();

        do{

        System.out.println("\n===== Hospital Management Menu =====");
            System.out.println("1. Add Doctor");
            System.out.println("2. Add Patient");
            System.out.println("3. View Doctors");
            System.out.println("4. View Patients");
            System.out.println("5. Assign Doctor to Patient");
            System.out.println("6. Create Appointment");
            System.out.println("7. View Appointments");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice){
            case 1 -> System.out.println(m.adddoctor());
            case 2 -> System.out.println(m.addpatient());
            case 3 -> m.viewdoctors();
            case 4 -> m.viewpatients();
            case 5 -> System.out.println(m.assignDoctortoPatient());
            case 6 ->System.out.println( m.createappointment());
            case 7 -> m.viewappointments();
            case 8 -> System.out.println("Exiting system. Goodbye!");
            default -> System.out.println("Please choose correct option.");
            }

            }while(choice!=8);
    }

       public String adddoctor()
        {
    	  // Scanner sc=new Scanner(System.in);
    	   
//    	   
//    	   System.out.println("Enter the Name");
//    	   String name=sc.next();
//    	   System.out.println("Enter the age");
//    	   int age=sc.nextInt();
//    	   System.out.println("Enter the gender");
//    	   String gender=sc.next();
//    	   System.out.println("Enter the phonenumber");
//    	   String phonenumber=sc.next();
//    	   System.out.println("Enter the specialization");
//    	   String specialization=sc.next();
//    	   System.out.println("Enter the department");
//    	   String department=sc.next();
//    	   System.out.println("Enter the availablity");
//    	   boolean availablity=sc.nextBoolean();
//    	   
    	   Doctor d=new Doctor(docid++,"jebakumar",52,"male","41541","pysoco","Cse",true);
    	   doctors.add(d);
    	   return "Successfully doctor added";

        }
        public  String addpatient()
        {
        	NameException n=new NameException(null);
        	Scanner sc=new Scanner(System.in);
        	String name=sc.next();
        	try {
        	if(n.checkname(name)) {
        	Patient p=new Patient(patId++,name,"aids","01-03-2025","02-05-2025","hari",22,"male","937304294");
        	patients.add(p);
        	return "Successfully added";
        	}
        	}
        	catch(NameException e)
        	{
        		e.printStackTrace();
        	}
        	return null;
        }
        
        
        public  void viewdoctors()
        {
        	
        	if(!doctors.isEmpty())
        	{
        		for(Doctor d:doctors)
        		{
        			System.out.println(d);
        		}
        	}

        }
        public void viewpatients()
        {
        	if(!patients.isEmpty())
        	{
        		for(Patient p:patients)
        		{
        			System.out.println(p);
        		}
        	}

        }
        public Doctor assignDoctortoPatient()
        {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter patientId:");
        	int patientId=sc.nextInt();
        	System.out.println("Enter doctorId:");
        	int doctorId=sc.nextInt();
        	Patient p1=getPatientById(patientId);
        	Doctor d1=getDoctorById(doctorId);
        		
        	if(p1!=null && d1!=null)
        	{
        		p1.setDoctorAssigned(d1);
        		return d1;
        	}else {
        		return null;
        	}
        }
        private Patient getPatientById(int patientId) {
        	for(Patient p:patients)
        	{
        		if(p.getPersonId()==patientId)
        		{
        			return p;
        		}
        	}
        	return null;
		}

		private Doctor getDoctorById(int doctorId) {
			for(Doctor d:doctors)
			{
				if(d.getPersonId()==doctorId)
				{
					return d;
				}
			}
			return null;
		}

		public String createappointment()
        {
			int patid=1;
			int docId=101;
			String date="2025-07-01 12:30";
			try {
				
				LocalDateTime ldt= LocalDateTime.parse(date.replace(" ", "T"));
				String odate=ldt.toString();
				
				if(isFree(odate))
				{
				Appointment a=new Appointment(appId,patid,docId,ldt.toString());
				
			Patient pname=getPatientById(patid);
			Doctor dname=getDoctorById(docId);
			appointment.add(a);
			return "Successfully created appointment for "+pname.getPatientName()+" at "+ldt.toString()+" with "+dname.getName();
				}
				else
					{
					return "for this time the appointment was already booked";
					}
				}
			catch(Exception e)
			{
				 e.printStackTrace();
			}
			return null;

        }
		boolean isFree(String odate)
		{
			for(Appointment i:appointment)
			{
				String date=i.getTime();
				if(date.equals(odate))
				{
					return false;
					
				}
			}
			return true;
		}
        public void viewappointments()
        {
        	var f=true;
        	int paid=1;
        	for(Appointment a:appointment)
        	{
        		if(a.getPatientName()==paid)
        		{
        			System.out.println("Name ="+a.getPatientName()+"\n Doctor Name="+a.getDoctorName()+"\n Time"+a.getTime());
        			f=false;
        		}
        	}
        	if(f)
        		System.out.println("Invalid patientId");
        	

        }
        

}