<!-- </head> -->
<%@ include file="/pages/header.jsp"%>

<body>

	<!-- Navigation -->
	<%@include file="/pages/nav.jsp"%>

	<!-- Page Content -->
	<div class="container">

		<!-- Jumbotron Header -->
		<header class="jumbotron hero-spacer">


			<form role="form" action="signup" method="post">
				<div class="form-group">
					<label for="country">Country</label> <input type="text"
						class="form-control" id="country" placeholder="Country" name="country">
				</div>
				<div class="form-group">
					<label for="full-address">FullAddress</label> <input type="text"
						class="form-control" id="full-address" placeholder="Full Addresss" name="fullAddress">
				</div>
				
<!-- 					<div class="form-group"> -->
<!-- 					<label for="last-name">Last Name</label> <input type="text" -->
<!-- 						class="form-control" id="last-name" placeholder="Enter last name"> -->
<!-- 				</div> -->
				
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		</header>

		<hr>


		<%@include file="/pages/footer.jsp"%>

	</div>
	<!-- /.container -->

	<!-- jQuery -->
	<script src="/pages/js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="/pages/js/bootstrap.min.js"></script>

</body>

</html>
