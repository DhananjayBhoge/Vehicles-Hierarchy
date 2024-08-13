package project;

import java.util.Scanner;

class Vehicle
{
	String Model_Name;
	String Engine_Type;
	String Fuel_Capacity;
	String Mileage;
	double price;
}

//All TwoWheelers
class TwoWheeler extends Vehicle
{
	String Brk_system;
	String Sus_type;
}

class Bike extends TwoWheeler
{
	String Super_Charger;
}

class RoyalEnfield extends Bike 
{
	public void choose_your_RE_bike()
	{
		Scanner sc3 = new Scanner(System.in);
		int choice3 = sc3.nextInt();

		switch (choice3)
		{
		case 1: System.out.println(" ");
				System.out.println("RoyalEnfield_Bikes");

				Classic clc = new Classic("Classic 350", "4 Stroke Engine", "13 L", "41.55 kmpl", 150000.00);
				System.out.println(" ");
				System.out.println("Specifications for TwoWheeler of RoyalEnfield : ");
			    System.out.println(" ");
				System.out.println("Model Name    : " + clc.Model_Name);
			    System.out.println("Engine Type   : " + clc.Engine_Type);
				System.out.println("Fuel Capacity : " + clc.Fuel_Capacity);
				System.out.println("Mileage       : " + clc.Mileage);
				System.out.println("price         : " + clc.price);
				break;

		case 2: System.out.println(" ");
				System.out.println("RoyalEnfield_Bikes");

				ThunderBird thndr = new ThunderBird("ThunderBird 350X", "4 Stroke Engine", "20 L", "42.00 kmpl", 300000.00);
				System.out.println(" ");
				System.out.println("Specifications for TwoWheeler of RoyalEnfield : ");
				System.out.println(" ");
				System.out.println("Model Name    : " + thndr.Model_Name);
				System.out.println("Engine Type   : " + thndr.Engine_Type);
				System.out.println("Fuel Capacity : " + thndr.Fuel_Capacity);
				System.out.println("Mileage       : " + thndr.Mileage);
				System.out.println("price         : " + thndr.price);
				break;

	   default: System.out.println("Sorry Model is not available");
				break;

		}
	}
}

class Classic extends RoyalEnfield
{
	Classic(String Model_Name, String Engine_Type, String Fuel_Capacity, String Mileage, double price) 
	{												// we are using constructor for initializing values
		this.Model_Name = Model_Name;
		this.Engine_Type = Engine_Type;
		this.Fuel_Capacity = Fuel_Capacity;
		this.Mileage = Mileage;
		this.price = price;
	}
}

class ThunderBird extends RoyalEnfield
{
	ThunderBird(String Model_Name, String Engine_Type, String Fuel_Capacity, String Mileage, double price) 
	{											    // we are using constructor for initializing values
		this.Model_Name = Model_Name;
		this.Engine_Type = Engine_Type;
		this.Fuel_Capacity = Fuel_Capacity;
		this.Mileage = Mileage;
		this.price = price;
	}
}

class TVS extends Bike 
{
	public void choose_your_TVS_bike()
	{
		String TVS_Model_1 = "TVS-MDL-1";
		String TVS_Model_2 = "TVS-MDL-2";

		switch ("TVS-MDL-2")
		{
		case "TVS-MDL-1": System.out.println(" ");
						  System.out.println("TVS_Bikes");
				
					   	  Jupiter jupi = new Jupiter("Classic scooty", "4 Stroke Engine", "06 L", "55.00 kmpl", 77743.00);
						  System.out.println(" ");
						  System.out.println("Specifications for TwoWheeler of TVS : ");
						  System.out.println(" ");
						  System.out.println("Model Name    : " + jupi.Model_Name);
						  System.out.println("Engine Type   : " + jupi.Engine_Type);
						  System.out.println("Fuel Capacity : " + jupi.Fuel_Capacity);
						  System.out.println("Mileage       : " + jupi.Mileage);
						  System.out.println("price         : " + jupi.price);
						  break;

				
		case "TVS-MDL-2": System.out.println(" ");
						  System.out.println("TVS_Bikes");

						  Apache apa = new Apache("RTR 160", "4 Stroke Engine", "12 L", "45.00 kmpl", 109700.00);
						  System.out.println(" ");
						  System.out.println("Specifications for TwoWheeler of TVS : ");
						  System.out.println(" ");
						  System.out.println("Model Name    : " + apa.Model_Name);
						  System.out.println("Engine Type   : " + apa.Engine_Type);
						  System.out.println("Fuel Capacity : " + apa.Fuel_Capacity);
						  System.out.println("Mileage       : " + apa.Mileage);
						  System.out.println("price         : " + apa.price);
						  break;

				 default: System.out.println("Sorry Model is not available");
						  break;

		}
	}
}

