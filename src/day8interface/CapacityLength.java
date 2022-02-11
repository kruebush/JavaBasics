package day8interface;

public class CapacityLength {

	public static void main(String[] args) {
		StringBuffer data = new StringBuffer("123456789");
		
	/*	
		System.out.println("length"+ data.length());//length = 0
		System.out.println("capacity"+ data.capacity());// cap 16+ length
		
		data.append ("hello");
		System.out.println("length"+ data.length());//l=5
		System.out.println("capacity"+ data.capacity());//c=11 not 11 c= 16 can not be less than value
		
		data.append ("hello goodby");
		System.out.println("length"+ data.length());//l=17 
		System.out.println("capacity"+ data.capacity());//c =34 once length goes over 16 use the formula using last kown capacity c+1*2 (17+1(*2)=34)
		
				data.append ("hy");
		System.out.println("length"+ data.length());//l=19
		System.out.println("capacity"+ data.capacity());//c =34
		*/
		
		//more examples do not forget to add from main
			/*
			System.out.println("length"+ data.length());//length = 3
			System.out.println("capacity"+ data.capacity());// cap 16+ length=19
			
			data.append ("456789 10 111111111111");
			System.out.println("length"+ data.length());//l=25
			System.out.println("capacity"+ data.capacity());//c=40 Once
			
			data.append ("3231232");
			System.out.println("length"+ data.length());//l=32
			System.out.println("capacity"+ data.capacity());//c =40
			
					data.append ("334");
			System.out.println("length"+ data.length());//l=34
			System.out.println("capacity"+ data.capacity());//c =40
			
			data.append ("6054165165165165165165165");
			System.out.println("length"+ data.length());//l=60
			System.out.println("capacity"+ data.capacity());//c =82
			*/
			
			////Another example
			
			System.out.println("length"+ data.length());//length = 9
			System.out.println("capacity"+ data.capacity());// cap 16+ length=25
			
			data.append ("123456789 10 11 12 13 14 15 23");
			System.out.println("length"+ data.length());//l=39
			System.out.println("capacity"+ data.capacity());//c=52
			
			data.append ("24 26 28 30 32 34");
			System.out.println("length"+ data.length());//l=56
			System.out.println("capacity"+ data.capacity());//c =106
			
					data.append ("36");
			System.out.println("length"+ data.length());//l=58
			System.out.println("capacity"+ data.capacity());//c =106
			
			data.append ("38 40 42 44 46 48 50 52 54 56 58 60 62 6455662556");
			System.out.println("length"+ data.length());//l=107
			System.out.println("capacity"+ data.capacity());//c =214
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		

	}

}
