goog.provide('whackmole');
goog.require('cljs.core');
whackmole.score = cljs.core.atom.call(null,0);
whackmole.jq = (function jq(arg){
return jQuery(arg);
});
whackmole.log = (function log(arg){
return console.log(arg);
});
whackmole.bind_events = (function bind_events(){
return whackmole.jq.call(null,".hole").click((function (this$){
if(cljs.core.truth_(whackmole.jq.call(null,this$.target).hasClass("holeWithMole")))
{whackmole.jq.call(null,this$.target).removeClass("holeWithMole");
cljs.core.swap_BANG_.call(null,whackmole.score,cljs.core.inc);
whackmole.log.call(null,"the score is");
return whackmole.log.call(null,cljs.core.deref.call(null,whackmole.score));
} else
{return null;
}
}));
});
whackmole.mole_at = (function mole_at(n){
return whackmole.jq.call(null,whackmole.jq.call(null,".hole").get(n)).addClass("holeWithMole");
});
jQuery(whackmole.bind_events);
setInterval((function (){
return whackmole.mole_at.call(null,cljs.core.rand_int.call(null,4));
}),1000);