class Jupiter extends TVS
{
	Jupiter(String Model_Name, String Engine_Type, String Fuel_Capacity, String Mileage, double price) 
	{																	
		this.Model_Name = Model_Name;
		this.Engine_Type = Engine_Type;
		this.Fuel_Capacity = Fuel_Capacity;
		this.Mileage = Mileage;
		this.price = price;
	}

}

class Apache extends TVS
{
	Apache(String Model_Name, String Engine_Type, String Fuel_Capacity, String Mileage, double price)
	{
		this.Model_Name = Model_Name;
		this.Engine_Type = Engine_Type;
		this.Fuel_Capacity = Fuel_Capacity;
		this.Mileage = Mileage;
		this.price = price;
	}
}

class Kawasaki extends Bike 
{
	public void choose_your_Kawasaki_bike()
	{
		Scanner sc4 = new Scanner(System.in);
		int choice4 = sc4.nextInt();

		switch (choice4)
		{
		case 1: System.out.println(" ");
				System.out.println("Kawasaki_Bikes");

				Ninja_H2 h2 = new Ninja_H2("Ninja H2", "4 Stroke Engine", "17 L", "12.00 kmpl", "YES",3400000.00);
				System.out.println(" ");
				System.out.println("Specifications for TwoWheeler of Kawasaki : ");
			    System.out.println(" ");
				System.out.println("Model Name      : " + h2.Model_Name);
			    System.out.println("Engine Type     : " + h2.Engine_Type);
				System.out.println("Fuel Capacity   : " + h2.Fuel_Capacity);
				System.out.println("Mileage         : " + h2.Mileage);
				System.out.println("Super Charger   : " + h2.Super_Charger);
				System.out.println("price           : " + h2.price);
				break;

		case 2: System.out.println(" ");
				System.out.println("Kawasaki_Bikes");

				Ninja_H2R h2r = new Ninja_H2R("Ninja H2R", "4 Stroke Engine", "17 L", "12.00 kmpl", "YES", 7990000.00);
				System.out.println(" ");
				System.out.println("Specifications for TwoWheeler of Kawasaki : ");
				System.out.println(" ");
				System.out.println("Model Name      : " + h2r.Model_Name);
				System.out.println("Engine Type     : " + h2r.Engine_Type);
				System.out.println("Fuel Capacity   : " + h2r.Fuel_Capacity);
				System.out.println("Mileage         : " + h2r.Mileage);
				System.out.println("Super Charger   : " + h2r.Super_Charger);
				System.out.println("price           : " + h2r.price);
				break;

	   default: System.out.println("Sorry Model is not available");
				break;

		}
	}
}

class Ninja_H2 extends Kawasaki
{
	Ninja_H2(String Model_Name, String Engine_Type, String Fuel_Capacity, String Mileage, String Super_Charger, double price) 
	{
		this.Model_Name = Model_Name;
		this.Engine_Type = Engine_Type;
		this.Fuel_Capacity = Fuel_Capacity;
		this.Mileage = Mileage;
		this.Super_Charger = Super_Charger;
		this.price = price;
	}

}

