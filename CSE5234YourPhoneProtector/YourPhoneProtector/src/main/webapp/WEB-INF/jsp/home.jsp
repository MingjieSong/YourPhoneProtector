<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Build Your Phone Case</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style><%@include file="/css/home.css"%></style>
</head>

<body>
	<jsp:include page="headerPartial.jsp" />

	<!-- Header-->
	<header class="bg-dark py-5">
		<div class="container px-5">
			<div class="row gx-5 justify-content-center">
				<div class="col-lg-6">
					<div class="text-center my-5">
						<h1 class="display-5 fw-bolder text-white mb-2">Your Phone Protector</h1>
						<p class="display-5 text-white mb-4">We got everything you need to protect your phone!</p>
						<div>
							<img src="images/homepage_pic.png" class="d-block w-100"
								alt="...">
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	<!-- Features section-->
	<section class="py-5 border-bottom" id="features">
		<div class="container px-5 my-5">
			<div class="row gx-5">
				<div class="col-lg-4 mb-5 mb-lg-0">
					<div>
						<img src="images/iphone_our_case.png"
							class="d-block w-100" alt="...">
					</div>
					<h2 class="h4 fw-bolder">Phone Case</h2>
					<p>Surpasses US military drop test standard (MIL-STD 810G),
						absorbs impact of over 11 feet</p>
					<p>Honeycomb Structure</p>
					<p>A hexagonal pattern lines the inner surfaces of our case,
						improving shock absorption by up to 10%</p>

					<a class="text-decoration-none" href="/BuildYourPhoneCase/purchase?pageNum=1"> Buy it now! </a>
					 
				</div>
				<div class="col-lg-4 mb-5 mb-lg-0">
					<div>
						<img src="images/phone_lanyard_home.PNG" class="d-block w-100"
							alt="...">
					</div>
					<h2 class="h4 fw-bolder">Phone Lanyard</h2>
					<p>Our phone strap provides convenient and easy access to your phone no matter the activity. With our phone lanyards for around the neck, you can securely wear your phone, credit card, cash, and ID around your neck without compromising on comfort. The perfect balance between function and fashion, our stylish cell phone holder for walking is available in multiple colors and patterns to suit your taste and preference!</p>
					 
					<a class="text-decoration-none" href="/BuildYourPhoneCase/purchase?pageNum=2"> Buy it now! </a>

				</div>
				<div class="col-lg-4">
					<div>
						<img src="images/phone_holder_home.png" class="d-block w-100" alt="...">
					</div>
					<h2 class="h4 fw-bolder">Phone Holder</h2>
					<p>Your most beloved classic tales are the main design of these functional phone grips! They stick onto the back of almost any device and you can use them to wrap your headphones, stand the phone up, and of course safely hold onto your phone.</p>
					<a class="text-decoration-none" href="/BuildYourPhoneCase/purchase?pageNum=3"> Buy it now! </a>
				</div>
			</div>
		</div>
	</section>

	<jsp:include page="footer.jsp" />
</body>
</html>