<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>
<!doctype html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="format-detection" content="telephone=no">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="viewport" content="width=device-width,minimum-scale=1.0,maximum-scale=1.0">
  <title>首页</title>
  <link rel="stylesheet" href="../../layui/css/layui.css">
  <link rel="stylesheet" href="../../xznstatic/css/aos.css" />
  <link rel="stylesheet" href="../../xznstatic/css/bootstrap.min.css" />
  <link rel="stylesheet" href="../../xznstatic/css/idangerous.swiper.css" />
  <link rel="stylesheet" href="../../xznstatic/css/lightbox.css">
  <link rel="stylesheet" href="../../xznstatic/css/app.css" />
  <link rel="stylesheet" href="../../xznstatic/css/apmin.css" />
  <style>
    .ng-djn-txt {
      text-align: justify;
      text-justify: inter-ideograph;
      word-wrap: break-word;
      word-break: break-all;
    }

    .ng-inpusbox {
      text-indent: 0px;
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

      .bdshare-button-style2-16 a,
      .bdshare-button-style2-16 .bds_more {
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

<body>
  <div id="app">
    <div class="am-add">
      <div class="swiper-container ng-swiper">
        <div class="swiper-wrapper">
          <div class="swiper-slide" v-for="(item,index) in swiperList" v-bind:key="index">
            <a href="javascript:void(0);">
              <div class="swiper-slide"><img :src="item.img"></div>
            </a>
          </div>
        </div>
        <div class="swiper-pagination"></div>
        <div class="swiper-button-prev ng-swiper-ovleft"><img src="../../xznstatic/img/snne1.png" /></div>
        <div class="swiper-button-next ng-swiper-ovright"><img src="../../xznstatic/img/snne2.png" /></div>
      </div>
    </div>

    <div class="ng-container ng-fault">
      <div class="ng-inmod ng-fault ng-paddor ng-bg-assist">
        <div class="ng-inmod-ini">
          <div class="ng-fault ng-container">
            <div class="ng-inmod-the ng-container ng-bg-assist">
              <span class="ng-inmod-the-bg ng-inmod-the-bg-left" aos="fade-down-right">
                <img src="../../xznstatic/img/insie1.png" />
              </span>
              <span class="ng-inmod-the-bg ng-inmod-the-bg-right" aos="fade-up-left">
                <img src="../../xznstatic/img/insie2.png" />
              </span>
              <span class="ng-inmod-the-cn" aos="fade-down">失物展示推荐</span>
              <span class="ng-inmod-the-en" aos="fade-up">Recommend</span>
            </div>
            <span class="ng-inmod-thebor" aos="fade-up"></span>
          </div>

          <div class="ng-incontlst ng-fault ng-container ng-ai-drive1_map" aos="fade-up">
            <div class="ng-incontlst-doc ng-incontlst-doc-show">
              <div class="row">
                <div class="ng-incontlst-col" v-for="(item,index) in shiwuzhanshiRecommend" v-bind:key="index">
                  <div class="ng-incontlst-bor">
                    <div class="ng-incontlst-img ng-oa ng-fault">
                      <a href="javascript:void(0);" @click="jump('../shiwuzhanshi/detail.jsp?id='+item.id)">
                        <img :src="item.shiwuzhaopian?item.shiwuzhaopian.split(',')[0]:''" />
                      </a>
                    </div>
                    <div class="ng-fault ng-container">
                      <div class="ng-incontlst-tit">
                        <p>{{item.shiwubiaoti}}</p>
                        <span></span>
                      </div>
                      <a href="javascript:void(0);" class="ng-incontlst-ikk" @click="jump('../shiwuzhanshi/detail.jsp?id='+item.id)">查看详情</a>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="ng-inmod ng-fault ng-paddor ng-bg-fff">
        <div class="ng-inmod-ini">
          <div class="ng-fault ng-container">
            <div class="ng-inmod-the ng-container ng-bg-fff">
              <span class="ng-inmod-the-bg ng-inmod-the-bg-left" aos="fade-down-right">
                <img src="../../xznstatic/img/insie1.png" />
              </span>
              <span class="ng-inmod-the-bg ng-inmod-the-bg-right" aos="fade-up-left">
                <img src="../../xznstatic/img/insie2.png" />
              </span>
              <span class="ng-inmod-the-cn" aos="fade-down">新闻资讯</span>
              <span class="ng-inmod-the-en" aos="fade-up">HOME NEWS</span>
            </div>
            <span class="ng-inmod-thebor" aos="fade-up"></span>
          </div>
          <div class="ng-neswipe ng-fault ng-container ng-bg-fff" aos="fade-up">
            <div class="ng-fault ng-container">
              <div class="ng-inzep swiper-container">
                <div class="swiper-wrapper">
                  <div class="swiper-slide" v-for="(item,index) in newsList" v-bind:key="index">
                    <div class="ng-inzep-img">
                      <div class="ng-inzep-ims ng-oa">
                        <a :href="'../news/detail.jsp?id='+item.id">
                          <img :src="item.picture" />
                        </a>
                      </div>
                      <span class="ng-inzep-ims-bor"></span>
                    </div>
                    <div class="ng-inzep-iff">
                      <div class="ng-inzep-itit">{{item.title}}</div>
                      <div class="ng-inzep-idate">{{item.addtime}}</div>
                      <div class="ng-inzep-text">{{item.content|newsDesc}}</div>
                      <div class="ng-inzep-ikk ng-fault"><a :href="'../news/detail.jsp?id='+item.id">点击查看></a></div>
                    </div>
                  </div>
                </div>
                <div class="swiper-pagination"></div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="ng-inmod ng-fault ng-paddor ng-bg-assist">
        <div class="ng-inmod-ini">
          <div class="ng-fault ng-container">
            <div class="ng-inmod-the ng-container ng-bg-assist">
              <span class="ng-inmod-the-bg ng-inmod-the-bg-left" aos="fade-down-right">
                <img src="../../xznstatic/img/insie1.png" />
              </span>
              <span class="ng-inmod-the-bg ng-inmod-the-bg-right" aos="fade-up-left">
                <img src="../../xznstatic/img/insie2.png" />
              </span>
              <span class="ng-inmod-the-cn" aos="fade-down">失物展示展示</span>
              <span class="ng-inmod-the-en" aos="fade-up">DATA SHOW</span>
            </div>
            <span class="ng-inmod-thebor" aos="fade-up"></span>
          </div>

          <div class="ng-incontlst ng-fault ng-container ng-ai-drive1_map" aos="fade-up">
            <div class="ng-incontlst-doc ng-incontlst-doc-show">
              <div class="row">
                <div class="ng-incontlst-col" v-for="(item,index) in shiwuzhanshiList" v-bind:key="index">
                  <div class="ng-incontlst-bor">
                    <div class="ng-incontlst-img ng-oa ng-fault">
                      <a href="javascript:void(0);" @click="jump('../shiwuzhanshi/detail.jsp?id='+item.id)">
                        <img :src="item.shiwuzhaopian?item.shiwuzhaopian.split(',')[0]:''" />
                      </a>
                    </div>
                    <div class="ng-fault ng-container">
                      <div class="ng-incontlst-tit">
                        <p>{{item.shiwubiaoti}}</p>
                        <p style="color: red;" v-if="item.price">{{item.price}} RMB</p>
                        <span></span>
                      </div>
                      <a href="javascript:void(0);" class="ng-incontlst-ikk" @click="jump('../shiwuzhanshi/detail.jsp?id='+item.id)">查看详情</a>
                    </div>
                  </div>
                </div>
              </div>
            </div>
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
  <!-- 组件配置信息 -->
  <script src="../../js/config.js"></script>
  <!-- 扩展插件配置信息 -->
  <script src="../../modules/config.js"></script>
  <!-- 工具方法 -->
  <script src="../../js/utils.js"></script>

  <script type="text/javascript">
    var vue = new Vue({
      el: '#app',
      data: {
        shiwuzhanshiRecommend: [],

        shiwuzhanshiList: [],
        swiperList: [],
        // 新闻资讯
        newsList: [],
        leftNewsList: [],
        rightNewsList: [],
        projectName: projectName
      },
      filters: {
        newsDesc: function(val) {
          if (val) {
            val = val.replace(/<[^<>]+>/g, '').replace(/undefined/g, '');
            if (val.length > 60) {
              val = val.substring(0, 60);
            }

            return val;
          }
          return '';
        }
      },
      methods: {
        jump(url) {
          jump(url)
        }
      }
    });

    layui.use(['layer', 'form', 'element', 'carousel', 'http', 'jquery'], function() {
      var layer = layui.layer;
      var element = layui.element;
      var form = layui.form;
      var carousel = layui.carousel;
      var http = layui.http;
      var jquery = layui.jquery;

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

      // 新闻资讯
      http.request('news/list', 'get', {
        page: 1,
        limit: 3,
        order: 'desc'
      }, function(res) {
        var newsList = res.data.list;
        vue.newsList = newsList;
        if (newsList.length > 0 && newsList.length <= 2) {
          vue.leftNewsList = res.data.list
        } else {
          var leftNewsList = []
          for (let i = 0; i <= 2; i++) {
            leftNewsList.push(newsList[i]);
          }
          vue.leftNewsList = leftNewsList
        }
        if (newsList.length > 2 && newsList.length <= 8) {
          var rightNewsList = []
          for (let i = 3; i <= newsList.length; i++) {
            rightNewsList.push(newsList[i]);
          }
          vue.rightNewsList = rightNewsList
        }
        vue.$nextTick(()=>{
          window.xznResize();
        });
      });
                  
      // 获取推荐信息
      http.request(`shiwuzhanshi/autoSort`, 'get', {
        page: 1,
        limit: 6
      }, function(res) {
        vue.shiwuzhanshiRecommend = res.data.list;
        vue.$nextTick(()=>{
          window.xznResize();
        });
      });
              
      http.request(`shiwuzhanshi/list`, 'get', {
        page: 1,
        limit: 10
      }, function(res) {
        vue.shiwuzhanshiList = res.data.list;
        vue.$nextTick(()=>{
          window.xznResize();
        });
      });
    });
  </script>

  <script src="../../xznstatic/js/idangerous.swiper.min.js"></script>
  <script src="../../xznstatic/js/aos.js" type="text/javascript" charset="utf-8"></script>
  <script src="../../xznstatic/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
  <script src="../../xznstatic/js/jquery.superslide.2.1.1.js"></script>
  <script src="../../xznstatic/js/app.js"></script>
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