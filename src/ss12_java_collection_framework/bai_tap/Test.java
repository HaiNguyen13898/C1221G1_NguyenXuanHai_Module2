package ss12_java_collection_framework.bai_tap;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        do {
            System.out.println("--------MENU---------");
            System.out.println("1. Thêm sản phẩm: ");
            System.out.println("2. Sửa sản phảm: ");
            System.out.println("3. Xoá sản phẩm: ");
            System.out.println("4. Hiển thị sản phẩm: ");
            System.out.println("5. Tìm kiếm sản phẩm: ");
            System.out.println("6. Sắp xếp sản phẩm tăng dần: ");
            System.out.println("7. Sắp xếp sản phẩm giảm dần: ");
            System.out.println("0. Exit: ");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Vui lòng nhập lựa chọn của bạn");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    productManager.addNewProduct();
                    break;
                case 2:
                    productManager.editProduct();
                    break;
                case 3:
                    productManager.deleteProduct();
                    break;
                case 4:
                    productManager.displayProduct();
                    break;
                case 5:
                    productManager.searchProduct();
                    break;
                case 6:
                    productManager.increaseProduct();
                    break;
                case 7:
                    productManager.decreaseProduct();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