class Ninja_H2R extends Kawasaki
{
	Ninja_H2R(String Model_Name, String Engine_Type, String Fuel_Capacity, String Mileage, String Super_Charger, double price) 
	{
		this.Model_Name = Model_Name;
		this.Engine_Type = Engine_Type;
		this.Fuel_Capacity = Fuel_Capacity;
		this.Mileage = Mileage;
		this.Super_Charger = Super_Charger;
		this.price = price;
	}
}

class Cycle extends TwoWheeler
{
	String Cycle_name;
	String weight;
//No need to declare price again because we already declared it inside parent class.
}

class Hercules extends Cycle
{
	public void choose_your_HRLS_cycle()
	{
		Scanner sc6 = new Scanner(System.in);
		int choice6 = sc6.nextInt();

		switch (choice6)
		{
		case 1: System.out.println(" ");
				System.out.println("Hercules_Cycles");

				Hercules20T hr20t = new Hercules20T("Streetcat Pro 20T", "Disc brake", "Rigid Sus", "16.5kg", 6500.00);
				System.out.println(" ");
				System.out.println("Specifications for Cycle of Hercules : ");
			    System.out.println(" ");
				System.out.println("Cycle Name    : " + hr20t.Cycle_name);
			    System.out.println("Brk System    : " + hr20t.Brk_system);
				System.out.println("Sus Type      : " + hr20t.Sus_type);
				System.out.println("Weight        : " + hr20t.weight);
				System.out.println("Price         : " + hr20t.price);
				break;

		case 2: System.out.println(" ");
				System.out.println("Hercules_Cycles");

				Hercules26T hr26t = new Hercules26T("Streetcat Pro 26T", "Disc brake", "Rigid Sus", "18.5kg", 7500.00);
				System.out.println(" ");
				System.out.println("Specifications for Cycle of Hercules : ");
				System.out.println(" ");
				System.out.println("Cycle Name    : " + hr26t.Cycle_name);
				System.out.println("Brk System    : " + hr26t.Brk_system);
				System.out.println("Sus Type      : " + hr26t.Sus_type);
				System.out.println("Weight        : " + hr26t.weight);
				System.out.println("Price         : " + hr26t.price);
				break;

	   default: System.out.println("Sorry Model is not available");
				break;
		}
	}
}

class Hercules20T extends Hercules
{
	Hercules20T(String Cycle_name, String Brk_system, String Sus_type, String weight, double price)
	{
		this.Cycle_name = Cycle_name;
		this.Brk_system = Brk_system;
		this.Sus_type = Sus_type;
		this.weight = weight;
		this.price = price;
	}
}

class Hercules26T extends Hercules
{
	Hercules26T(String Cycle_name, String Brk_system, String Sus_type, String weight, double price)
	{
		this.Cycle_name = Cycle_name;
		this.Brk_system = Brk_system;
		this.Sus_type = Sus_type;
		this.weight = weight;
		this.price = price;
	}
}


class Firefox extends Cycle
{
	public void choose_your_Firefox_cycle()
	{
		Scanner sc7 = new Scanner(System.in);
		int choice7 = sc7.nextInt();

		switch (choice7)
		{
		case 1: System.out.println(" ");
				System.out.println("Firefox_Cycles");

				Firefox_Spirit fisp = new Firefox_Spirit("Firefox Spirit", "Disc brake", "Rigid Sus", "19.00kg", 18900.00);
				System.out.println(" ");
				System.out.println("Specifications for Cycle of Firefox : ");
			    System.out.println(" ");
				System.out.println("Cycle Name    : " + fisp.Cycle_name);
			    System.out.println("Brk System    : " + fisp.Brk_system);
				System.out.println("Sus Type      : " + fisp.Sus_type);
				System.out.println("Weight        : " + fisp.weight);
				System.out.println("Price         : " + fisp.price);
				break;

		case 2: System.out.println(" ");
				System.out.println("Firefox_Cycles");

				Firefox_Swagfire fisg = new Firefox_Swagfire("Firefox Swagfire", "Disc brake", "Rigid Sus", "20.00kg", 29800.00);
				System.out.println(" ");
				System.out.println("Specifications for Cycle of Firefox : ");
				System.out.println(" ");
				System.out.println("Cycle Name    : " + fisg.Cycle_name);
				System.out.println("Brk System    : " + fisg.Brk_system);
				System.out.println("Sus Type      : " + fisg.Sus_type);
				System.out.println("Weight        : " + fisg.weight);
				System.out.println("Price         : " + fisg.price);
				break;

	   default: System.out.println("Sorry Model is not available");
				break;
		}
	}
}

