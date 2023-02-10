package beans;

import anno.Apsio;

@Apsio(value = "classe", annee = 2023)
public class Etudiant extends Personne {

    @SuppressWarnings("unused")
    private String truc;
    @Apsio(value="attribut")
    private int note;

    @Apsio(annee = 2023)
    public Etudiant(@Apsio String nom) {
        super(nom);
    }

    @Override
    @Apsio(value="methode", annee = 2022)
    public void bonjour() {
        System.out.println("L'étudiant est " + this.getNom());
    }

    public void bonsoir(){
        System.out.println("Bonsoir");
    }

}
