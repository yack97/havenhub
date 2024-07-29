package org.havenhub4.havenhub4.service;

import org.havenhub4.havenhub4.model.Hotel;
import org.havenhub4.havenhub4.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService extends TypeOfAccommodationService {

    @Autowired
    private HotelRepository hotelRepository;

    // Métodos específicos para los hoteles

    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    public Optional<Hotel> getHotelById(Long id) {
        return hotelRepository.findById(id);
    }

    public void saveHotel(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    public void deleteHotel(Long id) {
        hotelRepository.deleteById(id);
    }

}