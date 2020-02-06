package donnees;

import java.util.Collection;

public interface IDao<T> {
	public boolean create(T o);
	public boolean delete(T o);
	public boolean update(T o);
	public T findById(int id);
	public Collection<T> findAll();
	public String toString();

}
