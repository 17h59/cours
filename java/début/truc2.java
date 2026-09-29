//exo 1


"""
bool uniquement si comparaison :
1. oui
2. non
3. oui
4. oui
5. oui
6. non
7. non : un entier et un booléen marche pas
8. oui
9. oui
10. oui
11. oui
12. oui
13. oui


exo 2
1. int
2. int
3. int
4. int
5. whatever


exo 3

non, dans le 1 il faut que if ne s'active pas pour que else s'active. dans le deux, les deux ifs peuvent marcher l'un après l'autre.
"""

//exo 4

IO.println("ton âge :");
int age = UT.saisirEntier();
while (age < 0 || age > 122){
	IO.println("recommence");
	age = UT.saisirEntier();
}

if (age < 12){
	IO.println("5 balles stp");
} else if (age < 25){
	IO.println("8 balles");
} else if (age < 64) {
	IO.println("le prix d'un grec deux viandes");
} else {
	IO.println("6 balles mon sang");
}

//exo 5

int nombre;
int pair = 0;
do {
	IO.println("saisir nombre entier positif ou nul ou -1 pour interrompre");
	nombre = UT.saisirEntier();
	if (nombre % 2 == 0){
		pair ++;
	}
} while (nombre != -1);

IO.println("Il y a " + pair + " entiers pairs");


//exo 6
int a;
int b;

IO.println("saisis un entier :");
a = UT.saisirEntier();
b = a;

for (int i = 0; i < 19; i++){
	IO.println("saisis un entier :");
	a = UT.saisirEntier();
	if (a > b){
		b = a;
	}
}
IO.println("le nombre le plus grand était " + b +".");

//exo 7

IO.println("valeurs de tes côtés :");
int a = Ut.saisirEntier();
int b = Ut.saisirEntier();
int c = Ut.saisirEntier();

if (a+b<c || a+c<b || b+c<a){
	IO.println("pas un triangle");
} else if (a == c){
	IO.println("equilateral");
} else if (b == a || b == c){
	IO.println("isocel");
} else (){
	IO.println("quelconque");
}

// exo 8
// pass

//exo 9

