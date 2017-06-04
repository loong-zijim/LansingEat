package model;

import org.json.JSONArray;
import org.json.JSONException;

public class Restaurant {
	
    // * Performed data cleanup and purify from Yelp API.
    public static String parseString(String str) {
   	 return str.replace("\"", "\\\"").replace("/", " or ");
    }
 
    public static String jsonArrayToString(JSONArray array) {
   	 StringBuilder sb = new StringBuilder();
   	 try {
   		 for (int i = 0; i < array.length(); i++) {
   			 String obj = (String) array.get(i);
   			 sb.append(obj);
   			 if (i != array.length() - 1) {
   				 sb.append(",");
   			 }
   		 }
   	 } catch (JSONException e) {
   		 e.printStackTrace();
   	 }
   	 return sb.toString();
    }
 
    public static JSONArray stringToJSONArray(String str) {
   	 try {
   	 	return new JSONArray("[" + parseString(str) + "]");
 
   	 } catch (JSONException e) {
   		 e.printStackTrace();
   	 }
   	 return null;
    }

	
    private String businessId;
    private String name;
    private String categories;
    private String city;
    private String state;
    private String fullAddress;
    private double stars;
    private double latitude;
    private double longitude;
    private String imageUrl;
    private String url;
    
    
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public double getStars() {
		return stars;
	}
	public void setStars(double stars) {
		this.stars = stars;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
    
    
    
}
