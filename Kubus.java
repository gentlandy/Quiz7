import java.lang.Math;
public class Kubus extends BangunRuang{
	private Kotak kotak;
	public Kubus(Kotak kotak) {
		this.kotak = kotak;
	}
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		
		return Math.pow(kotak.getSisi(), 3);
	}

	@Override
	public double luasPermukaan() {
		// TODO Auto-generated method stub
		return kotak.luas()*4;
	}

}
