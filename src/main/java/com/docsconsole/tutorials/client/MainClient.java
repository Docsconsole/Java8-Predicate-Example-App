package com.docsconsole.tutorials.client;

import com.docsconsole.tutorials.model.Tutorial;

import java.util.ArrayList;
import java.util.List;

import static com.docsconsole.tutorials.prdicate.TutorialPredicates.*;

public class MainClient {

       public static void main(String[] args)
        {
            Tutorial tutorial1 = new Tutorial(1,"Java","James",8.3f,"Language", 4.5f);
            Tutorial tutorial2 = new Tutorial(2,"C++","Bjarne",6.3f,"Language", 3.5f);
            Tutorial tutorial3 = new Tutorial(3,"C","Dennis",4.3f,"Language", 4.6f);
            Tutorial tutorial4 = new Tutorial(4,"Python","Guido",4.3f,"Language", 3.6f);

            List<Tutorial> tutorials = new ArrayList<Tutorial>();
            tutorials.add(tutorial1);
            tutorials.add(tutorial2);
            tutorials.add(tutorial3);
            tutorials.add(tutorial4);

            System.out.println("Display popular tutorials");

            List<Tutorial> resultedTutorials = filterTutorials(tutorials, isAuthorGood());
            resultedTutorials.forEach(System.out::println);

            System.out.println("Display lengthy tutorials");

            List<Tutorial> resultedTutorials1 = filterTutorials(tutorials, isTutorialLengthy());
            resultedTutorials1.forEach(System.out::println);

        }

}
