package ss12_java_collection_framework.bai_tap;


import java.util.Comparator;

public class Product implements Comparable <Product>{
    private int id;
    private String nameProduct;
    private int priceProdcut;


    public Product() {
    }

    public Product(int id, String nameProduct, int priceProdcut) {
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

    public int getPriceProdcut() {
        return priceProdcut;
    }

    public void setPriceProdcut(int priceProdcut) {
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
        return this.getPriceProdcut() - o.getPriceProdcut();
    }

}
