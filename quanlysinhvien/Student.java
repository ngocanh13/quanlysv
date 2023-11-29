package quanlysinhvien;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String dateOfBith;
    private String adderess;
    private double gpa;

    public Student(int id, String name, String dateOfBith, String adderess, double gpa){
        this.id = id;
        this.name = name;
        this.dateOfBith = dateOfBith;
        this.adderess = adderess;
        this.gpa  = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBith() {
        return dateOfBith;
    }

    public void setDateOfBith(String dateOfBith) {
        this.dateOfBith = dateOfBith;
    }

    public String getAdderess() {
        return adderess;
    }

    public void setAdderess(String adderess) {
        this.adderess = adderess;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
