package com.example.chihamohamedkhalilexblanc.Services;

import com.example.chihamohamedkhalilexblanc.Entities.CarteFid;
import com.example.chihamohamedkhalilexblanc.Entities.Client;
import com.example.chihamohamedkhalilexblanc.Entities.Magasin;
import com.example.chihamohamedkhalilexblanc.Repositories.ClientRepository;
import com.example.chihamohamedkhalilexblanc.Repositories.MagasinRepository;
import com.example.chihamohamedkhalilexblanc.Repositories.PersonneRepository;

import java.util.List;

public class Services implements  IServices {

        ClientRepository clientRepository;
        MagasinRepository magasinRepository;
        PersonneRepository personnelRepository;

        @Override
        public Client ajouterClient(Client c) {
            return clientRepository.save(c);
        }

        @Override
        public Magasin ajouterMagasinEtPersonnels(Magasin magasin) {
            return magasinRepository.save(magasin);
        }

        @Override
        public void affecterClientAMagasin(int idClient, int idMagasin) {
            Client client = clientRepository.findById(idClient).get();
            Magasin magasin = magasinRepository.findById(idMagasin).get();
            client.getMagasins().add(magasin);
            clientRepository.save(client);
        }
    }

