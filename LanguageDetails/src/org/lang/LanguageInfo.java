package org.lang;
//child
public class LanguageInfo {
	private void tamilLanguage() {
		System.out.println("Vankam");

	}
	private void englishLanguage() {
		System.out.println("Hello Every one");
		

	}
	
    private void hindiLanguage() {
    	System.out.println("Sukiriya");
	

}
    public static void main(String[] args) {
		LanguageInfo a=new LanguageInfo();
		a.englishLanguage();
		a.hindiLanguage();
		a.tamilLanguage();
		
		StateDetails b=new StateDetails();
			b.NorthIndia();
			b.SouthIndia();
		}
	}



