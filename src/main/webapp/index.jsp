<!DOCTYPE html>

<%--<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>--%>
    <%----%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>--%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
        <link rel="stylesheet" href="css/responsive-nav.css">
        <script src="js/responsive-nav.js"></script>
	</head> 
	<body>
    <div id="nav">
        <ul>
            <li><a href="#">Home</a></li>
            <li><a href="#">About</a></li>
            <li><a href="#">Projects</a></li>
            <li><a href="#">Contact</a></li>
        </ul>
    </div>
    <script>
        var navigation = responsiveNav("#nav", { // Selector: The ID of the wrapper
            animate: true, // Boolean: 是否启动CSS过渡效果（transitions）， true 或 false
            transition: 400, // Integer: 过渡效果的执行速度，以毫秒（millisecond）为单位
            label: "Menu", // String: Label for the navigation toggle
            insert: "after", // String: Insert the toggle before or after the navigation
            customToggle: "", // Selector: Specify the ID of a custom toggle
            openPos: "relative", // String: Position of the opened nav, relative or static
            jsClass: "js", // String: 'JS enabled' class which is added to <html> el
            debug: false, // Boolean: Log debug messages to console, true 或 false
            init: function () {
            }, // Function: Init callback
            open: function () {
            }, // Function: Open callback
            close: function () {
            } // Function: Close callback
        });
    </script>
	</body>
</html>
