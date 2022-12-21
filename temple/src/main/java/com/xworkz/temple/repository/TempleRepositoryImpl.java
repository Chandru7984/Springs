package com.xworkz.temple.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.temple.dto.TempleDTO;

@Component
public class TempleRepositoryImpl implements TempleRepository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(TempleDTO dto) {
		System.out.println("Calling Repository method");
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
	public Optional<List<TempleDTO>> findByGod(String god) {
		EntityManager manager = factory.createEntityManager();
		try {
		Query query = manager.createNamedQuery("findByGod");
		query.setParameter("cs", god);
		return Optional.ofNullable(query.getResultList());
		}catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return Optional.empty();
	}

}
