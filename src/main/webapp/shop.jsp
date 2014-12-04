<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="section" tagdir="/WEB-INF/tags/layouts/sections" %>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<t:main title="Shopping online">
	<section:advertisement></section:advertisement>
	<section>
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
					<layout:left-sidebar></layout:left-sidebar>
				</div>
				<div class="col-sm-9 padding-right">
					<layout:pagination-features-items></layout:pagination-features-items>
				</div>
			</div>
		</div>
	</section>
</t:main>

