package service;

import java.util.List;

public abstract interface IGenericService<T> {
	public void ajouter(T t);
	public void supprimer(T t);
	public List<T> findAll();
	public abstract void modifier(T t);
	public T rechercher(Integer id);
	

}
