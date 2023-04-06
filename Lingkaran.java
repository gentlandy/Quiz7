
public class Lingkaran extends BangunDatar{
	private double r;
	public Lingkaran(double r) {
		this.r = r;
	}
	@Override
	public double luas() {
		// TODO Auto-generated method stub
		return (Math.pow(r, 2)* (314 / 100)) ;
	}
	@Override
	public double keliling() {
		// TODO Auto-generated method stub
		return (r * 2 * (314 / 100));
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getR() {
		return r;
	}
}
