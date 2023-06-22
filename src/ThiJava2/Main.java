package ThiJava2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerRelationshipManagement crm = new CustomerRelationshipManagement();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("------- Quản lý quan hệ khách hàng -------");
            System.out.println("1. Thêm khách hàng mới");
            System.out.println("2. Tìm theo tên");
            System.out.println("3. Hiển thị tất cả");
            System.out.println("4. Thoát");
            System.out.print("Chọn một tuỳ chọn: ");
            choice = scanner.nextInt();
            scanner. nextLine();

            switch (choice) {
                case 1:
                    crm.addNewCustomer(scanner);
                    break;
                case 2:
                    crm.searchCustomerByName(scanner);
                    break;
                case 3:
                    crm.displayAllCustomers();
                    break;
                case 4:
                    System.out.println("cảm ơn đã sử dụng chương trình");
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ , vui lòng chọn ");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}



