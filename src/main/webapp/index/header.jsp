<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link type="text/css" rel="stylesheet" href="index/css/css.css"/>
	<script type="text/javascript" src="index/js/common.js"></script>
	<script type="text/javascript" src="index/js/jquery.js"></script>
	<script type="text/javascript" src="index/js/clock.js"></script>
</head>
<body onload="clock()">

		<div id="top">
		<div id="logo" style="background-image:url('index/image/logo0.jpg');">
			<h2 style="color:#E8C198;font-size:40px;margin-left:100px;margin-top:20px;">${company.name}</h2>
		</div>

		<div id="time">
			<h3>
				<span id=localtime></span>&nbsp;<!--时钟插件-->
				<a href="javascript:setHomepage();">设为首页</a>||<a href="javascript:AddToFavorite();">加入收藏</a>
			</h3>
		</div>

		<div id="banner">
			<!--图片幻灯片效果脚本-->
			<script type=text/javascript>
				var swf_width='1000';
				var swf_height='250';
				var configtg='0xffffff:文字颜色|2:文字位置|0x000000:文字背景颜色|30:文字背景透明度|0xffffff:按键文字颜色|0x4f6898:按键默认颜色|0x000033:按键当前颜色|3:自动播放时间|3:图片过渡效果|1:是否显示按钮|_blank:打开新窗口';
				var files='index/image/banner-1.jpg|index/image/banner-2.jpg|index/image/banner-3.jpg|index/image/banner-4.jpg|index/image/banner-5.jpg|index/image/banner-6.jpg';
				var links='||';
				var texts ;
				document.write('<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,0,0" width="'+ swf_width +'" height="'+ swf_height +'">');
				document.write('<param name="movie" value="js/slideflash.swf"><param name="quality" value="high">');
				document.write('<param name="menu" value="false"><param name=wmode value="transparent">');
				document.write('<param name="FlashVars" value="bcastr_file='+files+'&bcastr_link='+links+'&bcastr_title='+texts+'&bcastr_config='+configtg+'">');
				document.write('<embed src="index/js/slideflash.swf" wmode="opaque" FlashVars="bcastr_file='+files+'&bcastr_link='+links+'&bcastr_title='+texts+'&bcastr_config='+configtg+'& menu="false" quality="high" width="'+ swf_width +'" height="'+ swf_height +'" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" />'); 
				document.write('</object>'); 
			</script>
		</div>
		
		<div class="nave">
			<ul>
				<li><a href="index.action">网站首页</a></li>
				<li><a href="news.action">新闻资讯</a></li>
				<li><a href="product.action">产品展示</a></li>
				<li><a href="example.action">成功案例</a></li>
				<li><a href="gbook.action">在线留言</a></li>
				<li><a href="about.action">关于我们</a></li>
				<li style="float: right;"><a href="admin.action" target="_blank">后台管理</a></li>
			</ul>
		</div>
		
	</div>

</body>
</html>