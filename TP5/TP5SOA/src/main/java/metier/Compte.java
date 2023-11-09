package metier;
import java.time.LocalDate;

public class Compte {

    private int code;
    private double solde;
    private LocalDate dateCreation;

    public Compte(int code, double solde, LocalDate date) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = date;

    }

    public int getcode() {
        return this.code;
    }

    public String toString() {
        return "code :" + this.code + " solde :" + solde + " date :" + this.dateCreation + "\n";
    }

}
