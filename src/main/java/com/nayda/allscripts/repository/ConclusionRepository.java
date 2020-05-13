package com.nayda.allscripts.repository;

import com.nayda.allscripts.domain.Conclusion;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Conclusion entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ConclusionRepository extends JpaRepository<Conclusion, Long>, JpaSpecificationExecutor<Conclusion> {
}
