package com.example.chihamohamedkhalilexblanc.Services;

import com.example.chihamohamedkhalilexblanc.Entities.CarteFid;
import com.example.chihamohamedkhalilexblanc.Entities.Client;
import com.example.chihamohamedkhalilexblanc.Entities.Magasin;

import java.util.List;


    public interface IServices {
        Client ajouterClient(Client c);
        Magasin ajouterMagasinEtPersonnel(Magasin magasin);
        void  affecterClientAMagasin(int idClient, int idMagasin);
        void ajouterCarteEtAffecterClient(CarteFid carteFid, long cin);
        long effectuerOperation(String typeOperation, long numCarte, int montant);
        List<Client> afficherClients(String nomMagasin);
        void totalSolde();

    }


