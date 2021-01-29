<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container"> 
      <div class="py-5 text-center">
           <h2>게시판</h2>
      </div>      
      <div style="margin:10% 10% 10% 10%;">
         <!--  파일첨부 -->
         <form  action="/file/upload" method="post"  enctype="multipart/form-data">
             <input type="file" name="file"/>
             <input class="btn btn-primary btn-sm"  type="submit" value="업로드"/>
         </form>
     </div>
	</div>
</body>
</html>