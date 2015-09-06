package com.tutorial.olivepress.press;

import com.tutorial.olivepress.olives.Olive;

public class OlivePress {
	public void getOil(Olive[] olives) {
		for (Olive olive : olives) {
			olive.crush();
		}

	}

}
