<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<!--通用-->
<meta name="format-detection" content="telephone=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="viewport" content="width=device-width,minimum-scale=1.0,maximum-scale=1.0">
<title>轮播图管理列表页</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link rel="stylesheet" href="../../layui/css/layui.css">
<link rel="stylesheet" href="../../xznstatic/css/aos.css" />
<link rel="stylesheet" href="../../xznstatic/css/bootstrap.min.css" />
<link rel="stylesheet" href="../../xznstatic/css/idangerous.swiper.css" />
<link rel="stylesheet" href="../../xznstatic/css/lightbox.css">
<link rel="stylesheet" href="../../xznstatic/css/app.css" />
<link rel="stylesheet" href="../../xznstatic/css/apmin.css"/>
<style>
  .ng-djn-txt {
    text-align: justify;
    text-justify: inter-ideograph;
    word-wrap: break-word;
    word-break: break-all;
  }
  .ng-inpusbox { 
    text-indent:0px;
  }
  .am-inside-adv{ 
    height:auto;
  }
  .am-inside-adv img { 
    width:100%;
  }
  .ng-oa a .small { 
    display:none;
  }
  .ng-oa a:hover .small { 
    display:block;
  }
  .ng-oa a:hover .image {
    display:none;
  }
  .pos-a {
    height:30px;
    line-height:30px;
    margin:0 5px;
  }
  .pos-a a { 
    margin:0 5px; 
  }
  .layui-laypage .layui-laypage-curr .layui-laypage-em {
    background-color: #F5BB00!important;
  }
  .jishuzichis a {
    font-size: 12px;
    color: #878787;
  }
  .ng-siotext {
    line-height: 50px;
  }

  @media screen and (max-width: 992px) {
    .ng-zein-iten-link li {
      width: 50%;
      text-align: center;
    }
    .ng-zein-iten-link li.li {
      width: 100%;
    }
    .bdshare-button-style2-16 a, .bdshare-button-style2-16 .bds_more {
      float: initial;
    }
    .ng-zein-code {
      width: 100%;
    }
    .ng-zein-code-tit {
      width: 100%;
      text-align: center;
    }
  }
