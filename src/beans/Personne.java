package beans;

public class Personne {

    private String nom;

    public void bonjour() {
        // TODO Auto-generated method stub
        System.out.println("La personne est "+this.nom);
    }

    public Personne(String nom) {
        super();
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
