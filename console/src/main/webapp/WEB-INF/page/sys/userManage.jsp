<%@ page language="java" import="java.util.*" isErrorPage="true"  pageEncoding="UTF-8"%>
<%@ include file="../../base/head.jsp"%>
<html>
<head>
    <title>用户管理</title>

    <link rel="stylesheet" href="${project}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="${project}/resources/css/bootstrap-table.css">

    <script src="${project}/resources/js/jquery-2.1.4.min.js"></script>
    <script src="${project}/resources/js/bootstrap.min.js"></script>
    <script src="${project}/resources/js/bootstrap-table.js"></script>
    <script src="${project}/resources/js/bootstrap-table-zh-CN.js"></script>
</head>
<body>
<div>
    <h4 style="font-weight: bold">系统管理->用户管理</h4>
</div>

<div class="col-xs-12" style="background-color: #f2f2f2;padding: 12px">
    <label for="username" class="col-xs-1" style="line-height: 25px">用户名</label>
    <input type="text" id="username" placeholder="Username" class=" form-control col-xs-2">

    <div class="form-group" >
        <label for="exampleInputEmail1">Email address</label>
        <input type="email" class="form-control " id="exampleInputEmail1" placeholder="Email">
    </div>

    <div class="form-group">
        <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
        <div class="col-sm-10">
            <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="inputPassword3" placeholder="Password">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <div class="checkbox">
                <label>
                    <input type="checkbox"> Remember me
                </label>
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Sign in</button>
        </div>
    </div>
</div>

<%--<table id="table"></table>--%>

</body>
</html>

<script>
    $('#table').bootstrapTable({
        columns: [{
            field: 'id',
            title: 'Item ID'
        }, {
            field: 'name',
            title: 'Item Name'
        }, {
            field: 'price',
            title: 'Item Price'
        }],
        data: [{
            id: 1,
            name: 'Item 1',
            price: '$1'
        }, {
            id: 2,
            name: 'Item 2',
            price: '$2'
        }]
    });
</script>
