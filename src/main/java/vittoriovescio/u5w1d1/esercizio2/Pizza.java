package vittoriovescio.u5w1d1.esercizio2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {
	protected String nome = "Margherita";
	protected double prezzo = 4.50;
	private long calorie = 500;
	private String ingredienti = "Pomodoro e Mozzarella";

	public Pizza(String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
		;
	}

	@Override
	public String toString() {
		return "[ Nome = " + nome + ", prezzo = € " + prezzo + ", calorie = " + calorie + ", ingredienti = "
				+ ingredienti + "]";
	}

}
