package vittoriovescio.u5w1d1.esercizio2;

public class ExtraSalameDecorator extends ExtraAdditionDecorator {
	public ExtraSalameDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getNome() {
		return pizza.getNome() + " con aggiunta di salame!";
	};

	@Override
	public double getPrezzo() {
		return pizza.getPrezzo() + 1;
	}

	@Override
	public String getIngredienti() {
		return pizza.getIngredienti() + ", con aggiunta di salame";
	}

	@Override
	public int getCalorie() {
		return pizza.getCalorie() + 5;
	}

	@Override
	public String toString() {
		return "[ " + "Nome = " + getNome() + ", Prezzo = " + "€ " + getPrezzo() + ", Ingredienti = " + getIngredienti()
				+ ", Calorie = " + getCalorie() + "]";
	}
}