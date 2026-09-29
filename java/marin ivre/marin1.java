public class Marin {

    void randomNumber() {
		int temp = Ut.randomMinMax(1, 10);
		if (temp <= 5){
			return (Ut.randomMinMax(1, 50));
		} else if (temp == 6 || temp == 7){
			return (Ut.randomMinMax(51, 70));
		} else if (temp == 8 || temp == 9){
			return (Ut.randomMinMax(71, 90));
		} else {
			return (Ut.randomMinMax(91, 100));
		}

	void arivobato() {

		// x = largeur
		// y = longueur

		float longueurPlanche = Ut.saisirFlottant();
		float largeurPlanche = Ut.saisirFlottant();

		while (largeurPlanche % 2 != 0 || longueurPlanche < largeurPlanche){
			IO.println("refais");
			float longueurPlanche = Ut.saisirFlottant();
			float largeurPlanche = Ut.saisirFlottant();
		}

		float marinLargeur = largeurPlanche / 2;
		float marinLongueur = 0;

		while (true){
			if (randomNumber() <= 50){
				marinLongueur += 1;
			} else if (randomNumber() <= 70){
				marinLargeur += 1;
			}else if (randomNumber() <= 90){
				marinLargeur -=1;
			} else {
				marinLongueur -=1;
			}

			if ()
		}
	}
}