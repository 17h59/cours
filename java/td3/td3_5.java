boolean estDateValide(int j, int m, int a){
	
}

boolean estBissextile(int an){
	return (an % 4 == 0 && an % 100 != 0 || an % 400 == 0)
}

int nbJoursDuMois(int mois, int an) {
    if (mois == 2) {
        if (estBissextile(an)) {
            return 29;
        }
        return 28;
    }
    if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
        return 30;
    }
    return 31;
}

