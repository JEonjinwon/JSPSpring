package kr.or.ddit.servlet01;

import java.io.IOException;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/01/gugudan.tmpl")
public class GugudanTemplateUseServlet extends UseTemplateServlet {

	
	
	@Override
	public String getMimeType() {
		return "text/html;charset=UTF-8";
	}

	@Override
	public void getDataMap(Map<String, Object> dataMap) {
	int min = (int)dataMap.get("min");
	int max = (int)dataMap.get("max");
		
		String pattern = "";
		
		for(int i =min ; i<=max;i++) {
			pattern +=
					"<tr><td>"+i+"단</td></tr>"       
					+"<tr><td>"+i+"</td><td>X 1 = </td><td>"+i*1+"</td></tr>"
					+"<tr><td>"+i+"</td><td>X 2 = </td><td>"+i*2+"</td></tr>"
					+"<tr><td>"+i+"</td><td>X 3 = </td><td>"+i*3+"</td></tr>"
					+"<tr><td>"+i+"</td><td>X 4 = </td><td>"+i*4+"</td></tr>"
					+"<tr><td>"+i+"</td><td>X 5 = </td><td>"+i*5+"</td></tr>"
					+"<tr><td>"+i+"</td><td>X 6 = </td><td>"+i*6+"</td></tr>"
					+"<tr><td>"+i+"</td><td>X 7 = </td><td>"+i*7+"</td></tr>"
					+"<tr><td>"+i+"</td><td>X 8 = </td><td>"+i*8+"</td></tr>"
					+"<tr><td>"+i+"</td><td>X 9 = </td><td>"+i*9+"</td></tr>";
		}
		
		dataMap.put("title","구구단");
		dataMap.put("gugudanTrTags",pattern);
	}
	
	
}
