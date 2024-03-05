package com.isimed.formation.Model;

import jakarta.persistence.*;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(length=30, nullable=false)
    String code_etudiant;
    @Column(length=30, nullable=false)
    String nom;
    @Column(length=30, nullable=false)
    String prenom;
    @Column(length=30, nullable=false)
    String classe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode_etudiant() {
        return code_etudiant;
    }

    public void setCode_etudiant(String code_etudiant) {
        this.code_etudiant = code_etudiant;
    }

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

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
