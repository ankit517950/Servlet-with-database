<%@ page import="com.example.demo.ConnectionP" %>
<!doctype html>
<html lang  = "en">

<% ConnectionP.createC();

%>
<head>
    <meta charset = "UtF-8">
    <title>Form Page</title>
    <style>
        .container
        {
            width: 40%;
            border:1px solid black;
            margin: auto;
            padding:20px;
            font-size: 25px;
        }
    </style>
</head>
<div class = "container">
    <h1> My Form </h1>
    <form id = "myformaction" action = "registerServlet" method = "post" >
        <table>
            <tr>
                <td>Enter your Name</td>
                <td> <input type = "text" name = "user_name" placeholder = "enter here"/></td>
            </tr>
            <tr>
            <td>Enter your password</td>
                <td> <input type = "password" name = "user_password" placeholder = "enter here"/> </td>
            </tr>
            <tr>
                <td>Enter Your Mail </td>
                <td> <input type = "email" name = "user_email" placeholder = " enter here" /> </td>
            </tr>
            <tr>
                <td>Select Gender</td>
                <td> <input type = "radio" name = "user_gender" value = "male" > Male &nbsp; &nbsp; <input type = "radio" name = "user_gender" value = "female" > Female</td>
            </tr>
            <tr>
                <td>
                    Select your course
                </td>
                <td>
                    <select name = "user_course">
                        <option value = "java">Java</option>
                        <option value = "php">Php</option>
                        <option value = "python">Python</option>
                        <option value = "andriod">Anderoid</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td style = "text-align: center;">
                    <input type = "checkbox" value = "checked" name = "condition" />

                </td>
                <td>
                    Agree terms and conditions
                </td>
            </tr>
            <tr>
                <td>

                </td>
                <td>
                    <button type = "submit">Register</button>
                    <button type = "submit">Reset</button>
                </td>
            </tr>
        </table>
    </form>
    <p><a href = "http://localhost:9090/demo/data">Show All Users</a></p>
</div>
</body>
</html>