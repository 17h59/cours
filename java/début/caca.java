void main(){
    int i = 0;
    int compteur = 0;
    int nb = Ut.saisirEntier();

    while (compteur < nb) {
        i++;
        compteur += i;
    }

    if (compteur - nb < nb - (compteur - i)) {
        IO.println(compteur);
    } else {
        IO.println(compteur - i);
    }
}