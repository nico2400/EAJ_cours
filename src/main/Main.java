package main;

import beans.Etudiant;
import beans.Personne;

public class Main {

    public static void main(String[] args) {

        Personne personne = new Personne("Nicolas");

        Etudiant etudiant = new Etudiant("Hugo");

        Object object = etudiant;

        System.out.println(etudiant.getClass().toString());
        System.out.println(object.getClass().toString());

    }
}
