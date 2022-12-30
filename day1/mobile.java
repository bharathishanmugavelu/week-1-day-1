package Week1.day1;

public class mobile {

public void makeCall() {
float mobileWeight = 0.563f;
String mobileModel = "Xp500";
System.out.println("Make call to bharathi");

System.out.println(mobileWeight);
System.out.println(mobileModel);

}
public void sendMsg() {
	// TODO Auto-generated method stub
	boolean isFullyCharged = true;
	int mobileCost = 100000;
System.out.println("Send Msg to emergency");
System.out.println(isFullyCharged);
System.out.println(mobileCost);



}
public static void main(String[] args) {
	mobile lava=new mobile ();
	lava.makeCall();
	lava.sendMsg();


	
}
}

