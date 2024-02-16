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
public class CarteFid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idCarte;
@Column(unique = true)
    Long numerocarte;
    Long solde;
    LocalDate datecreation;
    @OneToOne(cascade = CascadeType.ALL)
    Client client;
}
