package com.example.a533.examenpratique2;

public class jobOffeeModel {

    public String titrePoste;
    public String Description;
    public int slaire;

    public jobOffeeModel(String titrePoste, String description, int slaire) {
        this.titrePoste = titrePoste;
        Description = description;
        this.slaire = slaire;
    }

    public void joboffeeModel(){
        this.titrePoste = "";
        Description = "";
        this.slaire = 0;
    }


    public String getTitrePoste() {
        return titrePoste;
    }

    public String getDescription() {
        return Description;
    }

    public int getSlaire() {
        return slaire;
    }

    public void setTitrePoste(String titrePoste) {
        this.titrePoste = titrePoste;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setSlaire(int slaire) {
        this.slaire = slaire;
    }
}
