package fr.esigelec.projetSpring;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * exemple simple avec retour d'une vue fixe "vue2.jsp"
 * @author serais
 *
 */
@Controller
public class Controleur2 {

	
	@RequestMapping("/2")
	public String afficher() {
        return "vue2";
    }
}
