package ss12_java_collection_framework.bai_tap;

import java.util.Comparator;

public class ProductComparator implements Comparator <Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPriceProdcut() - o1.getPriceProdcut();
    }
}
