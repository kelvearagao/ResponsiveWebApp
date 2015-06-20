var	PACKT_PRODUCT_APP={
	/*Returning	jQuery	Promise	For	a	AJAX	call	with	Product	type*/
	getProductDetails	:	function(type){
							var	ajaxRequest=$.ajax("ProductServlet?type="+type);
							return	ajaxRequest.promise();
	},
	/*Handler	For	AJAX	response*/
	handleCallback	:	function(type){
					var	promise	=	PACKT_PRODUCT_APP.getProductDetails(type);
					promise.done(function(data){
									PACKT_PRODUCT_APP.doProductRendering(data);
					});
	},
	/*jQuery	Template	building	with	JSON	data*/
	doProductRendering:	function(data){
					var	productContainer = $('.ts-product-container'),
					aProductTemplate =	$('#aProductTemplate').tmpl(data),
					promiseOldPro	=	$(productContainer).find('.panel').fadeOut().promise();
					$.when(promiseOldPro).then(function(){
									productContainer.html(aProductTemplate);
					});
	},
	/*Event	Listener	to	Menu	Item	Click*/
	initCategoryClick:function(){
		$(".ts-bar").on('click','li',function(e){
						e.preventDefault();
						var	li	=	e.currentTarget,
										type=	$(li).attr('data-category');
						$(li).siblings('li').removeClass('active');
						$(li).addClass('active');
						PACKT_PRODUCT_APP.handleCallback(type);
		});
	}
};

$(document).ready(function(){
	/*Initial	Load	Call	Books	*/
	PACKT_PRODUCT_APP.handleCallback('book');
	/*Initialize	Click	Of	Menu	Item*/
	PACKT_PRODUCT_APP.initCategoryClick();
});