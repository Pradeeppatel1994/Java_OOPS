package Practices;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hb =new HSBCBank();
		hb.debit();
		hb.credit();
		hb.trasferMoney();
		hb.mutualFund();
		hb.loan();
		hb.autoDeduction();
		hb.withdrawMoney();
		
		System.out.println("Print Value of num of the class: "+hb.min_balance);
		System.out.println("Print Value of num of the interface: "+USBank.min_balance);
		
	}

}
