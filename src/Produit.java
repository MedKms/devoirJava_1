
public class Produit {
	private long code;
	private String  designation;
	private int  qte;
	private double  prix;
	private double  total;
	public Produit(long code, String designation, int qte, double prix) {
		this.code = code;
		this.designation = designation;
		setQte(qte);
		this.prix = prix;
	}
	public Produit(String designation, double prix) {
		this.designation = designation;
		this.prix = prix;
	}
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
		this.total=this.prix*this.qte;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
		this.total=this.prix*this.qte;
	}
	public String getDetail() {
		return designation+"\t"+qte+"\t"+prix+"\t"+total;
	}
	
}
