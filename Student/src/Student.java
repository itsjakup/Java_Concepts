

//parameters. nonparamters, set and get method used
/*import java.lang.String;

public class Student{
    public String emri;
    public String mbiemri;
    public int mosha;
    public String lendet;

    public Student() {
    }

    public Student(String emri, String mbiemri, int mosha, String lendet) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.mosha = mosha;
        this.lendet = lendet;
    }

    public String getEmri() {
        return this.emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return this.mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public int getMosha() {
        return this.mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public String getLendet() {
        return this.lendet;
    }

    public void setLendet(String lendet) {
        this.lendet = lendet;
    }
    public void setMosha() {
        if (mosha < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.mosha = mosha;
    }
}*/



public class Student {
    public String emri;
    public String mbiemri;
    public int id;
    public int nota;

    public Student(String emri, String mbiemri) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.id = id;
        this.nota = nota;
    }

    public Student(String emri, String mbiemri, int id, int nota) {
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri() {
        this.emri = emri;
    }

    public int getId() {
        return id;
    }

    public int setNota() {
        this.nota = nota;
        return nota;
    }

    public String toString(){
        return " emri :'" + emri + '\'' + ", mbiemri :" + mbiemri + '\'' + ", id: " + id + '\'' +
                ", nota: " + nota;
    };

    public String getMbiemri() {
        return mbiemri;
    }

    public int getNota() {
        return nota;
    }

    public int setId() {
        return id;
    }

    public String setMbiemri() {
        return mbiemri;
    }
}