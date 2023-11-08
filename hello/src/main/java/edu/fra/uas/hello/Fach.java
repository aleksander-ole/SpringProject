package edu.fra.uas.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Fach {
    private String Name;
    private int Gewichtung = 1;
    private double Note;

    public Fach(String name, int gewichtung, double note) {
        Name = name;
        Gewichtung = gewichtung;
        Note = note;
    }

    public static double durchschnittBerechnen(Fach[] FächerListe){
        double durchschnitt = 0;
        for (int i = 0;i < FächerListe.length;i++) {
            durchschnitt += FächerListe[i].getGewichtung() * FächerListe[i].getNote();
        }
        return (durchschnitt/FächerListe.length);
    }

    public String getName() {
        return Name;
    }

    public int getGewichtung() {
        return Gewichtung;
    }

    public double getNote() {
        return Note;
    }
    
}
