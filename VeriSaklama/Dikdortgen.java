package VeriSaklama;

public class Dikdortgen {
	private double en;
	private double boy;
	//yapýlandýrýcý kullanýrsan nesne çaðýrýrken deðerleri ekle.
/*	public Dikdortgen(double en, double boy) {
		setEn(en);
		setBoy(boy);
	}*/

	public double Alan(){
		return getEn()*getBoy();
	}

	public double getEn() {
		return en;
	}

	public void setEn(double en) {
		this.en = en;
		if (en<0){
			this.en=0;
		}
	}

	public double getBoy() {
		return boy;
	}

	public void setBoy(double boy) {
		this.boy = boy;
		if (boy<0){
			this.boy=0;
		}
	}
}
