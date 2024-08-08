package cascadee13.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import cascadee13.dto.AadharCard;
import cascadee13.dto.Person;

public class PersonAadharCont {
public static void main(String[] args) {
	
	AadharCard aadharCard=new AadharCard();
	aadharCard.setId(103);
	aadharCard.setName("abhi");
	aadharCard.setAge(19);
	
	Person person=new Person();
	person.setId(3);
	person.setName("ABHI");
	person.setAddress("Bangalore");
	
	person.setAadharCard(aadharCard);
	
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Person dbPerson=entityManager.find(Person.class, 1);
	entityTransaction.begin();
	
	entityManager.remove(dbPerson);
	
	
	entityTransaction.commit();
	
	
	
	
	
	
	
	
	
	
}
}
