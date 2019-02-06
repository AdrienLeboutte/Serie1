package PackageSerie1;

public class Localite {

    private String libelle;
    private double nbHabitant;


    public Localite (String libelle, double nHabitant)
    {
        this.libelle = libelle;
        this.nbHabitant = nbHabitant;

    }

    public String getLibelle() {
        return libelle;
    }
}
