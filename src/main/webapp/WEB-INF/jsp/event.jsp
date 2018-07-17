<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <meta charset="utf-8">
    <title>Spring MVC and Hibernate Template: Deployed from Circle CI</title>

    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="//netdna.bootstrapcdn.com/bootstrap/2.3.2/css/bootstrap.min.css" rel="stylesheet">

    <!--
      IMPORTANT:
      This is Heroku specific styling. Remove to customize.
    -->
    <!-- <link href="http://heroku.github.com/template-app-bootstrap/heroku.css" rel="stylesheet"> -->
    <!-- /// -->
</head>

<body>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <a href="/" class="brand">Demo Heroku Application</a>
            <a href="/" class="brand" id=""></a>
        </div>
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="span8 offset2">
            <div class="page-header">
                <h1 style="margin-top: 50px;">Simple Database Reading Page</h1>
            </div>
            <%-- <form:form method="post" action="add" commandName="person" class="form-vertical">

                <form:label path="firstName">First Name Dude</form:label>
                <form:input path="firstName" />
                <form:label path="lastName">Last Name</form:label>
                <form:input path="lastName" />
                <input type="submit" value="Add Person" class="btn"/>
            </form:form> --%>


            <c:if  test="${!empty events}">
                <h3>Event</h3>
                <table class="table table-bordered table-striped">
                    <thead>
                    <tr>
                        <th>Name</th>
                        <th>&nbsp;</th>
                    </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>${events.eventName}</td>
                            <td>${events.eventTagLine}</td>
                        </tr>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
</div>

</body>
</html>
