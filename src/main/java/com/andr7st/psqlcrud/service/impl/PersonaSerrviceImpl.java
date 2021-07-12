package com.andr7st.psqlcrud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.andr7st.psqlcrud.commons.GenericServiceImpl;
import com.andr7st.psqlcrud.dao.api.PersonaDaoApi;
import com.andr7st.psqlcrud.model.Persona;
import com.andr7st.psqlcrud.service.api.PersonaServiceApi;

@Service
public class PersonaSerrviceImpl extends GenericServiceImpl<Persona, Long> implements PersonaServiceApi {

	@Autowired
	private PersonaDaoApi personaDaoApi;
	
	@Override
	public CrudRepository<Persona, Long> getDao() {

		return personaDaoApi;
	}

}
