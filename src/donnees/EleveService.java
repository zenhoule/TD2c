package donnees;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import metier.Eleve;

public class EleveService implements IDao<Eleve> {
	
	Map<Integer,Eleve> map = new HashMap<Integer,Eleve>();

	public EleveService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Eleve o) {
		// TODO Auto-generated method stub
		map.put(o.getId(),o);
		return true;
	}

	@Override
	public boolean delete(Eleve o) {
		// TODO Auto-generated method stub
		map.remove(o.getId(), o);
		return true;
	}

	@Override
	public boolean update(Eleve o) {
		// TODO Auto-generated method stub
		map.replace(o.getId(), o);
		return true;
	}

	@Override
	public Eleve findById(int id) {
		// TODO Auto-generated method stub
		return map.get(id);
	}

	@Override
	public Collection<Eleve> findAll() {
		// TODO Auto-generated method stub
		return map.values();
	}

}