class Firefox_Spirit extends Firefox
{
	Firefox_Spirit(String Cycle_name, String Brk_system, String Sus_type, String weight, double price)
	{
		this.Cycle_name = Cycle_name;
		this.Brk_system = Brk_system;
		this.Sus_type = Sus_type;
		this.weight = weight;
		this.price = price;
	}
}

class Firefox_Swagfire extends Firefox
{
	Firefox_Swagfire(String Cycle_name, String Brk_system, String Sus_type, String weight, double price)
	{
		this.Cycle_name = Cycle_name;
		this.Brk_system = Brk_system;
		this.Sus_type = Sus_type;
		this.weight = weight;
		this.price = price;
	}
}


//All ThreeWheelers
class ThreeWheeler extends Vehicle
{
	String Chassis_Type;
	String Auto_color;
	double price;
}

class Bajaj extends ThreeWheeler
{
	public void choose_your_BajajAuto_cycle()
	{
		Scanner sc18 = new Scanner(System.in);
		int choice18 = sc18.nextInt();

		switch (choice18)
		{
		case 1: System.out.println(" ");
				System.out.println("Bajaj Auto");

				BJ_Atrksw bb1617R = new BJ_Atrksw("Bajaj Compact RE", "CNG","8.0 L", "27.00 kmpkg", "Chassis with Cabin", "Yellow-Green", 227000.00);
				System.out.println(" ");
				System.out.println("Specifications for ThreeWheeler of Bajaj Auto : ");
			    System.out.println(" ");
				System.out.println("Model Name          : " + bb1617R.Model_Name);
			    System.out.println("Engine Type         : " + bb1617R.Engine_Type);
				System.out.println("Fuel Capacity       : " + bb1617R.Fuel_Capacity);
				System.out.println("Mileage             : " + bb1617R.Mileage);
				System.out.println("Chassis Type        : " + bb1617R.Chassis_Type);
				System.out.println("Auto color          : " + bb1617R.Auto_color);
				System.out.println("Price               : " + bb1617R.price);
				break;

	   default: System.out.println("Sorry Model is not available");
				break;
		}
	}
}

class BJ_Atrksw extends Bajaj
{
	BJ_Atrksw(String Model_Name, String Engine_Type, String Fuel_Capacity, String Mileage, String Chassis_Type, String Auto_color, double price)
	{
		this.Model_Name = Model_Name;
		this.Engine_Type = Engine_Type;
		this.Fuel_Capacity = Fuel_Capacity;
		this.Mileage = Mileage;
		this.Chassis_Type = Chassis_Type;
		this.Auto_color = Auto_color;
		this.price = price;	
	}
}


//All FourWheelers
class FourWheeler extends Vehicle
{
	String All_Wheel_Drive;
	String Hatchback;
	String Price; //sub class variable not from super class
	//Model_Name, Engine_Type, Fuel_Capacity, Milage from vehicle class which is parent class
}

