package com.main;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] birler = new String[] {"","bir","iki","uc","dort","beş","alti","yedi","sekiz","dokuz"};
		String[] onlar = new String[] {"","on","yirmi","otuz","kirk","elli","altmıs","yetmis","seksen","doksan"};
		String[] yüzler = new String[] {"","yuz","iki yuz","uc yuz","dort yuz","bes yuz","alti yuz","yedi yuz","sekiz yuz","dokuz yuz"};
		int rakam = 376409;
		int yüzbinlerBasamağı = rakam/100000;
		int onbinlerBasamağı  = rakam%100000/10000;
		int binlerBasamağı    = rakam%10000/1000;
		int yüzlerBasamağı    = rakam%1000/100;
		int onlarBasamağı     = rakam%100/10;
		int birlerBasamağı    = rakam%10/1;		
		String yazı = yüzler[yüzbinlerBasamağı]+" "+onlar[onbinlerBasamağı]+" "+birler[binlerBasamağı];
		if (rakam>999) {yazı = yazı+" bin ";}
		yazı = yazı+yüzler[yüzlerBasamağı]+" "+onlar[onlarBasamağı]+" "+birler[birlerBasamağı];
		System.out.println("yazı = "+yazı);
		for (int i = 0; i < yazı.length(); i++) {
			if(yazı.substring(0,1).equals(" ")) yazı = yazı.substring((1));else break;			
		}
		System.out.println("yazı = "+yazı);
	}

}
