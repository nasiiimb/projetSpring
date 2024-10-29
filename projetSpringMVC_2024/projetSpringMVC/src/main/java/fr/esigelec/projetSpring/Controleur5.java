package fr.esigelec.projetSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * exemple de r�cup�ration d'un param�tre HTTP
 * 
 * @author serais
 *
 */
@Controller
@RequestMapping("/5")
public class Controleur5 {

	@RequestMapping(method = RequestMethod.GET)
	public String afficher(final ModelMap modelMap,
			@RequestParam(value = "ville"
			,defaultValue="Rouen"		//optionnel, permet de d�finir une valeur par d�faut
			) final String ville) {

		// utilisation de modelMap
		modelMap.addAttribute("ville", ville);
		

		return "vue5";

	}
}
