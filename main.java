import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

import com.google.gson.Gson;

public class main{
	public static String url = "jdbc:sqlserver://localhost:1433;databaseName=Api_Maven;encrypt=true;trustServerCertificate=true";
	public static String user = "sa";
	public static String pass = "root";
	public static Connection con = null;
	
	name name1=new name();
	 currencies currencies1=new currencies();
	 idd idd1=new idd();
	 languages languages1=new languages();
	 translations translations1=new translations();
	 demonyms demonyms1=new demonyms();
	 maps maps1=new maps();
	 car car1=new car();
	 flags flags1=new flags();
	 coatOfArms coatOfArms1=new coatOfArms();
	 capitalInfo capitalInfo1=new capitalInfo();
	 String[]tld;
	 String cca2;
	 String ccn3;
	 String cca3;
	 String cioc;
	 boolean independent;
	 String status;
	 boolean unMember;
	 String []capital;
	 String [] altSpellings;
	 String region;
    String subregion;
    double[] latlng;
    boolean landlocked;
    double area;
    String flag;
    int population;
    String fifa;
    String [] timezones;
    public String[] getTimezones() {
		return timezones;
	}
	public void setTimezones(String[] timezones) {
		this.timezones = timezones;
	}


	public String[] getContinents() {
		return continents;
	}
	public void setContinents(String[] continents) {
		this.continents = continents;
	}

	String [] continents;
    String startOfWeek;
    
	 public name getName1() {
		return name1;
	}
	public void setName1(name name1) {
		this.name1 = name1;
	}
	public currencies getCurrencies1() {
		return currencies1;
	}
	public void setCurrencies1(currencies currencies1) {
		this.currencies1 = currencies1;
	}
	public idd getIdd1() {
		return idd1;
	}
	public void setIdd1(idd idd1) {
		this.idd1 = idd1;
	}
	public languages getLanguages1() {
		return languages1;
	}
	public void setLanguages1(languages languages1) {
		this.languages1 = languages1;
	}
	public translations getTranslations1() {
		return translations1;
	}
	public void setTranslations1(translations translations1) {
		this.translations1 = translations1;
	}
	public demonyms getDemonyms1() {
		return demonyms1;
	}
	public void setDemonyms1(demonyms demonyms1) {
		this.demonyms1 = demonyms1;
	}
	public maps getMaps1() {
		return maps1;
	}
	public void setMaps1(maps maps1) {
		this.maps1 = maps1;
	}
	public car getCar1() {
		return car1;
	}
	public void setCar1(car car1) {
		this.car1 = car1;
	}
	public flags getFlags1() {
		return flags1;
	}
	public void setFlags1(flags flags1) {
		this.flags1 = flags1;
	}
	public coatOfArms getCoatOfArms1() {
		return coatOfArms1;
	}
	public void setCoatOfArms1(coatOfArms coatOfArms1) {
		this.coatOfArms1 = coatOfArms1;
	}
	public capitalInfo getCapitalInfo1() {
		return capitalInfo1;
	}
	public void setCapitalInfo1(capitalInfo capitalInfo1) {
		this.capitalInfo1 = capitalInfo1;
	}
	public String[] getTld() {
		return tld;
	}
	public void setTld(String[] tld) {
		this.tld = tld;
	}
	public String getCca2() {
		return cca2;
	}
	public void setCca2(String cca2) {
		this.cca2 = cca2;
	}
	public String getCcn3() {
		return ccn3;
	}
	public void setCcn3(String ccn3) {
		this.ccn3 = ccn3;
	}
	public String getCca3() {
		return cca3;
	}
	public void setCca3(String cca3) {
		this.cca3 = cca3;
	}
	public String getCioc() {
		return cioc;
	}
	public void setCioc(String cioc) {
		this.cioc = cioc;
	}
	public boolean isIndependent() {
		return independent;
	}
	public void setIndependent(boolean independent) {
		this.independent = independent;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isUnMember() {
		return unMember;
	}
	public void setUnMember(boolean unMember) {
		this.unMember = unMember;
	}
	public String[] getCapital() {
		return capital;
	}
	public void setCapital(String[] capital) {
		this.capital = capital;
	}
	public String[] getAltSpellings() {
		return altSpellings;
	}
	public void setAltSpellings(String[] altSpellings) {
		this.altSpellings = altSpellings;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getSubregion() {
		return subregion;
	}
	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}
	public double[] getLatlng() {
		return latlng;
	}
	public void setLatlng(double[] latlng) {
		this.latlng = latlng;
	}
	public boolean isLandlocked() {
		return landlocked;
	}
	public void setLandlocked(boolean landlocked) {
		this.landlocked = landlocked;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String getFifa() {
		return fifa;
	}
	public void setFifa(String fifa) {
		this.fifa = fifa;
	}
	public String getStartOfWeek() {
		return startOfWeek;
	}
	public void setStartOfWeek(String startOfWeek) {
		this.startOfWeek = startOfWeek;
	}

	 
	 

	 public static void main(String[] args) throws IOException, InterruptedException {
		 insert();
		
  
	
}
	
	
	
	
	
	
	
	
	
	
	 public static void insert() throws IOException, InterruptedException {
			
			
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://restcountries.com/v3.1/all")).build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			String jsonString0 = response.body();

			Gson gson = new Gson();
			main[] data1 = gson.fromJson(jsonString0, main[].class);
			
			for (main r : data1) {
				int independent = r.isIndependent()== true ? 1:0;
				String status=r.getStatus();
				String region=r.getRegion();
				String subregion = r.getSubregion();
				int population = r.getPopulation();
				String startOfWeek = r.getStartOfWeek();
				
		
				
				
				
				 String sql = "insert into MyApi values('"+independent+"', '"+status+"','"+region+"', '"+subregion+"', '"+population+"', '"+startOfWeek+"')";
     		 System.out.println(sql);
				
		         try {

		             Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		             // Registering drivers
		             DriverManager.registerDriver(driver);

		             // Reference to connection interface
		             con = DriverManager.getConnection(url, user,
		                     pass);

		             // Creating a statement
		             Statement st = con.createStatement();
		             int m = st.executeUpdate(sql);
		             
		             con.close();
		         }
		         catch (Exception ex) {

		             System.err.println(ex);
		    	 
		     }


		}}}
