<%-- 
    Document   : INICIO
    Created on : 12 mar 2024, 18:51:56
    Author     : Telle
--%>

<%
    String email = request.getParameter("uname");
    String Password = request.getParameter("pass");
    

if(email.equals ( "sau.tellez@gmail.com") && Password.equals(1234))
{

    }
    else
    {
        out.print("error");
    }

    %>

