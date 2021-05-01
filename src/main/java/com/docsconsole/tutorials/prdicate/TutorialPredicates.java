package com.docsconsole.tutorials.prdicate;

import com.docsconsole.tutorials.model.Tutorial;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TutorialPredicates {

    public static Predicate<Tutorial> isAuthorGood() {
        return t -> t.getRating() > 4;
    }

    public static Predicate<Tutorial> isTutorialLengthy() {
        return t -> t.getDuration() > 5;
    }
    public static List<Tutorial> filterTutorials (List<Tutorial> tutorials,
                                                  Predicate<Tutorial> predicate)
    {
        return tutorials.stream()
                .filter( predicate )
                .collect(Collectors.<Tutorial>toList());
    }
}
