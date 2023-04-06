
public class Tabung extends BangunRuang{
	private Lingkaran lingkaran;
	private BangunDatar selimut;
	private double tinggi;
	public Tabung(Lingkaran lingkaran,Kotak selimut) {
		this.lingkaran = lingkaran;
		this.selimut = (BangunDatar) selimut;
		tinggi= selimut.getSisi();
	}
	public Tabung(Lingkaran lingkaran,PersegiPanjang selimut) {
		this.lingkaran = lingkaran;
		this.selimut = (BangunDatar) selimut;
		if(selimut.getPanjang()<selimut.getLebar()) {
			tinggi = selimut.getPanjang();
		}
		else {
			tinggi = selimut.getLebar();
		}
	}
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		
		return lingkaran.luas()*tinggi;
	}

	@Override
	public double luasPermukaan() {
		// TODO Auto-generated method stub
		return lingkaran.luas()+(lingkaran.keliling()*tinggi);
	}

}
