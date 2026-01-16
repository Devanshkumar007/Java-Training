package Collection_AND_WrapperClass;

public class BoxingUnboxing {
	public static void main(String[] args) {
		
		//Boxing primitive -> nonPrimitive 				//Unboxing nonPrimitive-> primitive
		
		
		//------------------------BOXING--------------------------------------
		//Implicit 						//Explicit
		byte b = 1 ;					Byte b2 = Byte.valueOf(b);
		Byte b1 = b ;
		
		short s = 10;					Short s2 = Short.valueOf(s);
		Short s1 = s;
		
		int i = 100 ;					Integer i2 = Integer.valueOf(i);
		Integer i1 = i ;
		
		long l = 1000L;					Long l2 = Long.valueOf(l);
		Long l1 = l;
		
		float f = 10000f;				Float f2 = Float.valueOf(f);
		Float f1 = f;
		
		double d = 100000.00;			Double d2 =Double.valueOf(d);
		Double d1 = d;
		
		char c = 'd';					Character c2 = Character.valueOf(c);
		Character c1 = c;
		
		boolean bl = true;				Boolean bl2= Boolean.valueOf(bl);						
		Boolean bl1 = bl ;
		
		
		//-------------------UNBOXING-----------------------------------
		byte by = b1 ;					byte by2 = b2.byteValue();
		short sh = s ;					short sh2  =s2.shortValue();
		int in = i ;					int in2 = i2.intValue();
		long lo = l ;					long lo2 = l2.longValue();
		float fl = f ;					float fl2 = f2.floatValue();
		double dou = d ;				double do2 = b2.doubleValue();
		char ch = c;					char ch2 = c2.charValue();
		boolean bo = bl ;				boolean bo2 = bl2.booleanValue();
		
		
		
		
		
		
		
		
		
		
	}
}
