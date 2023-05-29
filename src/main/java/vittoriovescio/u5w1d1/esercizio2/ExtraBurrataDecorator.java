package vittoriovescio.u5w1d1.esercizio2;

public class ExtraBurrataDecorator extends ExtraAdditionDecorator {
	public ExtraBurrataDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getNome() {
		return pizza.getNome() + " con in aggiunta una burrata fresca!";
	};

	@Override
	public double getPrezzo() {
		return pizza.getPrezzo() + 1.50;
	}

	@Override
	public String getIngredienti() {
		return pizza.getIngredienti() + ", con in aggiunta una burrata fresca";
	}

	@Override
	public long getCalorie() {
		return pizza.getCalorie() + 250;
	}

	@Override
	public String toString() {
		return "[ " + "Nome = " + getNome() + ", Prezzo = " + "€ " + getPrezzo() + ", Ingredienti = " + getIngredienti()
				+ ", Calorie = " + getCalorie() + "]";
	}
}
