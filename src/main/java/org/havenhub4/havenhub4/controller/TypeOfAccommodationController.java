package org.havenhub4.havenhub4.controller;

import org.havenhub4.havenhub4.model.Hotel;
import org.havenhub4.havenhub4.model.Cabin;
import org.havenhub4.havenhub4.model.Department;
import org.havenhub4.havenhub4.model.TypeOfAccommodation;
import org.havenhub4.havenhub4.service.TypeOfAccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class TypeOfAccommodationController {

    @Autowired
    private TypeOfAccommodationService typeOfAccommodationService;

    @GetMapping("/type-of-accommodation")
    public String showForm(Model model) {
        List<TypeOfAccommodation> accommodations = typeOfAccommodationService.getAllAccommodations();
        model.addAttribute("typeOfAccommodations", accommodations);
        return "index";
    }

    @PostMapping("/type-of-accommodation")
    public String saveAccommodation(@RequestParam String typeAccommodation,
                                    @RequestParam(required = false) String hotelName,
                                    @RequestParam(required = false) String typeOfBedroom,
                                    @RequestParam(required = false) Double hotelPricePerNight,
                                    @RequestParam(required = false) String cabinName,
                                    @RequestParam(required = false) String typeOfCabin,
                                    @RequestParam(required = false) Double cabinPricePerNight,
                                    @RequestParam(required = false) String departmentName,
                                    @RequestParam(required = false) String typeOfDepartment,
                                    @RequestParam(required = false) Double departmentPricePerNight) {

        TypeOfAccommodation accommodation;
        LocalDateTime createdAt = LocalDateTime.now();

        switch (typeAccommodation) {
            case "Hotel":
                accommodation = new Hotel();
                ((Hotel) accommodation).setHotelName(hotelName);
                ((Hotel) accommodation).setTypeOfBedroom(typeOfBedroom);
                ((Hotel) accommodation).setPricePerNight(hotelPricePerNight);
                break;
            case "Cabin":
                accommodation = new Cabin();
                ((Cabin) accommodation).setCabinName(cabinName);
                ((Cabin) accommodation).setTypeOfCabin(typeOfCabin);
                ((Cabin) accommodation).setPricePerNight(cabinPricePerNight);
                break;
            case "Department":
                accommodation = new Department();
                ((Department) accommodation).setDepartmentName(departmentName);
                ((Department) accommodation).setTypeOfDepartment(typeOfDepartment);
                ((Department) accommodation).setPricePerNight(departmentPricePerNight);
                break;
            default:
                throw new IllegalArgumentException("Tipo de alojamiento desconocido: " + typeAccommodation);
        }

        accommodation.setTypeAccommodation(typeAccommodation);
        accommodation.setCreatedAt(String.valueOf(createdAt));
        typeOfAccommodationService.saveAccommodation(accommodation);
        return "redirect:/type-of-accommodation";
    }
}