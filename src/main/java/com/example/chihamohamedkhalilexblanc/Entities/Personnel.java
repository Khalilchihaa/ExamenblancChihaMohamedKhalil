package com.example.chihamohamedkhalilexblanc.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idPersonnel;
    String nomPersonnel;
    String prenomPersonnel;
    LocalDate dateNaissance;
    @Enumerated(EnumType.STRING)
    TypePersonnel typePersonnel;
    @OneToOne
    Magasin magasin;
    @ManyToOne
    Magasin magasins;


}
