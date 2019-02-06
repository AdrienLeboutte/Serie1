package PackageSerie1;

public class Ouvrage {


    private String titre;
    private int  anneeEdition;
    private Editeur reference;


    public Ouvrage(String titre, int anneeEdition, Editeur reference) {
        this.titre = titre;
        this.anneeEdition = anneeEdition;
        this.reference = reference;
    }

    public String getTitre() {
        return titre;
    }

    public Editeur getReference() {
        return reference;
    }

    public String categorie()
    {
        return "l'ouvrage";
    }

    public int getAnneeEdition() {
        return anneeEdition;
    }

    @Override
    public String toString()
    {
        return categorie() + "édité en " + anneeEdition +" par "+ reference.toString();
    }

}
