//exo6
int nb = 1;
while (nb % 2 != 0){
    IO.println("rentre un nombre pair:");
    int nb = ut.saisirEntier();
}

for (int i = 10; i > 0;  nb += 2, i -= 1){
    IO.println(nb);

//---
int nb = 1
while (nb % 2 != 0 && nb !> 50){
    IO.println("rentre un nombre pair:");
    int nb = ut.saisirEntier();
}

for (int i = 10; i > 0;  nb -= 2, i -= 1){
    IO.println(nb);
}

//exo 7

IO.println("rentre un nombre stp:");
nb = ut.saisirEntier();
for (int somme = 0; nb > 0; nb -= 1){
    IO.println("rentre encore un nombre:")
    somme += ut.saisirEntier()
} 
IO.println(somme)

//---
int nb = 0;
int caca = 0;
while (true) {
    IO.println("rentre un nombre");
    int temp = ut.saisirEntier();
    nb += temp;
    caca += 1;
    if (nb >= 100 || temp == 0){
        IO.println("Nombre d'entiers saisis : ", caca, " et somme de ces derniers : ", nb);
    }  
}

//exo 8
int nb = -1
while (nb < 0){
    IO.println("rentre un nombre positif:");
    int nb = ut.saisirEntier();
}
int somme = 0;
for (nb; nb > 0;  nb -= 1){
    somme += nb;
}
IO.println(nb)

//exo 10
int age;
int n = UT.saisirEntier("nombre personnes :");
int sommeAge = 0;
for(int i = 0; i < n; i += 1){
    do{
        age = UT.saisirEntier();
    } while (age < 0)
}
IO.println(sommeAge/(double)n);


//exo 13

public static double abs(double somme) {
    if (somme < 0){
    somme -= somme - somme
    }
    return somme
}

int espsilon = UT.saisirEntier();
int num = 1;
double den = 1;
double somme = 1;
double abs

while (abs(num/den) != epsilon){
    den += 2
    somme -= num/den
    if (abs(num/den) != epsilon){
        den += 2
        somme += num/den
    }
}