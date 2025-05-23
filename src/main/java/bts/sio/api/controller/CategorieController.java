package bts.sio.api.controller;

import bts.sio.api.model.Categorie;
import bts.sio.api.model.Entreprise;
import bts.sio.api.service.CategorieService;
import bts.sio.api.service.EntrepriseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Categories", description = "API pour la gestion des categories")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @Operation(
            summary = "Récupérer tous les catégories",
            description = "Permet de récupérer la liste de tous les catégories"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Liste des catégories récupérée avec succès"),
            @ApiResponse(responseCode = "500", description = "Erreur interne du serveur")
    })
    @GetMapping("/categories")
    public Iterable<Categorie> getCategories() {
        return categorieService.getCategories();
    }
}