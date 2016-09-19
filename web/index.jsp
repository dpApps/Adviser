<%--
  Created by IntelliJ IDEA.
  User: Denis
  Date: 12.09.2016
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>


<html>

<head>

  <meta charset="UTF-8">
  <meta name="viewport" content="width-device-width, initial-scale-1.0"/>
  <title> 3D&Paul </title>
  <link rel="stylesheet" href="css/style.css" media="screen"/>
</head>


<body>

<div id="particles-js"></div>

<div class="page-wrapper">


  <div class="qest"><em><h2>Задай вопрос вселенскому разуму!</h2></em></div>
  <div class="imgQest" ><img src="img/qest.png"/></div>

  <div class="qestion"><input value="Где моя тачка бро?" onfocus="this.value=''" width="auto" height="auto" /></div>
  <div class="button" ><button>Узнать ответ!</button></div>

</div>




<script src="assets/jquery/jquery-3.1.0.js"></script>
<script src="assets/particles/particles.js"></script>

<script src="js/main.js"></script>

</body>


</html>