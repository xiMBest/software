package com.nayda.allscripts.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Therapist.class)
public abstract class Therapist_ {

	public static volatile SingularAttribute<Therapist, String> phone;
	public static volatile SingularAttribute<Therapist, String> surname;
	public static volatile SetAttribute<Therapist, Patient> patients;
	public static volatile SingularAttribute<Therapist, String> name;
	public static volatile SingularAttribute<Therapist, Integer> roomIn;
	public static volatile SingularAttribute<Therapist, Long> id;
	public static volatile SingularAttribute<Therapist, Hospital> hospital;
	public static volatile SingularAttribute<Therapist, String> email;

	public static final String PHONE = "phone";
	public static final String SURNAME = "surname";
	public static final String PATIENTS = "patients";
	public static final String NAME = "name";
	public static final String ROOM_IN = "roomIn";
	public static final String ID = "id";
	public static final String HOSPITAL = "hospital";
	public static final String EMAIL = "email";

}

