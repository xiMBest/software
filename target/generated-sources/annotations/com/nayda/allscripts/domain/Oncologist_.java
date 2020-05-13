package com.nayda.allscripts.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Oncologist.class)
public abstract class Oncologist_ {

	public static volatile SetAttribute<Oncologist, TestResult> tests;
	public static volatile SingularAttribute<Oncologist, String> phone;
	public static volatile SingularAttribute<Oncologist, String> surname;
	public static volatile SetAttribute<Oncologist, Conclusion> conclusions;
	public static volatile SetAttribute<Oncologist, Patient> patients;
	public static volatile SingularAttribute<Oncologist, String> name;
	public static volatile SingularAttribute<Oncologist, Integer> roomIn;
	public static volatile SingularAttribute<Oncologist, Long> id;
	public static volatile SingularAttribute<Oncologist, Hospital> hospital;
	public static volatile SingularAttribute<Oncologist, String> email;

	public static final String TESTS = "tests";
	public static final String PHONE = "phone";
	public static final String SURNAME = "surname";
	public static final String CONCLUSIONS = "conclusions";
	public static final String PATIENTS = "patients";
	public static final String NAME = "name";
	public static final String ROOM_IN = "roomIn";
	public static final String ID = "id";
	public static final String HOSPITAL = "hospital";
	public static final String EMAIL = "email";

}

