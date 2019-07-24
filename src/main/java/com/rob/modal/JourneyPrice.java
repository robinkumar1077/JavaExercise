package com.rob.modal;

public class JourneyPrice {
	
	private Journey journey;
	
	private Double price; //Assumption : price is in £;
	
	private Double discount=0.0; //  //Assumption : discount is in percentage;
	
	private Double netPrice; //Assumption : price is in £; 

	public Journey getJourney() {
		return journey;
	}

	public void setJourney(Journey journey) {
		this.journey = journey;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(Double netPrice) {
		this.netPrice = netPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((discount == null) ? 0 : discount.hashCode());
		result = prime * result + ((journey == null) ? 0 : journey.hashCode());
		result = prime * result + ((netPrice == null) ? 0 : netPrice.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JourneyPrice other = (JourneyPrice) obj;
		if (discount == null) {
			if (other.discount != null)
				return false;
		} else if (!discount.equals(other.discount))
			return false;
		if (journey == null) {
			if (other.journey != null)
				return false;
		} else if (!journey.equals(other.journey))
			return false;
		if (netPrice == null) {
			if (other.netPrice != null)
				return false;
		} else if (!netPrice.equals(other.netPrice))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "JourneyPrice [journey=" + journey + ", price=" + price + ", discount=" + discount + ", netPrice="
				+ netPrice + "]";
	}
	
}
