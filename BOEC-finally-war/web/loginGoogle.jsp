<%-- 
    Document   : login2
    Created on : May 1, 2018, 3:53:03 PM
    Author     : namptit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
        <script src="https://apis.google.com/js/platform.js" async defer></script>
        <meta name="google-signin-client_id" content="688397542022-konnbsjrq9qpcb9ak5j4j59s1ovb4g64.apps.googleusercontent.com">
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>
        <div class="g-signin2" data-onsuccess="onSignIn" id="myP"></div>
        <img id="myImg"><br>
        <p id="name"></p>
        <div id="status">
        </div>
        <form action="LoginServlet" method="post">
            <script type="text/javascript">
                function onSignIn(googleUser) {
                    
                    var profile = googleUser.getBasicProfile();
                    var imagurl = profile.getImageUrl();
                    var name = profile.getName();
                    var email = profile.getEmail();
                    document.getElementById("myImg").src = imagurl;
                    document.getElementById("name").innerHTML = name;
                    document.getElementById("myP").style.visibility = "hidden";
                }
                ;
            </script>
            <button onclick="myFunction()">Sign Out</button>
        </form>

        
        <script>
            function myFunction() {
                gapi.auth2.getAuthInstance().disconnect();
                location.reload();
            }
        </script>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>