package PackageSerie1;

public class Livre extends Ouvrage implements Publication {

    private int nbPageTableMatière;
    private int nbPagePreface;
    private int contenuLivre;


    public Livre(String titre, int anneeEdition, Editeur reference, int nbPageTableMatière, int nbPagePreface, int contenuLivre) {
        super(titre, anneeEdition, reference);
        this.nbPageTableMatière = nbPageTableMatière;
        this.nbPagePreface = nbPagePreface;
        this.contenuLivre = contenuLivre;
    }

    public void setNbPagePreface(int nbPagePreface) {
        this.nbPagePreface = nbPagePreface;
    }


    @Override
    public int totalPages() {
        return nbPagePreface + nbPagePreface + contenuLivre;
    }


    @Override
    public String categorie() {
        return "le livre ";
    }


    @Override
    public String toString() {
        return super.toString() + "\n compte " +totalPages() + " pages et est intitulé " + getTitre() ;
    }




}


