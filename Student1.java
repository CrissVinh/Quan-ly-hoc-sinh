
package OOp1;

import java.util.Date;
import java.util.Scanner;

public class Student1 {
     String studentId;
     String fullName;
     Date dateOfBirth;
     String major;
     float gpa;

    public void enterStudentInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        studentId = scanner.nextLine();
        System.out.print("Nhap ten: ");
        fullName = scanner.nextLine();
        System.out.print("Nhap ngay thang nam sinh (dd-mm-yy) ");
        String dob = scanner.nextLine();
        System.out.print("Nhap nganh hoc: ");
        major = scanner.nextLine();
        System.out.print("Nhap GPA: ");
        gpa = scanner.nextFloat();

        try {
            dateOfBirth = new java.text.SimpleDateFormat("dd-MM-yyyy").parse(dob);
        } catch (Exception e) {
            System.out.println("Ngay thang nam sinh khong hop le!");
        }
    }

    public void displayStudentInfo() {
        System.out.println("ID: " + studentId + ", Ten: " + fullName + ", Ngay thang nam sinh: " +
                new java.text.SimpleDateFormat("dd-MM-yyyy").format(dateOfBirth) +
                ", Nganh hoc: " + major + ", GPA: " + gpa);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    
}
