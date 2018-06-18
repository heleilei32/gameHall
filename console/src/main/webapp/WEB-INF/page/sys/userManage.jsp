<%@ page language="java" import="java.util.*" isErrorPage="true"  pageEncoding="UTF-8"%>
<%@ include file="../../base/head.jsp"%>
<html>
<head>
    <title>用户管理</title>
    <link rel="stylesheet" href="${project}/resources/css/bootstrap.min.css">
    <!-- DataTables CSS -->
    <link rel="stylesheet" type="text/css" href="${project}/resources/css/dataTables.bootstrap.css">
    <%--<link rel="stylesheet" type="text/css" href="${project}/resources/css/jquery.dataTables.css">--%>
    <script src="${project}/resources/js/jquery-2.1.4.min.js"></script>
    <script src="${project}/resources/js/bootstrap.min.js"></script>
    <!-- DataTables -->
    <script type="text/javascript" charset="utf8" src="${project}/resources/js/jquery.dataTables.js"></script>
    <script type="text/javascript" charset="utf8" src="${project}/resources/js/dataTables.bootstrap.js"></script>
    <!-- page specific plugin scripts -->
    <script src="${project}/resources/js/bootstrap-datepicker.min.js"></script>
    <%--配置文件--%>
    <script src="${project}/resources/js/setting.js"></script>
</head>
<style type="text/css">
    .selected {
        background-color: #DFF0D8;
    }

    #example_length {
        float: left;
    }

    .odd td strong {
        color: red;
    }

    #deleteButton {
        float: left;
    }

    #addButton {
        float: left;
    }

    #topPlugin {
        float: left;
        margin-left: 10px;
    }

    #example_info{
        float: left;
    }

    .modal-footer span {
        font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
        float: left;
        font-size: 16px;
    }

    .table th, .table td {
        text-align: center;
        height: 25px;
    }

</style>
<body>
<div>
    <h4 style="font-weight: bold">系统管理->用户管理</h4>
</div>

<div class="panel panel-default">
    <div class="panel-body">
        <div class="col-md-12">
            <form class="form-horizontal" action="${pageContext.request.contextPath}/equipment/list.do" method="post">
                <div class="form-group">
                    <label class="col-sm-2 control-label">部门名称：</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="deptname" name="deptname" style="width: 250px">
                    </div>
                    <label class="col-sm-2 control-label">部门状态：</label>
                    <div class="col-sm-3">
                        <select class="form-control" style="width: 250px" id="state" name="state">
                            <option value="">请选择...</option>
                            <option value="1">有 效</option>
                            <option value="2">无 效</option>
                        </select>
                    </div>
                    <!--
                <div class="col-sm-2">
                   <button type="button" class="btn btn-primary" style="float: right;" onclick="javascript:window.location.href=''">添 加</button>
                 </div>
                 -->
                </div>
                <div class="form-group">

                    <label class="col-sm-2 control-label">创建开始时间：</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="startTime" name="startTime" style="width: 250px"
                               onclick="laydate()">
                    </div>
                    <label class="col-sm-2 control-label">创建结束时间：</label>
                    <div class="col-sm-3">
                        <!-- <input type="text" onclick="laydate({istime: true, format: 'YYYY-MM-DD hh:mm:ss'})"> 年月日时分秒-->
                        <input type="text" class="form-control" id="endTime" name="endTime" style="width: 250px"
                               onclick="laydate()">
                    </div>
                    <div class="col-sm-2">
                        <button type="button" class="btn btn-success search" style="float: right;">查 询</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<!--第二步：添加如下 HTML 代码-->
<table id="example" class="table table-striped table-bordered" style="width:100%"></table>

</body>
</html>

<script>
    var data = [
        {
            "id": 1,
            "password": "123456",
            "username": "admin"
        },
        {
            "id": 2,
            "password": "123",
            "username": "he0001"
        },
        {
            "id": 3,
            "username": "he0002"
        },
        {
            "id": 4,
            "username": "he0003"
        },
        {
            "id": 5,
            "username": "he0004"
        },
        {
            "id": 1,
            "password": "123456",
            "username": "admin"
        },
        {
            "id": 2,
            "password": "123",
            "username": "he0001"
        },
        {
            "id": 3,
            "username": "he0002"
        },
        {
            "id": 4,
            "username": "he0003"
        },
        {
            "id": 5,
            "username": "he0004"
        },
        {
            "id": 1,
            "password": "123456",
            "username": "admin"
        },
        {
            "id": 2,
            "password": "123",
            "username": "he0001"
        },
        {
            "id": 3,
            "username": "he0002"
        },
        {
            "id": 4,
            "username": "he0003"
        },
        {
            "id": 5,
            "username": "he0004"
        }
    ];

    $(document).ready( function () {
        $('#example').DataTable({
            data: data,
            /*字段*/
            columns: [
                {
                    "title": "id",
                    "name":"id",
                    "data":"id",
                    "cellType": "th",
                    "orderable" : false, // 禁用排序
                    "defaultContent": ""
                },
                {
                    "title": "用户名",
                    "data":"username",
                    "orderable" : false, // 禁用排序
                    "defaultContent": ""
                },
                {
                    "title": "密码",
                    "data":"password",
                    "orderable" : false, // 禁用排序
                    "defaultContent": ""
                }
            ],

            "dom": '<l<\'#topPlugin\'>f>rt<ip><"clear">',
            scrollY: 400,
            scrollCollapse: true,
            searching:false,//禁用搜索

            language: languageConfig,//国际化

            initComplete:initComplete,
        });
    } );


    /**
     * 表格加载渲染完毕后执行的方法
     * @param data
     */
    function initComplete(data){
        //上方topPlugin DIV中追加HTML
        //var topPlugin='<button id="addButton" class="btn btn-success btn-sm" data-toggle="modal" data-target="#addUser" style="display:block;">' +
        // '<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>添加用户</button>';

        //删除用户按钮的HTMLDOM
        var topPlugin=      '<button  class="btn btn-danger btn-sm" id="deleteAll">批量删除</button> ' +
                            '<button  class="btn btn-primary btn-sm addBtn" id="add" onclick="toAdd()" >新 增</button>' +
                            '<button  class="btn btn-info btn-sm" id="expCsv">导 出全部</button>' +
                            '<button  class="btn btn-warning btn-sm" id="reset">重置搜索条件</button>' ;
        $("#topPlugin").append(topPlugin);//在表格上方topPlugin DIV中追加HTML

        //$("#expCsv").on("click", exp1);//给下方按钮绑定事件

    }


    function toAdd() {
        alert()
    }
</script>
