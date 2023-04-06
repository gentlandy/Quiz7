public class SegitigaSamaSisi extends Segitiga{
	public SegitigaSamaSisi (double alas) {
		super(alas,alas);
	}
	@Override
	public double luas() {
		// TODO Auto-generated method stub
		double tinggi =	Math.sqrt(Math.pow(alas, 2)-(Math.pow(alas/2, 2) )); 
		return alas * tinggi / 2;
	}
	@Override
	public double keliling() { 
		return alas*3;
	}
}
