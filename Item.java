class Item {
	int id;
	String name;
	double price;
	char taxtype;

	//TODO constructor
	Item(int id, String name, double price, char taxtype)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.taxtype = taxtype;
	}
	//TODO setters and getters

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public char getTaxtype() {
		return taxtype;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTaxtype(char taxtype) {
		this.taxtype = taxtype;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	double taxReturn () {
		if (taxtype == A)
		{
			return price*0.18*0.15;
		}
		else if (taxtype == B)
		{
			return price*0.05*0.15;
		}
		else if (taxtype == C)
		{
			return 0.0;
		}
	}
}