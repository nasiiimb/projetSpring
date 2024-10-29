<!DOCTYPE html>
<html lang="fr">
<head>
<title>Accueil projet Spring MVC</title>
</head>
<body>
	<h2>Page d'accueil</h2>
	<div>
		<ul>
			<li><a href="1">Contr�leur 1  (avec @ResponseBody)</a></li>
			<li><a href="2">Contr�leur 2 (retour d'une vue sans param�tre)</a></li>
			<li><a href="3">Contr�leur 3 (vue g�n�r�e avec PrintWriter)</a></li>
			<li><a href="4">Contr�leur 4 (avec ModelMap et Session)</a></li>
			<li><a href="5?ville=Copenhague">Contr�leur 5 (avec un param�tre HTTP)</a></li>
			<li><a href="6/Danemark">Contr�leur 6 (avec @PathVariable)</a></li>
			<li><a href="7">Contr�leur 7 (avec @RestController)</a></li>
			</ul>
	</div>
</body>
</html>
