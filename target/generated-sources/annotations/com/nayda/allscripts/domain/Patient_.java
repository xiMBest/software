package com.nayda.allscripts.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Patient.class)
public abstract class Patient_ {

	public static volatile SingularAttribute<Patient, String> address;
	public static volatile SetAttribute<Patient, Conclusion> conclusions;
	public static volatile SingularAttribute<Patient, Double> weight;
	public static volatile SetAttribute<Patient, Therapist> therapists;
	public static volatile SetAttribute<Patient, TestResult> tests;
	public static volatile SingularAttribute<Patient, String> phone;
	public static volatile SingularAttribute<Patient, String> surname;
	public static volatile SingularAttribute<Patient, String> name;
	public static volatile SingularAttribute<Patient, Long> id;
	public static volatile SetAttribute<Patient, Oncologist> oncologists;
	public static volatile SingularAttribute<Patient, String> email;
	public static volatile SingularAttribute<Patient, Integer> age;
	public static volatile SingularAttribute<Patient, Double> height;

	public static final String ADDRESS = "address";
	public static final String CONCLUSIONS = "conclusions";
	public static final String WEIGHT = "weight";
	public static final String THERAPISTS = "therapists";
	public static final String TESTS = "tests";
	public static final String PHONE = "phone";
	public static final String SURNAME = "surname";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String ONCOLOGISTS = "oncologists";
	public static final String EMAIL = "email";
	public static final String AGE = "age";
	public static final String HEIGHT = "height";

}

