
//Këtu është një implementim i klasës `Zgjedhje` dhe `ZgjedhjeTest`
// në Java sipas specifikimeve të dhëna:

import java.util.ArrayList;
import java.util.Scanner;

public class Zgjedhje {
    private int ID;
    private String emri;
    private String mbiemri;
    private int numriVotave;

    // Konstruktori pa parametra
    public Zgjedhje() {}

    // Konstruktori me parametra
    public Zgjedhje(int ID, String emri, String mbiemri, int numriVotave) {
        this.ID = ID;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.numriVotave = numriVotave;
    }

    // Metodat set dhe get për variablat instance
    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return this.ID;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getEmri() {
        return this.emri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public String getMbiemri() {
        return this.mbiemri;
    }

    public void setNumriVotave(int numriVotave) {
        this.numriVotave = numriVotave;
    }

    public int getNumriVotave() {
        return this.numriVotave;
    }

    // Metoda për gjetjen e fituesit
    public static Zgjedhje gjejFituesin(ArrayList<Zgjedhje> zgjedhjet) {
        Zgjedhje fituesi = zgjedhjet.get(0);
        for (Zgjedhje zgjedhje : zgjedhjet) {
            if (zgjedhje.getNumriVotave() > fituesi.getNumriVotave()) {
                fituesi = zgjedhje;
            }
        }
        return fituesi;
    }
}