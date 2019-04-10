jQuery(document).ready(function($) {

	'use strict';

		$(".our-listing").owlCarousel({
			items: 5,
			navigation: true,
			navigationText: ["&larr;","&rarr;"],
		});


		$('.flexslider').flexslider({
		    animation: "fade",
		    controlNav: false,
		    prevText: "&larr;",
		    nextText: "&rarr;"
		});

});









