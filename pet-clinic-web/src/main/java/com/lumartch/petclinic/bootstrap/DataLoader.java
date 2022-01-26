package com.lumartch.petclinic.bootstrap;

import com.lumartch.petclinic.model.Owner;
import com.lumartch.petclinic.model.Vet;
import com.lumartch.petclinic.services.OwnerService;
import com.lumartch.petclinic.services.VetService;
import com.lumartch.petclinic.services.map.OwnerServiceMap;
import com.lumartch.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerServices;
    private final VetService vetService;

    public DataLoader(OwnerService ownerServices, VetService vetService) {
        this.ownerServices = ownerServices;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner ow_1 = new Owner("Lumart","Chryssomallis");
        ow_1.setId(1L);
        ownerServices.save(ow_1);
        Owner ow_2 = new Owner("Luis","Martínez");
        ow_2.setId(2L);
        ownerServices.save(ow_2);
        System.out.println("Loading Owners... ");

        Vet vet_1 = new Vet("Sam", "Samson");
        vet_1.setId(1L);
        vetService.save(vet_1);
        Vet vet_2 = new Vet("Peter", "Parker");
        vet_2.setId(2L);
        vetService.save(vet_2);
        System.out.println("Loading Vets... ");

    }
}
