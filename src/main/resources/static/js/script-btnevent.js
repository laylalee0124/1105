/**
 * 
 */
var size=260+20;
var check=true;
$(function(){
	$("#new .btn-next").click(function(){
		if(check){
			check=false;
			btn_next();
		}
	});
	$("#new .btn-prev").click(function(){
		if(check){
			check=false;
			btn_prev();
		}
	});
});

function btn_next(){
	var first=$("#new .goods-list li").first();
	var last=$("#new .goods-list li").last();
	$("#new .goods-list").animate({marginLeft:-size},function(){
		last.after(first);
		$("#new .goods-list").css({marginLeft:0});
		//$(".goods-list").css("margin-left",0);
		check=true;
	});
}

function btn_prev(){
	var first=$("#new .goods-list li").first();
	var last=$("#new .goods-list li").last();
	first.before(last);
	$("#new .goods-list").css({marginLeft:-size});
	
	$("#new .goods-list").animate({marginLeft:0}, function(){
		check=true;
	});
}