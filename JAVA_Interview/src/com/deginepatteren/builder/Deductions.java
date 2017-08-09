package com.deginepatteren.builder;

import java.io.Serializable;

public class Deductions implements Serializable {

	private MoneyDetails section80c;
	private MoneyDetails section80cc;
	private MoneyDetails section80ccd;
	private MoneyDetails sectionother;

	private Deductions(final MoneyDetails section80c, final MoneyDetails section80cc, final MoneyDetails section80ccd,
			final MoneyDetails sectionother) {
		this.section80c = section80c;
		this.section80cc = section80cc;
		this.section80ccd = section80ccd;
	}

	public MoneyDetails getSection80c() {
		return section80c;
	}

	public MoneyDetails getSection80cc() {
		return section80cc;
	}

	public MoneyDetails getSection80ccd() {
		return section80ccd;
	}

	public MoneyDetails getSectionother() {
		return sectionother;
	}

	public static class DeductionsBuilder {
		private MoneyDetails section80c;
		private MoneyDetails section80cc;
		private MoneyDetails section80ccd;
		private MoneyDetails sectionother;

		private DeductionsBuilder(final MoneyDetails section80c, final MoneyDetails section80cc,
				final MoneyDetails section80ccd, final MoneyDetails sectionother) {
			this.section80c = section80c;
			this.section80cc = section80cc;
			this.section80ccd = section80ccd;
		}

		public Deductions build() {
			return new Deductions(section80c, section80cc, section80ccd, sectionother);
		}
	}
}
