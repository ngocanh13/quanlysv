package quanlysinhvien;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> a= new ArrayList<>();

    public static void main(String[] args) {
        a.add(new Student( 1, "Ngoc Anh", "13/9/2004", "bacninh", 4.5));
        a.add(new Student( 2, "Ngoc Anh", "13/9/2004", "bacninh", 5.5));
        a.add(new Student( 3, "Ngoc Anh", "13/9/2004", "bacninh", 6.5));
        int i;
        Scanner sc = new Scanner(System.in);

            try {
                System.out.println("nhap gia tri 0->6");
                i = sc.nextInt();
                do {
                    switch (i) {
                        case 1: {
                            Addstudent();
                            break;
                        }
                        case 2: {
                            EditStudent();
                            break;
                        }
                        case 3: {
                            Delete();
                            break;
                        }
                        case 4:{
                            Sortstudentbtgpa();
                            break;
                        }
                        case 5:{
                            Sortstudentbyname();
                            break;
                        }
                        case 6:{
                            Showstudent();
                            break;
                        }
                        case 0:{
                            break;
                        }
                        default:{
                            System.out.println("nhap gia tri sai nhap lai.");
                            break;
                        }
                    }
                    i = sc.nextInt();
                } while (i != 0);
            } catch (Exception e) {
                System.out.println( e.getMessage());
            }

    }

    public static void Addstudent() throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Add student");

        System.out.println("id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("name:");
        String name = sc.nextLine();
        System.out.println("date of birth:");
        String dateOfBith = sc.nextLine();
        System.out.println("address:");
        String address = sc.nextLine();
        System.out.println("gpa:");
        double gpa = sc.nextFloat();

        System.out.println("thong tin hoc sinh moi:");
        System.out.println("id:"+ id);
        System.out.println("name:"+ name);
        System.out.println("date:"+ dateOfBith);
        System.out.println("address:"+ address);
        System.out.println("gpa:"+ gpa);

    }
    public  static void EditStudent() throws Exception{
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id sinh vien can sưa:");
        i = sc.nextInt();
        System.out.println("Edit student");
        for (Student s: a){
            if (s.getId() == i){
                System.out.println("thong tin sinh vien:");
                System.out.println(s.getId());
                System.out.println(s.getDateOfBith());
                System.out.println(s.getAdderess());
                System.out.println(s.getGpa());

                sc.nextLine();
                System.out.println("nhap ten moi:");
                String newname = sc.nextLine();

                sc.nextLine();
                System.out.println("nhap ngay sinh moi:");
                String newdate = sc.nextLine();

                System.out.println("nhap dia chi moi:");
                String newaddress = sc.nextLine();

                System.out.println("nhap gpa moi:");
                double newgpa = sc.nextDouble();



                Student b = new Student(s.getId(),newname, newdate, newaddress, newgpa);
                a.add(b);
                System.out.println("sau chinh xua");
                System.out.println(newname);
                System.out.println(newdate);
                System.out.println(newaddress);
                System.out.println(newgpa);
            }
        }
    }
    public static void Delete()throws Exception{
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id sinh vien can xoa:");
        i = sc.nextInt();
        for (Student s : a){
            if (i == s.getId()){
                a.remove(i);
                System.out.println("sinh vien da xoa");
                return;
            }
        }
    }
    public static void Sortstudentbtgpa()throws Exception{
        int n = a.size();
        for (int i =0;i<n-1;i++){
            for (int j = 0; j < n-i-1; j++){
                if (a.get(j).getGpa() > (a.get(j + 1).getGpa())){
                    Student s = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, s);
                }
            }

        }
    }
    public static void Sortstudentbyname()throws Exception{

        int n = a.size();
        for (int i = 0; i<= n-1; i++){
            for (int j = 0; j <= n-i-1;i++){
                if (a.get(j).getName().compareTo(a.get(j+1).getName()) >0){
                    Student s = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, s);
                }
            }
        }
    }
    public static void Showstudent()throws Exception{
        for (Student s : a){
            System.out.println("id:" + s.getId());
            System.out.println("name" + s.getName());
            System.out.println("birth: "+ s.getDateOfBith());
            System.out.println("Address:" + s.getAdderess());
            System.out.println("GPA:"+ s.getGpa());
        }
    }
}

