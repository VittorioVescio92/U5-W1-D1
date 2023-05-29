package vittoriovescio.u5w1d1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import vittoriovescio.u5w1d1.esercizio1.Esercizio1;
import vittoriovescio.u5w1d1.esercizio2.ExtraBurrataDecorator;
import vittoriovescio.u5w1d1.esercizio2.ExtraPepeDecorator;
import vittoriovescio.u5w1d1.esercizio2.ExtraSalameDecorator;
import vittoriovescio.u5w1d1.esercizio2.Hawaiana;
import vittoriovescio.u5w1d1.esercizio2.Pizza;

@Configuration
public class BeansConfiguration {
	@Bean
	Esercizio1 e1() {
		return new Esercizio1();
	}

	@Bean
	@Primary
	Pizza margherita() {
		return new Pizza();
	}

	@Bean
	Hawaiana hawaiana() {
		return new Hawaiana();
	}

	@Bean
	ExtraPepeDecorator extraPepe(Pizza pizza) {
		return new ExtraPepeDecorator(pizza);
	}

	@Bean
	ExtraSalameDecorator extraSalame(Pizza pizza) {
		return new ExtraSalameDecorator(pizza);
	}

	@Bean
	ExtraBurrataDecorator extraBurrata(Pizza pizza) {
		return new ExtraBurrataDecorator(pizza);
	}
}
