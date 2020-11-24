<%@page import="java.net.URL"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<pre>
	자원의 종류
	1) File System Resource : 파일 시스템 절데 경로를 통해 접근
	2) ClassPath Resource : classpath 이후의 절대경로 (qualified name)를 통해 접근
	3) Web Resource : URL 체계를 통해 웹상에서 접근

	웹 리스소 식별(identify) 방법
	URI : Uniformed Resource Identifier
	URL(Locator) : 자원의 위치를 기준으로 식별 
	URN(Name) : 자원의 명칙을 기준으로 식별 
	URC(Content) : 자원의 속성을 기준으로 식별
	
	URL 표기방식
	ex) http://IP:80/depth.../name
	protocol://IP[domainname]:port/depth...../name
	
	절대경로 : 
		protocol://IP[domainname]:port/depth.../name
		client side : 반드시 context root 부터 경로 기술
			ex) /wevStudy01/images/1.jpg
		server side : context root 이후의 경로를 기술.	
		
	상대경로 : 브라우저의 주소를 기준으로 상대 경로가 시작됨.
		ex) .../depth/name
	
</pre>
<%
	String url = "/images/1.jpg";
	URL resURL = getServletContext().getResource(url);
	File file = new File(resURL.getFile());
%>
<%=file.getAbsolutePath() %>
<%=file.length() %>
<img src="<%=request.getContextPath() %>/images/1.jpg"/>
<img src="../images/1.jpg"/>
</body>
</html>