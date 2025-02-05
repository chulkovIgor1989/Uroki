package org.example;
import org.example.Sotrudnik;
public class Main {
    public static void main(String[] args) {



        Sotrudnik [] persArray = new Sotrudnik[5];

        persArray[0] = new Sotrudnik("Ivanov Ivan Fedorovich", "Engineer", "iviivan@mail.com", "8923452", 30000, 35);
        persArray[1] = new Sotrudnik("Petr Sergeev Matveev", "QAEngineer", "dghk@mail.com", "89435436474", 40000, 33);
        persArray[2] = new Sotrudnik("Chulkov Bogdan Igorevich", "1C", "hjsdba@mail.com", "8927630", 35000, 34);
        persArray[3] = new Sotrudnik("Luchiy Dog Namevich", "DevOps", "ghlagh@mailbox.com", "8964527854", 32000, 34);
        persArray[4] = new Sotrudnik("Prosto Maria Vadimovna", "Progger", "jhuihio@mailbox.com", "893455543532", 38000, 19);

        for (Sotrudnik employee : persArray) {
            employee.SotrudnikDemon();
            System.out.println("\n");
        }
    }
}


