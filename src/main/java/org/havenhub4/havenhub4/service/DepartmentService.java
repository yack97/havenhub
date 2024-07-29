package org.havenhub4.havenhub4.service;

import org.havenhub4.havenhub4.model.Department;
import org.havenhub4.havenhub4.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService extends TypeOfAccommodationService {

    @Autowired
    private DepartmentRepository departmentRepository;

    // Métodos específicos para los departamentos

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Optional<Department> getDepartmentById(Long id) {
        return departmentRepository.findById(id);
    }

    public void saveDepartment(Department department) {
        departmentRepository.save(department);
    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }

}