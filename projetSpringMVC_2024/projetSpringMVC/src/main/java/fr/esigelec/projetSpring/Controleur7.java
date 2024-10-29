package fr.esigelec.projetSpring;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@RestController
@EnableWebMvc
public class Controleur7 {

	@RequestMapping(value="/7",method = RequestMethod.GET)
	public Personne afficher() {

		// retour de l'objet JSON grace a Jackson dans le classpath + EnableWebMvc
		return new Personne(1,"serais","sebastien");

	}
}
