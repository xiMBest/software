package com.nayda.allscripts.domain;

import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Conclusion.class)
public abstract class Conclusion_ {

	public static volatile SingularAttribute<Conclusion, ZonedDateTime> date;
	public static volatile SingularAttribute<Conclusion, Oncologist> signedBy;
	public static volatile SingularAttribute<Conclusion, Long> id;
	public static volatile SingularAttribute<Conclusion, String> resultDescription;
	public static volatile SingularAttribute<Conclusion, Patient> forPatient;
	public static volatile SingularAttribute<Conclusion, String> url;

	public static final String DATE = "date";
	public static final String SIGNED_BY = "signedBy";
	public static final String ID = "id";
	public static final String RESULT_DESCRIPTION = "resultDescription";
	public static final String FOR_PATIENT = "forPatient";
	public static final String URL = "url";

}

