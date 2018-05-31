package invoice;

public class Invoice {
	String  partnumber;
	String discription;
	int quality;
	double price,total;
	public String getPartnumber() {
		return partnumber;
	}
	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public int getQuality() {
		if(quality<0){
			this.quality=0;
			
		}
		else
		{
			
		}
	
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<0)
		{
			this.price=0;
		}
		else {
			
		
		this.price = price;
		}
	}
	public double gettotal() {
		double total=quality*price;
		return total;
		
	}
	
	public static void main(String args[]) {
		Invoice invoice=new Invoice();
		invoice.setQuality(3);
		invoice.setPrice(100);
		invoice.setDiscription("bolt");
		System.out.println(invoice.getQuality());
		System.out.println(invoice.gettotal());
		
	}
	
	}
	
