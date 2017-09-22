package model;

import java.util.ArrayList;
import java.util.List;

import view.IView;

public class Model extends ModelAdapter {
	
	private String titre;
	private List<Item> liste = new ArrayList<Item>();
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public List<Item> getListe() {
		return liste;
	}
	public void setListe(List<Item> liste) {
		this.liste = liste;
	}
	
	public void addItem(Item item) {
		getListe().add(item);
	}
	
	public void removeItem(Item item) {
		getListe().remove(item);
	}
	
}
