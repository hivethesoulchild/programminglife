package collegecourse;

/**
 *
 * @author casayr
 */

import java.util.Scanner;

public class CollegeCourse {
    private String department;
    private int coursenumber;
    private int units;
    private int fee;

    public CollegeCourse(String department, int courseNum, int credits) {
        this.department = department;
        this.coursenumber = courseNum;
        this.units = credits;
    }

    public int getFee() {
        this.fee = 120 * units;
        return fee;
    }
    
    public void display(){
        System.out.println("Department: " + department);
        System.out.println("Course Number: " + coursenumber);
        System.out.println("Credits: " + units);
        System.out.println("Course Fee: " + getFee());
    }
}

class LabCourse extends CollegeCourse{
    private int fee;

    public LabCourse(String department, int cnum, int credits) {
        super(department, cnum, credits);
        this.fee = (120 + 50);
    }
    
    public void display(){
        super.display();
        System.out.println("Overall Fee: " + (getFee() + 50));
    }
}

class UseCourse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter course,course number, course credits: ");
        String cor = sc.nextLine();
        int num = sc.nextInt();
        int cred = sc.nextInt();
        cor.toUpperCase();
        
        switch(cor){
            case "BIO":
            case "CHM":
            case "CIS":
            case "PHY":
                LabCourse course = new LabCourse(cor, num, cred);
                course.display();
                break;
            default:
                CollegeCourse dept = new CollegeCourse(cor, num, cred);
                dept.display();         
        }
    }
}

