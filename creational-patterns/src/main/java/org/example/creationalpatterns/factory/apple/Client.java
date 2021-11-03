package org.example.creationalpatterns.factory.apple;

import org.example.creationalpatterns.factory.apple.factory.IPhoneFactory;
import org.example.creationalpatterns.factory.apple.factory.Iphone11Factory;
import org.example.creationalpatterns.factory.apple.factory.Iphone11ProFactory;
import org.example.creationalpatterns.factory.apple.factory.IphoneXFactory;
import org.example.creationalpatterns.factory.apple.model.IPhone;

public class Client {

	public static void showIphoneInfo(IPhone iPhone){
		iPhone.getHardware();
		iPhone.assemble();
		iPhone.certificates();
		iPhone.pack();
	}
	
	public static void main(String[] args) {
		IPhoneFactory ixFactory = new IphoneXFactory();
		IPhoneFactory i11Factory = new Iphone11Factory();
		IPhoneFactory i11ProFactory = new Iphone11ProFactory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iPhonex = ixFactory.createIphone();


		showIphoneInfo(iPhonex);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");

		IPhone iphone11Pro = i11ProFactory.createIphone();

		showIphoneInfo(iphone11Pro);

	}
}
