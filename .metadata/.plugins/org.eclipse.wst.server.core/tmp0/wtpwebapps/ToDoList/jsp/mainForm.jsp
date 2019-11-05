<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width">
<title>To-DO List</title>
<link href="css/custom.css" rel="stylesheet"/>
</head>
<body>
	<header>
    	<a href="writeForm.do" class="button" id="btnAdd">Link Button</a>
    </header>
    
    <section>
      <div id="todo">
        <ul>
	        <c:foreach var="list" items="${map.list }">
	           <li>
	            <a href="#">
	              <h2>${list.title }</h2>
	              <p>${list.content }</p>
	              <button>예제1</button>
	            </a>
	          </li>
	        </c:foreach>
        </ul>
      </div>

      <div id="doing">
        <ul>
          
        </ul>
      </div>

      <div id="done">
        <ul>
          
        </ul>
      </div>
    </section>
</body>
</html>