</style>
</head>
<body >
  <div id="app">
    <div class="am-add">
      <div class="swiper-container ng-swiper">
        <div class="swiper-wrapper">
          <div class="swiper-slide" v-for="(item,index) in swiperList" v-bind:key="index">
            <a href="#">
              <div class="swiper-slide"><img :src="item.img"></div>
            </a>
          </div>
        </div>
        <div class="swiper-pagination"></div>
        <div class="swiper-button-prev ng-swiper-ovleft"><img src="../../xznstatic/img/snne1.png"/></div>
        <div class="swiper-button-next ng-swiper-ovright"><img src="../../xznstatic/img/snne2.png"/></div>
      </div>
    </div>

    <div class="ng-container ng-fault">
      <div class="ng-inmod ng-fault ng-paddor ng-bg-fff">
        <div class="ng-inmod-ini">
          <div class="ng-fault ng-container">
            <div class="ng-inmod-the ng-container ng-bg-fff">
              <span class="ng-inmod-the-bg ng-inmod-the-bg-left" aos="fade-down-right"><img src="../../xznstatic/img/insie1.png" alt="" /></span>
              <span class="ng-inmod-the-bg ng-inmod-the-bg-right" aos="fade-up-left"><img src="../../xznstatic/img/insie2.png" alt="" /></span>
              <span class="ng-inmod-the-cn" aos="fade-down">轮播图管理展示</span><span class="ng-inmod-the-en" aos="fade-up">DATA SHOW</span>
            </div>
            <span class="ng-inmod-thebor" aos="fade-up"></span>
          </div>
          <fieldset class="search-container" style="text-align: center;">
            <form class="layui-form">
              <div class="layui-inline" style="margin-bottom: 10px;">
                <label class="layui-form-label">名称</label>
                <div class="layui-input-inline">
                  <input type="text" name="name" id="name" placeholder="名称" autocomplete="off" class="layui-input">
                </div>
              </div>   
              <div class="layui-inline" style="margin-left: 30px;margin-bottom: 10px;">
                <button id="btn-search" type="button" class="layui-btn" style="background-color: #F5BB00;">
                  搜索
                </button>
                <button v-if="isAuth('config','新增')" @click="jump('../config/add.jsp')" type="button" class="layui-btn btn-theme">
                  <i class="layui-icon">&#xe654;</i> 添加
                </button>
              </div>
            </form>
          </fieldset>
          <div class="ng-inside-box ng-fault ng-container" aos="fade-up">
            <div class="ng-prslist ng-fault ng-container">
              <ul>
                <li v-for="(item,index) in dataList" v-bind:key="index">
                  <div class="ng-prslist-doc">
                    <div class="ng-prslist-img" @click="jump('../config/detail.jsp?id='+item.id)">
                      <a href="#" class="ng-prsliik">
                        <span class="ng-prsliik-ki ng-prsliik-ki_1">
                        </span>
                        <span class="ng-prsliik-ki ng-prsliik-ki_2">
                        </span>
                      </a>
                    </div>
                    <div class="ng-prslist-tit" v-if="item.price"><span style="color: red;">{{item.price}} RMB</span></div>                 
                  </div>
                </li>
              </ul>
            </div>
            <!--ng-paging-->
            <nav class="pages">
              <div class="pager" id="pager"></div>
            </nav>
          </div>
        </div>
      </div>
    </div>

    <div class="am-end">
      <div class="ng-siobox ng-fault ng-paddor">
      <div class="am-end-ini">
        <div class="ng-siotext" aos="fade-up" aos-delay="400" aos-anchor-placement="top-bottom">
          <p>欢迎访问<span v-text="projectName"></span>！</p>
        </div>
      </div>
      </div>
    </div>
  </div>

  <script src="../../xznstatic/js/jquery.min.js"></script>

  <script src="../../layui/layui.js"></script>
  <script src="../../js/vue.js"></script>
  <script src="../../js/config.js"></script>
  <script src="../../modules/config.js"></script>
  <script src="../../js/utils.js"></script>

  <script>
    var vue = new Vue({
      el: '#app',
      data: {
        // 轮播图
        swiperList: [],
        dataList: [],
        projectName: projectName
      },
      methods: {
        isAuth(tablename, button) {
          return isFrontAuth(tablename, button)
        },
        jump(url) {
          jump(url)
        }
      }
    });

    layui.use(['layer', 'element', 'carousel', 'laypage', 'http', 'jquery'], function() {
      var layer = layui.layer;
      var element = layui.element;
      var carousel = layui.carousel;
      var laypage = layui.laypage;
      var http = layui.http;
      var jquery = layui.jquery;

      var limit = 8;

      // 获取轮播图 数据
      http.request('config/list', 'get', {
        page: 1,
        limit: 5
      }, function(res) {
        if (res.data.list.length > 0) {
          let swiperList = [];
          res.data.list.forEach(element => {
            if (element.value != null) {
              swiperList.push({
                img: element.value
              });
            }
          });
          vue.swiperList = swiperList;
          vue.$nextTick(()=>{
            var mySwiper = new Swiper('.ng-swiper', {
                speed: 400,
                spaceBetween: 100,
                pagination: '.ng-swiper .swiper-pagination',
                autoplay : 5000,
                loop : true,
                autoplayDisableOnInteraction : false,
                calculateHeight : true
            });   
            
            $(".ng-swiper-ovleft").bind("click",function (){ mySwiper.swipePrev();});
            $(".ng-swiper-ovright").bind("click",function (){ mySwiper.swipeNext();});
          });
        }
      });

      // 分页列表
      pageList();

      // 搜索按钮
      jquery('#btn-search').click(function(e) {
        pageList();
      });

      function pageList() {
        var param = {
          page: 1,
          limit: limit
        };
        if (jquery('#name').val()) {
          param['name'] = jquery('#name').val() ? '%' + jquery('#name').val() + '%' : '';
        }  
        // 获取列表数据
        http.request('config/list', 'get', param, function(res) {
          vue.dataList = res.data.list
          // 分页
          laypage.render({
            elem: 'pager',
            count: res.data.total,
            limit: limit,
            jump: function(obj, first) {
              param.page = obj.curr;
              //首次不执行
              if (!first) {
                http.request('config/list', 'get', param, function(res) {
                  vue.dataList = res.data.list;
                  vue.$nextTick(()=>{
                    window.xznResize();
                  });
                })
              }
            }
          });
          vue.$nextTick(()=>{
            window.xznResize();
          });
        })
      }
    });
  </script>

  <script src="../../xznstatic/js/idangerous.swiper.min.js"></script> 
  <script src="../../xznstatic/js/aos.js" type="text/javascript" charset="utf-8"></script> 
  <script src="../../xznstatic/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script> 
  <script src="../../xznstatic/js/jquery.superslide.2.1.1.js"></script> 
  <script src="../../xznstatic/js/app.js"></script> 
  <script src="../../xznstatic/js/jquery-1.7.2.min.js"></script> 
  <script src="../../xznstatic/js/lightbox.js"></script> 

  <script>
    window.xznResize = function() {
      var mySwiper2 = new Swiper('.ng-inzep',{
        calculateHeight : true,
        loop : true,
        paginationClickable :true,
        pagination: ".ng-inzep .swiper-pagination"
      });

      $(document).bind("scroll",function (){
        if($(".ng-swip-porlist").length > 0){
          if($(window).width() > 769){  
            mySwiper2.params.slidesPerView = 4;
            mySwiper3.params.slidesPerView = 4;
          }else if($(window).width() < 769){
            if($(window).width() < 480){
              mySwiper2.params.slidesPerView = 2;
              mySwiper3.params.slidesPerView = 2;
            }else{
              mySwiper2.params.slidesPerView = 3; 
              mySwiper3.params.slidesPerView = 3;
            }
          }
        }
      });

      $(window).bind("resize", function () {
        // 强制关闭导航
        if ($(window).width() > 992) { $(".ipad-nav").slideUp(); };

        if ($(".ng-swip-porlist").length > 0) {
          if ($(window).width() > 769) {
            mySwiper2.params.slidesPerView = 4;
            mySwiper3.params.slidesPerView = 4;
          } else if ($(window).width() < 769) {
            if ($(window).width() < 480) {
              mySwiper2.params.slidesPerView = 2;
              mySwiper3.params.slidesPerView = 2;
            } else {
              mySwiper2.params.slidesPerView = 3;
              mySwiper3.params.slidesPerView = 3;
            }
          }
        }

        Spirit_dynamicBG($(".ng-inswbg"), 1600, 616, $(".ng-inswbg"));
        Spirit_CallBack($(".ng-porlist-doc>a"), 280, 200);
        Spirit_CallBack($(".ng-incontlst-img"), 368, 240);
        Spirit_CallBack($(".ng-inzep-ims"), 400, 270);
        Spirit_CallBack($(".ng-isenst-img"), 368, 240);
        Spirit_CallBack($(".ng-prslist-img"), 100, 100);
        Spirit_CallBack($(".ng-vrslist-img"), 260, 170);
        Spirit_CallBack($(".ng-newbve-img-ikk"), 368, 240);

        $(".ng-subc-swiper").css({ "height": $(".ng-subc-swiper").width() });

        if ($(window).width() < 640) {
          $(".am-inside-swf").css({
            "min-height": $(window).height() - 60
          });
        } else {
          $(".am-inside-swf").css({
            "min-height": "auto"
          });
        }
      }).resize();
    }
  </script>
</body>
</html>