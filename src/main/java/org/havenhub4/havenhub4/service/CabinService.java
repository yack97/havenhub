package org.havenhub4.havenhub4.service;

import org.havenhub4.havenhub4.model.Cabin;
import org.havenhub4.havenhub4.repository.CabinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CabinService extends TypeOfAccommodationService {

    @Autowired
    private CabinRepository cabinRepository;

    // Métodos específicos para las cabañas

    public List<Cabin> getAllCabins() {
        return cabinRepository.findAll();
    }

    public Optional<Cabin> getCabinById(Long id) {
        return cabinRepository.findById(id);
    }

    public void saveCabin(Cabin cabin) {
        cabinRepository.save(cabin);
    }

    public void deleteCabin(Long id) {
        cabinRepository.deleteById(id);
    }

}