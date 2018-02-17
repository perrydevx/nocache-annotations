package nocache.annotations

import grails.transaction.Transactional


class NoCacheInterceptor {

    NoCacheInterceptor() {
        match(controller: '*', action: '*') // using strings
    }

    boolean before() {
        def controllerClass = grailsApplication.controllerClasses.find { it.fullName.indexOf(controllerName.capitalize()+"Controller") != -1 }
        def classAnnotated = controllerClass.getClazz().isAnnotationPresent(Transactional)


        if (actionName) {
           def controllerAction = controllerClass.getClazz().declaredFields.find { it.toString().indexOf(actionName) != -1 }

            for (field in controllerClass.getClazz().declaredFields) {
                println '---------------> ' + field.name
            }
            //def actionAnnotated = controllerAction?.isAnnotationPresent(Transactional)

        }
        true
    }

    boolean after() {
        println '---> after interceptor'
        true
    }

    void afterView() {
        // no-op
    }
}
