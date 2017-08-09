package com.deginepatteren.builder;

public class Salary {

	private Income incomeDetails;
	private Deductions deductionDetails;

	private Salary(final Income incomeDetails, final Deductions deductionDetails) {
		this.incomeDetails = incomeDetails;
		this.deductionDetails = deductionDetails;
	}

	public Income getIncomeDetails() {
		return this.incomeDetails;
	}

	public Deductions getDeductionDetails() {
		return this.deductionDetails;
	}

	public static class SalaryBuilder {

		private Income incomeDetails;
		private Deductions deductionDetails;

		public SalaryBuilder(final Income incomeDetails, final Deductions deductionDetails) {
			this.incomeDetails = incomeDetails;
			this.deductionDetails = deductionDetails;
		}

		public Salary build() {
			return new Salary(incomeDetails, deductionDetails);
		}
	}

}
