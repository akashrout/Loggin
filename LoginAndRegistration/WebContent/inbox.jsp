<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inbox page</title>
<meta charset="utf-8">
   <title>Inbox page</title>
   <h1>INBOX</h1>
	<meta name="Description" content="I am going to show how to design Gmail style inbox page using help of Html, Bootstrap Jquery and Bootstrap
	Css for your  resposive website."/>
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<link href="css/tab.css" rel="stylesheet" id="bootstrap-css">
    
    <script src="js/jquery-1.10.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript">
        window.alert = function(){};
        var defaultCSS = document.getElementById('bootstrap-css');
        function changeCSS(css){
            if(css) $('head > link').filter(':first').replaceWith('<link rel="stylesheet" href="'+ css +'" type="text/css" />'); 
            else $('head > link').filter(':first').replaceWith(defaultCSS); 
        }
        $( document ).ready(function() {
          var iframe_height = parseInt($('html').height()); 
          window.parent.postMessage( iframe_height, 'https://coderglass.com');
        });
    </script>
	
	<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<script>
  (adsbygoogle = window.adsbygoogle || []).push({
    google_ad_client: "ca-pub-5530842635918863",
    enable_page_level_ads: true
  });
</script>	
</head>
<body>
<div class="topnav">
  <a class="active" href="home.jsp">Home</a>
  <a href="index.jsp">sign up</a>
  <a href="login.jsp">login</a>
  <a href="about.jsp">About</a>
  <a href="/LoginAndRegistration/LogoutServlet">Logout</a>
</div>
 <button type="button" class="btn btn-default">
                        <span class="glyphicon glyphicon-chevron-left"></span>
                    </button>
                    <button type="button" class="btn btn-default">
                        <span class="glyphicon glyphicon-chevron-right"></span>
                    </button>
                </div>
            </div>
        </div><script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-73364464-1', 'auto');
  ga('send', 'pageview');