class Mercedes extends FourWheeler
{
	public void choose_your_MB_car()
	{
		Scanner sc9 = new Scanner(System.in);
		int choice9 = sc9.nextInt();

		switch (choice9)
		{
		case 1: System.out.println(" ");
				System.out.println("Mercedes Benz");

				Mercedes_GLS GLS = new Mercedes_GLS("MB-Maybach GLS", "Petrol Engine", "90.00 L", "8.5 kmpl", "YES", "YES", "2.80 Crore");
				System.out.println(" ");
				System.out.println("Specifications for FourWheeler of Mercedes Benz : ");
			    System.out.println(" ");
				System.out.println("Model Name       : " + GLS.Model_Name);
			    System.out.println("Engine Type      : " + GLS.Engine_Type);
				System.out.println("Fuel Capacity    : " + GLS.Fuel_Capacity);
				System.out.println("Mileage          : " + GLS.Mileage);
				System.out.println("All Wheel Drive  : " + GLS.All_Wheel_Drive);
				System.out.println("Hatchback        : " + GLS.Hatchback);
				System.out.println("Price            : " + GLS.Price);
				break;

		case 2: System.out.println(" ");
				System.out.println("Mercedes Benz");

				MercedesAMG_GT AMG = new MercedesAMG_GT("MB-AMG GT", "Petrol Engine", "80.00 L", "11.00 kmpl", "YES", "NO", "2.71 Crore");
				System.out.println(" ");
				System.out.println("Specifications for FourWheeler of Mercedes Benz : ");
				System.out.println(" ");
				System.out.println("Model Name       : " + AMG.Model_Name);
			    System.out.println("Engine Type      : " + AMG.Engine_Type);
				System.out.println("Fuel Capacity    : " + AMG.Fuel_Capacity);
				System.out.println("Mileage          : " + AMG.Mileage);
				System.out.println("All Wheel Drive  : " + AMG.All_Wheel_Drive);
				System.out.println("Hatchback        : " + AMG.Hatchback);
				System.out.println("Price            : " + AMG.Price);
				break;

	   default: System.out.println("Sorry Model is not available");
				break;
		}
	}
	
}

class Mercedes_GLS extends Mercedes
{ 
	Mercedes_GLS(String Model_Name, String Engine_Type, String Fuel_Capacity, String Mileage, String All_Wheel_Drive, String Hatchback, String Price)
	{
		this.Model_Name = Model_Name;
		this.Engine_Type = Engine_Type;
		this.Fuel_Capacity = Fuel_Capacity;
		this.Mileage = Mileage;
		this.All_Wheel_Drive = All_Wheel_Drive;
		this.Hatchback = Hatchback;
		this.Price = Price;
	}
}

class MercedesAMG_GT extends Mercedes
{ 
	MercedesAMG_GT(String Model_Name, String Engine_Type, String Fuel_Capacity, String Mileage, String All_Wheel_Drive, String Hatchback, String Price)
	{
		this.Model_Name = Model_Name;
		this.Engine_Type = Engine_Type;
		this.Fuel_Capacity = Fuel_Capacity;
		this.Mileage = Mileage;
		this.All_Wheel_Drive = All_Wheel_Drive;
		this.Hatchback = Hatchback;
		this.Price = Price;
	}
}

class BMW extends FourWheeler
{
	public void choose_your_BMW_car()
	{
		Scanner sc10 = new Scanner(System.in);
		int choice10 = sc10.nextInt();

		switch (choice10)
		{
		case 1: System.out.println(" ");
				System.out.println("BMW");

				BMW_X6 x6 = new BMW_X6("BMW_X6", "Petrol Engine", "83.00 L", "8.0 to 10.0 kmpl", "YES", "NO", "1.01 Crore");
				System.out.println(" ");
				System.out.println("Specifications for FourWheeler of BMW : ");
			    System.out.println(" ");
				System.out.println("Model Name       : " + x6.Model_Name);
			    System.out.println("Engine Type      : " + x6.Engine_Type);
				System.out.println("Fuel Capacity    : " + x6.Fuel_Capacity);
				System.out.println("Mileage          : " + x6.Mileage);
				System.out.println("All Wheel Drive  : " + x6.All_Wheel_Drive);
				System.out.println("Hatchback        : " + x6.Hatchback);
				System.out.println("Price            : " + x6.Price);
				break;

		case 2: System.out.println(" ");
				System.out.println("BMW");

				BMW_7s AMG = new BMW_7s("BMW 7 Series", "Petrol Engine", "46.00 to 78.00 L", "8.0 to 40.0 kmpl", "YES", "YES", "2.46 Crore");
				System.out.println(" ");
				System.out.println("Specifications for FourWheeler of BMW : ");
				System.out.println(" ");
				System.out.println("Model Name       : " + AMG.Model_Name);
			    System.out.println("Engine Type      : " + AMG.Engine_Type);
				System.out.println("Fuel Capacity    : " + AMG.Fuel_Capacity);
				System.out.println("Mileage          : " + AMG.Mileage);
				System.out.println("All Wheel Drive  : " + AMG.All_Wheel_Drive);
				System.out.println("Hatchback        : " + AMG.Hatchback);
				System.out.println("Price            : " + AMG.Price);
				break;

	   default: System.out.println("Sorry Model is not available");
				break;
		}
	}
	
}

