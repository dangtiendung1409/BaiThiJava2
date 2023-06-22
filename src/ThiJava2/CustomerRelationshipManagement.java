package ThiJava2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomerRelationshipManagement {
    private static Map<String, Customer> customerMap = new HashMap<>();


        public void addNewCustomer(Scanner scanner) {
        System.out.println("Nhập thông tin khách hàng:");
        System.out.print("Tên: ");
        String name = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Điện thoại: ");
        String phone = scanner.next();

        Customer customer = new Customer(name, email, phone);
        customerMap.put(phone, customer);

        System.out.println("Thêm khách hàng thành công!\n");
    }

        public void searchCustomerByName(Scanner scanner) {
        System.out.print("Nhập tên khách hàng: ");
        String name = scanner.next();
        boolean found = false;

        for (Customer customer : customerMap.values()) {
            if (customer.getName().equalsIgnoreCase(name)) {
                System.out.println("Thông tin khách hàng:");
                System.out.println("Tên: " + customer.getName());
                System.out.println("Email: " + customer.getEmail());
                System.out.println("Điện thoại: " + customer.getPhone());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy khách hàng có tên '" + name + "'.");
        }

        System.out.println();
    }

       public void displayAllCustomers() {
        if (customerMap.isEmpty()) {
            System.out.println("Danh sách khách hàng trống.");
        } else {
            System.out.println("Danh sách khách hàng:");

            for (Customer customer : customerMap.values()) {
                System.out.println("Tên: " + customer.getName());
                System.out.println("Email: " + customer.getEmail());
                System.out.println("Điện thoại: " + customer.getPhone());
                System.out.println("--------------------");
            }
        }

        System.out.println();
    }
}
