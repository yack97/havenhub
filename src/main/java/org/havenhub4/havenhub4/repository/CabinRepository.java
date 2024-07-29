package org.havenhub4.havenhub4.repository;

import org.havenhub4.havenhub4.model.Cabin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabinRepository extends JpaRepository<Cabin, Long> {
}
