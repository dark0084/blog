<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
    <style>
    body{
      font-family: "Helvetica Nene", Helvetica, Arial, 맑은 고딕;,"malgun gothic", sans-serif;
    }
    </style>

    <title>널익셉션의 개발블로그</title>
  </head>
  <body>
    <h1>널익셉션의 개발블로그</h1>
    <hr>
    <#list posts?reverse as post>
      <h3>${post.getTitle()}</h3> ${post.getDate()?string('yyyy년 MM월 dd일 HH시 mm분')}
      <p>${post.getContent()}</p>
    <#else>
      <p> 포스트가 없습니다. </p>
    </#list>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>