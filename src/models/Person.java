package models;

public class Person{
    private int personId;
    private String name;
    private int age;
    private String gender;
    private String phoneNo;

   
    public Person() {
    }

    public Person(int personId,String name, int age, String gender,  String phoneNo) {
      
       
        this.personId = personId;
         this.name = name;
          this.age = age;
        this.gender = gender;
        this.phoneNo = phoneNo;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    void display(){

    }
    
}