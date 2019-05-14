package com.ormexample.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.ormexample.entities.AuthorsEntity;
import com.ormexample.utils.HibernateUtil;

public class AuthorRepository {

	public void save(AuthorsEntity authorEntity) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(authorEntity);
		session.getTransaction().commit();
		session.close();
	}

	public void update(AuthorsEntity authorEntity) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(authorEntity);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(AuthorsEntity authorEntity) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(authorEntity);
		session.getTransaction().commit();
		session.close();
	}

	public AuthorsEntity getById(Integer id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		Query query = session.createQuery("from AuthorsEntity a where a.authorId = :author_id");
		query.setParameter("author_id", id);
		AuthorsEntity authorEntity = (AuthorsEntity) query.getSingleResult();

		session.getTransaction().commit();
		session.close();
		return authorEntity;
	}

	public List<AuthorsEntity> getByEmail(String authorEmail) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		Query query = session.createQuery("from AuthorsEntity a where a.authorEmail = :author_email");
		query.setParameter("author_email", authorEmail);
		List<AuthorsEntity> authorEntityList = query.getResultList();

		session.getTransaction().commit();
		session.close();
		return authorEntityList;
	}

	public List<AuthorsEntity> getAll() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();

		Query query = session.createQuery("from AuthorsEntity");
		List<AuthorsEntity> authorEntityList = query.getResultList();

		session.getTransaction().commit();
		session.close();
		return authorEntityList;
	}

}