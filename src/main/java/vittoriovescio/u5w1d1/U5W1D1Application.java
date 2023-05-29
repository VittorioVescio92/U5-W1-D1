package vittoriovescio.u5w1d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import vittoriovescio.u5w1d1.config.BeansConfiguration;
import vittoriovescio.u5w1d1.esercizio1.Esercizio1;
import vittoriovescio.u5w1d1.esercizio2.ExtraBurrataDecorator;
import vittoriovescio.u5w1d1.esercizio2.ExtraPepeDecorator;
import vittoriovescio.u5w1d1.esercizio2.ExtraSalameDecorator;
import vittoriovescio.u5w1d1.esercizio2.Hawaiana;
import vittoriovescio.u5w1d1.esercizio2.Pizza;

@SpringBootApplication
public class U5W1D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W1D1Application.class, args);
		configWithConfigurationAnnotation();
	}

	public static void configWithConfigurationAnnotation() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);
		Esercizio1 e1 = (Esercizio1) ctx.getBean("e1");

		// ESERCIZIO 1
		System.out.println("*************************** esercizio 1 ***************************");
		System.out.println();

		e1.saluto();

		// ESERCIZIO 2
		System.out.println("*************************** esercizio 2 ***************************");
		System.out.println();

		Pizza margherita = (Pizza) ctx.getBean("margherita");
		Hawaiana hawaiana = (Hawaiana) ctx.getBean("hawaiana");
		ExtraPepeDecorator margheritaExtraPepe = (ExtraPepeDecorator) ctx.getBean("extraPepe");
		ExtraSalameDecorator margheritaExtraSalame = (ExtraSalameDecorator) ctx.getBean("extraSalame");
		ExtraBurrataDecorator margheritaConBurrata = (ExtraBurrataDecorator) ctx.getBean("extraBurrata");
		ExtraBurrataDecorator margheritaSalameBurrata = new ExtraBurrataDecorator(new ExtraSalameDecorator(margherita));

		System.out.println("1. " + margherita.toString());
		System.out.println("2. " + hawaiana.toString());
		System.out.println("3. " + margheritaExtraPepe.toString());
		System.out.println("4. " + margheritaExtraSalame.toString());
		System.out.println("5. " + margheritaConBurrata.toString());
		System.out.println("6. " + margheritaSalameBurrata.toString());

		ctx.close();
	}
}
