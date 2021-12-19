/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2Ciclo4.repositorio;

import Reto2Ciclo4.interfaces.InterfacePeripheral;
import Reto2Ciclo4.modelo.Peripheral;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author WINDOWS
 */
@Repository
public class RepositorioPeripheral {
    @Autowired
    private InterfacePeripheral repository;

    public List<Peripheral> getAll() {
        return repository.findAll();
    }

    public Optional<Peripheral> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Peripheral create(Peripheral clothe) {
        return repository.save(clothe);
    }

    public void update(Peripheral clothe) {
        repository.save(clothe);
    }
    
    public void delete(Peripheral clothe) {
        repository.delete(clothe);
    }
}
