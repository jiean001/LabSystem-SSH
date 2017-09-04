package org.labsystem.domain.dao.iface;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, PK extends Serializable> {
	public T select(T entity, PK id);

	public Integer insert(T entity);

	public boolean update(T entity);

	public boolean delete(T entity);

	public List<T> findAll();
}
