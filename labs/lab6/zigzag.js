Cheat = (function() {

    var i = 0;
    function doCheat() {
        var direction = null;
        if (i % 10 == 0) direction = {x: 0, y: 1};
        else if (i % 10 == 4 || i % 10 == 9) direction = {x: 1, y: 0};
        else if (i % 10 == 5) direction = {x: 0, y: -1};
        i++;
        return direction;
    }

    return {
        cheat: doCheat
    };

})();
