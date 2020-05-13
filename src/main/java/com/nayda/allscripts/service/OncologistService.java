package com.nayda.allscripts.service;

import com.nayda.allscripts.domain.Oncologist;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link Oncologist}.
 */
public interface OncologistService {

    /**
     * Save a oncologist.
     *
     * @param oncologist the entity to save.
     * @return the persisted entity.
     */
    Oncologist save(Oncologist oncologist);

    /**
     * Get all the oncologists.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<Oncologist> findAll(Pageable pageable);

    /**
     * Get the "id" oncologist.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Oncologist> findOne(Long id);

    /**
     * Delete the "id" oncologist.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
