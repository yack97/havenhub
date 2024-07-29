package org.havenhub4.havenhub4.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase abstracta que representa un Tipo de Alojamiento. Utiliza la estrategia de herencia de una tabla única.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class TypeOfAccommodation {

    /**
     * Identificador único para cada tipo de alojamiento.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Tipo de alojamiento.
     */
    @Column(name = "type_accommodation", nullable = false)
    private String typeAccommodation;

    /**
     * Fecha de creación del registro del tipo de alojamiento.
     */
    @Column(name = "created_at", nullable = false)
    private String createdAt;
}