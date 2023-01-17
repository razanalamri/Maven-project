import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

import com.google.gson.Gson;

public class name {
	
	String common;
    String official;
    nativeName nativeName1;
	
	  public String getCommon() {
		return common;
	}
	public void setCommon(String common) {
		this.common = common;
	}
	public String getOfficial() {
		return official;
	}
	public void setOfficial(String official) {
		this.official = official;
	}
	public nativeName getNativeName1() {
		return nativeName1;
	}
	public void setNativeName1(nativeName nativeName1) {
		this.nativeName1 = nativeName1;
	}
	

}
