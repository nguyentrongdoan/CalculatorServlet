<%--
  Created by IntelliJ IDEA.
  User: duyli
  Date: 4/7/2020
  Time: 11:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      #content{
        width: 450px;
        margin: 0 auto;
        padding: 0px 20px 20px;
        background: white;
        border: solid navy 2px;
      }
      label{
        width: 10em;
        padding-right: 1em;
        float: left;
      }
      #data input{
        float: left;
        width: 15em;
        margin-bottom: .5em;
      }
    </style>
  </head>
  <body>
  <div id="content">
    <h1>Product Discount Calculator</h1>
    <form action="/calculator" method="post">
      <div id="data">
        <label>Product Discount</label>
        <input type="text" name="description">
        <br>
        <label>Price</label>
        <input type="text" name="price">
        <br>
        <label>Discount Percent</label>
        <input type="text" name="discount">
      </div>
      <div>
        <br>
        <input type="submit" value="Discount Product" >
      </div>
    </form>
  </div>
  </body>
</html>
