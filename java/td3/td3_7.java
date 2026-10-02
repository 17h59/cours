int racineParfait(int c){
	int n = 1;
	while (n*n <= c){
		if (n*n == c){
			return n;
		}
		n ++;
	}
	return -1;
}

void main(){
	nbTrianglesRectangles(Ut.saisirEntier());
}

boolean potentielTriangleRectangle(int c1, int c2){
	return racineParfait(c1*c1+c2*c2) != -1; //it does da thing
}

void nbTrianglesRectangles (int p){
	int compteur = 0;
	for (int i = p-2; i>0; i -= 1){
		for (int j = 1; j <= p-i; j++){
			if (potentielTriangleRectangle(i, j)){
				compteur ++;
			}
		}
	}
	IO.println(compteur);
}