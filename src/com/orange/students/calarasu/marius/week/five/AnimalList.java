package com.orange.students.calarasu.marius.week.five;

import com.orange.students.calarasu.marius.week.five.inplementation.Crocodil;
import com.orange.students.calarasu.marius.week.five.inplementation.Gaina;
import com.orange.students.calarasu.marius.week.five.inplementation.Porc;
import com.orange.students.calarasu.marius.week.five.inplementation.Vultur;
import com.orange.students.calarasu.marius.week.five.interfaces.Animal;

import java.util.*;

public class AnimalList {

    public static ArrayList getAnimal() {

        Porc porkyPig = new Porc();
        Gaina chick = new Gaina();
        Vultur hawk = new Vultur();
        Crocodil croco = new Crocodil();
        ArrayList animalsList = new ArrayList();

        animalsList.add(porkyPig);
        animalsList.add(chick);
        animalsList.add(hawk);
        animalsList.add(croco);

        return animalsList;
    }

    public static void iterateWithForLoop(Iterable iterable) {
        for (Object element :
                iterable) {
            System.out.println(element);
        }
        System.out.println();
    }
}
