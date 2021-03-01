package com.orange.topics.scannerPractice;

import java.util.Scanner;

public class InsertFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShowMessagesUtils.showMenu();

        ShowMessagesUtils.showMessage("Programerul va functiona doar pt 2 elemente ");
        ShowMessagesUtils.showMessage("Alege o operatie de executat : ");
        int index = scanner.nextInt();

        if (index > ShowMessagesUtils.myMenu().size()) {
            ShowMessagesUtils.showMessage("Ai ales o operatie inexistenta");
            return;
        } else {
            ShowMessagesUtils.showMessage("Ai ales operatia de " + ShowMessagesUtils.myMenu().get(index - 1));
        }

        ShowMessagesUtils.showMessage("Insereaza primul termen");
        double primulElement = scanner.nextDouble();

        ShowMessagesUtils.showMessage("Insereaza alDoilea termen");
        double alDoileaElement = scanner.nextDouble();

        double rezultat = 0;
        switch (index) {
            case 1:
                rezultat = MathUtils.adunare(primulElement, alDoileaElement);
                ShowMessagesUtils.showMessageForOperation("adunare", rezultat);
                break;
            case 2:
                // scadere
                ShowMessagesUtils.showMessageForOperation("scadere", rezultat);
                return;
            //break;
            case 3:
                // inmultire
                ShowMessagesUtils.showMessageForOperation("inmultire", rezultat);
                return;
            //break;
            case 4:
                rezultat = MathUtils.impartire(primulElement, alDoileaElement);
                ShowMessagesUtils.showMessageForOperation("impartire", rezultat);
                break;
        }
    }


}
