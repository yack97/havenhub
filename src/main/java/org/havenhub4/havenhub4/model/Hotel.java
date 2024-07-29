package org.havenhub4.havenhub4.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad que representa un Hotel, hereda de TypeOfAccommodation.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel extends TypeOfAccommodation {

    /**
     * Nombre del hotel.
     */
    @Column(name = "hotel_name", nullable = false)
    private String hotelName;

    /**
     * Tipo de habitación en el hotel.
     */
    @Column(name = "type_of_bedroom", nullable = false)
    private String typeOfBedroom;

    /**
     * Precio por noche en el hotel.
     */
    @Column(name = "price_per_night", nullable = false)
    private Double pricePerNight;
}