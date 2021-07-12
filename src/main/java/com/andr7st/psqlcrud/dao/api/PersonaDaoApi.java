package com.andr7st.psqlcrud.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.andr7st.psqlcrud.model.Persona;

public interface PersonaDaoApi extends CrudRepository<Persona, Long> {
	
	

}
