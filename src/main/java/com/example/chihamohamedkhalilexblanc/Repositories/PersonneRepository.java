package com.example.chihamohamedkhalilexblanc.Repositories;

import com.example.chihamohamedkhalilexblanc.Entities.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository  extends JpaRepository<Personnel,Integer> {
}
