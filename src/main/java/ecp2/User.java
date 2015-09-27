package ecp2;

public class User {

    private int number;

    private String name;

    private String familyName;

    public User(int number, String name, String familyName) {
        this.number = number;
        this.name = this.format(name);
        this.familyName = this.format(familyName);
    }
    
    private String format(String string) {
        string = string.trim();
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public String fullName() {
        return this.name + " " + this.familyName;
    }

    public String initials() {
        return this.name.substring(0, 1) + ".";
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getFamilyName() {
        return this.familyName;
    }
    
    public String nombreLowerComas() {
		char[] Nom = this.name.toCharArray();
    	Nom[0] = Character.toUpperCase(Nom[0]);
    	for (int i = 1; i < this.name.length(); i++) {
    	Nom[i] = Character.toLowerCase(Nom[i]);
    	}
    	String NomS = String.valueOf(Nom);
    	String Ape = (this.familyName).toLowerCase();
    	String cadena = NomS + "," + Ape;
    	return cadena;
    }

}