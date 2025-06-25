import java.util.*;
public class Main{


    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
    int choice;

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
            case 1 -> adddoctor();
            case 2 -> addpatient();
            case 3 -> viewdoctors();
            case 4 -> viewpatients();
            case 5 -> assignDoctortoPatient();
            case 6 -> createappointment();
            case 7 -> viewappointments();
            case 8 -> System.out.println("Exiting system. Goodbye!");
            default -> System.out.println("Please choose correct option.");
            }

            }while(choice!=8);
    }

       public static void adddoctor()
        {

        }
        public static void addpatient()
        {

        }
        public static void viewdoctors()
        {

        }
        public static void viewpatients()
        {

        }
        public static void assignDoctortoPatient()
        {

        }
        public static void createappointment()
        {

        }
        public static void viewappointments()
        {

        }

}