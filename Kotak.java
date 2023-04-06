
public class Kotak extends BangunDatar{
	private double sisi;
	public Kotak(double sisi) {
		this.sisi = sisi;
	}
	@Override
	public double luas() {
		// TODO Auto-generated method stub
		return Math.pow(sisi, 2) ;
	}
	@Override
	public double keliling() {
		// TODO Auto-generated method stub
		return ( sisi * 4);
	}
	public void setSisi(double sisi) {
		this.sisi = sisi;
	}
	public double getSisi() {
		return sisi;
	}
}
