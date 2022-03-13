package media;

import java.util.Comparator;

public class LikesPerViewAscComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        if(o1.getLikes()/o1.getViews()>o2.getLikes()/o2.getViews()){
            return 1;
        }
        else if(o1.getLikes()/o1.getViews()<o2.getLikes()/o2.getViews()){
            return -1;
        }
        return 0;
    }
}
