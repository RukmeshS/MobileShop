package sampleShop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobileShop {

	public static void main(String[] args) {

		MobileShop shop = new MobileShop();
		shop.isMobile();

	}

	void isMobile() {

		Scanner sc = new Scanner(System.in);
		int phonecount = sc.nextInt();
		List<String> OSlist = new ArrayList<String>();
		List<Integer> Ramlist = new ArrayList<Integer>();
		List<Integer> Memorylist = new ArrayList<Integer>();
		List<Integer> Pricelist = new ArrayList<Integer>();
		List<Integer> Ratinglist = new ArrayList<Integer>();
		for (int i = 0; i < phonecount; i++) {
			OSlist.add(sc.next());
			Ramlist.add(sc.nextInt());
			Memorylist.add(sc.nextInt());
			Pricelist.add(sc.nextInt());
			Ratinglist.add(sc.nextInt());
		}

		int customercount = sc.nextInt();
		List<String> COSlist = new ArrayList<String>();
		List<Integer> CRamlist = new ArrayList<Integer>();
		List<Integer> CMemorylist = new ArrayList<Integer>();
		List<Integer> CPricelist = new ArrayList<Integer>();
		for (int i = 0; i < customercount; i++) {
			COSlist.add(sc.next());
			CRamlist.add(sc.nextInt());
			CMemorylist.add(sc.nextInt());
			CPricelist.add(sc.nextInt());
		}

		for (int i = 0; i < customercount; i++) 
		{

			if (OSlist.contains(COSlist.get(i))) 
			{
				int a = COSlist.indexOf(OSlist.get(i));

				if (Ramlist.get(a).equals(CRamlist.get(i)) && Memorylist.get(a).equals(CMemorylist.get(i)))
				{
					System.out.println(Ratinglist.get(a));
				} 
				
				else 
				{
					System.out.println("-1");
				}
			}
		}
	}

}
