package bts.sio.api.controller;

import bts.sio.api.model.Entreprise;
import bts.sio.api.service.EntrepriseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


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
}
