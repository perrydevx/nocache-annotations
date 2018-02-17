package nocache.annotations


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(NoCacheInterceptor)
class NoCacheInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test noCache interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"noCache")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
