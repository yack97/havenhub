package org.havenhub4.havenhub4.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Department extends TypeOfAccommodation{

    @Column(name = "department_name", nullable = false)
    private String departmentName;

    @Column(name = "type_of_department", nullable = false)
    private String typeOfDepartment;

    @Column(name = "price_per_night", nullable = false)
    private Double pricePerNight;
}
