package contracts.consumer-contract

org.springframework.cloud.contract.spec.Contract.make {
    description "should return even when number input is even - tests"
    request {
        method GET()
        url("/validate/prime-number") {
            queryParameters {
                parameter("number", "2")
            }
        }
    }
    response {
        body("Even")
        status 200
    }
}