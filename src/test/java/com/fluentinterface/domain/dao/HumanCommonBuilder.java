package com.fluentinterface.domain.dao;

public interface HumanCommonBuilder<T extends HumanCommonBuilder<T>> 
         extends DbCommonBuilder<T> {
	
	T withFirstName(final String firstName);

	T withLastName(final String lastName);

	T withAddress(final String address);
}
