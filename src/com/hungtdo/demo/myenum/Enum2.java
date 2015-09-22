package com.hungtdo.demo.myenum;



public class Enum2 {

	private enum SUBMATHCATE{
		DAISO(3),
		HINHHOC(4);
		
		private int giatri;
		
		SUBMATHCATE(int gt)
		{
			this.giatri = gt;
		}
		
		public int getGiaTri()
		{
			return this.giatri;
		}
	}
	
	public static void main(String[] args)
	{
		com.hungtdo.demo.myenum.Enum1.Category c = com.hungtdo.demo.myenum.Enum1.Category.TOANHOC;
		SUBMATHCATE sub = SUBMATHCATE.HINHHOC;
		c.setValue(sub.getGiaTri());
		
		System.out.println(c.getValue());
	}
}
