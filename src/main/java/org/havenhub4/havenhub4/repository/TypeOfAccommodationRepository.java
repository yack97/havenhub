package org.havenhub4.havenhub4.repository;

import org.havenhub4.havenhub4.model.TypeOfAccommodation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOfAccommodationRepository extends JpaRepository<TypeOfAccommodation, Long> {
}
