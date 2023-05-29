package vittoriovescio.u5w1d1.esercizio2;

public class Hawaiana extends Pizza {
	public Hawaiana() {
		setNome("Hawaiana");
		setCalorie(getCalorie() + 2);
		setIngredienti(getIngredienti() + ", prosciutto e ananas");
		setPrezzo(prezzo += 2.50);
	}

}
