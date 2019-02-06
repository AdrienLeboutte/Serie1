package PackageSerie1;

public class Editeur {

    private String nom;
    private Localite reference;


    public Editeur(String nom, Localite reference)
    {
        this.nom = nom;
        this.reference = reference;
    }

    public String getNom() {
        return nom;
    }

    public Localite getReference() {
        return reference;
    }

    public String toString()
    {
        return "les editions "+ nom;
    }




}
