<!DOCTYPE html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.okta.javakafka.kafkajava.HelloAppEngine" %>
<%@ page import="com.okta.javakafka.kafkajava.CheckKafkaLink" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href='//fonts.googleapis.com/css?family=Marmelad' rel='stylesheet' type='text/css'>
    <title>Tutosphere | Welcome</title>
</head>
<body>
<h1>Hello App Engine -- Java 8!</h1>

<p>This is <%= HelloAppEngine.getInfo() %>.</p>
<table>
    <tr>
      <td colspan="2" style="font-weight:bold;">Available Servlets:</td>
    </tr>
    <tr>
      <td><a href='/hello'>Hello App Engine</a></td>
    </tr>
    <tr>
      <td colspan="2" style="font-weight:bold;">This is <%= CheckKafkaLink.getInfo() %>.</td>
     </tr>
        <tr>
          <td><a href='/kafka'>Press to see kafka</a></td>
        </tr>
  </table>
</body>
</html>