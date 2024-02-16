package com.example.chihamohamedkhalilexblanc.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Magasin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idMagasin;
    String nomMagasin;
    String adresseMagasin;
    Long contactMagasin;
    @OneToMany(mappedBy = "magasins")
    List<Personnel> caissier = new ArrayList<>() ;
    @ManyToMany(mappedBy = "magasins")
    List<Client> clientList = new ArrayList<>();


}