class BMW_X6 extends BMW
{ 
	BMW_X6(String Model_Name, String Engine_Type, String Fuel_Capacity, String Mileage, String All_Wheel_Drive, String Hatchback, String Price)
	{
		this.Model_Name = Model_Name;
		this.Engine_Type = Engine_Type;
		this.Fuel_Capacity = Fuel_Capacity;
		this.Mileage = Mileage;
		this.All_Wheel_Drive = All_Wheel_Drive;
		this.Hatchback = Hatchback;
		this.Price = Price;
	}
}

class BMW_7s extends BMW
{ 
	BMW_7s(String Model_Name, String Engine_Type, String Fuel_Capacity, String Mileage, String All_Wheel_Drive, String Hatchback, String Price)
	{
		this.Model_Name = Model_Name;
		this.Engine_Type = Engine_Type;
		this.Fuel_Capacity = Fuel_Capacity;
		this.Mileage = Mileage;
		this.All_Wheel_Drive = All_Wheel_Drive;
		this.Hatchback = Hatchback;
		this.Price = Price;
	}
}

class Suzuki extends FourWheeler
{
	public void choose_your_Suzuki_car()
	{
		Scanner sc12 = new Scanner(System.in);
		int choice12 = sc12.nextInt();

		switch (choice12)
		{
		case 1: System.out.println(" ");
				System.out.println("Suzuki");

				Ertiga ertg = new Ertiga("Ertiga", "Diesel Engine", "45 to 60 L", "18.0 to 16.0 kmpl", "YES", "YES", "12.00 Lakhs");
				System.out.println(" ");
				System.out.println("Specifications for FourWheeler of Suzuki : ");
			    System.out.println(" ");
				System.out.println("Model Name       : " + ertg.Model_Name);
			    System.out.println("Engine Type      : " + ertg.Engine_Type);
				System.out.println("Fuel Capacity    : " + ertg.Fuel_Capacity);
				System.out.println("Mileage          : " + ertg.Mileage);
				System.out.println("All Wheel Drive  : " + ertg.All_Wheel_Drive);
				System.out.println("Hatchback        : " + ertg.Hatchback);
				System.out.println("Price            : " + ertg.Price);
				break;

	   default: System.out.println("Sorry Model is not available");
				break;
		}
	}

}

class Ertiga extends Suzuki
{ 
	Ertiga(String Model_Name, String Engine_Type, String Fuel_Capacity, String Mileage, String All_Wheel_Drive, String Hatchback, String Price)
	{
		this.Model_Name = Model_Name;
		this.Engine_Type = Engine_Type;
		this.Fuel_Capacity = Fuel_Capacity;
		this.Mileage = Mileage;
		this.All_Wheel_Drive = All_Wheel_Drive;
		this.Hatchback = Hatchback;
		this.Price = Price;
	}
}

//All Six Wheelers
class SixWheeler extends Vehicle
{
	String Gross_Weight;
	String Electric_Battery;
	String Price; //sub class variable not from super class
}

