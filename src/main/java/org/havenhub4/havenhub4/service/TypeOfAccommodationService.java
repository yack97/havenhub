package org.havenhub4.havenhub4.service;

import org.havenhub4.havenhub4.model.TypeOfAccommodation;
import org.havenhub4.havenhub4.repository.TypeOfAccommodationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeOfAccommodationService {

    @Autowired
    private TypeOfAccommodationRepository typeOfAccommodationRepository;

    public List<TypeOfAccommodation> getAllAccommodations() {
        return typeOfAccommodationRepository.findAll();
    }

    public void saveAccommodation(TypeOfAccommodation accommodation) {
        typeOfAccommodationRepository.save(accommodation);
    }
}