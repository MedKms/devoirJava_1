
public class DbProduits {
	private double nbProduits;
	private Produit tabP[];
	public DbProduits() {
		this.tabP=new Produit[15];
		this.nbProduits=0;
	}
	public void addToList(Produit p) {
		for(int i=0;i<tabP.length;i++) {
			if(tabP[i]==null) {
				tabP[i]=p;
				break;
			}
		}
		nbProduits++;
	}
	public Produit findByCode(long code) {
		for(int i=0;i<tabP.length;i++)
			if(tabP[i]!=null) {
				if(tabP[i].getCode()==code )		return tabP[i];
			}else break;
				
		return null;
	}
}
