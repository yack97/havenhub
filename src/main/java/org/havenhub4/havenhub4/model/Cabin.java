package org.havenhub4.havenhub4.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad que representa una Cabaña, hereda de TypeOfAccommodation.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cabin extends TypeOfAccommodation {

    /**
     * Nombre de la cabaña.
     */
    @Column(name = "cabin_name", nullable = false)
    private String cabinName;

    /**
     * Tipo de cabaña.
     */
    @Column(name = "type_of_cabin", nullable = false)
    private String typeOfCabin;

    /**
     * Precio por noche en la cabaña.
     */
    @Column(name = "price_per_night", nullable = false)
    private Double pricePerNight;
}