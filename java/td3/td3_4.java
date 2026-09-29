int sommeDiviseurs(int a){
	int somme = 0;
	for (int i = 1; i <= a/2; i++){
		if (a % i == 0){
			somme += i;
		}
	}
	return somme;
}

boolean amis(int a, int b){
	if (a != b){
		if (sommeDiviseurs(a) == b || sommeDiviseurs(b) == a){
			return true;
		}
	}
	return false;
}

void amisInferieur(int a){
	for (int i = 1; i <= a; i++){
		for (int j = i; j <= a; j++){
			if (amis(i, j)){
				IO.println(i+ " "+j);
			}
		}
	}
}


void main() {
    amisInferieur(300);
}