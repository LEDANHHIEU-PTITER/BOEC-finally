<%-- 
    Document   : Footer
    Created on : Oct 10, 2017, 9:39:41 AM
    Author     : HieuLe
--%>

<%@page import="java.time.LocalDate"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="fb-livechat">
    <div class="ctrlq fb-overlay"></div>
    <div class="fb-widget">
        <div class="ctrlq fb-close"></div>
        <div class="fb-page" data-href="https://www.facebook.com/HangXachTaySKS/" data-tabs="messages" data-width="360" data-height="400" data-small-header="true" data-hide-cover="true" data-show-facepile="false">
            <blockquote cite="https://www.facebook.com/sarmadgardezi/" class="fb-xfbml-parse-ignore"> </blockquote>
        </div>
        <div id="fb-root"></div>
    </div>
    <a href="https://m.me/sarmadgardezi" title="Send us a message on Facebook" class="ctrlq fb-button"></a>
</div>
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
<script src="https://connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.9"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script>$(document).ready(function () {
        var t = {delay: 125, overlay: $(".fb-overlay"), widget: $(".fb-widget"), button: $(".fb-button")};
        setTimeout(function () {
            $("div.fb-livechat").fadeIn()
        }, 8 * t.delay), $(".ctrlq").on("click", function (e) {
            e.preventDefault(), t.overlay.is(":visible") ? (t.overlay.fadeOut(t.delay), t.widget.stop().animate({bottom: 0, opacity: 0}, 2 * t.delay, function () {
                $(this).hide("slow"), t.button.show()
            })) :
                    t.button.fadeOut("medium", function () {
                        t.widget.stop().show().animate({bottom: "30px", opacity: 1}, 2 * t.delay), t.overlay.fadeIn(t.delay)
                    })
        })
    });
</script>   