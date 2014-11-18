modules = {
    application {
        dependsOn 'kendoui, bootstrap'
        resource url:'js/application.js'
    }

    kendoui {
        dependsOn 'jquery'
        resource url:'js/kendo.web.min.js'
        resource url:'css/kendo.bootstrap.min.css'
        resource url:'css/kendo.common.min.css'
    }
}