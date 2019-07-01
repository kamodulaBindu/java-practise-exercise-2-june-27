package com.stackroute.practiseexersise2;
//class for memberVariable
class Membervariable {
    Member member=new Member();
    public String printValues(String name,int age,float salary)//returns the details of members
    {
        member.name=name;
        member.age=age;
        member.salary=salary;
        return "Member's Name:"+member.name+"\n"+"Member's Age:"+member.age+"\n"+"Member's Salary:"+member.salary;
    }
}