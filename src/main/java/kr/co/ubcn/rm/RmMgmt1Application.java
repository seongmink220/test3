package kr.co.ubcn.rm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kr.co.ubcn.rm.rmchk.ReadFile;
import kr.co.ubcn.rm.rmchk.RmChkProc;

/*
@SpringBootApplication
@ImportResource({"classpath*:applicationContext.xml"})
public class RmMgmt1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(RmMgmt1Application.class, args);
		
		//RmChkProc chk = new RmChkProc();
		//chk.test();
		//rmChk.StateUpload();
	}
}*/
@SpringBootApplication
public class RmMgmt1Application implements CommandLineRunner{
	
	@Autowired
	private RmChkProc rmChk;
	
	@Autowired
	private ReadFile rf;
	/*
	public static boolean isNumeric(String s) {
		try {
			double value = Double.parseDouble(s);

			if(value >= 0)
				return true;
			else
				return false;


		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean isNumericInc(String s) {
		try {
			boolean rtnCode = s.matches(".*[0-9].*");
			
			return rtnCode;
		}catch (Exception ex) {
			return false;
		}
	}*/

	
	public static void main(String[] args) {
		SpringApplication.run(RmMgmt1Application.class, args);
		
		//System.out.println(isNumeric("잔액:9860"));
		
		//System.out.println(isNumericInc("잔액:09231"));
		/*
		 Calendar cal = Calendar.getInstance();
	        Date date = cal.getTime();
	        String dateString = new SimpleDateFormat("yyyyMMdd").format(date);
	        // 2018-12-09
	        System.out.println(dateString);

	        // 1일 더한다.
	        cal.add(Calendar.DATE, 1);
	        date = cal.getTime();
	        dateString = new SimpleDateFormat("yyyyMMdd").format(date);

	        // 2018-12-10
	        System.out.println(dateString);
	        */
		
		//String mifInfo = "                                                                                                                                                      3080734        1NNDN      NTMN3080734        0000 990583518      1NNDN      NMYB990583518      0000                                                                                                                                                                                                                                                           6002166001     1NNDN      NCSB6002166001     0000                                                                                                                                                                                                                                                           4103264548     1NNDN      NNPCP1902181720    0000                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 0000000000000001YYNN      NKEC               0000 0000000000000001YYNN      NKEC               0000 0000000000000001YYNN      NKEC               0000 0000000000000001YYNN      NHDC               0000 0000000000000001YYNN      NLTC               0000                                                                                                                                                                                                         jp_0005600                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ";
//		String mifInfo = "                                                                                                                                                      2023042        1NNDN      NTMN2023042        0000 990430182      1NNDN      NMYB990430182      0000 78038601       1NNNN      NKCA               0000                                                                                                                                                                                                         6001061001     1NNDN      NCSB6001061001     0000                                                                                                                                                                                                                                                           4103232219     1NNDN      NNPCP1810175470    0000 2344200087     1NNDN      NKRPDPT0Z27165     0000 CQR00013765S2361NNDN      NKKPAT0242016A     0000                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             0000000000000001YYNN      NKEC               0000 0000000000000001YYNN      NKEC               0000 0000000000000001YYNN      NKEC               0000 0000000000000001YYNN      NHDC               0000 0000000000000001YYNN      NLTC               0000                                                                                                                                                                                                         lcb0000063                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              "; 
//		for(int i=0;i<(mifInfo.length()/50);i++) {
//			System.out.println(String.format("%d~%s~", i,mifInfo.substring(i*50, i*50+50)));
//			
//			
//		}
	}
	
	@Override
	public void run(String... args) throws Exception {
		//rmChk.RmTest();
		rmChk.RmProcess();
		
		//rf.fileRead();
	}

}



