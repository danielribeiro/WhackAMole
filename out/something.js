goog.provide('whackmole');
goog.require('cljs.core');
whackmole.bind_events = (function bind_events(){
return jQuery(".hole").click((function (this$){
return jQuery(this$.target).removeClass("holeWithMole");
}));
});
whackmole.mole_at = (function mole_at(n){
return jQuery(jQuery(".hole").get(n)).addClass("holeWithMole");
});
jQuery(whackmole.bind_events);
setInterval((function (){
return whackmole.mole_at.call(null,cljs.core.rand_int.call(null,4));
}),1000);
