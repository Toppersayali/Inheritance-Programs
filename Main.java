package org.example;

class Human{
    private String name;
    private int age;
    private String gender;
   public Human(String name,int age,String gender){
       this.name=name;
       this.name=name;
       this.age=age;
       this.gender=gender;
   }
   public int getAge(){
       return age;
   }
   public String getName(){
       return name;
   }
   public String getGender(){
       return gender;
   }
   public String getInfo(){
       return"\n Name : "+getName()+"\n Age : "+getAge()+"\n Gender: "+getGender();
   }
}
class Student extends Human{
    private int roll;
    private String div;
    private int sem;
    private double cpi;
    public Student(String name,int age,String gender,int roll,String div,int sem ,double cpi){
        super(name,age,gender);
        this.roll=roll;
        this.div=div;
        this.sem=sem;
        this.cpi=cpi;
    }
    public int getRoll(){
        return roll;
    }
     public String getDiv(){
        return div;
    }
     public int getSem(){
        return sem;
    }
     public double getCpi(){
        return cpi;
    }
    @Override
    public String getInfo(){
        return super.getInfo()+"\n Roll No. : "+getRoll()+"\n Class :"+getDiv()+"\n Semester : "+getSem()+"\n CPI : "+getCpi();
    }
}
class Faculty extends Human {
    private int empid;
    private int salary;
    private String special;
    public Faculty(String name,int age,String gender,String special,int salary){
        super(name,age,gender);
 
        this.salary=salary;
        this.special=special;
    }
   
    public int getSalary(){
        return salary;
    }
    public String getSpecial(){
        return special;
    }
    @Override
    public String getInfo(){
        return super.getInfo()+"\n Salary : "+getSalary()+"\n Specialization : "+getSpecial();
    }
}
public class Main{
public static void main(String[] args){
        Student s= new Student("Sayali",19,"Female",34,"IT",3,7.8);
        Faculty f=new Faculty(" Dr. Shirole",45,"Male","IT",50000);
        System.out.println("Student Info : "+s.getInfo());
        System.out.println("Faculty Info : "+f.getInfo());
   
       
}
}
