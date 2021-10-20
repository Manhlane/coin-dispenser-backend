package coin.dispenser.backend.services;

import coin.dispenser.backend.entities.Coins;
import coin.dispenser.backend.repositories.CoinsRepository;
import coin.dispenser.backend.repositories.UserRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Optional;

@Service
@Builder
public class CoinsService {

    @Autowired
    CoinsRepository coinsRepository;

    public Coins initializeCoins(){
        Coins c = Coins.builder()
                .twentyCent(100)
                .fiftyCent(100)
                .fiveRand(100)
                .oneRand(100)
                .tenCent(100)
                .twoRand(100)
                .build();
        return coinsRepository.save(c);
    }

    public HashMap<String, Double> findDenominations(double amount){
        //Optional<Coins> c = coinsRepository.findById(1L);
        double newAmount = 0;

        HashMap<String, Double> hashMap = new HashMap<String, Double>();
        hashMap.put("fiveRand", fiveRandDenominations(amount));
        newAmount = amount % 5;
        hashMap.put("twoRand", twoRandDenominations(newAmount));
        newAmount = newAmount % 2;
        hashMap.put("oneRand", oneRandDenominations(newAmount));
        newAmount = newAmount % 1;
        hashMap.put("fiftyCent", fiftyCentDenominations(newAmount));
        newAmount = newAmount % .50;
        hashMap.put("twentyCent", twentyCentDenominations(newAmount));
        newAmount = newAmount % .20;
        hashMap.put("tenCent", tenCentDenominations(newAmount));

        return hashMap;
    }

    public double fiveRandDenominations(double amount){

        if(amount < 5){
            return 0.0;
        }
        double remainder = amount % 5;
        return (amount-remainder)/5;
    }

    public double twoRandDenominations(double amount){

        if(amount < 2){
            return 0.0;
        }
        double remainder = amount % 2;
        return (amount-remainder)/2;
    }

    public double oneRandDenominations(double amount){

        if(amount < 1){
            return 0.0;
        }
        double remainder = amount % 1;
        return (amount-remainder)/1;
    }

    public double fiftyCentDenominations(double amount){
        if(amount < .50){
            return 0.0;
        }
        double remainder = amount % .50;
        return (amount-remainder)/.50;
    }

    public double twentyCentDenominations(double amount){
        if(amount < .2){
            return 0.0;
        }
        double remainder = amount % .20;
        return (amount-remainder)/.20;
    }

    public double tenCentDenominations(double amount){
        if(amount < .1){
            return 0.0;
        }
        double remainder = amount % .10;
        return (amount-remainder)/.10;
    }


}
