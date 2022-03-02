package ss12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Product implements Comparable<Product>, Comparator<Product> {
    private int id;
    private String nameProduct;
    private double priceProdcut;

    ArrayList <String> addProduct = new ArrayList();
    Scanner scanner = new Scanner(System.in);

    public Product() {
    }

    public Product(int id, String nameProduct, double priceProdcut) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.priceProdcut = priceProdcut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProdcut() {
        return priceProdcut;
    }

    public void setPriceProdcut(double priceProdcut) {
        this.priceProdcut = priceProdcut;
    }



    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProdcut=" + priceProdcut +
                '}';
    }


    @Override
    public int compareTo(Product o) {
        if (this.priceProdcut > o.getPriceProdcut()) {
            return 1;
        } else if (this.priceProdcut < o.getPriceProdcut()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.priceProdcut > o2.getPriceProdcut()) {
            return -1;
        } else if (o1.priceProdcut <o2.getPriceProdcut()) {
            return 1;
        } else {
            return 0;

        }

    }
}
