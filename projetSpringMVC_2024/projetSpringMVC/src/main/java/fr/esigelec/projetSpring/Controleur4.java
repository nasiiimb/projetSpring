package fr.esigelec.projetSpring;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;
/**
 * exemple de transfert de donn�es � la vue en utilisant modelMap
 * exemple de transfert de donn�es � la vue en utilisant la session)
 * @author serais
 *
 */
@Controller
@RequestMapping("/4")
public class Controleur4 {

	@RequestMapping(method = RequestMethod.GET)
    public String afficher(final ModelMap modelMap,final HttpSession session) {
		
		//utilisation de modelMap
		modelMap.addAttribute("prenom","Sébastien");
		modelMap.addAttribute("nom","Serais");
	
		//utilisation de la session
		session.setAttribute("entreprise","esigelec");
		
		return "vue4";
	
    }
}
