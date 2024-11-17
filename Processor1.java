package OOp1;

import java.util.Scanner;

public class Processor1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList1 studentList = new StudentList1();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them thong tin sinh vien");
            System.out.println("2. Xem thong tin sinh vien");
            System.out.println("3. Tim sinh vien bang ID");
            System.out.println("4. Xoa sinh vien bang ID");
            System.out.println("5. Thay doi thong tin sinh vien theo ID");
            System.out.println("0. Thoat");
            System.out.println("  Nhap su lua chon cua ban: ");
            System.out.println("");
            System.out.println("");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    studentList.addStudents();
                    break;
                case 2:
                    studentList.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Nhap ID sinh vien: ");
                    String idToFind = scanner.nextLine();
                    Student1 foundStudent = studentList.findStudentById(idToFind);
                    if (foundStudent != null) {
                        foundStudent.displayStudentInfo();
                    } else {
                        System.out.println("Khong tim thay sinh vien!");
                    }
                    break;
                case 4:
                    System.out.print("Nhap ID sinh vien can xoa: ");
                    String idToDelete = scanner.nextLine();
                    if (studentList.deleteStudentById(idToDelete)) {
                        System.out.println("Xoa xong!");
                    } else {
                        System.out.println("Khong tim thay sinh vien!");
                    }
                    break;
                case 5:
                    System.out.print("Nhap ID sinh vien can thay doi thong tin: ");
                    String idToEdit = scanner.nextLine();
                    if (studentList.editStudentById(idToEdit)) {
                        System.out.println("Chinh sua xong!");
                    } else {
                        System.out.println("Khong tim thay sinh vien!");
                    }
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }

}
