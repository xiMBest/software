package com.nayda.allscripts.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Hospital.class)
public abstract class Hospital_ {

	public static volatile SingularAttribute<Hospital, String> address;
	public static volatile SingularAttribute<Hospital, String> phone;
	public static volatile SingularAttribute<Hospital, String> name;
	public static volatile SetAttribute<Hospital, Therapist> therapists;
	public static volatile SingularAttribute<Hospital, Long> id;
	public static volatile SingularAttribute<Hospital, Boolean> paidFor;
	public static volatile SetAttribute<Hospital, Oncologist> oncologists;

	public static final String ADDRESS = "address";
	public static final String PHONE = "phone";
	public static final String NAME = "name";
	public static final String THERAPISTS = "therapists";
	public static final String ID = "id";
	public static final String PAID_FOR = "paidFor";
	public static final String ONCOLOGISTS = "oncologists";

}

