((() => {
    //const coords = {lat: 39.9612, lng: -82.9988};
    // let's use our custom icon on the google map:
    const image = {
        url: '../img/cardinal-bird.svg',
        scaledSize: new google.maps.Size(50, 50)
    };
    const contentString = '<h2>' + city + ', ' + state + '</h2> <p>Where your dreams come true!</p>';
    // creates a new instance of google maps for us:
    const map = initMap(coords);

    // add the image/icon to the map as a marker
    const marker = new google.maps.Marker({
        position: coords,
        map     : map,
        icon    : image,
        animation: google.maps.Animation.BOUNCE
    });
    // add our custom message to the map window for our marker:
    const infoWindow = new google.maps.InfoWindow({
        content: contentString
    });
    // display the custom message when clicking on the marker (will show as a bubble above the marker)
    google.maps.event.addListenerOnce(marker, 'click', () => {
        infoWindow.open(map, marker);
    });

    /**
     * Initializes a new instance of google maps in the browser.
     *
     * @param coords lat / long for the map to center on
     * @returns {google.maps.Map}
     */
    function initMap(coords) {
        return new google.maps.Map(document.getElementById('map'), {
            center: coords,
            // min = 0 (view of earth), max = 21 (super zoomed in)
            zoom  : 10,
            scrollwheel: false
        });
    }
})());