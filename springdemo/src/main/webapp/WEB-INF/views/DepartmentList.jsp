<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Ajitem Sahasrabuddhe">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="/springdemo/resources/images/favicon.png" type="image/png">
<title>Rapid Eagle Inc | Department Details</title>
<link href="/springdemo/resources/css/style.default.css" rel="stylesheet">
<link href="/springdemo/resources/css/jquery.datatables.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
  <script src="/resources/js/html5shiv.js"></script>
  <script src="/resources/js/respond.min.js"></script>
  <![endif]-->
</head>

<body>

<!-- Preloader -->
<div id="preloader">
    <div id="status"><i class="fa fa-spinner fa-spin"></i></div>
</div>
  

<div class="leftpanel">
  <div class="logopanel">
    <h1><span>[</span> Rapid Eagle Inc. <span>]</span></h1>
  </div>
  <!-- logopanel --> 
  
</div>
<!-- leftpanel -->

<div class="mainpanelnew">
<div class="headerbar"> <a class="menutoggle"><i class="fa fa-bars"></i></a>
  <form class="searchform" action="http://themepixels.com/demo/webpage/bracket/index.html" method="post">
    <input type="text" class="form-control" name="keyword" placeholder="Search here..." />
  </form>
  <div class="header-right"> </div>
  <!-- header-right --> 
  
</div>
<!-- headerbar -->

<div class="pageheader">
  <h2><i class="fa fa-table"></i> Tables <span>Subtitle goes here...</span></h2>
  <div class="breadcrumb-wrapper"> <span class="label">You are here:</span>
    <ol class="breadcrumb">
      <li><a href="index.html">Bracket</a></li>
      <li class="active">Tables</li>
    </ol>
  </div>
</div>
<div class="contentpanel">
<div class="panel panel-default">
<div class="panel-heading">
  <div class="panel-btns"> <a href="#" class="panel-close">&times;</a> <a href="#" class="minimize">&minus;</a> </div>
  <!-- panel-btns -->
  <h3 class="panel-title">Rapid Eagle Inc | Department Details</h3>
  <p>List of all the departments at Rapid Eagle Inc</p>
</div>
<div class="panel-body">
<div class="table-responsive">
<c:if test="${!empty deptList}">
<table class="table" id="table2">
	<thead>
	  <tr>
	    <th>Department Id</th>
	    <th>Department Name</th>
	  </tr>
    </thead>
    <tbody>
  <c:forEach items="${deptList}" var="dept">
    <tr>
      <td><c:out value="${dept.departmentId}"/></td>
      <td><c:out value="${dept.deptName}"/></td>
    </tr>
  </c:forEach>
    </tbody>
</table>
</c:if>
</div><!-- table-responsive -->
          
        </div><!-- panel-body -->
      </div><!-- panel -->
        
    </div><!-- contentpanel -->
    
  </div><!-- mainpanel -->
    
    


<script src="/springdemo/resources/js/jquery-1.10.2.min.js"></script>
<script src="/springdemo/resources/js/jquery-migrate-1.2.1.min.js"></script>
<script src="/springdemo/resources/js/bootstrap.min.js"></script>
<script src="/springdemo/resources/js/modernizr.min.js"></script>
<script src="/springdemo/resources/js/jquery.sparkline.min.js"></script>
<script src="/springdemo/resources/js/toggles.min.js"></script>
<script src="/springdemo/resources/js/retina.min.js"></script>
<script src="/springdemo/resources/js/jquery.cookies.js"></script>

<script src="/springdemo/resources/js/jquery.datatables.min.js"></script>
<script src="/springdemo/resources/js/chosen.jquery.min.js"></script>

<script src="/springdemo/resources/js/custom.js"></script>
<script>
  jQuery(document).ready(function() {
    
    jQuery('#table2').dataTable({
      "sPaginationType": "full_numbers"
    });
    
    // Chosen Select
    jQuery("select").chosen({
      'min-width': '100px',
      'white-space': 'nowrap',
      disable_search_threshold: 10
    });
    
    // Delete row in a table
    jQuery('.delete-row').click(function(){
      var c = confirm("Continue delete?");
      if(c)
        jQuery(this).closest('tr').fadeOut(function(){
          jQuery(this).remove();
        });
        
        return false;
    });
    
    // Show aciton upon row hover
    jQuery('.table-hidaction tbody tr').hover(function(){
      jQuery(this).find('.table-action-hide a').animate({opacity: 1});
    },function(){
      jQuery(this).find('.table-action-hide a').animate({opacity: 0});
    });
  
  
  });
</script>



</body>
</html>
