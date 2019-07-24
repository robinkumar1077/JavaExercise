package com.rob.modal;

import com.rob.app.enums.CustomerType;

public class Customer {
	
	private Integer customerId;
	
	private CustomerType customerType;
	
	private String customerName;
	
	private String favouriteRoute;
	
	public Customer() {
		super();
	}

	public Customer(Integer customerId) {
		super();
		this.customerId = customerId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getFavouriteRoute() {
		return favouriteRoute;
	}

	public void setFavouriteRoute(String favouriteRoute) {
		this.favouriteRoute = favouriteRoute;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerType=" + customerType + ", customerName="
				+ customerName + ", favouriteRoute=" + favouriteRoute + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((customerType == null) ? 0 : customerType.hashCode());
		result = prime * result + ((favouriteRoute == null) ? 0 : favouriteRoute.hashCode());
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
		Customer other = (Customer) obj;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (customerType != other.customerType)
			return false;
		if (favouriteRoute == null) {
			if (other.favouriteRoute != null)
				return false;
		} else if (!favouriteRoute.equals(other.favouriteRoute))
			return false;
		return true;
	}

}
