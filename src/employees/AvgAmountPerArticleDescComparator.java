package employees;

import java.util.Comparator;

public class AvgAmountPerArticleDescComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        if(o1.getTotalAmount()/ o1.getNumArticles()>o2.getTotalAmount()/ o1.getNumArticles()){
            return -1;
        }
        else if(o1.getTotalAmount()/ o1.getNumArticles()<o2.getTotalAmount()/ o1.getTotalItems()){
            return 1;
        }
        return 0;
    }
}
