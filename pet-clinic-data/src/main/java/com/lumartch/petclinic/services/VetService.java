package com.lumartch.petclinic.services;

import com.lumartch.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet pet);
    Set<Vet> findAll();
}