</script>	<div class="container">
    <div class="row">
        <div class="col-sm-3 col-md-2">
            <div class="btn-group">
                <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
                    Gmail <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu">
                    <li ><a  style='color:red;' href="#">Mail</a></li>
                    <li><a href="#">Contacts</a></li>
                    <li><a href="#">Tasks</a></li>
                </ul>
            </div>
        </div>
        <div class="col-sm-9 col-md-10">
            <!-- Split button -->
            <div class="btn-group">
                <button type="button" class="btn btn-default">
                    <div class="checkbox" style="margin: 0;">
                        <label>
                            <input type="checkbox">
                        </label>
                    </div>
                </button>
                <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                    <span class="caret"></span><span class="sr-only">Toggle Dropdown</span>
                </button>
                <ul class="dropdown-menu" role="menu">
                    <li><a href="#">All</a></li>
                    <li><a href="#">None</a></li>
                    <li><a href="#">Read</a></li>
                    <li><a href="#">Unread</a></li>
                    <li><a href="#">Starred</a></li>
                    <li><a href="#">Unstarred</a></li>
                </ul>
            </div>
            <button type="button" class="btn btn-default" data-toggle="tooltip" title="Refresh">
                &nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-refresh"></span>&nbsp;&nbsp;&nbsp;</button>
            <!-- Single button -->
            <div class="btn-group">
                <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                    More <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu">
                    <li><a href="#">Mark all as read</a></li>
                    <li class="divider"></li>
                    <li class="text-center"><small class="text-muted">Select messages to see more actions</small></li>
                </ul>
            </div>
            <div class="pull-right">
                <span class="text-muted"><b>1</b>–<b>50</b> of <b>277</b></span>
                <div class="btn-group btn-group-sm">
                  
    </div>
    <hr />
    <div class="row">
        <div class="col-sm-3 col-md-2">
            <a href="#" class="btn btn-danger btn-sm btn-block" role="button">COMPOSE</a>
            <hr />
            <ul class="nav nav-pills nav-stacked">
                <li class="active"><a href="#"><span class="badge pull-right">1546</span> Inbox </a>
                </li>
                <li><a style='color:black;' href="https://www.coderglass.com">Starred</a></li>
                <li><a style='color:black;' href="https://www.coderglass.com">Important</a></li>
                <li><a style='color:black;' href="https://www.coderglass.com">Sent Mail</a></li>
                <li><a style='color:black;' href="https://www.coderglass.com"><span class="badge pull-right">445</span>Drafts</a></li>
            </ul>
        </div>
        <div class="col-sm-9 col-md-10">
            <!-- Nav tabs -->
            <ul class="nav nav-tabs">
                <li class="active"><a href="#home" data-toggle="tab"><span class="glyphicon glyphicon-inbox">
                </span>Primary</a></li>
                <li><a style="color:black;" href="#profile" data-toggle="tab"><span class="glyphicon glyphicon-user"></span>
                    Social</a></li>
                <li><a style="color:black;" href="#messages" data-toggle="tab"><span class="glyphicon glyphicon-tags"></span>
                    Promotions</a></li>
                <li><a style="color:black;" href="#settings" data-toggle="tab"><span class="glyphicon glyphicon-plus no-margin">
                </span></a></li>
            </ul>
            <!-- Tab panes -->
            <div class="tab-content">
                <div class="tab-pane fade in active" id="home">
                    <div class="list-group">
                        
                    <a href="#" class="list-group-item">
                    <div class="checkbox">
                       <label>
                        <input type="checkbox">
                       </label>
                    </div>
                    <span class="glyphicon glyphicon-star-empty"></span>
					<span class="name" style="min-width: 120px; display: inline-block;">Varun Singh</span>
					<span class="">You have uploaded 2 files</span>
                    <span class="text-muted" style="font-size: 11px;">
					- The files will be available for a limited time only unless 
					you are a sendspace Premium member.
					</span> 
					<span class="badge">12:10 AM</span> 
					<span class="pull-right">
					<span class="glyphicon glyphicon-paperclip">
                    </span></span>
					</a>
                    
					<a href="#" class="list-group-item">
                    <div class="checkbox">
                       <label>
                        <input type="checkbox">
                       </label>
                    </div>
                    <span class="glyphicon glyphicon-star"></span>
					<span class="name" style="min-width: 120px; display: inline-block;">Varun Singh</span>
					<span class="">You have uploaded 2 files</span>
                    <span class="text-muted" style="font-size: 11px;">
					- The files will be available for a limited time only unless 
					you are a sendspace Premium member.
					</span> 
					<span class="badge">12:10 AM</span> 
					<span class="pull-right">
					<span class="glyphicon glyphicon-paperclip">
                    </span></span>
					</a>
					
					<a href="#" class="list-group-item">
                    <div class="checkbox">
                       <label>
                        <input type="checkbox">
                       </label>
                    </div>
                    <span class="glyphicon glyphicon-star-empty"></span>
					<span class="name" style="min-width: 120px; display: inline-block;">Varun Singh</span>
					<span class="">You have uploaded 2 files</span>
                    <span class="text-muted" style="font-size: 11px;">
					- The files will be available for a limited time only unless 
					you are a sendspace Premium member.
					</span> 
					<span class="badge">12:10 AM</span> 
					<span class="pull-right">
					<span class="glyphicon glyphicon-paperclip">
                    </span></span>
					</a>
					
					<a href="#" class="list-group-item">
                    <div class="checkbox">
                       <label>
                        <input type="checkbox">
                       </label>
                    </div>
                    <span class="glyphicon glyphicon-star"></span>
					<span class="name" style="min-width: 120px; display: inline-block;">Varun Singh</span>
					<span class="">You have uploaded 2 files</span>
                    <span class="text-muted" style="font-size: 11px;">
					- The files will be available for a limited time only unless 
					you are a sendspace Premium member.
					</span> 
					<span class="badge">12:10 AM</span> 
					<span class="pull-right">
					<span class="glyphicon glyphicon-paperclip">
                    </span></span>
					</a>
                     
					 <a href="#" class="list-group-item">
                    <div class="checkbox">
                       <label>
                        <input type="checkbox">
                       </label>
                    </div>
                    <span class="glyphicon glyphicon-star"></span>
					<span class="name" style="min-width: 120px; display: inline-block;">Varun Singh</span>
					<span class="">You have uploaded 2 files</span>
                    <span class="text-muted" style="font-size: 11px;">
					- The files will be available for a limited time only unless 
					you are a sendspace Premium member.
					</span> 
					<span class="badge">12:10 AM</span> 
					<span class="pull-right">
					<span class="glyphicon glyphicon-paperclip">
                    </span></span>
					</a>
                        
                    </div>
                </div>
                <div class="tab-pane fade in" id="profile">
                    <div class="list-group">
                        <div class="list-group-item">
                            <span class="text-center">This tab is empty.</span>
                        </div>
                    </div>
                </div>
                <div class="tab-pane fade in" id="messages">
                    ...</div>
                <div class="tab-pane fade in" id="settings">

					
					</div>
            </div>
            <!-- Ad -->
            <div class="row-md-12">
                <div class="ad">
                    
                  
                   <!--
<ul class="social_list">
    <li><a href="#" target="_blank"><img src="../advertise/ads-1.jpg" alt="coderglass twitter" height="300" width="221"></a></li>
    <li><a href="#" target="_blank"><img src="../advertise/ads-2.jpg" alt=" coderglass facebook" height="300" width="221"></a></li>
    <li><a href="#" target="_blank"><img src="../advertise/ads-3.jpg" alt="coderglass Google+" height="300" width="221"></a></li>
</ul> -->

<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<!-- Bottom-text-ads -->
<ins class="adsbygoogle"
     style="display:inline-block;width:728px;height:180px"
     data-ad-client="ca-pub-5530842635918863"
     data-ad-slot="9535300836"></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script> 
                    
                </div>
            </div>
        </div>
    </div>
</div>

	<script type="text/javascript">
	
	</script>
</body>
</html>