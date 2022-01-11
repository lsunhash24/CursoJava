package cl.desafiolatam.clases;

public class BookDetail extends Book {
	
	private String link;
	private int pages;
	private int year;
	private float price;
	private float lastPrice;
	private boolean delivery;
	
	public BookDetail() {
		super();
	}

	public BookDetail(Integer id, String author, String country, String imageLink, String language, String title,
			String link, int pages, int year, float price, float lastPrice, boolean delivery) {
		super(id, author, country, imageLink, language, title);
		this.link = link;
		this.pages = pages;
		this.year = year;
		this.price = price;
		this.lastPrice = lastPrice;
		this.delivery = delivery;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(float lastPrice) {
		this.lastPrice = lastPrice;
	}

	public boolean isDelivery() {
		return delivery;
	}

	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}

	@Override
	public String toString() {
		return "BookDetail [Id= "+ getId() + ", author= " + getAuthor() + ", country= " + getCountry() + ", imageLink=" + getImageLink() + ", language= " + getLanguage() + ", title= " + getTitle() + ", link=" + link + ", pages=" + pages + ", year=" + year + ", price=" + price + ", lastPrice="
				+ lastPrice + ", delivery=" + delivery + "]\n";
	}

	
	
	
}
