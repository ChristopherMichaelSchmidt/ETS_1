package media;

import java.util.Comparator;

public class ShareLikeRatioDescComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        if(o1.getShares()/o2.getLikes()>o2.getShares()/o2.getLikes()){
            return 1;
        }
        else if(o1.getShares()/o2.getLikes()<o2.getShares()/o2.getLikes()){
            return -1;
        }
        return 0;

    }
}
