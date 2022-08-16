package com.election;

public class Voter {
    private int age;
    private String name;
    static final int VOTER_ELIGIBLE_AGE=18;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Voter()
    {

    }
    public String getAgeCriteria(int age)
    {
       if (this.age>=18&&this.age<=120)
       {
           return " Eligible for voting "+name;
       }
       else if (this.age<18&&this.age>0)
       {
           return " Not eligible for voting "+name;
       }
       else
           return "Age cant be negative or zero ";
    }
}
