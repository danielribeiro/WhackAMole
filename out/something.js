goog.provide('whackmole');
goog.require('cljs.core');
whackmole.bind_events = (function bind_events(){
return jQuery(".hole").click((function (this$){
return jQuery(this$.target).removeClass("holeWithMole");
}));
});
jQuery(whackmole.bind_events);
