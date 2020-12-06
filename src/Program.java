import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long code;
		Produit p1= new Produit(1, "Galaxy-S1",2, 1000);
		Produit p2= new Produit(2, "Galaxy-S2",2, 2000 );
		Produit p3= new Produit(3, "Galaxy-S3",2, 3000 );
		Produit p4= new Produit(4, "Galaxy-S4",2, 4000);
		Produit p5= new Produit(5, "Galaxy-S5",2, 5000);
		DbProduits db=new DbProduits();
		db.addToList(p1);
		db.addToList(p2);
		db.addToList(p3);
		db.addToList(p4);
		db.addToList(p5);
		System.out.println("Saisir code de produit chercher");
		code=scan.nextLong();
		Produit p=db.findByCode(code);
		if(p!=null) System.out.println(p.getDetail());
	}
}
