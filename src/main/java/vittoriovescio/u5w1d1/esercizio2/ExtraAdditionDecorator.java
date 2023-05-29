package vittoriovescio.u5w1d1.esercizio2;

public abstract class ExtraAdditionDecorator extends Pizza {
	Pizza pizza;

	@Override
	public abstract String getNome();

	@Override
	public abstract double getPrezzo();

	@Override
	public abstract int getCalorie();

	@Override
	public abstract String getIngredienti();
}