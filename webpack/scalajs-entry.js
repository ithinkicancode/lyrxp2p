if (process.env.NODE_ENV === "production") {
    const opt = require("./lyrxp2p-opt.js");
    opt.main();
    module.exports = opt;
} else {
    var exports = window;
    exports.require = require("./lyrxp2p-fastopt-entrypoint.js").require;
    window.global = window;

    const fastOpt = require("./lyrxp2p-fastopt.js");
    fastOpt.main()
    module.exports = fastOpt;

    if (module.hot) {
        module.hot.accept();
    }
}
