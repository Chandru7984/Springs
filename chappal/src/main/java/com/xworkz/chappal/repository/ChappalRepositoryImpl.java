package com.xworkz.chappal.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.chappal.dto.ChappalDTO;

@Component
public class ChappalRepositoryImpl implements ChappalRepository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(ChappalDTO dto) {
		System.out.println("Repository method");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			createEntityManager.persist(dto);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			createEntityManager.close();
		}
		return true;
	}

	@Override
	public Optional<List<ChappalDTO>> findByBrand(String brand) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByBrand");
			query.setParameter("cp", brand);
			return Optional.ofNullable(query.getResultList());
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return Optional.empty();
	}

}
