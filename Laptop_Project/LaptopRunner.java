package Projects_05.Laptop;

import java.util.Scanner;

public class LaptopRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PriceForOneLaptop f1=new PriceForOneLaptop();
		
		System.out.println("============ URUN LISTESI ============");
		Data liste = new Data();
		for (int i = 1100000; i < 1100008; i++) {
			int laptopId=i;
			System.out.println("Urun id : "+ laptopId+" \n" +liste.AllData(laptopId)+"\n");
		}
		
		System.out.print("Lutfen istediginiz urunun id`sini giriniz : ");
        int num= f1.getPrice(scan.nextInt());
        System.out.println();
        System.out.println("Toplam fiyat "+num);
        System.out.println("Indirimli fiyat "+ f1.getDiscount(num, 20));

	}

}
