<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="shop.css" rel = "stylesheet">
</head>
<body>
<div>
		<form action="AddGoods">
			<h1>주문목록</h1>
			<table border=1px>
				<tr>
					<td><img src="shop/1.jpg"></td>
					<td><img src="shop/2.jpg"></td>
					<td><img src="shop/3.png"></td>
					<td><img src="shop/4.jpg"></td>
					<td><img src="shop/5.jpg"></td>
				</tr>
				<tr>
					<td>아이폰</td>
					<td>아이패드</td>
					<td>아이맥</td>
					<td>맥북 프로</td>
					<td>에어팟</td>
				</tr>
				<tr>
					<td><input type="checkbox" name="product" value="아이폰11"></td>
					<td><input type="checkbox" name="product" value="아이패드"></td>
					<td><input type="checkbox" name="product" value="아이맥"></td>
					<td><input type="checkbox" name="product" value="맥북프로"></td>
					<td><input type="checkbox" name="product" value="에어팟"></td>
				</tr>
				<tr>
					<td><img src="shop/6.jpg"></td>
					<td><img src="shop/7.jpg"></td>
					<td><img src="shop/8.jpg"></td>
					<td><img src="shop/9.jpg"></td>
					<td><img src="shop/11.jpg"></td>
				</tr>
				<tr>
					<td>애플펜슬</td>
					<td>맥</td>
					<td>아이맥</td>
					<td>아이맥</td>
					<td>미니맥</td>
				</tr>
				<tr>
					<td><input type="checkbox" name="product" value="애플펜슬"></td>
					<td><input type="checkbox" name="product" value="맥"></td>
					<td><input type="checkbox" name="product" value="아이맥블랙"></td>
					<td><input type="checkbox" name="product" value="맥프로"></td>
					<td><input type="checkbox" name="product" value="미니맥"></td>
				</tr>
				<tr>
					<td colspan=5>
						<input type="reset" value="초기화"> 
						<input type="submit" value="담기">
					</td>
				</tr>
			</table>
		</form>
		<div id="list">
			<h3>장바구니 목록</h3>
			<% 
				// 1. 쿠키 꺼내오기
				Cookie[] cookies = request.getCookies();
					// 2. name값에 product라는 글자가 포함된 쿠키만 꺼내와서
				for(Cookie c : cookies){
					if(c.getName().startsWith("product")){
						// 3. value값을 화면에 출력하기
						out.print(c.getValue()+"<br>");
					}
				}
			%>
		</div>


	</div>
</body>
</html>