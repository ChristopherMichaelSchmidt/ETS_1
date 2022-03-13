package employees;

import java.util.Comparator;

public class ArticlesDescItemsAscComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        if(Integer.compare(o1.getNumArticles(), o2.getNumArticles())==0){
            return Integer.compare(o1.getTotalItems(), o2.getTotalItems());
        }
        else return Integer.compare(o2.getNumArticles(), o1.getNumArticles());
    }
}
