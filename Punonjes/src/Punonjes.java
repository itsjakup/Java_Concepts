
import java.util.Scanner;
public class Punonjes {
    private int ID;
    private String emer;
    private String mbiemer;
    private double paga;

    public Punonjes() {}

    public Punonjes(int ID, String emer, String mbiemer, double paga) {
        this.ID = ID;
        this.emer = emer;
        this.mbiemer = mbiemer;
        this.paga = paga;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public String getEmer() {
        return emer;
    }

    public void setMbiemer(String mbiemer) {
        this.mbiemer = mbiemer;
    }

    public String getMbiemer() {
        return mbiemer;
    }

    public void setPaga(double paga) {
        this.paga = paga;
    }

    public double getPaga() {
        return paga;
    }

    public double gjejSigurimet_Shoqerore() {
        return 0.05 * paga;
    }
}