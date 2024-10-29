package fr.esigelec.projetSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * exemple de r�cup�ration d'un param�tre � partir du chemin URL
 * possibilit� d'utiliser * , par exemple : /exemple6/{pays}/* 
 * @author serais
 *
 */
@Controller
@RequestMapping("/6/{pays}")
public class Controleur6 {

	@RequestMapping(method = RequestMethod.GET)
	public String afficher(final ModelMap modelMap,
			@PathVariable(value = "pays") final String pays) {

		// utilisation de modelMap
		modelMap.addAttribute("pays", pays);
		

		return "vue6";

	}
}
