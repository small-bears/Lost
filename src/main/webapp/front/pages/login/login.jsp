<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>登录</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script>
    addEventListener("load", function () {
      setTimeout(hideURLbar, 0);
    }, false);

    function hideURLbar() {
      window.scrollTo(0, 1);
    }
  </script>
  <link rel="stylesheet" href="../../layui/css/layui.css">
  <link rel="stylesheet" href="../../xznstatic/css/style.css" type="text/css" media="all">
  <link href="../../xznstatic/css/font-awesome.min.css" rel="stylesheet">

</head>

<body>
  <div id="mian" class="main-bg">
    <h1 v-text="projectName"></h1>
    <div class="sub-main-w3">
      <div class="image-style"></div>
      <div class="vertical-tab">
        <div id="section1" class="section-w3ls">
          <input type="radio" name="sections" id="option1" checked="checked">
          <article>
            <form class="layui-form login-form">
              <div class="layui-form-item layui-form-text input">
                <div class="layui-input-inline" style="width: 300px;">
                  <input type="text" name="username" required lay-verify="required" placeholder="请输入账号" autocomplete="off" class="layui-input">
                </div>
              </div>
              <div class="layui-form-item input">
                <div class="layui-input-inline" style="width: 300px;">
                  <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off"
                   class="layui-input">
                </div>
              </div>
              <div class="layui-form-item input">
                <div class="layui-input-block" style="text-align: left;margin-left: 0;">
                  <input v-if="item.tableName!='users'" v-for="(item,index) in menu" v-bind:key="index" type="radio" name="role" id="role" :value="item.tableName" :title="item.roleName">
                </div>
              </div>
              <div class="layui-form-item" style="margin-bottom: 0;">
                <div class="layui-input-block" style="margin-left: 0;">
                  <button class="layui-btn btn-submit btn submit" style="height: 50px;line-height: 25px;" lay-submit lay-filter="login">登录</button>
                </div>
              </div>
              <a class="bottom-text-w3ls" v-if="item.tableName!='users'" v-for="(item,index) in menu" v-bind:key="index" :href="'javascript:registerClick(\''+item.tableName+'\')'">注册{{item.roleName.replace('注册','')}}</a>
            </form>
          </article>
        </div>
      </div>
      <div class="clear"></div>
    </div>
    <div class="copyright">
      <h2><a href="#"></a></h2>
    </div>
  </div>

  <script src="../../layui/layui.js"></script>
  <script src="../../js/vue.js"></script>
  <!-- 组件配置信息 -->
  <script src="../../js/config.js"></script>
  <!-- 扩展插件配置信息 -->
  <script src="../../modules/config.js"></script>
  <!-- 工具方法 -->
  <script src="../../js/utils.js"></script>

  <script>
    var vue = new Vue({
      el: '#mian',
      data: {
        menu: menu,
        projectName: projectName
      },
      methods: {
        jump(url) {
          jump(url)
        }
      }
    });

    layui.use(['layer', 'element', 'carousel', 'form', 'http', 'jquery'], function() {
      var layer = layui.layer;
      var element = layui.element;
      var carousel = layui.carousel;
      var form = layui.form;
      var http = layui.http;
      var jquery = layui.jquery;

      // 登录
      form.on('submit(login)', function(data) {
        data = data.field;
        if (!data.role) {
          layer.msg('请选择登录用户类型', {
            time: 2000,
            icon: 5
          });
          return false;
        }
        http.request(data.role + '/login', 'get', data, function(res) {
          layer.msg('登录成功', {
            time: 2000,
            icon: 6
          });
          // 登录凭证
          localStorage.setItem('Token', res.token);
          localStorage.setItem('role', jquery('#role:checked').attr('title'));
          // 当前登录用户角色
          localStorage.setItem('userTable', data.role);
          localStorage.setItem('sessionTable', data.role);
          // 用户名称
          localStorage.setItem('adminName', data.username);
          http.request(data.role + '/session', 'get', {}, function(res) {
            // 用户id
            localStorage.setItem('userid', res.data.id);
            // 路径访问设置
            window.location.href = '../../index.jsp';
          })
          
        });
        return false
      });

    });

    /**
      * 跳转登录
      * @param {Object} tablename
      */
    function registerClick(tablename) {
      window.location.href = '../' + tablename + '/register.jsp?tablename=' + tablename;
    }
  </script>

</body>

</html>