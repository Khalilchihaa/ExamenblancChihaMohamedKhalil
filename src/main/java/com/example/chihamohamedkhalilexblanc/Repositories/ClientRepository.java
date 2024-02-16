package com.example.chihamohamedkhalilexblanc.Repositories;

import com.example.chihamohamedkhalilexblanc.Entities.CarteFid;
import com.example.chihamohamedkhalilexblanc.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client,Integer> {
}
