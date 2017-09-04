package org.labsystem.domain.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.labsystem.domain.dao.iface.GenericDao;
import org.springframework.stereotype.Repository;

@Repository("GenericDao")
public class GenericDaoImpl<T, PK extends Serializable> implements GenericDao<T, PK> {
	@Resource
	private SessionFactory sessionFactory;
	private Session session;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		this.session = sessionFactory.getCurrentSession();
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T select(T entity, PK id) {
		return getSession().get((Class<T>) entity, id);
	}

	@Override
	public Integer insert(T entity) {
		return (Integer) getSession().save(entity);
	}

	@Override
	public boolean update(T entity) {
		try {
			getSession().update(entity);
		} catch (HibernateException e) {
			return false;
		}
		return true;
	}

	@Override
	public boolean delete(T entity) {
		try {
			getSession().delete(entity);
		} catch (HibernateException e) {
			return false;
		}
		return true;
	}

	@Override
	public List<T> findAll() {
		return null;
	}
}
