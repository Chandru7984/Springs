package com.xworkz.patient.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.patient.dto.PatientDTO;

@Component
public class PatientRepositoryImpl implements PatientRepository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(PatientDTO dto) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(dto);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}
		return true;
	}

	@Override
	public Optional<List<PatientDTO>> findByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("pt", name);
			return Optional.ofNullable(query.getResultList());
		}catch (PersistenceException e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}

	@Override
	public Optional<List<PatientDTO>> findAgeGreaterThan(int age) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAgeGreaterThan");
			query.setParameter("Age", age);
			return Optional.ofNullable(query.getResultList());
		}catch (PersistenceException e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}

	@Override
	public List<PatientDTO> findByEmail(String email) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByEmail");
			query.setParameter("em", email);
			List resultList = query.getResultList();
			if(resultList.isEmpty()) {
				System.out.println("Result is null");
				return null;
			}else if(!resultList.isEmpty()) {
				return resultList;
			}
		}finally {
			manager.close();
		}
		return null;
	}

	@Override
	public List<PatientDTO> findByMobile(long mobileNo) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByMobile");
			query.setParameter("mb", mobileNo);
			List resultList = query.getResultList();
			if(resultList.isEmpty()) {
				System.out.println("Result is null");
				return null;
			}else if(!resultList.isEmpty()) {
				return resultList;
			}
		}finally {
			manager.close();
		}
		return null;
	}

	
}
