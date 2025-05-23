package bts.sio.api.service;

import bts.sio.api.model.Athlete;
import bts.sio.api.model.Entreprise;
import bts.sio.api.repository.EntrepriseRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class EntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;

    public Iterable<Entreprise> getEntreprises() {
        return entrepriseRepository.findAll();
    }

    public Entreprise saveEntreprise(Entreprise entreprise) {
        Entreprise savedEntreprise = entrepriseRepository.save(entreprise);
        System.out.println("service : " + entreprise);
        return savedEntreprise;
    }
}
