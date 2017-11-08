/// <reference path="../jquery-3.1.1.js" />

$(document).ready(function () {
$("#SameShipping").on('click',function(){
	$('#ShippingAddress1').val($("#BillingAddress1").val());
	$('#ShippingAddress2').val($("#BillingAddress2").val());
	$('#ShippingCity').val($("#BillingCity").val());
	$('#ShippingState').val($("#BillingState").val());
	$('#ShippingPostalCode').val($("#BillingPostalCode").val());
});
$("input[name='ShippingType']").on('click',function(){
	var checkbox= $(this);
	var checkShipping = checkbox.attr('data-cost');
	$('#shipping > .price').text('$'+checkShipping);
var sbtotal = $('#subtotal > .price').text().substring(1);
$('#grandtotal > .price').text('$'+(parseFloat(checkShipping)+parseFloat(sbtotal)).toFixed(2));
grandTotal();
});
//$(document).on('keydown', function(event){
//	if(event.key==='ArrowDown'){
//	var ship=	$('.ship').attr('id');
//		$('.ship').removeClass();
//		$('row').addClass('.ship');
//	}
//});
});


function grandTotal(){
    var subtotal = $('#subtotal span').text();
    subtotal = parseFloat(subtotal.substring(1, subtotal.length));
    
    var tax = $('#tax span').text();
    tax = parseFloat(tax.substring(1, tax.length));
    
    var shipping = $('#shipping span').text();
    shipping = parseFloat(shipping.substring(1, shipping.length));
    
    var grandTotal = subtotal + tax + shipping;
    $('#order-summary #grandtotal span').text('$' + grandTotal).toFixed(2);
    
}