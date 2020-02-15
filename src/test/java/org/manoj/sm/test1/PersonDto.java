package org.manoj.sm.test1;

import org.manoj.sm.MField;

public class PersonDto {
    @MField("pname")
    private String name;
    @MField("page")
    private int age;
    @MField("pgender")
    private String gender;
    @MField("pemail")
    private String email;
    private String pmobile;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return pmobile;
    }

    public void setMobile(String mobile) {
        this.pmobile = mobile;
    }

    @Override
    public String toString() {
        return "PersonDto [age=" + age + ", email=" + email + ", gender=" + gender + ", name=" + name + ", pmobile="
                + pmobile + "]";
    }

}