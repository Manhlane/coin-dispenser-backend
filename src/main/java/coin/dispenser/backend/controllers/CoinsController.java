package coin.dispenser.backend.controllers;

import coin.dispenser.backend.dto.RegistrationDTO;
import coin.dispenser.backend.entities.Coins;
import coin.dispenser.backend.services.CoinsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CoinsController {

    @Autowired
    CoinsService coinsService;

    @PostMapping(value = "/initialize-coins", produces = "application/json")
    public Coins initializeCoins(){
        return coinsService.initializeCoins();
    }

    @GetMapping(value = "/denominations/{amount}", produces = "application/json")
    public HashMap<String, Double> getDenominations(@PathVariable double amount){
        return coinsService.findDenominations(amount);

    }
}
