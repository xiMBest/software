package com.nayda.allscripts.repository;

import com.nayda.allscripts.domain.TestResult;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the TestResult entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TestResultRepository extends JpaRepository<TestResult, Long>, JpaSpecificationExecutor<TestResult> {
}
