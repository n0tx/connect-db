package com.riki.connect_db.repository;

import com.riki.connect_db.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
