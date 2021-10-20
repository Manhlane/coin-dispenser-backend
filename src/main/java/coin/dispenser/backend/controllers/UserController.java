package coin.dispenser.backend.controllers;

import coin.dispenser.backend.dto.AuthenticationRequest;
import coin.dispenser.backend.dto.AuthenticationResponse;
import coin.dispenser.backend.dto.LoginDTO;
import coin.dispenser.backend.dto.RegistrationDTO;
import coin.dispenser.backend.entities.User;
import coin.dispenser.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping(value = "/register-user", consumes = "application/json")
    public String registerUser(@RequestBody RegistrationDTO registrationDTO){
        if(userService.addUser(registrationDTO) == "Success") {
            return "Ok";
        }else{

        }
        return "User already exists";
    }


    @PostMapping(value = "/login", consumes = "application/json")
    public String login(@RequestBody LoginDTO loginDTO){
        return userService.doLogin(loginDTO);
    }

    @GetMapping(value = "/getUserDetails/{email}", produces = "application/json")
    public User getUserDetails(@PathVariable String email){
        return userService.findByEmail(email);
    }


}
