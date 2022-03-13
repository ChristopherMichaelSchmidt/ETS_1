package employees;

import java.util.Comparator;

public class UsernameDescTotalAmountAscComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        if(o1.getUserNAme().equals(o2.getUserNAme())){
            return Double.compare(o1.getTotalAmount(), o2.getTotalAmount());
        }
        else return o2.getUserNAme().compareTo(o1.getUserNAme());
    }
}
