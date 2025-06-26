package Mainclass;

import java.util.*;

import models.Doctor;
public class Main{
	  public List<Doctor> doctors=new ArrayList<Doctor>();
	  
	  
	  static int docid=101;
	  
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
            case 1 -> m.adddoctor();
            case 2 -> addpatient();
            case 3 -> m.viewdoctors();
            case 4 -> m.viewpatients();
            case 5 -> m.assignDoctortoPatient();
            case 6 -> m.createappointment();
            case 7 -> m.viewappointments();
            case 8 -> System.out.println("Exiting system. Goodbye!");
            default -> System.out.println("Please choose correct option.");
            }

            }while(choice!=8);
    }

       public void adddoctor()
        {
    	   Scanner sc=new Scanner(System.in);
    	   
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

        }
        public static void addpatient()
        {

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

        }
        public void assignDoctortoPatient()
        {

        }
        public void createappointment()
        {

        }
        public void viewappointments()
        {

        }

}