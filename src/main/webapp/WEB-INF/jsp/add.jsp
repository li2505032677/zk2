<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<link href="../css/index_work.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="../js/jquery-1.8.2.min.js"></script>
<title>???????</title>
<script type="text/javascript">
function tj() {
	$.post("add.do",$("form").Serialize(),function(obj){
		if(obj>0){
			alert("添加成功!");
			location = "toadd.do";
		}
		
	},'json');
}

</script>
</head>
<body>
<form action="add.do" method="post">
	<textarea rows="10" cols="10" name="text"></textarea>
	<input type="button" value="提交" onclick="tj()">
</form>
</body>
</html>