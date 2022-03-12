package employees;

import java.util.Comparator;

public class CartComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        return o1.getUserNAme().compareTo(o2.getUserNAme());
    }
}
