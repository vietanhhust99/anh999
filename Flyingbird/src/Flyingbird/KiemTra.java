package Flyingbird;

public class KiemTra {
	
	private ConChim conchimK = new ConChim();
    private OngNuoc ongnuocK = new OngNuoc();
                     
	public boolean chet() {
		
		if(conchimK.getY()+45>=400) {
		return true;
	}
		if (conchimK.getY() <= ongnuocK.getH1() && (((conchimK.getX() + 45) >= ongnuocK.getX1())) && conchimK.getX() <= (ongnuocK.getX1() + 65)) {
            return true;
        }
        if ((conchimK.getY() + 45) >= (ongnuocK.getH1() + 100) && ((conchimK.getX() + 45) >= ongnuocK.getX1() && conchimK.getX() <= (ongnuocK.getX1() + 65))) {
            return true;
        }
        
        
        //--------
        if (conchimK.getY() <= ongnuocK.getH2() && (((conchimK.getX() + 45) >= ongnuocK.getX2())) && conchimK.getX() <= (ongnuocK.getX2() + 65)) {
            return true;
        }
        if ((conchimK.getY() + 45) >= (ongnuocK.getH2() + 100) && ((conchimK.getX() + 45) >= ongnuocK.getX2() && conchimK.getX() <= (ongnuocK.getX2() + 65))) {
            return true;
        }
        
        
        //--------
        if (conchimK.getY() <= ongnuocK.getH3() && (((conchimK.getX() + 45) >= ongnuocK.getX3())) && conchimK.getX() <= (ongnuocK.getX3() + 65)) {
            return true;    
        }
        if ((conchimK.getY() + 45) >= (ongnuocK.getH3() + 100) && ((conchimK.getX() + 45) >= ongnuocK.getX3() && conchimK.getX() <= (ongnuocK.getX3() + 65))) {
            return true;
        }
        
        
        //--------
        if (conchimK.getY() <= ongnuocK.getH4() && (((conchimK.getX() + 45) >= ongnuocK.getX4())) && conchimK.getX() <= (ongnuocK.getX4() + 65)) {
            return true;
        }
        if ((conchimK.getY() + 45) >= (ongnuocK.getH4() + 100) && ((conchimK.getX() + 45) >= ongnuocK.getX4() && conchimK.getX() <= (ongnuocK.getX4() + 65))) {
            return true;
        }
		
		
		
		
		return false;
	}
}
