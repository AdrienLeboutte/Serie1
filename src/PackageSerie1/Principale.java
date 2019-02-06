package PackageSerie1;

public class Principale {


    public static void main(String[] args) {

        Localite londre  = new Localite("Londre",300000);

        Editeur dupuis = new Editeur("Dupuis",londre);

        OuvrageScientifique ouvrage = new OuvrageScientifique("Harry Potter", 2001, dupuis,5,4,600,10);

        Auteur auteur = new Auteur("Adrien","Leboutte");


        auteur.ajouterLivre(ouvrage);

        System.out.println(ouvrage);

        ouvrage.setNbPagePreface(10);

        System.out.println("------------------------------------------");

        System.out.println(ouvrage.getReference().getNom());

        System.out.println(ouvrage.getReference().getReference().getLibelle());
    }

}
