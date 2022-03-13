package employees;

import java.util.Comparator;

public class AvgAmountPerItemAscComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        if(o1.getTotalAmount()/o1.getTotalItems() > o2.getTotalAmount()/o2.getTotalItems()){
            return 1;

        }
        if(o1.getTotalAmount()/o1.getTotalItems() < o2.getTotalAmount()/o2.getTotalItems()){
            return -1;
        }
        return 0;
    }
}
