package com.orange.topics.interfaceTopic;

import com.orange.topics.interfaceTopic.implementation.Crocodil;
import com.orange.topics.interfaceTopic.implementation.Gaina;
import com.orange.topics.interfaceTopic.interfaces.Animal;
import com.orange.topics.interfaceTopic.interfaces.Domestic;
import com.orange.topics.interfaceTopic.interfaces.Salbatic;

public class MainAnimalClass {
    // In acest topic avem :
    // mostenire -- interfetele Aerian,Terestru,Acvatic mostenesc de la Animal
    // operatorul instanceof -- care poate detecta orice mostenire, pentru Crocodil poate confirma ca este :
    // Animal, Acvatic, Terestru, Salbatic
    // Acest exemplu  nu are o utilitate foarte mare, dar ajuta sa vedem pana la ce nivel de abstractizare putem merge.
    public static void main(String args[]) {
        Animal animals[] = {new Gaina(), new Crocodil(), new Crocodil(), new Gaina()};
        for (Animal animal : animals) {
            if (animal instanceof Gaina) {
                System.out.println("gaina");
                if (animal instanceof Domestic){
                    System.out.println("gaina este domestica");
                } else {
                    System.out.println("gaina este salbatic");
                }

            } else if (animal instanceof Crocodil) {
                System.out.println("crocodil");
                if (animal instanceof Salbatic){
                    System.out.println("crocodilul este salbatic");
                } else {
                    System.out.println("crocodilul este domestica");
                }
            }
        }
    }
}
