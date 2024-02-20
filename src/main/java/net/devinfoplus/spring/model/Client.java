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
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Fonction == null) ? 0 : Fonction.hashCode());
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((Nom == null) ? 0 : Nom.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Salaire);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	
	@Override
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if(Fonction == null) {
			if(other.Fonction != null)
				return false;
		} else if(!Fonction.equals(other.Fonction))
			return false;
		if(Id == null) {
			if(other.Id != null)
				return false;
		}else if(!Id.equals(other.Id))
			return false;
		if(Nom == null) {
			if(other.Nom != null)
				return false;
		}else if(!Nom.equals(other.Nom))
			return false;
		if(Double.doubleToLongBits(Salaire) != Double.doubleToLongBits(other.Salaire))
			return false;
		return true;
	}

}

