package main;

import beans.Etudiant;
import beans.Personne;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        Personne personne = new Personne("Nicolas");

        Etudiant etudiant = new Etudiant("Hugo");

        Object object = etudiant;

        System.out.println(etudiant.getClass().toString());
        System.out.println(object.getClass().toString());

        Class laClasse = object.getClass();

        System.out.println(laClasse.getCanonicalName());

        for (Method m: laClasse.getMethods() ) {
            System.out.println(m);
            for (Annotation a: m.getAnnotations()) {
                System.out.println(" - anno : " + a);
            }
        }


    }
}
