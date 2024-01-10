package ie.atu.ufcproject3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private SecondAppService secondAppService;

    @Autowired
    public UserController(SecondAppService secondAppService) {
        this.secondAppService = secondAppService;
    }

    @GetMapping("/display-fighter-details/{name}")
    public UserDetails displayFighterDetails(@PathVariable String name) {

        return secondAppService.getFighterDetailsFromSecondApp(name);
    }
}
