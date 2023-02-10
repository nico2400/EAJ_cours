package beans;

import anno.Apsio;

@SuppressWarnings("serial")
@Apsio(value = "classe", annee = 2023)
public class Etudiant extends Personne {

    @SuppressWarnings("unused")
    private String truc;
    @Apsio(value="attribut")
    private int note;

    @SuppressWarnings("unused")
    public Etudiant(@Apsio String nom) {
        super(nom);
    }

    @Override
    @Apsio(value="methode", annee = 2022)
    public void bonjour() {
        System.out.println("L'Ã©tudiant est " + this.getNom());
    }

}