class Ashok_Leyland extends SixWheeler
{
	public void choose_your_ASKLND_Truck()
	{
		Scanner sc15 = new Scanner(System.in);
		int choice15 = sc15.nextInt();

		switch (choice15)
		{
		case 1: System.out.println(" ");
				System.out.println("Ashok Leyland");

				AL_1618 al1618 = new AL_1618("Ashok Leyland 1618", "Diesel Engine", "300 L", "18.0 kmpl", "16.2 Tonne", "24 V 110 Ah","14.40 Lakhs");
				System.out.println(" ");
				System.out.println("Specifications for SixWheeler of Ashok Leyland : ");
			    System.out.println(" ");
				System.out.println("Model Name          : " + al1618.Model_Name);
			    System.out.println("Engine Type         : " + al1618.Engine_Type);
				System.out.println("Fuel Capacity       : " + al1618.Fuel_Capacity);
				System.out.println("Mileage             : " + al1618.Mileage);
				System.out.println("Gross Weight        : " + al1618.Gross_Weight);
				System.out.println("Electric Battery    : " + al1618.Electric_Battery);
				System.out.println("Price               : " + al1618.Price);
				break;

	   default: System.out.println("Sorry Model is not available");
				break;
		}
	}
}

class AL_1618 extends Ashok_Leyland
{
	AL_1618(String Model_Name, String Engine_Type, String Fuel_Capacity, String Mileage, String Gross_Weight, String Electric_Battery, String Price)
	{
		this.Model_Name = Model_Name;
		this.Engine_Type = Engine_Type;
		this.Fuel_Capacity = Fuel_Capacity;
		this.Mileage = Mileage;
		this.Gross_Weight = Gross_Weight;
		this.Electric_Battery = Electric_Battery;
		this.Price = Price;
	}
}

class Bharat_Benz extends SixWheeler
{
	public void choose_your_BRTBENZ_Truck()
	{
		Scanner sc16 = new Scanner(System.in);
		int choice16 = sc16.nextInt();

		switch (choice16)
		{
		case 1: System.out.println(" ");
				System.out.println("Bharat Benz");

				BB_1617R bb1617R = new BB_1617R("Bharat Benz 1617R", "Diesel Engine", "215 L", "17.00 kmpl", "16.2 Tonne", "24 V 110 Ah","22.19 to 23.85 Lakhs");
				System.out.println(" ");
				System.out.println("Specifications for SixWheeler of Bharat Benz : ");
			    System.out.println(" ");
				System.out.println("Model Name          : " + bb1617R.Model_Name);
			    System.out.println("Engine Type         : " + bb1617R.Engine_Type);
				System.out.println("Fuel Capacity       : " + bb1617R.Fuel_Capacity);
				System.out.println("Mileage             : " + bb1617R.Mileage);
				System.out.println("Gross Weight        : " + bb1617R.Gross_Weight);
				System.out.println("Electric Battery    : " + bb1617R.Electric_Battery);
				System.out.println("Price               : " + bb1617R.Price);
				break;

	   default: System.out.println("Sorry Model is not available");
				break;
		}
	}
}

class BB_1617R extends Bharat_Benz
{
	BB_1617R(String Model_Name, String Engine_Type, String Fuel_Capacity, String Mileage, String Gross_Weight, String Electric_Battery, String Price)
	{
		this.Model_Name = Model_Name;
		this.Engine_Type = Engine_Type;
		this.Fuel_Capacity = Fuel_Capacity;
		this.Mileage = Mileage;
		this.Gross_Weight = Gross_Weight;
		this.Electric_Battery = Electric_Battery;
		this.Price = Price;
	}
}

