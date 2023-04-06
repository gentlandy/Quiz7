import java.lang.Math;
public class SegitigaSamaKaki extends Segitiga{
	public SegitigaSamaKaki (double alas, double tinggi) {
		super(alas,tinggi);
	}
	@Override
	public double luas() {
		// TODO Auto-generated method stub
		return alas * tinggi / 2;
	}
	@Override
	public double keliling() {
		// TODO Auto-generated method stub
		double sisi =	Math.sqrt((Math.pow(alas/2, 2)  )+Math.pow(tinggi, 2)); 
		return alas+(sisi*2);
	}
}
