package com.inheritance;

public class B  {

	private Integer xyz;

	//public A a;
	private String x;
	private int z;
	private double p;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(p);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((x == null) ? 0 : x.hashCode());
		result = prime * result + ((xyz == null) ? 0 : xyz.hashCode());
		result = prime * result + z;
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
		B other = (B) obj;
		if (Double.doubleToLongBits(p) != Double.doubleToLongBits(other.p))
			return false;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		if (xyz == null) {
			if (other.xyz != null)
				return false;
		} else if (!xyz.equals(other.xyz))
			return false;
		if (z != other.z)
			return false;
		return true;
	}

	
	

}
