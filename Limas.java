import java.lang.Math;
public class Limas extends BangunRuang{
	private Kotak kotak;
	private SegitigaSamaKaki segitiga;
	private double tinggi;
	public Limas(Kotak kotak,SegitigaSamaKaki segitiga) {
		this.kotak = kotak;
		this.segitiga = segitiga;
		tinggi= Math.sqrt((Math.pow(segitiga.getTinggi(),2)-((kotak.getSisi()/2)*(kotak.getSisi()/2))));
	}
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		
		return kotak.luas()*tinggi/2;
	}

	@Override
	public double luasPermukaan() {
		// TODO Auto-generated method stub
		return kotak.luas()+(segitiga.luas()*4);
	}

}
