package com.deginepatteren.chainofresponsibility;

public class Currency {
	
	private int amount;
	private Integer aamount1;
	private Double amount3;
	private String name;
	

	public int getAmount() {
		return amount;
	}

	public Currency(int amt){
		this.amount=amt;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aamount1 == null) ? 0 : aamount1.hashCode());
		result = prime * result + amount;
		result = prime * result + ((amount3 == null) ? 0 : amount3.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Currency other = (Currency) obj;
		if (aamount1 == null) {
			if (other.aamount1 != null)
				return false;
		} else if (!aamount1.equals(other.aamount1))
			return false;
		if (amount != other.amount)
			return false;
		if (amount3 == null) {
			if (other.amount3 != null)
				return false;
		} else if (!amount3.equals(other.amount3))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



}
