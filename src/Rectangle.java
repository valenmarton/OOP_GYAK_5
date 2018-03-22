
public class Rectangle {
	
	
	int aSide;
	int bSide;
	
// konstruktor létrehozása manuálisan	
	
	public  Rectangle(int aSide, int bSide) {
		
		this.aSide = aSide;
		this.bSide = bSide;
		
	}
	
	public Rectangle(int sides) {
		this.aSide = sides;
		this.bSide = sides;
	}
	
	public int getArea(){
		return aSide*bSide;
	}

// default metódus, ha meghívjuk syso-ban akkor mindig a toString metódusa fog meghívódni , akkor hívódikk meg mikor stringként hivatkozunk a példányokra  	
	public String toString() {
		return aSide + "," + bSide+ " : " + getArea();
	}

	public int getaSide() {
		return aSide;
	}

	
	

	public int getbSide() {
		return bSide;
	}
	
	public void setSides(int aSide, int bSide) {
		this.aSide = aSide;
		this.bSide = bSide;
	}	

	public void setBothSides(int sides) {
		this.aSide = sides;
		this.bSide = sides;
	}
	
	public boolean hasBiggerAreaThan(Rectangle rectangle){
		if(this.getArea() > rectangle.getArea()){
			return true;
		}
		else return false;
	}
	public boolean hasSameSideLenght(Rectangle rectangle){
		if(this.getaSide()== rectangle.getaSide() && this.getbSide() == rectangle.getbSide() ){
			return true;
		}
		return false;
	}

}
