import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner get = new Scanner(System.in);
		ArrayList<BangunDatar> data= new ArrayList<BangunDatar>();
		ArrayList<BangunRuang> datas= new ArrayList<BangunRuang>();
		while(true) {
			System.out.println("Bangun Datar dan Ruang:");
			System.out.println("1. Lingkaran:");
			System.out.println("2. Persegi Panjang:");
			System.out.println("3. Segitiga:");
			System.out.println("4. Kubus:");
			System.out.println("5. Tabung:");
			System.out.println("6. Limas:");
			System.out.println("7. Exit:");
			System.out.println("Chose:");
			String pil = get.nextLine();
			if(pil.equals("1")) {
				System.out.println("Jari-jari:");
				double r = Double.parseDouble(get.nextLine());
				Lingkaran lingkaran =  new Lingkaran(r);
				data.add((BangunDatar)lingkaran);
				System.out.println("Luas Lingkaran : "+ data.get(data.size()-1).luas());
				System.out.println("Keliling Lingkaran : "+ data.get(data.size()-1).keliling());
			}
			else if(pil.equals("2")) {
				System.out.println("Panjang:");
				double panjang = Double.parseDouble(get.nextLine());
				System.out.println("Lebar:");
				double lebar = Double.parseDouble(get.nextLine());
				if(panjang == lebar) {
					Kotak persegi =  new Kotak(panjang);
					data.add((BangunDatar)persegi);
					System.out.println("Luas Persegi : "+ data.get(data.size()-1).luas());
					System.out.println("Keliling Persegi : "+ data.get(data.size()-1).keliling());
				}
				else {
					PersegiPanjang persegiPanjang =  new PersegiPanjang(panjang,lebar);
					data.add((BangunDatar)persegiPanjang);
					System.out.println("Luas Persegi Panjang: "+ data.get(data.size()-1).luas());
					System.out.println("Keliling Persegi Panjang: "+ data.get(data.size()-1).keliling());
				}
			}
			else if(pil.equals("3")) {
				System.out.println("Type Segitiga:");
				System.out.println("1. Segitiga Sama Kaki:");
				System.out.println("2. Segitiga Sama Sisi:");
				System.out.println("3. Segitiga Siku Siku:");
				System.out.println("Chose:");
				String seg = get.nextLine();
				if(seg.equals("1")) {
					System.out.println("Alas:");
					double alas = Double.parseDouble(get.nextLine());
					System.out.println("Tinggi:");
					double tinggi = Double.parseDouble(get.nextLine());
					SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki(alas,tinggi);
					Segitiga segitiga = (Segitiga)segitigaSamaKaki;
					data.add((BangunDatar)segitiga);
					System.out.println("Luas Segitiga Sama Kaki : "+ data.get(data.size()-1).luas());
					System.out.println("Keliling Segitiga Sama Kaki : "+ data.get(data.size()-1).keliling());
				}
				else if(seg.equals("2")) {
					System.out.println("Alas:");
					double alas = Double.parseDouble(get.nextLine());
					SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi(alas);
					Segitiga segitiga = (Segitiga)segitigaSamaSisi;
					data.add((BangunDatar)segitiga);
					System.out.println("Luas Segitiga Sama Sisi : "+ data.get(data.size()-1).luas());
					System.out.println("Keliling Segitiga Sama Sisi : "+ data.get(data.size()-1).keliling());
				}
				else if(seg.equals("3")) {
					System.out.println("Alas:");
					double alas = Double.parseDouble(get.nextLine());
					System.out.println("Tinggi:");
					double tinggi = Double.parseDouble(get.nextLine());
					SegitigaSikuSiku segitigaSikuSiku = new SegitigaSikuSiku(alas,tinggi);
					Segitiga segitiga = (Segitiga)segitigaSikuSiku;
					data.add((BangunDatar)segitiga);
					System.out.println("Luas Segitiga Siku Siku : "+ data.get(data.size()-1).luas());
					System.out.println("Keliling Segitiga Siku Siku : "+ data.get(data.size()-1).keliling());
				}
			}
			else if(pil.equals("4")) {
				ArrayList<Kotak> kotak = new ArrayList<Kotak>();
				for(int i=0;i<data.size();i++) {
					if(data.get(i) instanceof Kotak) {
						kotak.add((Kotak) data.get(i));
					}
				}
				if(kotak.size()==0) {
					System.out.println("Anda Tidak Mempunyai Kotak");
				}
				else {
					System.out.println("Kotak:");
					for(int i=0;i<kotak.size();i++) {
						System.out.println((i+1)+". Persegi sisi : "+kotak.get(i).getSisi());
					}
					System.out.println("choise");
					int index = Integer.parseInt(get.nextLine());
					Kubus kubus =  new Kubus(kotak.get(index-1));
					datas.add((BangunRuang)kubus);
					System.out.println("Luas Permukaan : "+ datas.get(datas.size()-1).luasPermukaan());
					System.out.println("Volume : "+ datas.get(datas.size()-1).volume());
					
				}
			}
			else if(pil.equals("5")) {
				ArrayList<Lingkaran> lingkaran = new ArrayList<Lingkaran>();
				ArrayList<BangunDatar> selimut = new ArrayList<BangunDatar>();
				for(int i=0;i<data.size();i++) {
					if(data.get(i) instanceof Lingkaran) {
						lingkaran.add((Lingkaran) data.get(i));
					}
					else if(data.get(i) instanceof Kotak) {
						selimut.add( data.get(i));
					}
					else if(data.get(i) instanceof PersegiPanjang) {
						selimut.add( data.get(i));
					}
				}
				if(lingkaran.size()==0 || selimut.size()==0 ) {
					if(selimut.size()==0  ) {
						System.out.println("Anda Tidak Mempunyai Kotak atau Persegi Panjang");
					}
					if(lingkaran.size()==0  ) {
						System.out.println("Anda Tidak Mempunyai Lingkarang");
					}
				}
				else {
					System.out.println("Selimut:");
					for(int i=0;i<selimut.size();i++) {
						if(selimut.get(i) instanceof Kotak) {
							Kotak temp = (Kotak) selimut.get(i);
							System.out.println((i+1)+". Persegi dengan sisi : "+(temp.getSisi()));
						}
						else{
							PersegiPanjang temp = (PersegiPanjang) selimut.get(i);
							System.out.println((i+1)+". Persegi Panjang dengan Panjang : "+temp.getPanjang() +" dan Lebar : "+temp.getLebar());
						}
					}
					System.out.println("choise");
					int index1 = Integer.parseInt(get.nextLine());
					System.out.println("Lingkaran:");
					for(int i=0;i<selimut.size();i++) {
						System.out.println((i+1)+". Lingkaran jari-jari : "+lingkaran.get(i).getR());
					}
					System.out.println("choise");
					int index2 = Integer.parseInt(get.nextLine());
					Tabung tabung;
					if(selimut.get(index1-1) instanceof Kotak) {
						Kotak temp = (Kotak)selimut.get(index1-1);
						tabung =  new Tabung(lingkaran.get(index2-1),temp);
					}
					else {
						PersegiPanjang temp = (PersegiPanjang)selimut.get(index1-1);
						tabung =  new Tabung(lingkaran.get(index2-1),temp);
						
					}
					datas.add((BangunRuang)tabung);
					System.out.println("Luas Permukaan : "+ datas.get(datas.size()-1).luasPermukaan());
					System.out.println("Volume : "+ datas.get(datas.size()-1).volume());
					
				}
			}
			else if(pil.equals("6")) {
				ArrayList<Kotak> kotak = new ArrayList<Kotak>();
				ArrayList<SegitigaSamaKaki> segitigaSamaKaki = new ArrayList<SegitigaSamaKaki>();
				for(int i=0;i<data.size();i++) {
					if(data.get(i) instanceof Kotak) {
						kotak.add((Kotak) data.get(i));
					}
					else if(data.get(i) instanceof Segitiga) {
						Segitiga temp = (Segitiga) data.get(i);
						if(temp instanceof SegitigaSamaKaki) {
							SegitigaSamaKaki temp1 = (SegitigaSamaKaki) data.get(i);
							segitigaSamaKaki.add(temp1);
						}
					}
				}
				if(kotak.size()==0 || segitigaSamaKaki.size()==0 ) {
					if(kotak.size()==0  ) {
						System.out.println("Anda Tidak Mempunyai Kotak ");
					}
					if(segitigaSamaKaki.size()==0  ) {
						System.out.println("Anda Tidak Mempunyai Segitiga Sama Kaki");
					}
				}
				else {
					System.out.println("Segitiga Sama Kaki:");
					for(int i=0;i<segitigaSamaKaki.size();i++) {
						System.out.println((i+1)+". Segitiga Sama Kaki dengan Alas: "+segitigaSamaKaki.get(i).getAlas() +" dan Tinggi : "+segitigaSamaKaki.get(i).getTinggi());
					}
					System.out.println("choise");
					int index1 = Integer.parseInt(get.nextLine());
					System.out.println("Kotak:");
					for(int i=0;i<kotak.size();i++) {
						System.out.println((i+1)+". Persegi sisi : "+kotak.get(i).getSisi());
					}
					System.out.println("choise");
					int index2 = Integer.parseInt(get.nextLine());
					Limas limas;
					limas =  new Limas(kotak.get(index2-1),segitigaSamaKaki.get(index1-1));
					datas.add((BangunRuang)limas);
					System.out.println("Luas Permukaan : "+ datas.get(datas.size()-1).luasPermukaan());
					System.out.println("Volume : "+ datas.get(datas.size()-1).volume());
					
				}
			}
		}
	}
}
