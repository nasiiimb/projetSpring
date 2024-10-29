<!DOCTYPE html>
<html lang="fr">
<head>
<title>Accueil projet Spring MVC</title>
</head>
<body>
	<h2>Page d'accueil</h2>
	<div>
		<ul>
			<li><a href="1">Contrôleur 1  (avec @ResponseBody)</a></li>
			<li><a href="2">Contrôleur 2 (retour d'une vue sans paramètre)</a></li>
			<li><a href="3">Contrôleur 3 (vue générée avec PrintWriter)</a></li>
			<li><a href="4">Contrôleur 4 (avec ModelMap et Session)</a></li>
			<li><a href="5?ville=Copenhague">Contrôleur 5 (avec un paramètre HTTP)</a></li>
			<li><a href="6/Danemark">Contrôleur 6 (avec @PathVariable)</a></li>
			<li><a href="7">Contrôleur 7 (avec @RestController)</a></li>
			</ul>
	</div>
</body>
</html>
