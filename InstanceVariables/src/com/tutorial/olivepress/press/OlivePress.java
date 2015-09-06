package com.tutorial.olivepress.press;

import java.util.ArrayList;
import com.tutorial.olivepress.olives.Olive;

public class OlivePress {
	public void getOil(ArrayList<Olive> olives) {

		int oil = 0;

		for (Olive olive : olives) {
			oil += olive.crush();
		}

		System.out.println("You got " + oil + " units of oil");

	}

}
