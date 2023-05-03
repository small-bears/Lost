// 获取页面元素
//var myElement = document.querySelector("header");
//// 创建 Headroom 对象，将页面元素传递进去
//var headroom  = new Headroom(myElement);
//// 初始化
//headroom.init(); 
     
             function Spirit_CallBack(obj,se_w,se_h){
	    	  if(jQuery(obj).length > 1){
		    	  	   (function (){
			       	    	 var se_ratio = se_h / se_w;
				       	    	jQuery(obj).each(function (){
				       	    	  	  jQuery(this).css({
				       	    	  	     height : Math.round(jQuery(obj).width() * se_ratio)
				       	    	      });
			       	    	     });  
		       	    })();
	    	  }else{
		    	  	  (function (){
			       	    	 var se_ratio = se_h / se_w;
			       	    	  jQuery(obj).css({
			       	    	  	  height : Math.round(jQuery(obj).width() * se_ratio)
			       	    	  });
		       	    })();
	    	  }
      }
             
             
       function Spirit_dynamicBG(obj,se_w,se_h,ob_consult){
       	     var zs_x = se_w;
       	     var zs_y = se_h;
       	     var zs_c = zs_x / zs_y;
       	     var win_w = $(ob_consult).width();
	   	     var win_h = $(ob_consult).height();
	   	  
	   	     var win_c = win_w / zs_c;
	   	     var zs_s = win_w / zs_c;
	   	     
	   	    if(win_h > zs_s){
	   	      	$(obj).css({'background-size' : 'auto 100%' });
	   	    }else{
	   	    	   $(obj).css({'background-size' : '100% auto'});
	   	    }
	   	    
       }
  
  
       if (navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion.split(";")[1].replace(/[ ]/g, "") == "MSIE6.0") {
           }else if (navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion.split(";")[1].replace(/[ ]/g, "") == "MSIE7.0") {
               } else if (navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion.split(";")[1].replace(/[ ]/g, "") == "MSIE8.0") {
                  } else {
                    AOS.init({
						easing: 'ease-out-back',
						duration: 1000,
					});
            }


  
  
