
package OOp1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList1 {
     ArrayList<Student1> studentList = new ArrayList<>();

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sach sinh vien trong");
        } else {
            for (Student1 student : studentList) {
                student.displayStudentInfo();
            }
        }
    }

    public void addStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sin vien: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            Student1 student = new Student1();
            student.enterStudentInfo();
            studentList.add(student);
        }
    }

    public Student1 findStudentById(String idToFind) {
        for (Student1 student : studentList) {
            if (student.getStudentId().equals(idToFind)) {
                return student;
            }
        }
        return null;
    }

    public boolean deleteStudentById(String idToDelete) {
        Student1 student = findStudentById(idToDelete);
        if (student != null) {
            studentList.remove(student);
            return true;
        }
        return false;
    }

    public boolean editStudentById(String idToEdit) {
        Student1 student = findStudentById(idToEdit);
        if (student != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap ten moi: ");
            student.setFullName(scanner.nextLine());
            System.out.print("Nhap nganh oc moi: ");
            student.setMajor(scanner.nextLine());
            System.out.print("Nhap GPA moi: ");
            student.setGpa(scanner.nextFloat());
            return true;
        }
        return false;
    }
    
}
