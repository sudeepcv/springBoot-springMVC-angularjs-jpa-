<!doctype html>
<html class="no-js" ng-app="basicsInjavaBlogSpot">
<head>
    <meta charset="utf-8">
    <title>Basics In Java Blogspot</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="lib/bootstrap/dist/css/bootstrap.united.min.css"/>    
    <link rel="stylesheet" href="styles/custom.css">
</head>
<body>

<div id="applicationHost" class="container body-content admin-appHost">
    <div data-ng-include="'app/layout/shell.html'"></div>
</div>

<footer>
			<div class="container">
				<div class="row">
					<div class="col-sm-2">
					<h6>Copyright &copy; 2014 </h6>
					</div><!-- end col-sm-2 -->
					
					<div class="col-sm-4">
						<h6>About Me</h6>
						<p>I am simply a human with emotions, needs, fears. I have a past and a future. I am far from perfect and I am not the worst failure in the world either!!! </p>
					</div><!-- end col-sm-4 -->
					
					<div class="col-sm-2">
						<h6>Navigation</h6>
						<ul class="unstyled">
							<li><a href="#">Home</a></li>
							<li><a href="#">Services</a></li>
							<li><a href="#">Links</a></li>
							<li><a href="#">Contact</a></li>
						</ul>
					</div><!-- end col-sm-2 -->
					
					<div class="col-sm-2">
						<h6>Portfolio</h6>
						<ul class="unstyled">
							<li><a href="http://sudeep-cv.tk">Portfolio</a></li>
							<li><a href="http://www.linkedin.com/in/sudeepcv">Linkedin Profile</a></li>
							<li><a href="http://apps.facebook.com/thamasha/">Face Book application</a></li>
						<li><a href="http://www.zend.com/en/store/education/certification/yellow-pages.php#show-ClientCandidateID=ZEND019003">Yellow page</a></li>
						</ul>
					</div><!-- end col-sm-2 -->
					
					<div class="col-sm-2">
						<h6>Coded with <span class="glyphicon glyphicon-heart"></span> by Sudeep cv</h6>
					</div><!-- end col-sm-2 -->
				</div><!-- end row -->
			</div><!-- end container -->
		</footer>




<!-- Vendor Scripts -->
<script src="lib/angular/angular.min.js"></script>
<script src="lib/angular-route/angular-route.min.js"></script>
<script src="lib/lodash/dist/lodash.min.js"></script>
<script src="lib/moment/min/moment.min.js"></script>
<script src="lib/spin.js/spin.js"></script>
<script src="lib/angular-bootstrap/ui-bootstrap-tpls.min.js"></script>

<!-- inject:js -->
<script src="app/app.js"></script>
<script src="app/directives/spinner.directive.js"></script>
<script src="app/home/home.controller.js"></script>
<script src="app/admin/adminhome.controller.js"></script>
<script src="app/home/blogpost.contoller.js"></script>
<script src="app/layout/shell.controller.js"></script>
<script src="app/services/app-spinner.service.js"></script>
<script src="app/services/basicsinjava-api.service.js"></script>
<!-- endinject -->


</body>
</html>
