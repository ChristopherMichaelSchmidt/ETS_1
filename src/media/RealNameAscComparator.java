package media;

import java.util.Comparator;

public class RealNameAscComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        return o1.getRealName().compareTo(o2.getRealName());
    }
}
