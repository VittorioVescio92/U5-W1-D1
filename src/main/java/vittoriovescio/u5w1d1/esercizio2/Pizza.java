package vittoriovescio.u5w1d1.esercizio2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class Pizza {
	protected String nome = "Margherita";
	protected double prezzo = 4.50;
	private int calorie = 10;
	private String ingredienti = "Pomodoro e Mozzarella";

	public Pizza(String nome, double prezzo) {
		this.nome = nome;
		;
	}

	@Override
	public String toString() {
		return "[ Nome = " + nome + ", prezzo = € " + prezzo + ", calorie = " + calorie + ", ingredienti = "
				+ ingredienti + "]";
	}

}
