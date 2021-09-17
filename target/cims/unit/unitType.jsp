<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>CMS-校园即时通系统</title>

    <!-- Bootstrap -->
    <link href="../commons/bootstrap-3.3.7/dist/css/bootstrap.css " rel="stylesheet">
    <link rel="stylesheet" href="../commons/bootstrap-3.3.7/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../commons/bootstrap-select-1.13.9/dist/css/bootstrap-select.css">
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <!--                <li class="active">< a href=" ">Link <span class="sr-only">(current)</span></ a></li>-->
                <li><a href="#" style="font-size: 20px;margin-left: 140px">CIMS-校园即时通系统</a></li>
                <li><a href="#">首页 <span class="sr-only">(current)</span></a></li>
                <li class="dropdown active">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">单位管理 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>

                    </ul>
                </li>
                <li ><a href="#">用户管理 <span class="sr-only">(current)</span></a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-log-out" aria-hidden="true"></span>注销</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>平台管理员：hzvtc</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->

    </div><!-- /.container-fluid -->

</nav>
<div class="container">
    <h3 class="page-header">单位类型</h3>

    <!--    表格-->
    <table class="table table-bordered table-striped" style="margin: auto;width: 70%" >
        <tbody>
        <tr>
            <th style="text-align: center;">类型编号</th>
            <th style="text-align: center;">类型名称</th>
            <th style="text-align: center;">排序号</th>
            <th style="text-align: center;">操作</th>
        </tr>

        <tr>
            <td style="text-align: center;">111</td>
            <td>院系</td>
            <td style="text-align: center;">1</td>
            <td style="text-align: center;">
               <span class="input-group-btn">
              <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                  <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>修改
              </button>
                   <button type="button" class="btn btn-danger">
                       <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
                   </button>
               </span>
            </td>
        </tr>

        <tr>
            <td style="text-align: center;">222</td>
            <td>宿舍楼</td>
            <td style="text-align: center;">2</td>
            <td style="text-align: center;">
               <span class="input-group-btn">
              <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                  <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>修改
              </button>
                   <button type="button" class="btn btn-danger">
                       <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
                   </button>
               </span>
            </td>
        </tr>

        <tr>
            <td style="text-align: center;">333</td>
            <td>社团</td>
            <td style="text-align: center;">3</td>
            <td style="text-align: center;">
               <span class="input-group-btn">
              <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                  <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>修改
              </button>
                   <button type="button" class="btn btn-danger">
                       <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
                   </button>
               </span>
            </td>
        </tr>

        <tr>
            <td style="text-align: center;">444</td>
            <td>教师</td>
            <td style="text-align: center;">4</td>
            <td style="text-align: center;">
               <span class="input-group-btn">
              <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                  <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>修改
              </button>
                   <button type="button" class="btn btn-danger">
                       <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
                   </button>
               </span>
            </td>
        </tr>

        <tr>
            <td style="text-align: center;">555</td>
            <td>学生</td>
            <td style="text-align: center;">5</td>
            <td style="text-align: center;">
               <span class="input-group-btn">
              <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                  <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>修改
              </button>
                   <button type="button" class="btn btn-danger">
                       <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
                   </button>
               </span>
            </td>
        </tr>
        </tbody>

        <tfoot>
        <tr>
            <div class="row">
                <td colspan="7">
                 <span class="input-group-btn">
                <button type="button" class="btn btn-primary">
                  <span class="glyphicon glyphicon-plus" ria-hidden="true"></span>新增
                </button>
                     <h5 style="float: right;color: gray;margin-right: 35px">总5条记录</h5>
                </span>
                </td>
            </div>
        </tr>
        </tfoot>
    </table>

</div>
<!--</form>-->
<hr>
<!--footer-->
<nav class="navbar navbar-default navbar-fixed-bottom">
    <div class="container-fluid" style="text-align: center;padding-top: 20px">
        Campus Instant Message System@2021 杭州职业技术学校 软件技术专业
    </div>
</nav>

<!--模态框start-->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="exampleModalLabel">新增院校管理</h4>
            </div>
            <div class="row" style="margin-top: 20px">
                <div class="col-md-2 col-md-offset-1">
                    <span>用户名:</span>
                </div>
                <div class="col-md-8">
                    <input type="text" class="form-control" id="username" placeholder="请输入用户名">
                </div>
            </div>
            <div class="row" style="margin-top: 20px">
                <div class="col-md-2 col-md-offset-1">
                    <span>&nbsp;&nbsp;&nbsp;密码:</span>
                </div>
                <div class="col-md-8">
                    <input type="text" class="form-control" id="password" placeholder="请输入密码">
                </div>
            </div>
            <div class="row" style="margin-top: 20px">
                <div class="col-md-2 col-md-offset-1">
                    <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;省:</span>
                </div>
                <div class="col-md-8">
                    <select class="selectpicker form-control" name="provinceId"
                            title="请选择省份">
                        <option value="0">请选择</option>
                        <option value="1">省</option>
                        <option value="2">市</option>
                        <option value="3">院校</option>
                    </select>
                </div>
            </div>
            <div class="row" style="margin-top: 20px">
                <div class="col-md-2 col-md-offset-1">
                    <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;市:</span>
                </div>
                <div class="col-md-8">
                    <select class="selectpicker form-control" name="provinceId"
                            title="请选择城市">
                        <option value="0">请选择</option>
                        <option value="1">省</option>
                        <option value="2">市</option>
                        <option value="3">院校</option>
                    </select>
                </div>
            </div>
            <div class="row" style="margin-top: 20px;margin-bottom: 20px">
                <div class="col-md-2 col-md-offset-1">
                    <span>&nbsp;&nbsp;&nbsp;院校:</span>
                </div>
                <div class="col-md-8">
                    <select class="selectpicker form-control" name="provinceId"
                            title="请选择院校">
                        <option value="0">请选择</option>
                        <option value="1">省</option>
                        <option value="2">市</option>
                        <option value="3">院校</option>
                    </select>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">保存</button>
            </div>
        </div>
    </div>
</div>
    <!--模态框end-->
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="../commons/bootstrap-3.3.7/js/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="../commons/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
    <script src="../commons/bootstrap-treeview-1.2.0/src/js/bootstrap-treeview.js"></script>
    <script src="../commons/bootstrap-select-1.13.9/dist/js/bootstrap-select.js"></script>

</body>
</html>