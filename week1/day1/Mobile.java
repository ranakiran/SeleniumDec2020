package week1.day1;

public class Mobile {
	String phoneBrand = "OnePLus";
	int phoneSize = 6;
	boolean isSmartPhone = true;
	Long phoneNumber = 8787878787L;
	String modelNo = "7T";
	double phonePrice = 777.23;
	char simType = 'P';
	
		private void sendSms() {
		System.out.println("Message Sent");
	}
public void makeCall() {
	System.out.println("Call Connected");
}
public static void main (String[] args) {
	Mobile obj = new Mobile();
	obj.sendSms();
	obj.makeCall();
	String brand = obj.phoneBrand;
	System.out.println(brand);
	String model = obj.modelNo;
	System.out.println(model);
	System.out.println(obj.phoneSize);
	System.out.println(obj.phoneNumber);
	System.out.println(obj.phonePrice);
	char type = obj.simType;
	System.out.println(type);
	boolean smart = obj.isSmartPhone;
	System.out.println(smart);
	
	}
}