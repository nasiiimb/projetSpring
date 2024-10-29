package fr.esigelec.projetSpring;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * exemple simple avec retour de donn�es sans passer par une vue
 * @author serais
 *
 */
@Controller
public class Controleur1 {
	
	@RequestMapping("/1")
	@ResponseBody  //indique que le retour de la méthode correspond au body de la réponse HTTP
	public String afficher() {
        return "Voici le résultat qui sera affiché dans le body de la page";
    }
}
