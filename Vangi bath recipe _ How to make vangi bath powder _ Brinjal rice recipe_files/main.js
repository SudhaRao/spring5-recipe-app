/* Banner
/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
function $(id) { return document.getElementById(id) };
function q(name) {return document.getElementsByClassName(name) };
var add = document.addEventListener ? 'addEventListener' : 'attachEvent';
var st = setTimeout;

var banner = (function() {
	'use strict';
	function Banner() {
		// private variables
		var b = $('banner');

				function onEnablerVisible() {
			animateIt();
			function animateIt() 
			{
				st(function() {
					$("bgGradient").className = "in";	
					$("flo").className = "in";
					$("logo").className = "in";
					$("copy").className = "in";
					$("cta").className = "in";
				}, 1)

			}  
		}
	
		// privileged methods
		this.init = function() {
			onEnablerVisible();
		};
	}
	return new Banner();
})();
