package test;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.util.HttpUtil;
import com.sitech.strategy.persist.utils.ServiceUtil;

/** 
 * coc客户群报文解析入库
* @date: 2016-10-31 
* @author: songxj
* @title: ParseCocXmlDocumentService 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note: 
*/
public class ParseCocXmlDocumentService {
	
	private static String dirPath;
	Timer timer = new Timer();

	public static void main(String[] args) {
		if (args.length > 0) {
			dirPath = args[0];
		}
		ParseCocXmlDocumentService service = new ParseCocXmlDocumentService();
	}

	public ParseCocXmlDocumentService() {
		this.timer.schedule(new callService(), 1L, 60000L);
	}

	class callService extends TimerTask {
		callService() {
		}

		public void run() {
			HttpUtil.setCharset("UTF-8");

			String serName = "com_sitech_strategy_process_service_jcf_inter_ICustGroupProcessServiceSvc_parseCocCustGroup";

			File files = new File(ParseCocXmlDocumentService.dirPath);
			for (File file : files.listFiles()) {
				System.out.println("===list filepath===" + file.getAbsolutePath());
				System.out.println(file.getAbsolutePath().endsWith(".xml"));
				if(file.getAbsolutePath().endsWith(".xml")){
					MBean bean = new MBean();
					try {
						Thread.sleep(1000L);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					bean.addBody("XML_PATH", file.getAbsolutePath());
					System.out.println("====bean===" + bean);
					String result = ServiceUtil.callService("http://localhost:8080/sitech-strategy-site/rs/service/" + serName, bean.toString());
					System.out.println("---result3---" + result);
				} else {
					file.delete();
				}
			}
		}
	}
}