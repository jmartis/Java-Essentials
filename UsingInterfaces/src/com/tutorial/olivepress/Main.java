package com.tutorial.olivepress;

import java.util.ArrayList;

import com.tutorial.olivepress.olives.Kalamata;
import com.tutorial.olivepress.olives.Ligurian;
import com.tutorial.olivepress.olives.Olive;
import com.tutorial.olivepress.press.OlivePress;

public class Main {

	public static void main(String[] args) {

		ArrayList<Olive> olives = new ArrayList<Olive>();

		Olive olive;

		olive = new Kalamata();
		olives.add(olive);

		olive = new Ligurian();
		olives.add(olive);

		olive = new Kalamata();
		olives.add(olive);

		OlivePress press = new OlivePress();
		press.getOil(olives);

		System.out.println("You got " + press.getTotalOil() + " units of oil");

		press.getOil(olives);

		System.out.println("You got " + press.getTotalOil() + " units of oil");

		// cast objects down
		Kalamata olive1 = (Kalamata) olives.get(0);
		System.out.println("Olive 1 is from " + olive1.getOrigin());

	}

}