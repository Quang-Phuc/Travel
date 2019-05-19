package edu.fa.common;

public class PageAction {
	public interface UserPage {
		public static final String LOGIN = "login";
		public static final String VIEW_ADMIN = "adminHome";
		public static final String VIEW_POST = "view-post";
		public static final String REGISTER = "register";
		public static final String LISTSUBJECT = "listSubject";
	}
	
	public interface HomePage {
		public static final String VIEWHOME = "viewHome";
		public static final String VIEW_ADMIN = "adminHome";
		public static final String VIEW_POST = "view-post";
		public static final String SAVE_HOME = "saveHome";		
	}
	
	public interface TravelPage {
		public static final String VIEWTRAVEL = "viewTravel";
		public static final String SAVETRAVEL = "savetravel";
		public static final String EDITTRAVEL = "EditTravel";
		
	}
	
	public interface TravelContentPage {
		public static final String VIEWTRAVELCONTENT = "viewContentTravel";
		public static final String SAVETRAVELCONTENT = "saveContentTravel";
		public static final String EDITTRAVELCONTENT = "EditContentTravel";
		
	}
	public interface SalePage {
		public static final String VIEWSALE = "viewSale";
		public static final String SAVESALE = "saveSale";
		public static final String EDITSALE = "EditSale";
		
	}
	public interface PlanesPage {
		public static final String VIEWPLANES = "viewPlanes";
		public static final String SAVEPLANES = "savePlanes";
		
		
	}
	public interface CarPage {
		public static final String VIEWCAR = "viewCar";
		public static final String SAVECAR = "saveCar";
		public static final String EDITCAR = "EditCar";
		
	}


	
}
