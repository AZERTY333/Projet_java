package net.pg3da97n.TD3;

import java.util.Scanner;

public class Exo2_Sapin_trop_laid {
	public static void main(String[]args) {
		// Initialisation des paramètres et nb de triangle.
		int NbSapint;
		System.out.println("Commbien de triangle ?");
		Scanner sc = new Scanner(System.in);
		NbSapint = sc.nextInt();
		int ligne = 4;		
		
		//nb de sapin
		for(int i = NbSapint;i>0;i--) {	
			//numéro de ligne pour les étoiles
			int coeff = 0;	
			//numéro de ligne pour les espaces
			for(int a = ligne; a>0; a--) {
				coeff ++;
				for(int b = a; b>0; b--) {
					System.out.print(" ");
				}
				//Construction des triangles
				for(int c = 0;c<2*coeff - 2;c ++) {
					System.out.print("*");					
				}
				System.out.println("*");
			}
		}
// Fabrication du tronc du sapin. 
			for(int ret = 0; ret<=4;ret ++) {		
			for(int esp = 0; esp<3 ;esp++) {
				System.out.print(" ");	
			}
			for(int eto = 0; eto<2 ;eto++) {
				System.out.print("*");	
			}
			System.out.println("*");
			}
		
	}

}
