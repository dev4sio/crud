package crud;

public class Utilisateur {
    String ut_nom,ut_prenom,ut_pseudo,ut_mail,ut_mp,ut_phrase;
    public Utilisateur(String ut_nom,String ut_prenom,String ut_pseudo,String ut_mail,String ut_mp,String ut_phrase){
        this.ut_nom = ut_nom;
        this.ut_prenom = ut_prenom;
        this.ut_pseudo = ut_pseudo;
	this.ut_mail = ut_mail;
        this.ut_mp = ut_mp;
        this.ut_phrase = ut_phrase;
    }
    
    //getters
    public String getPrenom(){
        return this.ut_prenom;
    }
    public String getNom(){
        return this.ut_nom;
    }
    public String getPseudo(){
        return this.ut_pseudo;
    }
    public String getMail(){
        return this.ut_mail;
    }
    public String getMP(){
        return this.ut_mp;
    }
    public String getPhrase(){
        return this.ut_phrase;
    }
    public void setPrenom(String ut_prenom){
        this.ut_prenom = ut_prenom;
    }
    public void setNom(String ut_nom){
        this.ut_nom = ut_nom;
    }
    public void setPseudo(String ut_pseudo){
        this.ut_pseudo = ut_pseudo;
    }
    public void setMail(String ut_mail){
        this.ut_mail = ut_mail;
    }
    public void setMP(String ut_mp){
        this.ut_mp = ut_mp;
    }
    public void setPhrase(String ut_phrase){
        this.ut_phrase = ut_phrase;
    }
}