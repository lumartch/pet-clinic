package com.lumartch.petclinic.services;

import com.lumartch.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
