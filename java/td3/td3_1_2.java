void repeteCarac(int nb, char car){
	if (nb >= 0){
		for (int i = 0; i < nb; i ++){
			IO.print(car);
		}
	}	
}

void pyramideSimple(int h, char c){
	int temp =1;
	for (int i = 1; i<h; i += 1){
		repeteCarac(h-i, ' ');
		repeteCarac((h+temp)-h, c);
		IO.println("");
		temp += 2;
	}
}


void afficheNombresCroissants (int nb1, int nb2) {
	if (nb1 <= nb2){
		for (int i = nb2-nb1+1; i != 0; i -= 1){
			IO.print(nb1 % 10);
			nb1 ++;
		}
	}
}


void afficheNombresDecroissants (int nb1, int nb2) {
	if (nb1 >= nb2){
		for (int i = nb1-nb2+1; i != 0; i -= 1){
			IO.print(nb1 % 10);
			nb1 -= 1;
		}
	}
}

void pyramideElaboree (int h){
	int temp =1;
	for (int i = 1; i<h; i += 1){
		//repeteCarac(h-i, ' ');
		afficheNombresCroissants(i, temp);
		afficheNombresDecroissants(temp-1, i);
		IO.println("");
		temp += 2;
	}
}

void main(){
	pyramideElaboree(Ut.saisirEntier());
	//afficheNombresDecroissants(Ut.saisirEntier(), Ut.saisirEntier());
	//afficheNombresCroissants(Ut.saisirEntier(), Ut.saisirEntier());
	//pyramideSimple(Ut.saisirEntier(), '*');
}
