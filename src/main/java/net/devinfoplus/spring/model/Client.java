package net.devinfoplus.spring.model;

public class Client {
	private String Id;
	private String Nom;
	private String Fonction;
	private double Salaire;
	
	public Client() {
		
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getFonction() {
		return Fonction;
	}

	public void setFonction(String fonction) {
		Fonction = fonction;
	}

	public double getSalaire() {
		return Salaire;
	}

	public void setSalaire(double salaire) {
		Salaire = salaire;
	}

	public Client(String nom, String fonction, double salaire) {
		super();
		Nom = nom;
		Fonction = fonction;
		Salaire = salaire;
	}
	
	

	
	


}

