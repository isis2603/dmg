(function (ng) {

    var mod = ng.module("mainApp",[
        "ui.router",
        "eventoModule",
        "ciudadModule",
        "itinerarioModule",
        "multimediaModule",
        "usuarioModule",
        "planEventoModule",
        "ngMessages"
    ]);

    mod.config(['$logProvider', function ($logProvider) {
            $logProvider.debugEnabled(true);
        }]);

    mod.config(['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {
            $urlRouterProvider.otherwise("/section-home");
            $stateProvider

                    .state('section-home', {
                        url: '/section-home',
                        //controller: "section-homeCtrl",
                        //controllerAs: "ctrl",
                        templateUrl: "src/modules/section-H/section-home.tpl.html"
                    })
                    .state('ciudad', {
                        url: '/ciudad',
                        controller: "ciudadCtrl",
                        controllerAs: "ctrl",
                        templateUrl: "src/modules/ciudad/ciudad.tpl.html"
                    })
                     .state('multimedia', {
                        url: '/multimedia',
                        controller: "multimediaCtrl",
                        controllerAs: "ctrl",
                        templateUrl: "src/modules/multimedia/multimedia.tpl.html"
                    })
                     .state('itinerario', {
                        url: '/itinerario',
                        controller: "itinerarioCtrl",
                        controllerAs: "ctrl",
                        templateUrl: "src/modules/Itinerario/itinerario.tpl.html"
                    })
                    .state('viajero', {
                        url: '/viajero',
                        controller: "usuarioCtrl",
                        controllerAs: "ctrl",
                        templateUrl: "src/modules/viajero/viajero.tpl.html"
                    })
                    .state('planEvento', {
                        url: '/planEvento',
                        controller: "planEventoCtrl",
                        controllerAs: "ctrl",
                        templateUrl: "src/modules/planEvento/planEvento.tpl.html"
                    })
                    .state('evento', {
                        url: '/evento',
                        controller: "eventoCtrl",
                        controllerAs: "ctrl",
                        templateUrl: "src/modules/evento/evento.tpl.html"
                    })
                    .state('eventoInfo', {
                        url: '/eventoInfo',
                       // controller: "eventoCtrl",
                       // controllerAs: "ctrl",
                        templateUrl: "src/modules/evento/evento1.tpl.html"
                    });
        }]);
})(window.angular);
