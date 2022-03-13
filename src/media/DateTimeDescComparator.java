package media;

import java.util.Comparator;

public class DateTimeDescComparator implements Comparator<Posting> {

    @Override
    public int compare(Posting o1, Posting o2) {
        if(o1.getDateTime().compareTo(o2.getDateTime())>0){
            return -1;
        }
        else if(o1.getDateTime().compareTo(o2.getDateTime())<0){
            return 1;
        }
        return 0;
    }
}
