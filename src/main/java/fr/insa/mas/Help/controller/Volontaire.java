package fr.insa.mas.Help.controller;



public class Volontaire {
    private String nom;
    private String prenom;
    private boolean aAntecedentsJudiciaires;
    private int age;

    public Volontaire(String nom, String prenom, boolean aAntecedentsJudiciaires, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.aAntecedentsJudiciaires = aAntecedentsJudiciaires;
        this.age = age;
    }

    // Getters and Setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public boolean isaAntecedentsJudiciaires() {
        return aAntecedentsJudiciaires;
    }

    public void setaAntecedentsJudiciaires(boolean aAntecedentsJudiciaires) {
        this.aAntecedentsJudiciaires = aAntecedentsJudiciaires;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

