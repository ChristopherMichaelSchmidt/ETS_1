package media;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class PostingDemo {
    public static void main(String[] args) {

        ArrayList<Posting> liste = new ArrayList<>();
        Posting p = new Posting(4, "harald", "meokee", LocalDateTime.of(2021, 3, 10, 18, 30 ,15),10, 4, 2000);
        Posting p1 = new Posting(3, "vera", "meokee", LocalDateTime.of(2021, 3, 10, 18, 30 ,15),10, 4, 2000);
        Posting p2 = new Posting(2, "elma", "meokee", LocalDateTime.of(2021, 3, 10, 18, 30 ,15),10, 4, 2000);
        Posting p3 = new Posting(1, "chris", "meokee", LocalDateTime.of(2021, 3, 10, 18, 30 ,15),10, 4, 2000);
        Posting p4 = new Posting(5, "wolfang", "meokee", LocalDateTime.of(2021, 3, 10, 18, 30 ,15),10, 4, 2000);
        Posting p5= new Posting(6, "josi", "meokee", LocalDateTime.of(2021, 3, 10, 18, 30 ,15),10, 4, 2000);
        Posting p6 = new Posting(7, "gerald", "meokee", LocalDateTime.of(2021, 3, 10, 18, 30 ,15),10, 4, 2000);
        Posting p7 = new Posting(8, "karin", "meokee", LocalDateTime.of(2021, 3, 10, 18, 30 ,15),10, 4, 2000);
        Posting p8 = new Posting(9, "helmut", "meokee", LocalDateTime.of(2021, 3, 10, 18, 30 ,15),10, 4, 2000);
        Posting p9 = new Posting(10, "ingrid", "meokee", LocalDateTime.of(2021, 3, 10, 18, 30 ,15),10, 4, 2000);
        Posting p10 = new Posting(11, "petra", "meokee", LocalDateTime.of(2021, 3, 10, 18, 30 ,15),10, 4, 2000);

        liste.add(p);
        liste.add(p1);
        liste.add(p2);
        liste.add(p3);
        liste.add(p4);
        liste.add(p5);
        liste.add(p6);
        liste.add(p7);
        liste.add(p8);
        liste.add(p9);
        liste.add(p10);

        System.out.println(liste);
        Collections.sort(liste);
        System.out.println(liste);



    }
}
