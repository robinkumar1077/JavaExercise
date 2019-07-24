package com.rob.modal;

import java.util.Date;

public class Journey {

	private Integer journeyId;

	private Customer customer;

	private Date journeyStartDate;

	private String routeName;

	public Integer getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(Integer journeyId) {
		this.journeyId = journeyId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getJourneyStartDate() {
		return journeyStartDate;
	}

	public void setJourneyStartDate(Date journeyStartDate) {
		this.journeyStartDate = journeyStartDate;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((journeyId == null) ? 0 : journeyId.hashCode());
		result = prime * result + ((journeyStartDate == null) ? 0 : journeyStartDate.hashCode());
		result = prime * result + ((routeName == null) ? 0 : routeName.hashCode());
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
		Journey other = (Journey) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (journeyId == null) {
			if (other.journeyId != null)
				return false;
		} else if (!journeyId.equals(other.journeyId))
			return false;
		if (journeyStartDate == null) {
			if (other.journeyStartDate != null)
				return false;
		} else if (!journeyStartDate.equals(other.journeyStartDate))
			return false;
		if (routeName == null) {
			if (other.routeName != null)
				return false;
		} else if (!routeName.equals(other.routeName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Journey [journeyId=" + journeyId + ", customer=" + customer + ", journeyStartDate=" + journeyStartDate
				+ ", routeName=" + routeName + "]";
	}

}
