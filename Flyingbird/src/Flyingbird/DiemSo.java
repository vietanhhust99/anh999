package Flyingbird;

public class DiemSo {
	
	private static int diem = 0;
	private ConChim conchimD = new ConChim();
	private OngNuoc ongnuocD= new OngNuoc();
	private static boolean bl1= false;
	private static boolean bl2= false;
	private static boolean bl3= false;
	private static boolean bl4= false;
	
	public static int getDiem() {
		return diem;
	}
	
	 public void congdiem() {
		 if(conchimD.getX()+45 > ongnuocD.getX1() && conchimD.getX()<ongnuocD.getX1()+65) {
			 bl1 = true;
		 }
		 if(bl1 == true && conchimD.getX() > ongnuocD.getX1() + 65) 
		 {
			 diem++;
			 bl1=false; 
		 }
	       
		 if(conchimD.getX()+45 > ongnuocD.getX2() && conchimD.getX()<ongnuocD.getX2()+65) {
			 bl2 = true;
		 }
		 if(bl2 == true && conchimD.getX() > ongnuocD.getX2() + 65) 
		 {
			 diem++;
			 bl2=false; 
		 }
		 
		 if(conchimD.getX()+45 > ongnuocD.getX3() && conchimD.getX()<ongnuocD.getX3()+65) {
			 bl3 = true;
		 }
		 if(bl3 == true && conchimD.getX() > ongnuocD.getX3() + 65) 
		 {
			 diem++;
			 bl3=false; 
		 }
		 if(conchimD.getX()+45 > ongnuocD.getX4() && conchimD.getX()<ongnuocD.getX4()+65) {
			 bl4 = true;
		 }
		 if(bl4 == true && conchimD.getX() > ongnuocD.getX4() + 65) 
		 {
			 diem++;
			 bl4=false; 
		 }
	 }
	 
}