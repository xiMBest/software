package com.nayda.allscripts.domain;

import com.nayda.allscripts.domain.enumeration.TestType;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TestResult.class)
public abstract class TestResult_ {

	public static volatile SingularAttribute<TestResult, ZonedDateTime> dateTime;
	public static volatile SingularAttribute<TestResult, Patient> patient;
	public static volatile SingularAttribute<TestResult, String> name;
	public static volatile SingularAttribute<TestResult, String> description;
	public static volatile SingularAttribute<TestResult, Long> id;
	public static volatile SingularAttribute<TestResult, TestType> type;
	public static volatile SingularAttribute<TestResult, String> url;
	public static volatile SingularAttribute<TestResult, Oncologist> oncologist;

	public static final String DATE_TIME = "dateTime";
	public static final String PATIENT = "patient";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String TYPE = "type";
	public static final String URL = "url";
	public static final String ONCOLOGIST = "oncologist";

}