$(function (){
	
	      
      
           $(".am-pc-sharebtn").bind("click",function (){
           	      $(".am-pc-share").fadeToggle();
           }); 

	    
	       //初始化 PC导航
	        if($(".am-pcv-activate").length > 0){
	        	  if($(".am-pclink-activate").length > 0){
	        	  	     $(".am-pcv-activate").stop(true).animate({
		    	  	    	   left : $(".am-pclink-activate").parent().position().left + 11,
		    	  	    	   width : $(".am-pclink-activate").innerWidth()
	    	  	          });
	        	  }
	       }
	        
	        //初始化 PC二级 定位
	        if($(".am-pc-level").length > 0){
	        	  $(".am-pc-level").each(function (){
	        	  	    $(this).css({
	        	  	    	  left : ($(this).parent().width() / 2) - ($(this).width() / 2)
	        	  	    });
	        	  });
	        }
	       
	           //触发 PC 导航
	           $(".am-pc-nav>ul>li").hover(
			    	    function (){
			    	    	$(this).addClass("err-on");
                            
                            $(this).find(".am-pc-level").stop(true).animate({
                            	   height : $(this).find(".am-pc-level").find("ul").height() + 18,
                            	   top : 72
                            });
                            
                            $(this).find(".am-pclink-borv>span").stop(true).animate({"width" : "100%"});
                             
			    	  },function (){
			    	  	 $(this).removeClass("err-on");
		                  
		                    $(this).find(".am-pc-level").stop(true).animate({
                            	   height : 0,
                            	   top : 64
                            });
		                  
		                   $(this).find(".am-pclink-borv>span").stop(true).animate({"width" : "0%"});
			    	  }
			    );
	    
	    
	        
           //初始化 首页轮播
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
			
        //初始化 新闻轮播
        var mySwiper2 = new Swiper('.ng-inzep',{
		 calculateHeight : true,
		 loop : true,
		 paginationClickable :true,
		 pagination: ".ng-inzep .swiper-pagination"
		});
		//swiper-pagination
        
         
        //触发 平板导航
		$(".ipad-nav-butt").click(function (){$(".ipad-nav").slideToggle(); });
     
     
       //初始化轮播高度
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
	         	  
	         	  
         
         $(window).bind("resize",function (){
         	     
         	     // 强制关闭导航
         	   if($(window).width() > 992){ $(".ipad-nav").slideUp();};
         	   
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
         	   
         	   Spirit_dynamicBG($(".ng-inswbg"),1600,616,$(".ng-inswbg"));
         	   
      	      Spirit_CallBack($(".ng-porlist-doc>a"),280,200);
      	      
      	      Spirit_CallBack($(".ng-incontlst-img"),368,240);
      	      
      	      Spirit_CallBack($(".ng-inzep-ims"),400,270);
      	      
      	      Spirit_CallBack($(".ng-isenst-img"),368,240);
      	      
      	      Spirit_CallBack($(".ng-prslist-img"),100,100);
      	      
      	      Spirit_CallBack($(".ng-vrslist-img"),260,170);
      	      
      	      Spirit_CallBack($(".ng-newbve-img-ikk"),368,240);
      	      
      	      $(".ng-subc-swiper").css({"height" : $(".ng-subc-swiper").width()});

      	      if($(window).width() < 640){
                  $(".am-inside-swf").css({
                   "min-height" : $(window).height() - 60
      	          });
      	      }else{
                  $(".am-inside-swf").css({
                      "min-height" : "auto"
      	          });
      	      }
      	      
         	   
         }).resize();

   
   
     $(".ng-inssbtn").bind("click",function (){$("html,body").animate({scrollTop:$(this).offset().top},1000);});
     
     $(".ng-ai-drive1 li").bind("click",function (){
     	  $(".ng-ai-drive1 li a").removeClass("on");
     	  $(this).find("a").addClass("on");
     	  $(".ng-ai-drive1_map .ng-incontlst-doc").removeClass("ng-incontlst-doc-show");
     	  $(".ng-ai-drive1_map .ng-incontlst-doc").eq($(this).index()).addClass("ng-incontlst-doc-show");
     });
      
      $(".ng-ai-drive2 li").bind("click",function (){
     	  $(".ng-ai-drive2 li a").removeClass("on");
     	  $(this).find("a").addClass("on");
     	  $(".ng-ai-drive2_map .ng-isenst-doc").removeClass("ng-isenst-doc-show");
     	  $(".ng-ai-drive2_map .ng-isenst-doc").eq($(this).index()).addClass("ng-isenst-doc-show");
     });
     
     
     
        var mySwiper4 = new Swiper('.ng-subinpe',{
			 calculateHeight : true,
			 loop : true,
			 paginationClickable :true,
			 pagination: ".ng-subinpe .pagination"
		});
		
		var siw_index = 0;
		
		$(".ng-subc-sli li").bind("click",function (){
			   $(".ng-subc-sli li").removeClass("on").eq($(this).index()).addClass("on");
			   mySwiper4.swipeTo($(this).index(),500, false);
			   siw_index = $(this).index();
		});
		
		$(".ng-imsze-map-left").bind("click",function (){
			  mySwiper4.swipePrev();
			  siw_index -= 1;  
			  console.log(siw_index);
			  if(siw_index == -1){   
			    	  siw_index =  $(".ng-subc-sli li").length - 1;  
			    	  console.log(siw_index);
			    	  $(".ng-subc-sli li").removeClass("on").eq($(".ng-subc-sli li").length - 1).addClass("on");
			    }else{
			    	 $(".ng-subc-sli li").removeClass("on").eq(siw_index).addClass("on");
			    }  
		});
		
		$(".ng-imsze-map-right").bind("click",function (){
			  mySwiper4.swipeNext();
			   siw_index += 1;
			    if(siw_index > $(".ng-subc-sli li").length - 1){
			    	  siw_index = 0;
			    	  $(".ng-subc-sli li").removeClass("on").eq(0).addClass("on");
			    }else{
			    	 $(".ng-subc-sli li").removeClass("on").eq(siw_index).addClass("on");
			    }
		});
		
		
		  var mySwiper6 = new Swiper('.ng-inzshow',{
			 loop : true,
			 paginationClickable :true,
			 pagination: ".ng-inzshow .pagination"
		});
		
		
		 $(".ng-onzebtn-left").bind("click",function (){
		 	    mySwiper6.swipePrev();
		 });
        
         $(".ng-onzebtn-right").bind("click",function (){
		 	    mySwiper6.swipeNext();
		 });
        
        $(".ng-potapp-list ul li").bind("click",function (){
        	 $(".ng-spiom").stop(true).animate({
			  	    "top" : "0%"
			  });
			  mySwiper6.swipeTo($(this).index(),500, false);
        });
        
		$(".ng-spiom-del").bind("click",function (){
			  $(".ng-spiom").stop(true).animate({
			  	    "top" : "100%"
			  });
		});


});
window._bd_share_config={"common":{"bdSnsKey":{},"bdText":"","bdMini":"2","bdMiniList":false,"bdPic":"","bdStyle":"2","bdSize":"16"},"share":{}};with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src='http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+~(-new Date()/36e5)];
