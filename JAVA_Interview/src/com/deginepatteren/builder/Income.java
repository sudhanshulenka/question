package com.deginepatteren.builder;

public class Income {

	private MoneyDetails basic;
	private MoneyDetails hra;
	private MoneyDetails pf;

	private Income(final MoneyDetails basic, MoneyDetails hra, MoneyDetails pf) {
		this.basic = basic;
		this.hra = hra;
		this.pf = pf;
	}

	public MoneyDetails getBasic() {
		return basic;
	}

	public MoneyDetails getHra() {
		return hra;
	}

	public MoneyDetails getPf() {
		return pf;
	}

	public static class IncomeBuilder {
		private MoneyDetails basic;
		private MoneyDetails hra;
		private MoneyDetails pf;

		public IncomeBuilder(final MoneyDetails basic, final MoneyDetails hra, final MoneyDetails pf) {
			this.basic = basic;
			this.hra = hra;
			this.pf = pf;
		}

		public Income build() {
			return new Income(basic, hra, pf);
		}
	}

}