//Driver Class
public class DriverVehicle
{
	public static void main(String[] agrs)
	{
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("                    *****__Welcome to Dhananjay AutoHUB__*****                    ");
		System.out.println(" ");
		System.out.println("Choose Your Vehicle Here: ");
		System.out.println("1.For Two-Wheelers\n2.For Three-Wheelers\n3.For Four-Wheelers\n4.For Six-Wheelers\n");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch (choice)
		{
		case 1: System.out.println("1.Bike\n2.Cycle\n");

				Scanner sc1 = new Scanner(System.in);
				int choice1 = sc1.nextInt();

				switch (choice1)
				{
				case 1: System.out.println("1.Royal Enfield\n2.TVS\n3.Kawasaki\n");

						Scanner sc2 = new Scanner(System.in);
						int choice2 = sc2.nextInt();

						switch (choice2)
						{
						case 1: System.out.println("1.RE-Classic 350\n2.RE-ThunderBird\n");
								RoyalEnfield RE = new RoyalEnfield();
								RE.choose_your_RE_bike();
								break;

						case 2: System.out.println("1.TVS-Jupiter Classic\n2.TVS-RTR 160\n");
								TVS tvs = new TVS();
								tvs.choose_your_TVS_bike();
								break;

						case 3: System.out.println("1.Kawasaki-Ninja_H2\n2.Kawasaki-Ninja_H2R\n");
								Kawasaki kawa = new Kawasaki();
								kawa.choose_your_Kawasaki_bike();
								break;

					    default: System.out.println("Sorry Model is not available");
								 break;
						}
						break;

				case 2: System.out.println("1.Hercules Cycles\n2.Firefox Cycles\n");
					
					    Scanner sc5 = new Scanner(System.in);
						int choice5 = sc5.nextInt();
						
						switch (choice5)
						{
						case 1: System.out.println("1.Hercules Streetcat Pro 20T\n2.Hercules Streetcat Pro 26T\n");
								Hercules hrls = new Hercules();
								hrls.choose_your_HRLS_cycle();
								break;

						case 2: System.out.println("1.Firefox Spirit\n2.Firefox Swagfire\n");
								Firefox frfx = new Firefox();
								frfx.choose_your_Firefox_cycle();
								break;

					   default: System.out.println("Sorry Model is not available");
								break;
						}
						break;
				}
				break;

		case 2: System.out.println("1.Bajaj Auto\n");

				Scanner sc17 = new Scanner(System.in);
				int choice17 = sc17.nextInt();

				switch (choice17)
				{
				case 1: System.out.println(" ");
						System.out.println("1.Auto Rickshaw\n");
						
						Bajaj bj = new Bajaj();
						bj.choose_your_BajajAuto_cycle();
						break;
				}
				break;

		case 3: System.out.println("1.Petrol Engine\n2.Diesel Engine\n");
				
				Scanner sc8 = new Scanner(System.in);
				int choice8 = sc8.nextInt();

				switch (choice8)
				{
				case 1: System.out.println("1.Mercedes-Benz\n2.BMW\n");
				
						Scanner sc9 = new Scanner(System.in);
						int choice9 = sc9.nextInt();	
						
						switch (choice9)
						{
						case 1: System.out.println("1.MB-Maybach GLS\n2.MB-AMG GT\n");
								Mercedes MB = new Mercedes();
								MB.choose_your_MB_car();
								break;

						case 2: System.out.println("1.BMW X6\n2.BMW 7 Series\n");
								BMW bmw = new BMW();
								bmw.choose_your_BMW_car();
								break;

					  default : System.out.println("Sorry Model is not available");
					  			break;
						}
						break;

				case 2: System.out.println("1.Suzuki\n");
						
						Scanner sc11 = new Scanner(System.in);
						int choice11 = sc11.nextInt();	
						
						switch (choice11)
						{
						case 1: System.out.println("1.Ertiga\n");
								Suzuki suzu = new Suzuki();
								suzu.choose_your_Suzuki_car();
								break;

					  default : System.out.println("Sorry Model is not available");
					  			break;
						}
						break;
				}
				break;

		case 4: System.out.println("1.Ashok Leyland\n2.Bharat Benz\n");
				
				Scanner sc13 = new Scanner(System.in);
				int choice13 = sc13.nextInt();

				switch (choice13)
				{
				case 1: System.out.println("1.Ashok Leyland 1618\n");
				
						Ashok_Leyland asklnd = new Ashok_Leyland();
						asklnd.choose_your_ASKLND_Truck();
						break;

				case 2: System.out.println("1.Bharat Benz 1617R\n");
				
						Bharat_Benz brtbenz = new Bharat_Benz();
						brtbenz.choose_your_BRTBENZ_Truck();
						break;

			  default : System.out.println("Sorry Model is not available");
					  	break;

				}
		}
	}
}