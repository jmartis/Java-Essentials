package com.tutorial.olivepress.press;

import java.util.Collection;

import com.tutorial.olivepress.olives.Olive;

public interface Press {
	public void getOil(Collection<Olive> olives);

	public int getTotalOil();

	public void setTotalOil(int totalOil);
}
