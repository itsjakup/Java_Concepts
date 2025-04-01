
import java.util.ArrayList;
public class Punonjes {
    public int id;
    public String emri;
    public String mbiemri;
    public int mosha;
    public int paga;

    //konstruktori pa parametra
    public Punonjes() {
    }

    //konstruktori me parametra
    public Punonjes(int id, String emri, String mbiemri, int mosha, int paga) {
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.mosha = mosha;
        this.paga = paga;

    }
    //set dhe get , me dhe pa parametra

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getEmri() {
        return emri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public int getMosha() {
        return mosha;
    }

    public void setPaga(int paga) {
        this.paga = paga;
    }

    public int getPaga() {
        return paga;
    }

    //metoda ndihmese per gjetjen e pensionisteve
    public static Punonjes gjejPensionistet(ArrayList<Punonjes> punonjesit) {
        Punonjes pensionisti = punonjesit(0);
        for (Punonjes punonjes : punonjesit){
            if (punonjes.getMosha() > 65){
                pensionisti = punonjes;
            }
        }
return pensionisti;
    }

    private static Punonjes punonjesit(int i) {
        return null;
    }
}
