package hash_code_2016;

import java.util.ArrayList;
import java.util.List;

public class Drone 
{
	int x;
	int y;
	int poid_porté;
	List<Integer> liste_type_produit;
	
	public Drone(int x,int y) 
	{
		this.x=0;
		this.y=0;
		this.poid_porté=0;
		this.liste_type_produit=new ArrayList<Integer>();
	}
	
	int ajout(int type_produit)
	{
		liste_type_produit.add(type_produit);
		poid_porté+=/*TODO poid produit*/0;
		return poid_porté;
	}
	
	int retire(int type_produit)
	{
		liste_type_produit.remove(type_produit);
		poid_porté-=/*TODO poid produit*/0;
		return poid_porté;
	}
}
