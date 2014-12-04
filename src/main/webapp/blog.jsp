<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="section" tagdir="/WEB-INF/tags/layouts/sections" %>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<t:main pageTitle="Blog">
	<section>
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
					<layout:left-sidebar></layout:left-sidebar>
				</div>
				<div class="col-sm-9">
					<layout:blog-post></layout:blog-post>
				</div>
			</div>
		</div>
	</section>
</t:main>

