package bts.sio.api.controller;

import bts.sio.api.model.Athlete;
import bts.sio.api.model.Entreprise;
import bts.sio.api.service.EntrepriseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Tag(name = "Entreprises", description = "API pour la gestion des entreprises/partenaires")
public class EntrepriseController {

    @Autowired
    private EntrepriseService entrepriseService;

    @Operation(
            summary = "Récupérer tous les entreprises",
            description = "Permet de récupérer la liste de tous les entreprises"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Liste des entreprises récupérée avec succès"),
            @ApiResponse(responseCode = "500", description = "Erreur interne du serveur")
    })
    @GetMapping("/entreprises")
    public Iterable<Entreprise> getEntreprises() {
        return entrepriseService.getEntreprises();
    }


    @Operation(
            summary = "Ajouter un partenaire",
            description = "Permet d'ajouter un partenaire"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Partenaire ajouté avec succès"),
            @ApiResponse(responseCode = "400", description = "Requête invalide"),
            @ApiResponse(responseCode = "409", description = "Partenaire existe déjà"),
            @ApiResponse(responseCode = "500", description = "Erreur interne du serveur")
    })
    @PostMapping("/entreprise")
    public Entreprise createEntreprise(@RequestBody Entreprise entreprise) {

        System.out.println("JSON REÇU : " + entreprise);
        return entrepriseService.saveEntreprise(entreprise);
    }
}
