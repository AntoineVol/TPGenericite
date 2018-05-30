package service;

import java.util.List;
import java.util.Vector;

public abstract class ServiceGenericImpl<T> implements IGenericService<T> {
	private List< T> listT = new Vector<T>();
	@Override
	public void ajouter(T t) {
		listT.add(t);
		
	}

	@Override
	public void supprimer(T t) {
		listT.remove(t);
		
	}

	@Override
	public List<T> findAll() {
		return listT;
	}


	@Override
	public T rechercher(Integer id) {
		return listT.get(id);
	}
	public void affich(List<T> liste) {
		for(T t : liste) {
			System.out.println(t);
		}
	}

}
