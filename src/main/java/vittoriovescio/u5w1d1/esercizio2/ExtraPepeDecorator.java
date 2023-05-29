package vittoriovescio.u5w1d1.esercizio2;

public class ExtraPepeDecorator extends ExtraAdditionDecorator {
	public ExtraPepeDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getNome() {
		return pizza.getNome() + " con aggiunta di pepe!";
	};

	@Override
	public double getPrezzo() {
		return pizza.getPrezzo() + 0.20;
	}

	@Override
	public String getIngredienti() {
		return pizza.getIngredienti() + ", con aggiunta di pepe";
	}

	@Override
	public int getCalorie() {
		return pizza.getCalorie() + 2;
	}

	@Override
	public String toString() {
		return "[ " + "Nome = " + getNome() + ", Prezzo = " + "€ " + getPrezzo() + ", Ingredienti = " + getIngredienti()
				+ ", Calorie = " + getCalorie() + "]";
	}

}
