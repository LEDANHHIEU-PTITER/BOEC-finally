<%-- 
    Document   : Footer
    Created on : Oct 10, 2017, 9:39:41 AM
    Author     : HieuLe
--%>

<%@page import="java.time.LocalDate"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<footer>
    <div class="content-wrapper">
        <div class="float-left">
            <h5>&copy; <%DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
                LocalDate localDate = LocalDate.now();
                System.out.println(dtf.format(localDate)); //2017%>
                <%=dtf.format(localDate)%></h5>
        </div>
    </div>
</footer>
<script src="scripts/register.js" type="text/javascript"></script>
<script src="scripts/login.js" type="text/javascript"></script>
<script src="scripts/logout.js" type="text/javascript"></script>
<script src="scripts/cart.js" type="text/javascript"></script>