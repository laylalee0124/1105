/**
 * 
 */
var doubleCheck=true;
var moveSpeed=500;
var delay=3000;
var imgSize=592+20;
var base=-254;
var timeout;
var imgs = [
		"url('/images/visual/img_1.png')",
		"url('/images/visual/img_2.png')",
		"url('/images/visual/img_3.png')",
		"url('/images/visual/img_4.png')",
		"url('/images/visual/img_5.png')",
		"url('/images/visual/img_6.png')"
		];
var imgList;
//ready Function
$(function(){
	imgList=$(".img-list li");
	visualImageLoading();
	//*
	timeout = setTimeout(start, delay);
	$(".view-area").hover(stop, function(){
		timeout = setTimeout(start, delay);
	});
	$(".bullets").hover(stop, function(){
		timeout = setTimeout(start, delay);
	});
	//*/
	//*
	$(".bullets li").click(function(){
		if(doubleCheck==true){
			doubleCheck=false;
			
			var i=$(this).index();
			$(".bullets li").removeClass("target");
			$(".bullets li").eq(i).addClass("target");
			
			
			imgList=$(".img-list li");
			for(var j=0; j<imgList.length; j++){
				var val=imgList.eq(j).val();
				if(i==val){
					//j=li위치 이미지의 현재 위치 index값
					//alert("위치 :"+j);
						move(j);
	
				}
			}
		}
		
	});
	//*/
	
});
function move(pos){
	
	//이동할대상 앞쪽의 모든li
	var prevall=imgList.eq(pos).prevAll();
	//prevall.clone().appendTo(".img-list");
	///*
	//img-list뒤쪽에 복제해서 삽입
	for(var i=prevall.length-1; i>=0; i--){
		prevall.eq(i).clone().appendTo(".img-list");
	}
	//*/
	//이미지이동
	$(".img-list").animate({marginLeft: base-imgSize*pos},moveSpeed,function(){
		//앞쪽으로밀려난 li는 삭제
		prevall.remove();
		$(this).css("margin-left", base);
		
		doubleCheck=true;
	});
	
}



function stop(){
	clearTimeout(timeout);
}

//setTimeout을 무한반복시키기위해 재귀함수사용
function start(){
	next();
	timeout = setTimeout(start, 3000);
}

//다음 이미지가 보이도록 이미지를 이동시킨다.
//초기이미지위치 "margin-left", "-254px" 에서 "margin-left", "-866px"
//animate안쪽에 style속성은 카멜표기법으로  marginLeft
function next(){
	var first=$(".img-list li:first-child");
	var last=$(".img-list li:last-child");
	//이미지이동
	$(".img-list").animate({marginLeft: base-imgSize},moveSpeed,function(){
		last.after(first);
		$(this).css("margin-left", base);
	});
	//블릿이동
	var i=first.val()+1;
	
	//alert(i);
	$(".bullets li").removeClass("target");
	$(".bullets li").eq(i%imgs.length).addClass("target");
}
 



//배열을 이용해서 이미지를 background-image 속성에 저장
function visualImageLoading(){
	
	
	
	for(var i=0; i<imgs.length ; i++){
		imgList.eq(i)
			.css("background-image",imgs[i])
			.attr("value",i);
			;
	}
	
}










