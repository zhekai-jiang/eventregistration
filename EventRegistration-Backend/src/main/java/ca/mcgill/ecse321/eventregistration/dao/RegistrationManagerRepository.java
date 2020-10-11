package ca.mcgill.ecse321.eventregistration.dao;

import org.springframework.data.repository.CrudRepository;

import ca.mcgill.ecse321.eventregistration.model.RegistrationManager;

public interface RegistrationManagerRepository extends CrudRepository<RegistrationManager, Integer> {
	
}
