package bts.sio.api.service;

import bts.sio.api.model.Categorie;
import bts.sio.api.model.Entreprise;
import bts.sio.api.repository.CategorieRepository;
import bts.sio.api.repository.EntrepriseRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    public Iterable<Categorie> getCategories() {
        return categorieRepository.findAll();
    }
}