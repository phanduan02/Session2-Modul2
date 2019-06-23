import java.util.Scanner;

public class StudentsInClass {
    public static void main(String[] args) {
        String[] students = {"Thong", "Nghia", "Quoc", "Lam", "Viet", "Phuong", "Duong", "Duan"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten hoc vien : ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for ( int i = 0; i < students.length; i++){
            if (students[i].equals(input_name)){
                System.out.println(" Vi tri cua hoc vien " + input_name + " trong danh sach la " + (i + 1));
                isExist = true;
                break;
            }
        } if (!isExist){
            System.out.println("Hoc vien " + input_name + " khong co ten trong danh sach vi qua ngu ");
        }
    }
}
