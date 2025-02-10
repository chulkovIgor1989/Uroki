package org.example;

public class Sotrudnik {
    private String name;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;
    public Sotrudnik(String name, String jobTitle,
                     String email,String phoneNumber,int salary,int age){
        this.name = name;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }
    public void SotrudnikDemon(){
        System.out.println(name+"\n"+ jobTitle + "\n"+
                email + "\n"+ phoneNumber + "\n"+ salary+"\n"+ age);
    }
}
