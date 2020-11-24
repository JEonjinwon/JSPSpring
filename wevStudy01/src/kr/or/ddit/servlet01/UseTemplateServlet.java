package kr.or.ddit.servlet01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.utils.TemplateUtils;
/**
 * 마임 하고 데이터 맵만 설정 가능 
 * 
 * 서블릿의 콜백 메소드 종류 
 * 	lifecycle callback(singleton) : init, destroy
 * 	request callback : service, doXXX
 * 	1)service : request method 판단 -> do[MethodName] 콜백을 호출하여 요철 처리 위임.
 * 	2)doXXX : request method 따라 처리할 구체적인 작업을 정의. 
 * 
 * 
 */
public abstract class UseTemplateServlet extends HttpServlet {
	@Override
	protected final void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType(getMimeType());
		
		 String minDan= request.getParameter("minDan") !=null ? request.getParameter("minDan"):"0"; 
		 String maxDan= request.getParameter("maxDan") !=null ? request.getParameter("maxDan"):"0"; 
		
	
		int min  = Integer.parseInt(minDan);
		int max  = Integer.parseInt(maxDan);
		
		
		Map<String, Object> dataMap = new HashMap<>();
		
		dataMap.put("min",min);
		dataMap.put("max",max);
		getDataMap(dataMap);

		String html = TemplateUtils.replaceTemplateToData(request, dataMap);

		try (PrintWriter out = response.getWriter();) {
			out.println(html);
		}

	}

	public abstract String getMimeType();

	public abstract void getDataMap(Map<String, Object> dataMap);
	

	
}
