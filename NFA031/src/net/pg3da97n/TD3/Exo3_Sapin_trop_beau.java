package net.pg3da97n.TD3;

import java.util.Scanner;

public class Exo3_Sapin_trop_beau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialisation des paramètres et nb de triangle.
		int NbSapint;
		System.out.println("Commbien de triangle ?");
		Scanner sc = new Scanner(System.in);
		NbSapint = sc.nextInt();
		//nb Sapin
		for(int i = 1;i<=NbSapint;i++) {	
			int coeff = 0;
			for(int a = i + 2;a>0;a--) {
				coeff ++;
				for(int b = a-i + NbSapint; b>0; b--) {
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
					for(int esp = 0; esp< NbSapint + 1 ;esp++) {
						System.out.print(" ");	
					}
					for(int eto = 0; eto<2 ;eto++) {
						System.out.print("*");	
					}
					System.out.println("*");
					}		
		
		
	}
	
}
