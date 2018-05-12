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
        <meta name="google-signin-client_id" content="122618528086-6cnusvs5f24bnvo2r217jlamesj6sfkc.apps.googleusercontent.com">
    </head>
    <body>
        <div class="g-signin2" data-onsuccess="onSignIn" id="myP" ></div>
        <img id="myImg"><br>
        <p id="name"></p>
        <div id="status">
        </div><a href="#" onclick="signOut();">Sign out</a>
        <script>
            function signOut() {
                var auth2 = gapi.auth2.getAuthInstance();
                auth2.signOut().then(function () {
                    console.log('User signed out.');
                });
            }
        </script>
        <script type="text/javascript">
            function onSignIn(googleUser) {
                var profile = googleUser.getBasicProfile();
                console.log('ID: ' + profile.getId()); // Do not send to your backend! Use an ID token instead.
                console.log('Name: ' + profile.getName());
                console.log('Image URL: ' + profile.getImageUrl());
                console.log('Email: ' + profile.getEmail()); // This is null if the 'email' scope is not present.
//                window.location.href = "abc.jsp";
//                        var profile = googleUser.getBasicProfile();
//                var imagurl = profile.getImageUrl();
//                var name = profile.getName();
//                var email = profile.getEmail();
//                document.getElementById("myImg").src = imagurl;
//                document.getElementById("name").innerHTML = name;
//                document.getElementById("myP").style.visibility = "hidden";
            }
        </script>
        <!--        <form action="LoginServlet" method="post">
        
                    <button onclick="myFunction()">Sign Out</button>
                </form>-->


        <!--        <script>
                    function myFunction() {
                        gapi.auth2.getAuthInstance().disconnect();
                        location.reload();
                    }
                </script>-->
    </body>
</html>