package model;

import java.util.ArrayList;
import java.util.List;

import view.Observer;

public class ModelAdapter implements IModel {

	private List<Observer> listObservers = new ArrayList<Observer>();
	
	public void removeObserver(Observer o) {
		listObservers.remove(o);
	}
	
	public void addObserver(Observer o) {
		listObservers.add(o);
	}
	
	
}
