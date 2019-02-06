package PackageSerie1;

public class OuvrageScientifique extends  Livre {

    private int nbPageAnnexe;

    public OuvrageScientifique(String titre, int anneeEdition, Editeur reference, int nbPageTableMatière, int nbPagePreface, int contenuLivre, int nbPageAnnexe) {
        super(titre, anneeEdition, reference, nbPageTableMatière, nbPagePreface, contenuLivre);
        this.nbPageAnnexe = nbPageAnnexe;
    }


    @Override
    public int totalPages() {
        return super.totalPages() + nbPageAnnexe ;
    }

    @Override
    public String categorie() {
        return "l'ouvrage scientifique ";
    }






}
