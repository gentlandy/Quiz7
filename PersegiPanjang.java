
public class PersegiPanjang  extends BangunDatar{
	private double panjang;
	private double lebar;
	public PersegiPanjang(double panjang, double lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}
	@Override
	public double luas() {
		// TODO Auto-generated method stub
		return (panjang * lebar) ;
	}
	@Override
	public double keliling() {
		// TODO Auto-generated method stub
		return ( 2 * (panjang + lebar));
	}
	public void setPanjang(double panjang) {
		this.panjang = panjang;
	}
	public double getPanjang() {
		return panjang;
	}
	public void setLebar(double lebar) {
		this.lebar = lebar;
	}
	public double getLebar() {
		return lebar;
	}
}