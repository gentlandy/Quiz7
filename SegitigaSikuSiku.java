public class SegitigaSikuSiku extends Segitiga{
	private double tinggi;
	public SegitigaSikuSiku (double alas, double tinggi) {
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
		double sisi =	Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi ,2)); 
		return alas+tinggi+sisi;
	}
}
