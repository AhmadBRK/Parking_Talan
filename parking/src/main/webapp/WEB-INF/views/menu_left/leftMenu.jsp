<%@ include file="/WEB-INF/views/includes/includes.jsp" %>
<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
		<ul class="nav" id="side-menu">
			<li class="sidebar-search">
				<div class="input-group custom-search-form">
					<input type="text" class="form-control" placeholder="Recherche...">
					<span class="input-group-btn">
						<button class="btn btn-default" type="button">
							<i class="fa fa-search"></i>
						</button>
					</span>
				</div> <!-- /input-group -->
			</li>
				<c:url value ="/home/" var = "home"/>
			<li class=""><a href="${home }"><i class="fa fa-dashboard fa-fw"></i>
					dashbord"  </a></li>
		
			<li><a href="#"><i class="fa fa-users fa-fw"></i>
					Persone <span class="fa arrow"></span></a>
				<ul class="nav nav-second-level" area-expended="false">
				<c:url value ="/personne/" var = "personne"/>
					<li><a href="${personne }">personne</a></li>
					
	</div>
	<!-- /.sidebar-collapse -->
</div>