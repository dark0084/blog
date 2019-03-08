<html>
<head>
</head>
<body>
  <#list posts as post>
  <p>${post.getTitle()}
  <p>${post.getContent()}
  <#else>
  <p>not Posts</p>
  </#list>
</body>
<html>