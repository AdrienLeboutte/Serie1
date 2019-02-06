package PackageSerie1;

public class Auteur {


    private static int  NB_LIVRES = 1000;
    private String prenom;
    private String nom;
    private Livre []reference ;

    public Auteur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.reference = new Livre[NB_LIVRES];
    }

    public void ajouterLivre(Livre livre)
    {
        int indice = 0;

        while((indice < NB_LIVRES )&& (reference[indice] != null))
        {
            indice++;
        }

        if(indice < NB_LIVRES || reference[indice] != null) {
            reference[indice] = livre;
        }
    }


    public int totalPagesEcrites()
    {
        int nbPagesTotal = 0;

        for(int indice = 0; indice < NB_LIVRES; indice++)
        {
            nbPagesTotal += reference[indice].totalPages();
        }

        return  nbPagesTotal;
    }

    public String listingLivres()
    {

       StringBuilder chaine = new StringBuilder();

        for (int indice  = 0;indice < NB_LIVRES; indice++)
        {
            chaine.append(reference[indice].toString());
        }

        return chaine.toString();
    }

}
