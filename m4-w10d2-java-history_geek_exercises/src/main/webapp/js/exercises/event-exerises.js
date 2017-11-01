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
$('#grandtotal > .price').text('$'+parseFloat(checkShipping)+parseFloat(sbtotal));	
});

});