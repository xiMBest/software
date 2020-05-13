package com.nayda.allscripts.repository;

import com.nayda.allscripts.domain.Therapist;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Therapist entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TherapistRepository extends JpaRepository<Therapist, Long>, JpaSpecificationExecutor<Therapist> {
}
