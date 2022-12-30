package com.xworkz.criminal.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.criminal.dto.CriminalDTO;

@Component
public class CriminalRepositoryImpl implements CriminalRepository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(CriminalDTO dto) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(dto);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return true;
	}

	@Override
	public Optional<List<CriminalDTO>> findByName(String name,String jailName) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nm", name);
			query.setParameter("jl", jailName);
			return Optional.ofNullable(query.getResultList());
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}

//	@Override
//	public Optional<List<CriminalDTO>> findByJailName(String jailName) {
//		EntityManager manager = factory.createEntityManager();
//		try {
//			Query query = manager.createNamedQuery("findByJailName");
//			query.setParameter("jl", jailName);
//			return Optional.ofNullable(query.getResultList());
//		} catch (PersistenceException e) {
//			e.printStackTrace();
//		}
//		return Optional.empty();
//	}

}
